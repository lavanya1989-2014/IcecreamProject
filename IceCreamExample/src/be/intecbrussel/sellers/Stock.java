package be.intecbrussel.sellers;

public class Stock {
	
	public int iceRockets;
	public int cones;
	public int balls;
	public int magni;
	
	public Stock(int i,int c,int b,int m)
	{
		this.iceRockets=i;
		this.cones=c;
		this.balls=b;
		this.magni=m;
	}
	
	
	

	public int getCones() {
		return cones;
	}
	public void setCones(int cones) {
		this.cones = cones;
	}
	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	public int getIceRockets() {
		return iceRockets;
	}
	public void setIceRockets(int iceRockets) {
		this.iceRockets = iceRockets;
	}
	public int getMagni() {
		return magni;
	}
	public void setMagni(int magni) {
		this.magni = magni;
	}
	
	
	
}
