import {Component, Input, OnInit} from '@angular/core';
import {FolderTree} from "../../model/reguests/treeview.model";

@Component({
    selector: 'app-request-tree',
    templateUrl: './request-tree.component.html'
})
export class RequestTreeComponent implements OnInit {

    @Input() requestTree: FolderTree[] = [];

    ngOnInit(): void {
        console.log(this.requestTree);
    }

    getRequestBadgeClass(method: string) {
        return {'text-bg-success': method == 'GET',
            'text-bg-danger': method == 'DELETE',
            'text-bg-primary': method == 'PUT',
            'text-bg-warning': method == 'POST'}
    }
}