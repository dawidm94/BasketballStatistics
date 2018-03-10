import { Component, OnInit, Renderer2 } from '@angular/core';
import { Router } from '@angular/router';

@Component({
	selector: 'app-login',
	templateUrl: './login.component.html',
	styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

	showRegistration: boolean = false;
	showLogin: boolean = true;


	constructor(private renderer: Renderer2, private router: Router) {
		this.renderer.setStyle(document.body, 'background', 'url("assets/images/login-background.jpg") no-repeat  fixed');
		this.renderer.setStyle(document.body, '-webkit-background-size', 'cover');
		this.renderer.setStyle(document.body, '-moz-background-size', 'cover');
		this.renderer.setStyle(document.body, '-o-background-size', 'cover');
		this.renderer.setStyle(document.body, 'background-size', 'cover');
	}

	clickRegistration() {
		this.showLogin = false;
		this.showRegistration = true;
	}

	clickLogin() {
		this.showRegistration = false;
		this.showLogin = true;
	}

	logIn() {
		window.location.href='/home'
	}

	ngOnInit() {
	}

}
