package ttu.tteh.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class logInRequest {
	String realName;
	String passWord;

	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
