package debugs;

public class Calculadora {

	// declaradas aqui => global
	
	public void soma(double valor1, double valor2){
		//var resultado = valor1 + valor2; //para ser declarado de forma local => só funciona dentro do método
		// var pode aparecer, mas como o Java é uma linguagem muito tipada é mais comum aparecer o tipo mesmo ex: double
		
			double resultado = valor1+valor2;
		System.out.println("Total: "+resultado);
	}		
		
	public double subtracao(double valor1,double valor2){
		return valor1+valor2;
	}
	
	public static void multiplicacao (double valor1, double valor2) {
		System.out.println("Resultado: " + valor1*valor2);
	}
}
