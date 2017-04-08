import {HttpClient, json} from 'aurelia-fetch-client'

export class people{

	userData = {}
	userList = []
//mdea, mis selle kühvel
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
        this.userData.userName=document.getElementById("userName").value;
        this.userData.age=document.getElementById("age").value;
        this.userData.bio=document.getElementById("bio").value;
		let client = new HttpClient();

		client.fetch('http://localhost:8080/users/add', {
			'method': "POST",
			'body': json(this.userData)
		})
			.then(response => response.json())
			.then(data => {
				console.log("Server saatis " + data.firstName);
		});

		console.log("Method executed!")
	}
}