package Fuctionality;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Order {

	public SimpleIntegerProperty StockID;
	public SimpleIntegerProperty UserID;
	public SimpleFloatProperty Time;
	public SimpleIntegerProperty DayNumber;
	public SimpleIntegerProperty Qty;
	public SimpleFloatProperty Price;

	public Order(int stockID, int userID, float time,
			int dayNumber, int qty, float price) {
		this.StockID = new SimpleIntegerProperty(stockID);
		this.UserID = new SimpleIntegerProperty(userID);
		this.Time = new SimpleFloatProperty(time);
		this.DayNumber = new SimpleIntegerProperty(dayNumber);
		this.Qty = new SimpleIntegerProperty(qty);
		this.Price = new SimpleFloatProperty(price);	
	}
	/**
	 * @return the stockID
	 */
	public SimpleIntegerProperty getStockID() {
		return StockID;
	}
	/**
	 * @param stockID the stockID to set
	 */
	public void setStockID(int stockID) {
		this.StockID = new SimpleIntegerProperty(stockID);
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
	public void setUserID(SimpleIntegerProperty userID) {
		UserID = userID;
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
		Time = new SimpleFloatProperty(time);
	}
	/**
	 * @return the dayNumber
	 */
	public int getDayNumber() {
		return DayNumber.get();
	}
	/**
	 * @param dayNumber the dayNumber to set
	 */
	public void setDayNumber(int dayNumber) {
		DayNumber = new SimpleIntegerProperty(dayNumber);
	}
	/**
	 * @return the qty
	 */
	public int getQty() {
		return Qty.get();
	}
	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		Qty = new SimpleIntegerProperty(qty);
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return Price.get();
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		Price = new SimpleFloatProperty(price);
	}
}