import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class EventosService {

  private API_SERVER = "http://localhost:8070/eventos/";

  constructor(
    private httpClient: HttpClient
  ) { }

  //Metodos//
  public getAllEventos(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }

  public saveEvent(evento:any): Observable<any>{
    return this.httpClient.post(this.API_SERVER, evento);
  }
}
