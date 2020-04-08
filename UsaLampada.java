public class UsaLampada {
	public static void main(String[] args) {
		
		Lampada lampada1 = new Lampada();
		Lampada lampada2 = new Lampada();
		
		lampada1.ligar();
		lampada2.desligar();
		
		System.out.println("Lâmpada 1"+lampada1.observar());
		System.out.println("Lâmpada 2"+lampada2.observar());
	}
}
