import { Component } from '@angular/core';
import { AppService } from './app.component.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Societe Generale Assessment';

  constructor(private appService: AppService,
    private routes: Router) {
  }

  goToHome() {
    console.log('here h');
    this.appService.setShowHeader(false);
    this.routes.navigate(['/']);
  }

  goToRegister() {
    console.log('here r');
    this.appService.setShowHeader(true);
    this.routes.navigate(['/register']);
  }

  goToEmployeeList() {
    console.log('here e');
    this.appService.setShowHeader(true);
    this.routes.navigate(['/employeeList']);
  }
}
