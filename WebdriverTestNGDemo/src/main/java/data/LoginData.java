package data;


public class LoginData {
  
  private String userName;

  private String password;

  private String errorMessage;

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getErrorMessage() {
	return errorMessage;
}

public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
}
