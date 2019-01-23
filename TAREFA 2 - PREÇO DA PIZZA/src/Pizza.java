import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
	
	double valorTotal;
	static int contador;
	List<String> ingredientes = new ArrayList<String>();
	static Map<String, Integer> totalIngredientesGastos = new HashMap<String,Integer>();
	


	//Método adiciona ingrediente
	void adicionaIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);	
	}
	
	//Método que retorna preco de acordo com a quantidade de ingredientes inseridos
	double getPreco() {
		
		if (ingredientes.size() <= 2) {
			return 15;
		}else if (ingredientes.size() >= 3 &&  ingredientes.size()<= 5) {
			return 20;
		}else if (ingredientes.size() > 5) {
			return 23;
		}
		return 0;
	}
	
	//Método que contabiliza a quantidade de ingredientes inseridos
	 void contabilizaIngrediente(String ingrediente) {
		 if (totalIngredientesGastos.containsKey(ingrediente)) {
			totalIngredientesGastos.put(ingrediente, (totalIngredientesGastos.get(ingrediente))+1);
		}else {
			totalIngredientesGastos.put(ingrediente, 1);
		}
	}
	 

}
