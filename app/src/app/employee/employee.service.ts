import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee.model';

@Injectable({
    providedIn: 'root'
})
export class EmployeeService {

    public apiURL: string = environment.apiURL;

    constructor(private http: HttpClient) {
    }

    registerEmployee(employee: Employee) {
        return this.http.post(this.apiURL + '/registerEmployee', employee, {
            observe: 'response'
        });
    }

    getemployeeList(): Observable<Employee[]> {
      return this.http.get<Employee[]>(this.apiURL + '/employeeList');
    }
}
