package br.com.generation.collections;

import java.util.ArrayList;

public class TestaEstoqueLoja {
	
	public static void main(String[] args) {
		
		
		EstoqueLoja p1 = new EstoqueLoja("Tênis", 90);
		EstoqueLoja p2 = new EstoqueLoja("Sandália", 65);
		EstoqueLoja p3 = new EstoqueLoja("Chinelo", 40);
		EstoqueLoja p4 = new EstoqueLoja("Scarpin", 100);
		
		ArrayList<EstoqueLoja> produtos = new ArrayList<>();
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		
		System.out.println(produtos);

	}

}
