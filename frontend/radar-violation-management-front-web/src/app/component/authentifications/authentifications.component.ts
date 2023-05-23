import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {Router} from "@angular/router";
import {AuthentificationsService} from "../../services/authentifications.service";
import {UserAppModel} from "../../models/userApp.model";

@Component({
  selector: 'app-authentifications',
  templateUrl: './authentifications.component.html',
  styleUrls: ['./authentifications.component.css']
})
export class AuthentificationsComponent implements OnInit{
  formGroup!:FormGroup;
  error!:string;
  userApp!: UserAppModel;

  constructor(private authentificatService:AuthentificationsService,private fb:FormBuilder,private router:Router) {

  }

  ngOnInit(): void {
    this.formGroup=this.fb.group({
      username:this.fb.control(null),
      password:this.fb.control(null)
    })
  }

  submit() {
    console.log(this.formGroup.value)
    let username=this.formGroup.value.username;
    let password=this.formGroup.value.password;
    this.authentificatService.login(username,password).subscribe({
      next:(data)=>{
        this.userApp=data;
        this.authentificatService.authenticat(this.userApp).subscribe({
          next:(data)=>{
            this.router.navigateByUrl("/admin");
          },
          error:(err)=>{this.error=err}
        })
      },
      error:(err)=>{
        this.error=err;
      }
    })
  }
}
