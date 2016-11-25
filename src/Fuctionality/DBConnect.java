package Fuctionality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DBConnect {

	private static Connection conn;
	private static String url = "jdbc:sqlite:StockDB.db";
	
	public static Connection connect() throws SQLException{
		try{
			Class.forName("org.sqlite.JDBC").newInstance();
		}catch(ClassNotFoundException cnfe){
			System.err.println("Error: "+cnfe.getMessage());
		}catch(InstantiationException ie){
			System.err.println("Error: "+ie.getMessage());
		}catch(IllegalAccessException iae){
			System.err.println("Error: "+iae.getMessage());
		}

		conn = DriverManager.getConnection(url,"root","root");
		return conn;
	}
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		if(conn !=null && !conn.isClosed())
			return conn;
		connect();
		return conn;

	}
	public static ObservableList<Stock> stockPopulate(ObservableList<Stock> data){
		data = FXCollections.observableArrayList();
		try{
			connect();
			//SQL FOR SELECTING ALL OF News
			String SQL = "SELECT StockId, StockName, StockPrice from StockTable";
			//ResultSet (Set that contains all sql)
			ResultSet rs = conn.createStatement().executeQuery(SQL);


			//Data added to ObservableList *
			int count = 0;
			while(rs.next()){
				//Iterate Row
				Stock entry = new Stock(rs.getInt(0),rs.getString(1) , rs.getInt(2), rs.getFloat(3));

				System.out.println("Row ["+ count++ +"] added " + entry.getStockName());
				data.add(entry);
				
			}
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("Error on Building Data");             
		}
		return data;
	}
	public static ObservableList<News> newsPopulate(ObservableList<News> data,String StockId){
		data = FXCollections.observableArrayList();
		try{
			//SQL FOR SELECTING ALL OF News
			PreparedStatement prep = conn.prepareStatement("SELECT newsId, newsName, Area FROM NewsTable WHERE StockId = ?");
			prep.setString(1,StockId);
			prep.execute();
			
			//ResultSet (Set that contains all sql)
			ResultSet rs = prep.getResultSet();

			//Data added to ObservableList *
			int count = 0;
			while(rs.next()){
				//Iterate Row
				News entry = new News(rs.getInt(0), rs.getInt(1), rs.getString(2), rs.getInt(3));

				System.out.println("Row ["+ count++ +"] added " + entry.getNewsArticle());
				data.add(entry);
				
			}
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("Error on Building Data");             
		}
		return data;
	}
	public static News addNews(String newsId, String StockID){
		try{
			//SQL FOR SELECTING News
			conn.createStatement().execute("UPDATE NewsTable SET StockId = " + StockID + " WHERE newsId = "+ newsId);

			PreparedStatement prep = conn.prepareStatement("SELECT newsId, newsName, Area FROM NewsTable WHERE newsId = ?");
			prep.setString(1,newsId);
			prep.execute();
			
			ResultSet rs = prep.getResultSet();

			while(rs.next()){
				//Iterate Row
				News entry = new News(rs.getInt(0), rs.getInt(1), rs.getString(2), rs.getInt(3));
				return entry;		
			}
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("Error on Building Data");             
		}
		return null;
	}
}