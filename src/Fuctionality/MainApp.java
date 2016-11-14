package Fuctionality;
/*
Copyright 2014 Zoi Capital, LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import loginApp.Stock;

public class MainApp extends Application implements Initializable{
	@FXML private VBox VBOX1;
	@FXML private VBox VBOX2;
	@FXML private TableView<Stock> AllStockTable;

	@Override
	public void start(Stage stage){
		try {
			//ObservableList<Stock> data = FXCollections.observableArrayList();
			//AllStockTable.getItems().addAll(DBConnect.stockPopulate(data));
			Parent root = FXMLLoader.load(getClass().getResource("/Fuctionality/MainMenu.fxml"));



			Scene scene = new Scene(root);
			stage.setTitle("Trading Game");
			stage.setScene(scene);





			stage.show();
		} catch (IOException e) {
			System.err.println("Exception in the MainApp start method");
			e.printStackTrace();
		}
	}


	public List<BarData> buildBars() {
		int previousClose = 100;


		final List<BarData> bars = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			int open = getNewValue(previousClose);
			int close = getNewValue(open);
			int high = Math.max(open + getRandom(),close);
			int low = Math.min(open - getRandom(),close);
			previousClose = close;

			BarData bar = new BarData(i, open, high, low, close, 1);
			bars.add(bar);
		}
		return bars;
	}

	protected int getNewValue( int previousValue ) {
		int sign;

		if( Math.random() < 0.5 ) {
			sign = -1;
		} else {
			sign = 1;
		}
		return getRandom() * sign + previousValue;
	}

	protected int getRandom() {
		double newValue = 0;
		newValue = Math.random() * 100;
		return (int)newValue;
	}

	/**
	 * The main() method is ignored in correctly deployed JavaFX application.
	 * main() serves only as fallback in case the application can not be
	 * launched through deployment artifacts, e.g., in IDEs with limited FX
	 * support. NetBeans ignores main().
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		CandleStickChart candleStickChart = new CandleStickChart(buildBars());
		candleStickChart.setYAxisFormatter(new DecimalAxisFormatter("#000.00"));
		VBOX1.getChildren().add(0,candleStickChart);
	}
}