package be.intecbrussel.sellers;
import be.intecbrussel.eatables.*;
import be.intecbrussel.eatables.Cone.Flavour;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamSalon implements IceCreamSeller{
	
	public PriceList priceList;
	public double totalProfit;
	
	public IceCreamSalon(PriceList priceList)
	{
		this.priceList=priceList;
	}
	
	public double getProfit()
	{
		return totalProfit;
	}
	public Cone orderCone(Flavour[] balls)
	{
		totalProfit+=PriceList.getBallPrice();
		return new Cone();
		
	}
	
	public IceRocket orderIceRocket()
	{
		totalProfit+=PriceList.getRocketPrice();
		return new IceRocket();
	}
	public Magnum orderMagnum(MagnumType type)
	{
		totalProfit+=PriceList.getMagnumPrice(Magnum.MagnumType.ALPINENUTS);
		return new Magnum(); 
	}
	
	@Override
	
	public String toString()
	{
		return "IceCreamSalon [ Total Profit: " + totalProfit +"]";
	}

}
