package app;

import java.util.Random;
import java.util.Scanner;

import model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	//1. Pide un n�mero por teclado e indica si es un n�mero primo o no	
		
		int i=6;
		int cont=4;
		int tope=100;
		boolean primo=false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Ingrese un numero para saber si es primo ");
		i= scan.nextInt();
		
        primo=esPrimo(i);
        
        if(primo== true) {
        	
          System.out.println(" Es primo ");
        }else {
        	
        	System.out.println(" No es primo");
		}
	}
	//FUNCION QUE INGRESA UN NUMERO POR PARAMETRO Y RETORNA TRUE SI ES PRIMO Y FALSE SINO LO ES
	public static boolean esPrimo(int num){
		
		Boolean primo = true;
		int i=2;
		
		while(i!=num && i<num && primo == true) {
			
			if(num % i == 0) {
				
				primo=false;
			}
		 i++;
		}
		
	 return primo;
	}
	*/
	
	/*2. Escribe una aplicaci�n que solicite al usuario que ingrese una contrase�a cualquiera.
		Despu�s se le pedir� que ingrese nuevamente la contrase�a, con 3 intentos. Cuando
		acierte ya no pedir� m�s la contrase�a y mostrar� un mensaje diciendo �Felicitaciones,
		record�s tu contrase�a�. Si falla luego de 3 intentos se mostrar� el mensaje �Tenes que
		ejercitar la memoria�. Los mensajes quedar�n en pantalla a la espera que el usuario
		presione una tecla, luego de esto se cerrar� el programa.
    */
		/*
		Scanner scan = new Scanner (System.in);
		
		String contrase�a;
		String contrase�a2;
		int i=0;
		
		System.out.println(" Ingrese contrase�a ");
		contrase�a=scan.next();
		
		System.out.println(" Ingrese nuevamente la contrase�a ");
		contrase�a2=scan.next();
		
		
		if(contrase�a.equals(contrase�a2)) {
			
			System.out.println("Felicitaciones, record�s tu contrase�a");
			
		}else {
			
			while((contrase�a.equals(contrase�a2)== false) && i<2) {
				
				System.out.println(" Contrase�a incorrecta ");
				System.out.println(" Ingrese nuevamente la contrase�a ");
				contrase�a2=scan.next();
			
			  i++;
			}
			
		 if(contrase�a.equals(contrase�a2)) {
			 
			 System.out.println("Felicitaciones, record�s tu contrase�a");
		
		 }else {
		    
			 System.out.println( "Tenes que ejercitar la memoria");
			 
		 }
		
		}
		*/
		
	
		/*
		 3. Por teclado se ingresa el valor hora de un empleado. Posteriormente se ingresa el
            nombre del empleado, la antig�edad y la cantidad de horas trabajadas en el mes. Se
            pide calcular el importe a cobrar teniendo en cuenta que al total que resulta de
            multiplicar el valor hora por la cantidad de horas trabajadas. Adem�s, si el empleado
            tiene m�s de 10 a�os de antig�edad hay que sumarle la cantidad de a�os trabajados
            multiplicados por $30. Imprimir en pantalla el nombre, la antig�edad y el total a cobrar
		 */
		/*
		Empleado empleado1 = new Empleado();
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Ingrese valor por hora ");
		empleado1.setValorHora(scan.nextDouble());
		
		System.out.println(" Ingrese nombre del empleado ");
		empleado1.setNombre(scan.next());
		
		System.out.println(" Ingrese antiguedad en meses ");
		empleado1.setAntiguedad(scan.nextInt());
		
		System.out.println(" Ingrese cantidad de horas trabajadas ");
		empleado1.setCantidadDeHoras(scan.nextInt());
		
		empleado1.calcularImporte();
		
		System.out.println(empleado1.mostrarEmpleado());
			
		*/
		
		/* 4. Generar un n�mero aleatorio comprendido entre 0 y 1000. Pedir, a continuaci�n, al
			usuario adivinar el n�mero escogido por el ordenador. Para ello, debe introducir un
			n�mero comprendido entre 0 y 1000. Se compara el n�mero introducido con el
			calculado por el ordenador y se muestra en la consola "es mayor" o "es menor" en
			funci�n del caso. Se repite la operaci�n hasta que el usuario encuentra el n�mero.
		*/
		/*
		Random random = new Random();
		int min=1, max =1000;
		int numeroAEncontrar = random.nextInt(min + max);
		Scanner scan = new Scanner(System.in);
		int numero;
		
		do
		{
			System.out.println(" Ingrese un numero del 1 al 1000");
			numero=scan.nextInt();
		
		    if(numero < numeroAEncontrar) {
		    	
		    	System.out.println(" Es mayor ");
		    
		    }else if((numero > numeroAEncontrar)) {
		    
		    	System.out.println(" Es menor ");
			    
		    }
		
		
		}while(numero != numeroAEncontrar);
		
		System.out.println( " numero encontrado ");

		System.out.println( " era:  "+numeroAEncontrar);
	
	*/
		
		/* 5. Pedir al usuario que ingrese un n�mero repetidamente hasta que ingrese un -1 y en ese
			caso se terminar� el programa.
			Al terminar, mostrar� lo siguiente:
			a. � mayor n�mero introducido
			b. � menor n�mero introducido
			c. � suma de todos los n�meros
			d. � suma de los n�meros
		*/
		/*
		double numero=0;
		Scanner scan = new Scanner(System.in);
		double []numeros = new double [100];
		int i=0;
		
		while(numero != -1) {
			
			System.out.println(" Ingrese un numero o -1 para terminaar ");
			numero = scan.nextDouble();
			if(numero!=-1) {
			numeros[i]=numero;
			i++;
			}
		}
		
		mostrarNumeros(numeros,i);
		System.out.println(" Numero mayor del arreglo: "+buscarMayor(numeros,i));
		System.out.println(" Numero menor del arreglo: "+buscarMenor(numeros,i));
		System.out.println(" Suma de todos los numeros del arreglo: "+sumaTotal(numeros, i));
				
		
  }
	
	
	public static void mostrarNumeros(double [] numeros, int val) {
		
		int i=0;
		
		while(i<val) {
			
			System.out.println(" ,"+numeros[i]);
			
			i++;
		}
		
		
	}
	//INGRESA POR PARAMETRO EL ARREGLO Y LA CANTIDAD DE ELEMENTOS Y RETORNA LA SUMA TOTAL DE TODOS LOS NUMEROS
	public static double sumaTotal (double []arreglo, int val) {
		
		int i=0;
		double suma=0;
		
		while(i<val) {
		
			suma+=arreglo[i];
			i++;
		}
	 return suma;
	}
	
	// INGRESA EL ARREGLO Y LA CANTIDAD DE NUMEROS Y RETORNA EL MAYOR
	public static double buscarMayor (double [] numeros, int val) {
		
		int i=0;
		double mayor =numeros[i] ;
		i++;
		
		while(i < val) {
			
			if(mayor < numeros [i]) {
				
				mayor = numeros [i];
			}
			
			i++;
			
		}
	 return mayor;
	}
	
	
	// INGRESA EL ARREGLO Y LA CANTIDAD DE NUMEROS Y RETORNA EL MENOR
	public static double buscarMenor (double [] numeros, int val) {
		
		int i=0;
		double menor =numeros[i] ;
		i++;
		
		while(i < val) {
			
			if(menor > numeros [i]) {
				
				menor = numeros [i];
			}
			
			i++;
			
		}
	 return menor;
	}
	
	*/
	}	
}
