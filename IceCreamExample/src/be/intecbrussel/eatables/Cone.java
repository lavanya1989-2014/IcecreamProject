package be.intecbrussel.eatables;
import java.util.Arrays;

public class Cone implements Eatable {
	public enum Flavour {
		STRAWBERRY,BANANA,CHOCOLATE,VANILLA,LEMON,STRACIATELLA,MOKKA,PISTACHE;
	}
	//public Flavour[] balls= {Flavour.STRAWBERRY,Flavour.BANANA,Flavour.VANILLA};
	public Flavour[] balls;
	
	public Cone()
	{
		
	}
	public Cone(Flavour[] balls)
	{
		this.balls=balls;
	}
	public void eat()
	{
		System.out.println("You are eating Conetype Icecream"+Arrays.toString(balls));
	}

}
