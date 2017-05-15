import {HttpClient, json} from 'aurelia-fetch-client'
export class Home {
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
    logIn(realName, passWord){
        return this.client.fetch('http://localhost:8080/logIn', {
			'method': "POST",
			'body': json(this.userData.realName, this.userData.passWord)
		})
			.then(response => response.json())
			.then(data => {
            localStorage.setItem("realName", userData.realName);
            localStorage.setItem("passWord", userData.passWord);
		});
    }
}