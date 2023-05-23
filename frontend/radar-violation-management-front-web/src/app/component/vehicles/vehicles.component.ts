import { Component } from '@angular/core';
import {Vehicle} from "../../models/vehicle.model";
import {FormBuilder, FormGroup} from "@angular/forms";
import {Router} from "@angular/router";
import {VehiclesService} from "../../services/vehicles.service";
import Swal from "sweetalert2";
@Component({
  selector: 'app-vehicles',
  templateUrl: './vehicles.component.html',
  styleUrls: ['./vehicles.component.css']
})
export class VehiclesComponent {

  vehicles! : Vehicle[];
  errMessage! : string;

  currentPage : number=0;
  size : number=6;
  totalPages : number=0;
  currentAction : string="all";

  searchFormGroup! : FormGroup;
  selectedVehicleOwner : any;
  isOwnerInfoVisible: boolean = false;

  constructor(private vehiclesService : VehiclesService,
              private fb : FormBuilder,
              private router : Router) {

  }

  ngOnInit(): void {
    this.searchFormGroup = this.fb.group({
      keyword : this.fb.control(null)
    });


    this.getVehicles();
  }

  getVehicles(): void {
    this.vehiclesService.getAllVehiclesPages(this.currentPage, this.size)
      .subscribe((data) => {
        this.vehicles = data.content;
        this.totalPages = data.totalPages;
      },
        error => {
        this.errMessage = "Data Not Found !";
        });
  }

  nextPage() {
    if (this.currentPage < this.totalPages - 1) {
      this.currentPage++;
      this.currentPage = this.currentPage++;
      if(this.currentAction === "all") this.getVehicles();
      else this.handleSearchVehicle();
    }
  }

  previousPage() {
    if (this.currentPage > 0) {
      this.currentPage--;
      this.currentPage = this.currentPage--;
      if(this.currentAction === "all") this.getVehicles();
      else this.handleSearchVehicle();
    }
  }


  handleGetAllVehicles(){
    this.vehiclesService.getAllVehicles().subscribe({
      next : data => {
        this.vehicles = data;
      },
      error : err => {
        this.errMessage = err;
      }
    });
  }

  handledeleteVehicle(r : Vehicle) {

    Swal.fire({
      title: 'Are you sure?',
      text: "You won't be able to revert this!",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Yes, delete it!'
    }).then((result) => {
      if (result.isConfirmed) {
        Swal.fire(
          'Deleted!',
          'Your file has been deleted.',
          'success'
        )

        this.vehiclesService.deleteVehicle(r.id).subscribe({
          next : (data) => {
            //this.handleGetAllProducts()
            let index = this.vehicles.indexOf(r);
            this.vehicles.splice(index, 1)
          }
        });


      }
    })

  }

  handleSearchVehicle(){
    this.currentAction = "search";
    let keyword = this.searchFormGroup.value.keyword;

    this.vehiclesService.searchVehicle(keyword).subscribe({
      next : (data) => {
        this.vehicles= data.content;
        this.totalPages = data.totalPages;
      }
    })
  }

  showOwner(vehicle: any) {
    this.isOwnerInfoVisible = true;
    this.selectedVehicleOwner = vehicle.owner;
  }



}
