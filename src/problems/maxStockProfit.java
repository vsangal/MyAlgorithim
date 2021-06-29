package problems;

import java.util.ArrayList;

public class maxStockProfit {

	public static void main(String[] argc) {
		
		int  stockPrices[] = {3,1,5,3,12};	
		int profit = 0;
		int newProfit = 0;
		int previousStockPrice = stockPrices[0];
		
		//System.out.println("previousStockPrice = " + previousStockPrice);
		
		for (int i = 0; i <stockPrices.length; i++) {
			
			//System.out.println("previousStockPrice = " + previousStockPrice +  " stockPrices[i] " + stockPrices[i]);
				if (stockPrices[i] > previousStockPrice) {
					profit = stockPrices[i] - previousStockPrice;
				}
				previousStockPrice = stockPrices[i];
				if (profit > newProfit) {
					newProfit = profit;
			}
		}
		System.out.println(newProfit);
	}
}
