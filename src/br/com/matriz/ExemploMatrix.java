package br.com.matriz;

import java.util.Locale;
import java.util.Scanner;

public class ExemploMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
	
		//esses dois [] indica que e um arranjo bidimensional
		int[][] mat = new int[n][n];
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		//para ler na diagonal ja que o valor fica no mesmo numro da linah e coluna 
		System.out.println("main diagonal: ");
		for(int i=0; i<n; i++) {
			System.out.println((mat[i][i] + " "));
		}
		System.out.println();
		
		
		//ver numeros negativos da matriz 	
		int count = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("negative number: " + count);
		
		
		
		
		
		
		sc.close();
		

	}

}
