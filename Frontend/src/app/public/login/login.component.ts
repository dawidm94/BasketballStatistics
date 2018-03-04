import { Component, OnInit, Renderer2 } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private renderer: Renderer2) {
	  this.renderer.setStyle(document.body, 'background', 'url("assets/images/login-background.jpg") no-repeat  fixed');
	  this.renderer.setStyle(document.body, '-webkit-background-size', 'cover');
	  this.renderer.setStyle(document.body, '-moz-background-size', 'cover');
	  this.renderer.setStyle(document.body, '-o-background-size', 'cover');
	  this.renderer.setStyle(document.body, 'background-size', 'cover');
  }

  ngOnInit() {
  }

}
