public class UsaTV {
	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.ligar();
		
		tv.aumentar();
		tv.aumentar();
		tv.aumentar();
		
		tv.reduzir();
		tv.reduzir();
		tv.reduzir();
		
		tv.trocarCanalParaCima();
		tv.trocarCanalParaCima();
		tv.trocarCanalParaCima();
		tv.trocarCanalParaCima();
		
		tv.mostrar();
		
		tv.desligar();
		tv.mostrar();
	}
}
