import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {DashboardComponent} from "./component/dashboard/dashboard.component";
import {RadarsComponent} from "./component/radar/radars/radars.component";
import {VehiclesComponent} from "./component/vehicles/vehicles.component";
import {InfractionsComponent} from "./component/infractions/infractions.component";
import {NewRadarComponent} from "./component/radar/new-radar/new-radar.component";
import {EditRadarComponent} from "./component/radar/edit-radar/edit-radar.component";
import {AdminTemplateComponent} from "./component/admin-template/admin-template.component";
import {AuthenticationGuard} from "./component/guards/authentication.guard";
import {AuthentificationsComponent} from "./component/authentifications/authentifications.component";
import {WelcomeComponent} from "./component/welcome/welcome.component";

const routes: Routes = [

  {path:"admin",component:AdminTemplateComponent,canActivate:[AuthenticationGuard],children:[
      {path : "", component : WelcomeComponent},
      {path : "dashboard", component : DashboardComponent},
      {path : "radars", component : RadarsComponent},
      {path : "vehicles", component : VehiclesComponent},
      {path : "infractions", component : InfractionsComponent},
      {path : "newRadar", component : NewRadarComponent},
      {path: 'editRadar/:id', component: EditRadarComponent }
    ]},
  {path: "", component: AuthentificationsComponent },
  {path: "login", component: AuthentificationsComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
