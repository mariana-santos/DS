public class UsaCaminhao {
	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao();
		
		caminhao.mostrar();
		System.out.println();
		
		caminhao.aumentarVelocidade();
		caminhao.aumentarVelocidade();
		caminhao.aumentarVelocidade();
		caminhao.aumentarVelocidade();
		caminhao.aumentarVelocidade();
		caminhao.aumentarVelocidade();
		
		caminhao.substituirCombustivel("gas");
		
		caminhao.mostrar();
	}
}
