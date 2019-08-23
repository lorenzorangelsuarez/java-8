package com.mx.lorenzo.lambda;

public class LambdaApp {

	//Enfoque imperativo (Cómo hace la implementación)
	public void calcularImperativo(){
		Operacion operacion = new Operacion(){
			@Override
			public double calcularPromedio(double numero1, double numeroDos) {
				return (numero1 + numeroDos)/2;
			}
		};
		System.out.println(operacion.calcularPromedio(2, 3));
	}
	
	
	//Enfoque declarativo (Qué es lo que necesito)
	public void calcularDeclarativo() {
		Operacion operacion = (double numeroUno, double numeroDos) -> (numeroUno + numeroDos)/2;
		System.out.println(operacion.calcularPromedio(2, 3));
	}
	
	public static void main(String[] args) {
		
		LambdaApp app = new LambdaApp();
		app.calcularImperativo();
		app.calcularDeclarativo();
	}

}
