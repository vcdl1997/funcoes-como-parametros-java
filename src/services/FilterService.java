package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class FilterService<G extends Produto>{
	
	
	public double filteredSum(List<G> list, Predicate<G> criteria) {
		double total = 0;
		
		for(G g : list) {
			if(criteria.test(g)) total += g.getPrice();
		}
		
		return total;
	}
}
