package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		
		return nota1 + nota2 + nota3;
		
	}
	public String situacao() {
		
		String sit;
		
		if (this.notaFinal() >= 60) {
			
			sit = "PASS";	
		}
		else {
			sit = "FAILED";
		}
		return sit;		
	}
	public String toString() {
		
		String retorno;
		
		retorno = String.format("FINAL GRADE = %.2f%n%s%n", this.notaFinal(),this.situacao());
		
		if (this.notaFinal() < 60) {
			retorno = retorno + String.format("MISSING %.2f POINTS%n",
					  (60 - this.notaFinal()));
		}
		return retorno;
	}

}
