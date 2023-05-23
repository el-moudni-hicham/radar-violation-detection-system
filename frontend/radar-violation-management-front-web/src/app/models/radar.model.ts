export interface Radar {
  id : number;
  name : string;
  maxSpeed: number;

  status: boolean;
  longitude: number;
  latitude: number;
}

export interface PageRadar {
  radars : Radar[];
  page : number;
  size : number;
  totalPages : number;
}
