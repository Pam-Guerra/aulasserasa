package textosestrings;

import tratamentoexceptions.TratamentoDeOutrasExceptions;

public class ExpressoesRegulares2 {
	private String ddd;
	private String numero;
	
	
	public ExpressoesRegulares2(String ddd, String numero) {
		
		if (ddd == null || numero == null) {
			throw new TratamentoDeOutrasExceptions("Telefone invalido"); // tratamento criado em outra classe
		}
		
		if (!ddd.matches("\\d{2}")) {
			throw new IllegalArgumentException("DDD invalido"); // tratamento padrão do sistema
		}
		
		if (!numero.matches("\\d{8}|\\d{9}")) {
			throw new IllegalArgumentException("Numero invalido");
		}
		
		this.ddd = ddd;
		this.numero = numero;
		
	}
	
	@Override
	public String toString() {
		return "("+this.ddd+") "+this.numero;
	}	
	
}