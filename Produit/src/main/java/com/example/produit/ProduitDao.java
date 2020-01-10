package com.example.produit;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProduitDao {
	private static Map<Integer, Produit> produits = new HashMap<Integer, Produit>();
	
	static {
		produits.put(0, new Produit("Monster", 1.5, "Coop"));
		produits.put(1, new Produit("Lucky strike", 7.7, "Kiosk"));
	}
	
	public List<Produit> getAllProducts(){
		return produits.values().stream().collect(Collectors.toList());
	}
	
	public void save(Produit produit) {
		produits.put(nextKey(), produit);
	}
	
	
	private static Integer nextKey() {
		final Comparator<Integer> comp = (k1, k2) -> Integer.compare( k1, k2);
	    
		return produits.keySet().stream().max(comp).get() + 1;
	}

}
