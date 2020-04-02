package be.intecbrussel.sellers;
import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavour;
import be.intecbrussel.eatables.IceRocket;
import  be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public interface IceCreamSeller extends Profitable{
	
	 Cone orderCone(Flavour[] balls);
	 IceRocket orderIceRocket();
	 Magnum orderMagnum(MagnumType type);
	 
	

}
