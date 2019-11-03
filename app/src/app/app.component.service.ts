import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})
export class AppService {

    public showHeader: boolean;

    constructor() {
    }

    getShowHeader() {
        return this.getShowHeader;
    }

    setShowHeader(showHeader: boolean) {
        this.showHeader = showHeader;
    }

}
