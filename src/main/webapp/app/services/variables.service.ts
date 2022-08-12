import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {Variable} from "../model/variables/variables.model";

@Injectable({
  providedIn: 'root'
})
export class VariablesService {

  // TODO env host
  private readonly apiUrl = `http://localhost:8080/api/v1/variables`;

  data: string = '[\n' +
      '  {"id": 1, "name": "uuid()", "type": "system", "value": null, "description": "Random uuid generation function"},\n' +
      '  {"id": 2, "type": "user", "value": "******", "description": "X Systems API token"}\n' +
      ']'

  constructor(private http: HttpClient) {
  }

  getAllVariables(): Observable<Variable[]> {
    const url: string = `${this.apiUrl}`;

    const variables: Variable [] = JSON.parse(this.data)
    //return this.http.get<Variable[]>(url);
    return new Observable<Variable[]>(subscriber => subscriber.next(variables));
  }
}

