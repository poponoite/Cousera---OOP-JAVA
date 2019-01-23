
public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(50,1.70);
		
		System.out.println("-----------------");
		System.out.println("Paciente p1 : " );
		System.out.println("IMC : "+p1.calcularImc());
		System.out.println("Diagnóstico : " +p1.diagnostico());
		
		Paciente p2 = new Paciente(70,1.60);
		
		System.out.println("-----------------");
		System.out.println("Paciente p2 : " );
		System.out.println("IMC : "+p2.calcularImc());
		System.out.println("Diagnóstico : " +p2.diagnostico());
		
		Paciente p3 = new Paciente(80,1.80);
	
		System.out.println("-----------------");
		System.out.println("Paciente p3 : " );
		System.out.println("IMC : "+ Math.round(p3.calcularImc()));
		System.out.println("Diagnóstico : " +p3.diagnostico());
	}

}
