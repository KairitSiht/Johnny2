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
			.then(users => this.userList = users)
    }
	addComment() {
        console.log("no midagigi");
		let client = new HttpClient();

		client.fetch('http://localhost:8080/users/add', {
			'method': "POST",
			'body': json(this.userData.comment)
		})
			.then(response => response.json())
			.then(data => {
		});
        
        this.userData.comment='';
        alert('Comment added!');
        }

}


