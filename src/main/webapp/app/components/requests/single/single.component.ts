import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";


@Component({
    selector: 'app-single-request',
    templateUrl: './single.component.html'
})
export class SingleRequestComponent implements OnInit {


    body: string = '{"json": 1, "id": "{{uuid()}}"}'
    url: string = 'http://vonamor.eu/{{variableX}}'
    tab: string = 'parameters';

    constructor(private activatedRoute: ActivatedRoute) { }

    ngOnInit(): void {
        console.log(this.activatedRoute.snapshot.paramMap.get('id'));
    }


    select(parameter: string) {
        this.tab = parameter;
    }
}