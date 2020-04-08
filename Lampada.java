public class Lampada {
	boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	public void ligar() {
		setStatus(true);
	}
	
	public void desligar() {
		setStatus(false);
	}
	public String observar() {
		if(isStatus() == true) {
			return " está ligada";
		}else {
			return " está desligada";
		}
	}
}
