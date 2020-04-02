package be.intecbrussel.sellers;
import be.intecbrussel.eatables.*;

import be.intecbrussel.eatables.Cone.Flavour;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamCar implements IceCreamSeller {
	
	PriceList pricelist;
	Stock stock;
	double profit;
	
	public IceCreamCar(PriceList pricelist,Stock stock)
	{
		this.pricelist=pricelist;
		this.stock=stock;
	}
	
	public Cone orderCone(Flavour[] balls)
	{
		return null;
	}
	private Cone prepareCone(Flavour[] balls)
	{
		return null;
	}
	public IceRocket orderIceRocket()
	{
		return null;
	}
	private IceRocket prepareRocket()
	{
	return null;	
	}
	public Magnum orderMagnum(MagnumType type)
	{
		return null;
	}
	private Magnum prepareMagnum(MagnumType type)
	{
		return null;
	}
	public double getProfit()
	{
		return profit;
	}
	

}
