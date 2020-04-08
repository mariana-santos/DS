public class Caminhao {
	double velocidade;
	String combustível = "gasolina";
	
	
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public String getCombustível() {
		return combustível;
	}
	public void setCombustível(String combustível) {
		this.combustível = combustível;
	}
	
	public void substituirCombustivel(String combustivel) {
		if(combustivel.contentEquals("gasolina") || combustivel.contentEquals("diesel") || combustivel.contentEquals("gas")) {
			setCombustível(combustivel);
		}else {
			System.out.println("Tente digitar um combustível válido: 'gas', 'diesel' ou 'gasolina'");
		}
	}
	
	public void aumentarVelocidade() {
		if(velocidade > 140) {
			System.out.println("Velocidade já é 150km/h. Tente reduzí-la");
		}else {
			setVelocidade(getVelocidade()+10);
		}
		
	}
	public void diminuirVelocidade() {
		if(velocidade < 10) {
			System.out.println("Velocidade já é 0km/h. Tente aumentá-la");
		}else {
			setVelocidade(getVelocidade()-10);
		}
	}
	
	public void mostrar() {
		System.out.println("O caminhão está rodando a "+getVelocidade()+" km/h");
		System.out.println("O combustível é "+getCombustível());
	} 
	
}
