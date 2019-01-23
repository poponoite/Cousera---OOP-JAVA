
public class Paciente {
	 double peso;
	 double altura;
	
	 //Construtor
	public Paciente(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	//Método calcula IMC
	double calcularImc(){
		double imc;
		return  imc = this.peso / (this.altura * this.altura);	
	}
	//Método que retorna o diagnóstico de acordo com o resultado do imc
	String diagnostico() {
		double imc = calcularImc();
		
		if(imc < 16) {
			return "Baixo peso muito grave";
		}else if (imc >= 16 && imc <=16.99) {
			return "Baixo peso grave";
		}else if (imc >= 17 && imc <=18.49) {
			return "Baixo peso";
		}else if (imc >= 18.50 && imc <=24.99) {
			return "Peso normal";
		}else if (imc >= 25 && imc <=29.99) {
			return "Sobrepeso";
		}else if (imc >= 30 && imc <=34.99) {
			return "Obesidade grau I";
		}else if (imc >= 35 && imc <=39.99) {
			return "Obesidade grau II";
		}else if (imc >= 40 ) {
			return "Obesidade grau III";
		}
		return null;	
	}
	
}
