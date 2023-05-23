import { Component } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {RadarsService} from "../../../services/radars.service";
import {ActivatedRoute, Router} from "@angular/router";

import Swal from 'sweetalert2';
import {Radar} from "../../../models/radar.model";
@Component({
  selector: 'app-edit-radar',
  templateUrl: './edit-radar.component.html',
  styleUrls: ['./edit-radar.component.css']
})
export class EditRadarComponent {
  radarId! : number;
  radar! : Radar
  radarFormGroup! : FormGroup;

  constructor(private fb : FormBuilder,
              private router : Router,
              public radarService : RadarsService,
              private route : ActivatedRoute) {
    this.radarId = this.route.snapshot.params['id'];
  }

  ngOnInit(): void {
    this.radarService.getRadar(this.radarId).subscribe({
      next : data => {
        this.radar = data;

        this.radarFormGroup = this.fb.group({
          name : this.fb.control(this.radar.name,[Validators.required, Validators.maxLength(4)]),
          maxSpeed : this.fb.control(this.radar.maxSpeed, [Validators.min(100)]),
          longitude : this.fb.control(this.radar.longitude, [Validators.required]),
          latitude : this.fb.control(this.radar.latitude, [Validators.required])
        });

      },
      error : err => {
        console.log(err);
      }
    })
  }

  handleEditRadar() {
    let r = this.radarFormGroup.value;
    r.id = this.radar.id;

    Swal.fire({
      title: 'Do you want to save the changes?',
      //showDenyButton: true,
      showCancelButton: true,
      confirmButtonText: 'Save',
      denyButtonText: `Don't save`,
    }).then((result) => {
      /* Read more about isConfirmed, isDenied below */
      if (result.isConfirmed) {
        Swal.fire('Saved!', '', 'success')

        this.radarService.editRadar(r).subscribe({
          next : data => {

            //alert("Radar Updated Successfully")
            this.router.navigate(['/radars']);
            this.radarFormGroup.reset()
          },
          error : err => {
            console.log(err);
          }
        })

      } else if (result.isDenied) {
        Swal.fire('Changes are not saved', '', 'info')
      }
    })

  }
}
