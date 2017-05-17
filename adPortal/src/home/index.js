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
   /* var commentator = commentator;
    var comment = comment;
    var Array = [commentator, comment];
    addComment(){
       
    // var comments = {commentator : this.commentator, comment: this.comment}
     console.log(comments1);
     //var str = JSON.stringify(comments);
       // console.log(str);
  
    }*/
   
}