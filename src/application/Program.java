package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Funcao;
import entities.Produto;
import entities.ProdutosHigine;
import services.FilterService;

public class Program {

	public static void main(String[] args) throws ParseException{
		List<Produto> produtos = new ArrayList<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date validade = sdf.parse("10/04/2023");
	
		produtos.add(new ProdutosHigine("Detergente para lavar louça", 4.80, Funcao.REMOVEDORES, validade));
		produtos.add(new ProdutosHigine("Álcool", 10.79, Funcao.DESINFETANTES, validade));
		produtos.add(new ProdutosHigine("Água sanitária", 12.99, Funcao.DESINFETANTES, validade));
		produtos.add(new ProdutosHigine("Limpador de uso geral", 13.99, Funcao.DESINFETANTES, validade));
		
		FilterService<Produto> service = new FilterService<Produto>();
		double total = service.filteredSum(produtos, x->x.getPrice() > 10);
		
		System.out.println("Total: " + total);
	}

}
