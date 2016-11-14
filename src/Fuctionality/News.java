package Fuctionality;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class News {
	public SimpleIntegerProperty NewsID;
	public SimpleIntegerProperty Scale;
	public SimpleStringProperty NewsArticle;
	public SimpleIntegerProperty StockID;

	public News(int newsID, int scale, String newsArticle, int stockID) {
		this.NewsID = new SimpleIntegerProperty(newsID);
		this.Scale = new SimpleIntegerProperty(scale);
		this.NewsArticle = new SimpleStringProperty(newsArticle);
		this.StockID = new SimpleIntegerProperty(stockID);
	}
	/**
	 * @return the newsID
	 */
	public SimpleIntegerProperty getNewsID() {
		return NewsID;
	}
	/**
	 * @param newsID the newsID to set
	 */
	public void setNewsID(SimpleIntegerProperty newsID) {
		NewsID = newsID;
	}
	/**
	 * @return the scale
	 */
	public SimpleIntegerProperty getScale() {
		return Scale;
	}
	/**
	 * @param scale the scale to set
	 */
	public void setScale(SimpleIntegerProperty scale) {
		Scale = scale;
	}
	/**
	 * @return the newsArticle
	 */
	public SimpleStringProperty getNewsArticle() {
		return NewsArticle;
	}
	/**
	 * @param newsArticle the newsArticle to set
	 */
	public void setNewsArticle(SimpleStringProperty newsArticle) {
		NewsArticle = newsArticle;
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
	public void setStockID(SimpleIntegerProperty stockID) {
		StockID = stockID;
	}
}