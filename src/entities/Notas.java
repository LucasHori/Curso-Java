package entities;

public class Notas {
	public String name;
	public double p1, p2, p3;
	
	public double NotaFinal() {
		double f = p1 + p2 + p3;
		if(f >= 60) {
			System.out.println(f);
			System.out.print("pass");
		}else {
			double missing = f - 60.00;
			System.out.println(f);
			System.out.println("failed");
			System.out.println(missing);
		}
		return f;
		
	}

}
