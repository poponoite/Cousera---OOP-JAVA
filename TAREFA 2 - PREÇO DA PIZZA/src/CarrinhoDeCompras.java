import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	int valorTotalPizzas = 0;
	List<Pizza> pizzas = new ArrayList<Pizza>();
	
	//Método que adiciona pizza ao carrinho
	void adicionaPizza(Pizza p) {
		if (!p.ingredientes.isEmpty()) {
				pizzas.add(p);
		}else{
			System.out.println("Pizza sem ingrediente !");
		}
	}
	
	//Método que retorna o valor total a pagar, de acordo com as pizzas e números de ingredientes inseridos nestas
	double valorTotal() {
		
		for (int i = 0 ; i< pizzas.size() ;i++) {
			valorTotalPizzas += pizzas.get(i).getPreco();
		}
		return valorTotalPizzas;
	}

}
