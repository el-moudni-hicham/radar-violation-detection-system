import { Component, OnInit } from '@angular/core';
import {RadarsService} from "../../services/radars.service";
import {VehiclesService} from "../../services/vehicles.service";
import {InfractionsService} from "../../services/infractions.service";
import {AuthentificationsService} from "../../services/authentifications.service";

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  radarsCount! : number;
  vehicleCount! : number;
  infractionsCount! : number;
  constructor(public radarService : RadarsService,
              public vehicleService : VehiclesService,
              public infractionService : InfractionsService,
              public authService : AuthentificationsService) { }

  ngOnInit(): void {
    this.getRadarsCount();
    this.getVehiclesCount();
    this.getInfractionsCount();
  }

  getRadarsCount() {
    this.radarService.getRadarsCount()
      .subscribe(count => {
        this.radarsCount = count;
      });
  }

  getVehiclesCount() {
    this.vehicleService.getVehiclesCount()
      .subscribe(count => {
        this.vehicleCount = count;
      });
  }

  getInfractionsCount() {
    this.infractionService.getInfractionsCount()
      .subscribe(count => {
        this.infractionsCount = count;
      });
  }
}
