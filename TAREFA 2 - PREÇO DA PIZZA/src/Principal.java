
public class Principal {
	
	public static void main(String args[]) {
		
		//Inst�ncia da primeira pizza
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Mussarela");
		p1.adicionaIngrediente("�regano");
		System.out.println(p1.totalIngredientesGastos);
		
		//Inst�ncia da segunda pizza
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Tomate");
		p2.adicionaIngrediente("Piment�o");
		p2.adicionaIngrediente("Frango");
		p2.adicionaIngrediente("Cebola");
		System.out.println(p2.totalIngredientesGastos);
		
		//Inst�ncia da terceira pizza
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Catupiry");
		p3.adicionaIngrediente("Azeitona");
		p3.adicionaIngrediente("Piment�o");
		p3.adicionaIngrediente("Lingui�a");
		p3.adicionaIngrediente("Pimenta");
		p3.adicionaIngrediente("Sal");
		
		System.out.println(p3.totalIngredientesGastos);
		
		//Adiciona pizzas ao carrinho de compras
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.adicionaPizza(p1);
		cc.adicionaPizza(p2);
		cc.adicionaPizza(p3);
		
		//Exibe valor total das pizzas
		System.out.println("\n\nValor Total : " + cc.valorTotal());
		
		//Exibe quantidade total de cada ingrediente gasto nas pizzas 
		System.out.println("\nQuantidade de Mussarela = " + Pizza.totalIngredientesGastos.get("Mussarela"));
		System.out.println("Quantidade de �regano = " + Pizza.totalIngredientesGastos.get("�regano"));
		System.out.println("Quantidade de Tomate = " + Pizza.totalIngredientesGastos.get("Tomate"));
		System.out.println("Quantidade de Piment�o = " + Pizza.totalIngredientesGastos.get("Piment�o"));
		System.out.println("Quantidade de Frango = " + Pizza.totalIngredientesGastos.get("Frango"));
		System.out.println("Quantidade de Cebola = " + Pizza.totalIngredientesGastos.get("Cebola"));
		System.out.println("Quantidade de Catupiry = " + Pizza.totalIngredientesGastos.get("Catupiry"));
		System.out.println("Quantidade de Azeitona = " + Pizza.totalIngredientesGastos.get("Azeitona"));
		System.out.println("Quantidade de Lingui�a = " + Pizza.totalIngredientesGastos.get("Lingui�a"));
		System.out.println("Quantidade de Pimenta = " + Pizza.totalIngredientesGastos.get("Pimenta"));
		System.out.println("Quantidade de Sal = " + Pizza.totalIngredientesGastos.get("Sal"));
		

		
	}

}
