import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms"; //Formularios//
import {EventosService} from './services/eventos/eventos.service'; //Importar servicio//

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  //Variables//
  eventForm: FormGroup;
  evento: any;
  title: any;
  
  constructor( //declarar elementos
    public form: FormBuilder,
    public eventService: EventosService
  ){

  }
  ngOnInit(): void {
    this.eventForm = this.form.group({
      id: ['', Validators.required],
		  nombre: ['', Validators.required],
		  fecha: ['', Validators.required],
    });;
  }

  save():void{

  }
}
