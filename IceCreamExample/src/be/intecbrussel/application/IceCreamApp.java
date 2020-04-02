package be.intecbrussel.application;
import be.intecbrussel.eatables.*;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.eatables.Cone.Flavour;
import be.intecbrussel.sellers.*;

public class IceCreamApp {

	public static void main(String[] args) {
		
		 PriceList priceList=new PriceList(1.5,1.8,20.5);
		 Stock stock=new Stock(15,18,16,40);
		
		stock.getIceRockets();
		

	}

}
