import {Component, OnInit} from '@angular/core';
import {VariablesService} from "../../services/variables.service";
import {Variable} from "../../model/variables/variables.model";

@Component({
    selector: 'app-variables',
    templateUrl: './variables.component.html'
})
export class VariablesComponent implements OnInit {

    data: Variable[] = [];

    constructor(private variablesService: VariablesService) {
    }

    ngOnInit(): void {
        this.variablesService.getAllVariables().subscribe((data: Variable[]) => {
            this.data = data;
        });
    }
}
