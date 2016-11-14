package Fuctionality;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Stock {

	public SimpleIntegerProperty StockID;
	public SimpleStringProperty StockName;
	public SimpleIntegerProperty Qty;
	public SimpleFloatProperty Price;

	Stock(int stockID, String stockName, int qty, float price){
		this.StockID =  new SimpleIntegerProperty(stockID);
		this.StockName =  new SimpleStringProperty(stockName);
		this.Qty =  new SimpleIntegerProperty(qty);
		this.Price =  new SimpleFloatProperty(price);
	}
	/**
	 * @return the stockID
	 */
	public int getStockID() {
		return StockID.get();
	}

	/**
	 * @param stockID the stockID to set
	 */
	public void setStockID(int stockID) {
		StockID = new SimpleIntegerProperty(stockID);
	}

	/**
	 * @return the stockName
	 */
	public String getStockName() {
		return StockName.get();
	}

	/**
	 * @param stockName the stockName to set
	 */
	public void setStockName(String stockName) {
		StockName = new SimpleStringProperty(stockName);
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
		Price =  new SimpleFloatProperty(price);
	}
}