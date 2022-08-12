import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {FolderTree} from "../model/reguests/treeview.model";

@Injectable({
  providedIn: 'root'
})
export class StoredRequestsService {

  // TODO env host
  private readonly apiUrl = `http://localhost:8080/api/v1/stored-requests`;


  constructor(private http: HttpClient) {
  }

  getAllStoredRequests(): Observable<FolderTree[]> {
    const url: string = `${this.apiUrl}`;

    return this.http.get<FolderTree[]>(url);
  }
}

