import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Client } from 'src/app/model/Client';
import { ServiceService } from 'src/app/Service/service.service';


@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {


  clientNew: Client={
    id_client:0,
    name:'',
    last_name:'',
    direction:'',
    birthdate:new Date(),
    phone:0,
    email:''};
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
  }


  addClient(){
    this.service.saveClient(this.clientNew).subscribe(
      res=>{
        this.router.navigate(['/listat'])
      },
      err=>console.log(err)
    );
  }

  

}
