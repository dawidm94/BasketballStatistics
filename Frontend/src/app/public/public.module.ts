import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import { PasswordModule } from 'primeng/primeng';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [LoginComponent]
})
export class PublicModule { }
