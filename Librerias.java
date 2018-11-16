import java.util.Scanner;

public class Librerias {

	public static void main(String[] args) {
		
		//Declaracion de Variables
		double valor=33.2325262462;
		
		//Operaciones utilizando librerias
		double raiz=Math.sqrt(valor);
		//System.out.println(raiz);
		
		double redondeo=Math.round(valor);
		//System.out.println(redondeo);
		
		double potencia=Math.pow(valor, 2);
		//System.out.println(potencia);
		
		
		//System.out.println("el dato utilizado es de tipo\ndouble y tiene el valor:\n"+potencia+"\n"+"\n");
		
		//Casting de numeros
		
		/*
		System.out.println((int)potencia);
		System.out.println((float)potencia);
		System.out.println((short)potencia);
		System.out.println((long)potencia);
		//double valor=33.2325262462;
		System.out.printf("%.3f", (float)valor);
		*/
		
		
		//Clases que no predeterminadas
		
	
 		Scanner entrada=new Scanner(System.in);
	
	
	
		//System.out.println("ingrese texto: ");
		//String dato_texto=entrada.nextLine();
		//System.out.println("dato texto ingresado: "+dato_texto);
		
		
		
		
		//System.out.println("ingrese entero: ");
		//int dato_int=entrada.nextInt();
		//System.out.println("dato entero ingresado: "+dato_int);
		
		

		//Manejo de String
		
		
		String nombre1=new String("hola");
		String nombre2=new String("wena");		
		String nombre3="hola";
		String texto="jose@hotmail.com";
		
		
		//System.out.println(nombre1);
		//System.out.println(nombre1.equals(nombre2));
		//System.out.println(nombre2.equals(nombre3));
		//System.out.println(nombre2.equals(dato_texto));
		
		
		
		//System.out.println(nombre1.length());
		//System.out.println(nombre1.toUpperCase());
		
		System.out.println(nombre1.contains("@"));
		System.out.println(texto.contains("@"));
		
		valor=Integer.parseInt("67");
		valor=Double.parseDouble("78.28288282");
		//System.out.println(valor);
		//System.out.printf("%.2f", (float)valor);
		System.out.println("\n");
		
		//Manejo de arreglos
		int[] lista_explicita= {1,2,3,4,5,6,7,8};
		int[] lista_implicita=new int[8];
		
		lista_explicita[7]=4;
		lista_implicita[7]=4;
		
		//System.out.println(lista_explicita[7]);
		//System.out.println(lista_implicita[6]);
		
		

		
	
	}

}
