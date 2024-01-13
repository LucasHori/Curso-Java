import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite os valores que deseja ser somados: ");
		
		String s1, s2, s3, soma;
		
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		soma = s1 + s2 + s3;
		
	
		System.out.println("valores digitados");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Essa e a soma dos valores: " + soma);
		
		
		
		
	}

}
