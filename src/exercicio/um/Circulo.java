package exercicio.um;

public class Circulo {
	
	double pi = 3.1416;
	double raio;
	
	public double getRaio() {
		return this.raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calculaArea(){
		double area = 0;
		
		area = pi * (raio*raio);
		
		return area;
	}
	
	public double calculaCircunferencia() {
		double circunferencia = 0;
		
		circunferencia = (2 * pi) * raio;
		
		return circunferencia;
	}


}
