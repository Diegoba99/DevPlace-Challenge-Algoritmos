package model;

public class Empleado {

 private String nombre;
 private int antiguedad;
 private int cantidadDeHoras;
 private double valorHora;
 private double importeACobrar=calcularImporte();
 
 public Empleado() {
	// TODO Auto-generated constructor stub
 importeACobrar= calcularImporte();
 
 }
 
 //FUNCION QUE RETORNA EL IMPORTE APARTIR DE EL VALOR POR HORA Y LA CANTIDAD, TAMBIEN TIENE EN CUENTA LA ANTIGUEDAD
 public double calcularImporte () {
	 
	 importeACobrar= valorHora*cantidadDeHoras;
	 int suma=0;
	 
	 if(antiguedad > 120) {
		 
		 suma = antiguedad * 30;
		 importeACobrar+=suma;
	 }	
	 
	 return importeACobrar;
 }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public int getCantidadDeHoras() {
		return cantidadDeHoras;
	}
	
	public void setCantidadDeHoras(int cantidadDeHoras) {
		this.cantidadDeHoras = cantidadDeHoras;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", antiguedad=" + antiguedad + ", importeACobrar=" + importeACobrar + "]";
	}
	 
	 
	public String mostrarEmpleado () {
		
		return toString();
	}
 
 

}
