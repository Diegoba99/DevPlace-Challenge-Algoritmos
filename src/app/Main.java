package app;

import java.util.Random;
import java.util.Scanner;

import model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	//1. Pide un número por teclado e indica si es un número primo o no	
		
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
	
	/*2. Escribe una aplicación que solicite al usuario que ingrese una contraseña cualquiera.
		Después se le pedirá que ingrese nuevamente la contraseña, con 3 intentos. Cuando
		acierte ya no pedirá más la contraseña y mostrará un mensaje diciendo “Felicitaciones,
		recordás tu contraseña”. Si falla luego de 3 intentos se mostrará el mensaje “Tenes que
		ejercitar la memoria”. Los mensajes quedarán en pantalla a la espera que el usuario
		presione una tecla, luego de esto se cerrará el programa.
    */
		/*
		Scanner scan = new Scanner (System.in);
		
		String contraseña;
		String contraseña2;
		int i=0;
		
		System.out.println(" Ingrese contraseña ");
		contraseña=scan.next();
		
		System.out.println(" Ingrese nuevamente la contraseña ");
		contraseña2=scan.next();
		
		
		if(contraseña.equals(contraseña2)) {
			
			System.out.println("Felicitaciones, recordás tu contraseña");
			
		}else {
			
			while((contraseña.equals(contraseña2)== false) && i<2) {
				
				System.out.println(" Contraseña incorrecta ");
				System.out.println(" Ingrese nuevamente la contraseña ");
				contraseña2=scan.next();
			
			  i++;
			}
			
		 if(contraseña.equals(contraseña2)) {
			 
			 System.out.println("Felicitaciones, recordás tu contraseña");
		
		 }else {
		    
			 System.out.println( "Tenes que ejercitar la memoria");
			 
		 }
		
		}
		*/
		
	
		/*
		 3. Por teclado se ingresa el valor hora de un empleado. Posteriormente se ingresa el
            nombre del empleado, la antigüedad y la cantidad de horas trabajadas en el mes. Se
            pide calcular el importe a cobrar teniendo en cuenta que al total que resulta de
            multiplicar el valor hora por la cantidad de horas trabajadas. Además, si el empleado
            tiene más de 10 años de antigüedad hay que sumarle la cantidad de años trabajados
            multiplicados por $30. Imprimir en pantalla el nombre, la antigüedad y el total a cobrar
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
		
		/* 4. Generar un número aleatorio comprendido entre 0 y 1000. Pedir, a continuación, al
			usuario adivinar el número escogido por el ordenador. Para ello, debe introducir un
			número comprendido entre 0 y 1000. Se compara el número introducido con el
			calculado por el ordenador y se muestra en la consola "es mayor" o "es menor" en
			función del caso. Se repite la operación hasta que el usuario encuentra el número.
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
		
		/* 5. Pedir al usuario que ingrese un número repetidamente hasta que ingrese un -1 y en ese
			caso se terminará el programa.
			Al terminar, mostrará lo siguiente:
			a. – mayor número introducido
			b. – menor número introducido
			c. – suma de todos los números
			d. – suma de los números
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
