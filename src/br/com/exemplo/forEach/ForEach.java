package br.com.exemplo.forEach;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"maria" , "bob", "alex"};
		
		
		for (int i=0; i<vect.length; i++ ) {
			System.out.println(vect[i]);
		}
		
		for(String name : vect) {
			System.out.println(name);
		}

	}

}
