import { Component, OnInit, Renderer2 } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { API_URL } from '../../config';

@Component({
	selector: 'app-login',
	templateUrl: './login.component.html',
	styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

	showRegistration: boolean = false;
	showLogin: boolean = true;
	login: any;
	password: any;


	constructor(private renderer: Renderer2, private router: Router, private http:HttpClient) {
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
		console.log(this.login);
		console.log(this.password);
		this.http.post(API_URL+'user/login',{"login":this.login,"password":this.password}).subscribe(
			(response) => {
				if(response){
					window.location.href='/home'
				}else{
					console.log('nie zalogowano');
				}
			}
		)
	}

	ngOnInit() {
		//example of http get
		this.http.get(API_URL+'user').subscribe(
			(data:any[]) => {
				console.log(data);
			}
		)
	}

}
