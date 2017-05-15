package ttu.tteh.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue
	long id;
	public String userName;
	public String realName;
	public String passWord;
	public String pic;
	public int age;
	public String url;
	public String interest;
	public String bio;
	/*  
	 * 
	 * ise loodud getter ja setterid, sest
	 * millegi pärast meil isegi pärast
	 * lombok install ei hakanud tööle
	 * ja selleprst ka igaks juhuks jäetud publicuks, et 
	 * kuidagigi ligi saada
	 * kuigi enda get set töötavad normilt
	 */
	public Object getPassWord() {
		return passWord;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
