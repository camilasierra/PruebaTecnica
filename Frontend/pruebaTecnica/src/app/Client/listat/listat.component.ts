import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Client } from 'src/app/model/Client';
import { ServiceService } from '../../Service/service.service';


@Component({
  selector: 'app-listat',
  templateUrl: './listat.component.html',
  styleUrls: ['./listat.component.css']
})
export class ListatComponent implements OnInit {
  list:any=[];
  constructor(private service:ServiceService) { }

  ngOnInit(): void {
   this.listClient();
  }

  listClient(){
    this.service.getClients().subscribe(
      res=>{
        this.list=res;},
      err=>console.log(err)
    );
  }

}
