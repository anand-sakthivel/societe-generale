import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { AppService } from '../app.component.service';
import { Employee } from '../model/employee.model';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  constructor(private appService: AppService,
    private employeeSerive: EmployeeService) {
    this.appService.setShowHeader(true);
  }

  employeeForm: FormGroup;
  firstName: FormControl;
  lastName: FormControl;
  gender: FormControl;
  dob: FormControl;
  department: FormControl;
  submitted = false as boolean;
  success = false as boolean;
  errorMsg: string;

  get genders(): string[] {
    return [
      'Male',
      'Female'
    ];
  }

  registerEmployee() {
    if (this.employeeForm.invalid) {
      this.submitted = true;
    } else {
      this.submitted = false;
      const employee = new Employee();
      employee.firstName = this.employeeForm.value.name.firstName;
      employee.lastName = this.employeeForm.value.name.lastName;
      employee.dob = this.employeeForm.value.dob;
      employee.gender = this.employeeForm.value.gender;
      employee.department = this.employeeForm.value.department;
      console.log(employee);

      this.employeeSerive.registerEmployee(employee).subscribe(result => {
        if (result) {
          this.employeeForm.reset();
          this.success = true;
          this.errorMsg = 'Successfully Saved.';
        } else {
          this.success = false;
          this.errorMsg = 'Failed to save.';
        }
        setTimeout(() => {
          this.success = null;
        }, 1000);
      });
    }
  }

  createEmployeeFormControls() {
    this.firstName = new FormControl('', Validators.required);
    this.lastName = new FormControl('', Validators.required);
    this.gender = new FormControl('', Validators.required);
    this.dob = new FormControl('', Validators.required);
    this.department = new FormControl('', Validators.required);
  }

  createEmployeeForm() {
    this.employeeForm = new FormGroup({
      name: new FormGroup({
        firstName: this.firstName,
        lastName: this.lastName
      }),
      gender: this.gender,
      dob: this.dob,
      department: this.department
    });
  }

  ngOnInit() {
    this.createEmployeeFormControls();
    this.createEmployeeForm();
  }
}
