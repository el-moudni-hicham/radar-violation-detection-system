export interface Infraction {
  id: number;
  date: any;
  radarId: number;
  paid: boolean;
  vehicleMatricule: string;
  vehicle: any;
  vehicleSpeed: number;
  radar: any;
  radarMaxSpeed: number;
  infractionAmount: number;
}
