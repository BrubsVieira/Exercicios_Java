package exer3;

public class Porta implements Cloneable {

	double altura;
	double largura;
	boolean aberta;

	public Porta(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
		this.aberta = false;
	}

	public void abrir() {
		aberta = true;
	}

	public void fechar() {
		aberta = false;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

//	@Override // do professor 
//	protected Object clone() throws CloneNotSupportedException {
//		Porta porta = new Porta(this.altura,this.largura);
//		porta.aberta =this.aberta;
//		
//		return porta;
//	} 

	@Override // jeito que eu fiz
	protected Object clone() throws CloneNotSupportedException {
		this.aberta = true;
		return super.clone();
	}

}
