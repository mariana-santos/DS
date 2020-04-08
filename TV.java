public class TV {
	boolean ligado;
	int canal;
	int volume;
	public boolean isLigado() {
		return ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	public void ligar() {
		setLigado(true);
	}
	public void desligar() {
		setLigado(false);
	}
	
	public void aumentar() {
		if(volume > 99) {
			System.out.println("Volume já é 100. Tente reduzir");
		}else {
			setVolume(getVolume()+1);
		}
	}
	public void reduzir() {
		if(volume < 1) {
			System.out.println("Volume já é 0. Tente aumentar");
		}else {
			setVolume(getVolume()-1);
		}
	}
	
	public void trocarCanalParaCima() {
		if (canal > 998) {
			System.out.println("Canal já é 999. Tente trocar o canal para baixo");
		}else {
			setCanal(getCanal()+1);
		}
	}
	public void trocarCanalParaBaixo() {
		if (canal < 1) {
			System.out.println("Canal já é 1. Tente trocar o canal para cima");
		}else {
			setCanal(getCanal()-1);
		}
	}
	
	public void mostrar() {
		if(isLigado() == true) {
			System.out.println("A TV está ligada");
			System.out.println("O canal está em "+canal);
			System.out.println("O volume está em "+volume);
		}else {
			System.out.println("A TV está desligada");
		}
	}
}
