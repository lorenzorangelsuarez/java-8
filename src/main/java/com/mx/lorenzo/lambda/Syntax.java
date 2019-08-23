package com.mx.lorenzo.lambda;

public class Syntax {
	
	
	public double testSyntax() {
		Operacion operacion = (double x, double y) -> x+y/2;
		return operacion.calcularPromedio(2, 3);
	}

	public double testSyntax1() {
		Operacion operacion = (double x, double y) -> {return (x+y)/2;};
		return operacion.calcularPromedio(2, 3);
	}
	
	public double testSyntax2() {
		Operacion operacion = (double x, double y) -> {
				double a = 2;
				System.out.println(a);
				return (x+y)/2;
			};
		return operacion.calcularPromedio(2, 3);
	}
	
	public double testSyntax3() {
		Operacion operacion = (x, y) -> {
				double a = 2;
				System.out.println(a);
				return (x+y)/2;
			};
		return operacion.calcularPromedio(2, 3);
	}
	
	public double testSyntax4() {
		Operacion1 operacion = () -> {
				double a = 2;
				double x = 2;
				double y = 3;
				System.out.println(a);
				return (x+y)/2;
			};
		return operacion.calcularPromedio();
	}
	
	public static void main(String[] args) {
		Syntax app = new Syntax();
		System.out.println(app.testSyntax());
	}

}
