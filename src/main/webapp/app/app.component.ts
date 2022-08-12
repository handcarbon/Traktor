import { Component } from '@angular/core';

import { faTractor } from '@fortawesome/free-solid-svg-icons';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html'
})
export class AppComponent {
    faTractor = faTractor;
}