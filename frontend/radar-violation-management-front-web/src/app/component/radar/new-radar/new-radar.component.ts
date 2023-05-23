import { Component } from '@angular/core';
import {FormBuilder, FormGroup, ValidationErrors, Validators} from "@angular/forms";
import {RadarsService} from "../../../services/radars.service";
import {Router} from "@angular/router";
import {error} from "@angular/compiler-cli/src/transformers/util";
import Swal from "sweetalert2";

@Component({
  selector: 'app-new-radar',
  templateUrl: './new-radar.component.html',
  styleUrls: ['./new-radar.component.css']
})
export class NewRadarComponent {
  radarFormGroup! : FormGroup;

  constructor(private fb : FormBuilder,
              public radarService : RadarsService) {

  }

  ngOnInit(): void {
    this.radarFormGroup = this.fb.group({
      name : this.fb.control(null,[Validators.required, Validators.maxLength(4)]),
      maxSpeed : this.fb.control(null, [Validators.min(100)]),
      longitude : this.fb.control(null,[Validators.required]),
      latitude : this.fb.control(null, [Validators.required])
    });

  }

  handleAddRadar() {
    let radar = this.radarFormGroup.value;
    this.radarService.addRadar(radar).subscribe({
      next : data => {
        Swal.fire({
          position: 'center',
          icon: 'success',
          title: 'Your work has been saved',
          showConfirmButton: false,
          timer: 1500
        })
        //alert("Radar Added Successfully")
        this.radarFormGroup.reset()
      },
      error : err => {
        console.log(err);
      }
    })
  }


}
