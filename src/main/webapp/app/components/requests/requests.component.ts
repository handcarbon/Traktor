import {Component, OnInit} from '@angular/core';
import {FolderTree} from "../../model/reguests/treeview.model";
import {RequestTreeService} from "../../services/request-tree.service";

@Component({
    selector: 'app-requests',
    templateUrl: './requests.component.html'
})
export class RequestsComponent implements OnInit {

    tree: FolderTree[] = [];

    constructor(private requestTreeService: RequestTreeService) {
    }

    ngOnInit(): void {
        console.log("ng init RequestsComponent");
        this.requestTreeService.getTree().subscribe((data: FolderTree[]) =>  {
            this.tree = data;
        });
    }
}