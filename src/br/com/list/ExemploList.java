package br.com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		
		list.add("Maria"); 
		list.add("joao");
		list.add("Alex");
		list.add("bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		
		//mostra o tamnho da lista
		System.out.println(list.size());
		
	
		
		for(String x : list) {
			
			System.out.println(x);
		}
		
		System.out.println("---------");
		
		//remove o que esta na 1 da lista podemos instanciar dessa forma ou colocar "
		//o nome igual esta na lista
		list.remove(1);
		
		//removeIf remove pelo caracter M
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}

		
		System.out.println("------------");
		
		System.out.println("Index of bob " + list.indexOf("bob"));
		
		System.out.println("Index of marco " + list.indexOf("Marco"));
		
		System.out.println("----------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for(String x : result) {
			System.out.println(x);
		}
		
		//como fazer para encontrar um elemento da lista para encontrar um predicado 
		
		System.out.println("-----------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'x').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
