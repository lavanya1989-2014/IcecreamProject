package be.intecbrussel.eatables;

public class Magnum implements Eatable {
	public enum MagnumType {
		MILKCHOCOLATE,WHITECHOCOLATE,BLACKCHOCOLATE,ALPINENUTS,ROMANTICSTRAWBERRIES;
 }

	public MagnumType type;
	
	public Magnum()
	{
		
	}
	public Magnum(MagnumType type)
	{
	this.type=type;
	}
	public MagnumType getType()
	{
		return type;
	}
	public void eat()
	{
		System.out.println("You are eating Magnum type IceCream"+this.type);
	}
	

}
