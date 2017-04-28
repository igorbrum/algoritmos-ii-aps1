package exercicio.i;

import com.senac.SimpleJava.Console;

public class Principal {
	
	private Circulo primeiroCirculo;
	private Circulo segundoCirculo;
	
	public void run () {
		
		primeiroCirculo = calculaCirculo(2, "primeiro");
		segundoCirculo = calculaCirculo(3, "segundo");
		
		calcularColisao();
	}

	private Circulo calculaCirculo(double raio, String texto) {
		Circulo circulo = new Circulo();
		
		circulo.setRaio(raio);
		Console.println("Raio do "+texto+" circulo: "+circulo.getRaio());
		Console.println("Area do "+texto+" circulo: "+circulo.calculaArea());
		Console.println("Circunferencia do "+texto+" circulo: "+circulo.calculaCircunferencia());
		Console.println();
		
		return circulo;
	}

	private void calcularColisao() {
		int distancia = 100; //distancia entre o centro dos dois circulos
		
		if (somaRaios() < distancia) {
			Console.println("Nao existe colisao");
		} else {
			Console.println("Existe colisao");
		}
		
	}
	
	private double somaRaios() {
		double somaRaios = primeiroCirculo.getRaio() + segundoCirculo.getRaio();
		
		return somaRaios;
	}
}
