public class Caminhao {
	double velocidade;
	String combust�vel = "gasolina";
	
	
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public String getCombust�vel() {
		return combust�vel;
	}
	public void setCombust�vel(String combust�vel) {
		this.combust�vel = combust�vel;
	}
	
	public void substituirCombustivel(String combustivel) {
		if(combustivel.contentEquals("gasolina") || combustivel.contentEquals("diesel") || combustivel.contentEquals("gas")) {
			setCombust�vel(combustivel);
		}else {
			System.out.println("Tente digitar um combust�vel v�lido: 'gas', 'diesel' ou 'gasolina'");
		}
	}
	
	public void aumentarVelocidade() {
		if(velocidade > 140) {
			System.out.println("Velocidade j� � 150km/h. Tente reduz�-la");
		}else {
			setVelocidade(getVelocidade()+10);
		}
		
	}
	public void diminuirVelocidade() {
		if(velocidade < 10) {
			System.out.println("Velocidade j� � 0km/h. Tente aument�-la");
		}else {
			setVelocidade(getVelocidade()-10);
		}
	}
	
	public void mostrar() {
		System.out.println("O caminh�o est� rodando a "+getVelocidade()+" km/h");
		System.out.println("O combust�vel � "+getCombust�vel());
	} 
	
}
