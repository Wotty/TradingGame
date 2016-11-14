package Fuctionality;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class User {
	public SimpleIntegerProperty  UserID;
	public SimpleStringProperty Username;
	public SimpleStringProperty FirstName;
	public SimpleStringProperty Password;
	public SimpleFloatProperty Capital;
	public SimpleIntegerProperty DayNum;
	public SimpleFloatProperty Time;

	User(int userID,String username, String firstName, String password,
			float capital, int dayNum, int time){
		this.UserID =  new SimpleIntegerProperty(userID);
		this.Username =  new SimpleStringProperty(username);
		this.FirstName =  new SimpleStringProperty(firstName);
		this.Password =  new SimpleStringProperty(password);
		this.Capital =  new SimpleFloatProperty(capital);
	}

	/**
	 * @return the userID
	 */
	public int getUserID() {
		return UserID.get();
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		UserID = new SimpleIntegerProperty(userID);
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return Username.get();
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		Username = new SimpleStringProperty(username);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName.get();
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName =  new SimpleStringProperty(firstName);
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password.get();
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password =  new SimpleStringProperty(password);
	}

	/**
	 * @return the capital
	 */
	public float getCapital() {
		return Capital.get();
	}

	/**
	 * @param capital the capital to set
	 */
	public void setCapital(float capital) {
		Capital =  new SimpleFloatProperty(capital);
	}

	/**
	 * @return the dayNum
	 */
	public int getDayNum() {
		return DayNum.get();
	}

	/**
	 * @param dayNum the dayNum to set
	 */
	public void setDayNum(int dayNum) {
		DayNum =  new SimpleIntegerProperty(dayNum);
	}

	/**
	 * @return the time
	 */
	public float getTime() {
		return Time.get();
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(float time) {
		Time =  new SimpleFloatProperty(time);
	}

}
