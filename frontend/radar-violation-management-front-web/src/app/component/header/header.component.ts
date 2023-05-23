import { Component, OnInit } from '@angular/core';
import {AuthentificationsService} from "../../services/authentifications.service";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {


  constructor(public authService:AuthentificationsService) { }

  ngOnInit(): void {

  }

}
