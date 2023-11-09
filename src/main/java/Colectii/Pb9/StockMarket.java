package Colectii.Pb9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockMarket {

    private Map<String, Integer> stockPriceByCompany;

    public StockMarket(Map<String, Integer> stockPriceByCompany) {
        this.stockPriceByCompany = stockPriceByCompany;
    }

    public Map<String, Integer> getStockPriceByCompany() {
        return stockPriceByCompany;
    }

    public void setStockPriceByCompany(Map<String, Integer> stockPriceByCompany) {
        this.stockPriceByCompany = stockPriceByCompany;
    }

    public String getMostExpensiveCompany(){
        int maxPrice = 0;
        String mostExpensiveCompany = " ";
        for(String companyName: stockPriceByCompany.keySet()){
            if (stockPriceByCompany.get(companyName) > maxPrice){
                maxPrice = stockPriceByCompany.get(companyName);
                mostExpensiveCompany = companyName;
            }
        }
        return mostExpensiveCompany;
    }
}
