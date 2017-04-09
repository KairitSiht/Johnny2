import {HttpClient, json} from 'aurelia-fetch-client'

export class Home {

	userList = []

	constructor() {
		this.message = "Just checking..."
	}
    
	activate() {
		let client = new HttpClient();

		client.fetch('http://localhost:8080/users')
			.then(response => response.json())
			.then(users => this.userList = users)
    }
}