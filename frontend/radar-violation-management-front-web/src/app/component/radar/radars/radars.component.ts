import { Component } from '@angular/core';
import {RadarsService} from "../../../services/radars.service";

import {FormBuilder, FormGroup} from "@angular/forms";
import {Router} from "@angular/router";
import Swal from "sweetalert2";
import {Radar} from "../../../models/radar.model";


@Component({
  selector: 'app-radars',
  templateUrl: './radars.component.html',
  styleUrls: ['./radars.component.css']
})
export class RadarsComponent {
  radars! : Radar[];
  errMessage! : string ;

  currentPage : number=0;
  size : number=4;
  totalPages : number=0;
  currentAction : string="all";

  searchFormGroup! : FormGroup;

  constructor(private radarsService : RadarsService,
              private fb : FormBuilder,
              private router : Router) {

  }

  ngOnInit(): void {
    this.searchFormGroup = this.fb.group({
      keyword : this.fb.control(null)
    });

    //this.handleGetPageRadars();
    //this.handleGetAllRadars();
    this.getRadars();
  }

  getRadars(): void {
    this.radarsService.getAllRadarsPages(this.currentPage, this.size)
      .subscribe({
        next : data => {
          this.radars = data.content;
          this.totalPages = data.totalPages;
        },
        error : err => {
          this.errMessage = "Data Not Found !";
        }
      });
  }

  nextPage() {
    if (this.currentPage < this.totalPages - 1) {
      this.currentPage++;
      this.currentPage = this.currentPage++;
      if(this.currentAction === "all") this.getRadars();
      else this.handleSearchRadar();
    }
  }

  previousPage() {
    if (this.currentPage > 0) {
      this.currentPage--;
      this.currentPage = this.currentPage--;
      if(this.currentAction === "all") this.getRadars();
      else this.handleSearchRadar();
    }
  }


handleGetAllRadars(){
  this.radarsService.getAllRadars().subscribe({
    next : data => {
      this.radars = data;
    },
    error : err => {
      this.errMessage = err;
    }
  });
}

  handledeleteRadar(r : Radar) {

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

        this.radarsService.deleteRadar(r.id).subscribe({
          next : (data) => {
            //this.handleGetAllProducts()
            let index = this.radars.indexOf(r);
            this.radars.splice(index, 1)
          }
        });


      }
    })
  }

  handleSearchRadar(){
    this.currentAction = "search";
    let keyword = this.searchFormGroup.value.keyword;

    this.radarsService.searchRadar(keyword).subscribe({
      next : (data) => {
        this.radars= data.content;
        this.totalPages = data.totalPages;
      }
    })
  }


  handleNewRadar() {
    this.router.navigateByUrl("admin/newRadar")
  }

  handleEditRadar(r: Radar) {
    this.router.navigateByUrl("admin/editRadar/"+r.id)
  }

  handleSetOn(r: any) {
    let on = r.status;
    r.status = !on;
  }
}
