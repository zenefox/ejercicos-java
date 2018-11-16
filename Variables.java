
public class Variables {

	public static void main(String[] args) {
		
		// Definicion de variables
		int a=4;
		int b=3;
		double c=3.3;
		double d=55.2;
		boolean e=true;
		boolean f=false;

		
		String texto="Variables y Operaciones";
		
		System.out.println(texto);
		System.out.println("-----------------------\n");
		
		
		//Operaciones aritmeticas
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("\n");
		
		//Operaciones logicas
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println(a==b);
		System.out.println(a>c&&b<d);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(d--);
		System.out.println(d);
		System.out.println(c+=2);
		System.out.println(c);
		System.out.println(b-=4);
		System.out.println(b);
		System.out.println(!e);
		System.out.println(e!=f);
		

	}

}
