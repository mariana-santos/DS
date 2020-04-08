public class Quadrado {
	private double lado;
	public void setLado(double l) {
		if( l < 0 ) throw new RuntimeException ("Lado invalido");
			lado = l;
       }
	
	public double área() {
		return lado * lado;
	}
}