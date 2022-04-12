import { Component, OnInit } from '@angular/core';
import { BillService } from '../../Service/bill.service';

@Component({
  selector: 'app-listat-detail',
  templateUrl: './listat-detail.component.html',
  styleUrls: ['./listat-detail.component.css']
})
export class ListatDetailComponent implements OnInit {
  list:any=[];
  constructor(private billservice:BillService) { }


  ngOnInit(): void {
   
    this.listDetail();
  }

  listDetail(){
    this.billservice.getDetails().subscribe(
      res=>{
        this.list=res;
      },
      err=>console.log(err)
    );
  }

}


  

