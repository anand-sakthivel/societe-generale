import { Component, OnInit } from '@angular/core';
import { AppService } from '../app.component.service';
import { EmployeeService } from '../employee/employee.service';
import { Employee } from '../model/employee.model';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  public employeesList: Employee[];
  public errorMsg: string;

  constructor(private appService: AppService,
    private employeeService: EmployeeService) {
    this.appService.setShowHeader(true);
  }

  ngOnInit() {
    this.employeeService.getemployeeList().subscribe((data) => {
      this.employeesList = data;
      console.log(this.employeesList);
    }, (error) => {
      this.errorMsg = error;
    });
  }

}
