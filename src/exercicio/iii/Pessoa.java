package exercicio.iii;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private LocalDate dataNascimento;
	private int idade;
	private String signo;

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento ;
	}
	
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getSigno() {
		return this.signo;
	}
	
	public void calculaIdade(LocalDate dataAtual) {
		this.idade = Period.between(dataNascimento, dataAtual).getYears();	
	}
	
	public void calculaSigno() {
		int dia = dataNascimento.getDayOfMonth();
		int mes = dataNascimento.getMonthValue();
		
		if ((mes==1 && dia>=20) || ( mes==2 && dia<19)) {
			this.signo = "Aquario";
		}
		
		if ((mes==2 && dia>=19) || (mes==3 && dia<21)) {
			this.signo =  "Peixes";
		}
		
		if ((mes==3 && dia>=21) || (mes==4 && dia<20)) {
			this.signo = "Aries";
		}
		
		if ((mes==4 && dia>=20) || (mes==5 && dia<21)) {
			this.signo =  "Touro";
		}
		
		if ((mes==5 && dia>=21) || (mes==6 && dia<21)) {
			this.signo = "Gemeos";
		}
		
		if ((mes==6 && dia>=21) || (mes==7 && dia<23)) {
			this.signo = "Cancer";
		}
		
		if ((mes==7 && dia>=23) || (mes==8 && dia<23)) {
			this.signo = "Leao";
		}
		
		if ((mes==8 && dia>=23) || (mes==9 && dia<23)) {
			this.signo = "Virgem";
		}
		
		if ((mes==9 && dia>=23) || (mes==10 && dia<23)) {
			this.signo = "Libra";
		}
		
		if ((mes==10 && dia>=23) || (mes==11 && dia<22)) {
			this.signo = "Escorpiao";
		}
		
		if ((mes==11 && dia>=22) || (mes==12 && dia<22)) {
			this.signo = "Sagitario";
		}
		
		if ((mes==12 && dia>=22) || (mes==1 && dia<20)) {
			this.signo = "Capricornio";
		}
	}

	
}
