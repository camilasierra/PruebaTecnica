import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddComponent } from './Client/add/add.component';
import { EditComponent } from './Client/edit/edit.component';
import { ListatComponent } from './Client/listat/listat.component';

import { AddProductComponent } from './Product/addProduct/addProduct.component';
import { EditProductComponent } from './Product/editProduct/editProduct.component';
import { ListatProductComponent } from './Product/listatProduct/listatProduct.component';

import { AddBillComponent } from './Bill/add-bill/add-bill.component';
import { EditBillComponent } from './Bill/edit-bill/edit-bill.component';
import { ListatBillComponent } from './Bill/listat-bill/listat-bill.component';
import { ListatDetailComponent } from './Detail/listat-detail/listat-detail.component';

const routes: Routes = [
  {path:'', redirectTo:'listat', pathMatch:'full'},
  
  {path:'listat',component:ListatComponent},
  {path:'add', component:AddComponent},
  {path:'edit',component:EditComponent},

  {path:'listatProduct',component:ListatProductComponent},
  {path:'addProduct', component:AddProductComponent},
  {path:'editProduct',component:EditProductComponent},

  {path:'listatBill',component:ListatBillComponent},
  {path:'listatDetail',component:ListatDetailComponent},
  {path:'addBill', component:AddBillComponent},
  {path:'editBill',component:EditBillComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
