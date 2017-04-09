import {HttpClient, json} from 'aurelia-fetch-client'

export class people{

	userData = {}
	userList = []

	constructor() {
		this.appName = "adPortal"
		this.count = 0
	}

	activate() {
		let client = new HttpClient();

		client.fetch('http://localhost:8080/users')
			.then(response => response.json())
			.then(users => this.userList = users);
	}

	addUser() {
        this.userData.age = parseInt(this.userData.age);
        console.log(this, this.userData);
		let client = new HttpClient();

		client.fetch('http://localhost:8080/users/add', {
        //client.fetch('http://httpbin.org/post', {
			'method': "POST",
			'body': json(this.userData)
		})
			.then(response => response.json())
			.then(data => {
				console.log("Server saatis " + data.userName);
		});

		console.log("Method executed!")
	}
}