package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class PriceList {

		Magnum magnum=new Magnum();
		double ballPrice;
		double rocketPrice;
		double magnumStandardPrice;
		
		public PriceList()
		{
			
		}
		public PriceList(double ballPrice,double rocketPrice,double magnumStandardPrice)
		{
			
			setBallPrice( ballPrice);
			//this.ballPrice=ballPrice;
			setRocketPrice( rocketPrice);
			//this.rocketPrice=rocketPrice;
			setMagnumStandardPrice( magnumStandardPrice );
			//this.magnumStandardPrice=magnumStandardPrice;

			{
				this.magnumStandardPrice=magnumStandardPrice;
			}
		}
		public void setBallPrice(double ballPrice)
		{
			this.ballPrice=ballPrice;
		}
		public void setRocketPrice(double rocketPrice)
		{
			this.rocketPrice=rocketPrice;
		}
		public void setMagnumStandardPrice(double magnumStandardPrice )
		{
			this.magnumStandardPrice=magnumStandardPrice;
		}
		public double getBallPrice()
		{
			return ballPrice;
		}
		public double getRocketPrice()
		{
			return rocketPrice;
		}
		public double getMagnumPrice(MagnumType type )
	     {
	
			if(type!=MagnumType.ALPINENUTS)
				return this.magnumStandardPrice ;
			else 
				return this.magnumStandardPrice *1.5; 
			
		}
	}



