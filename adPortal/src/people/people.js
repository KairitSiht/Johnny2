import {HttpClient, json} from 'aurelia-fetch-client'

export class people{

	userData = {}
	userList = []

	constructor() {
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
			'method': "POST",
			'body': json(this.userData)
		})
			.then(response => response.json())
			.then(data => {
		});
        
        alert('Account created ' + this.userData.realName + '!');
        this.userData.age='';
        this.userData.realName='';
        this.userData.userName='';
        this.userData.url='';
        this.userData.passWord='';
        this.userData.interest='';
        this.userData.bio='';
        this.userData.pic='';

	}
}