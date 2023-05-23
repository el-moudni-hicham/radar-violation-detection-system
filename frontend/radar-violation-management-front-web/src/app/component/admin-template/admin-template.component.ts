import { Component } from '@angular/core';
import {AuthentificationsService} from "../../services/authentifications.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-admin-template',
  templateUrl: './admin-template.component.html',
  styleUrls: ['./admin-template.component.css']
})
export class AdminTemplateComponent {
  constructor(public authenticatUser:AuthentificationsService,private router:Router) {
  }

  logout(){
    this.authenticatUser.logout();
    this.router.navigateByUrl("/login")
  }
}
