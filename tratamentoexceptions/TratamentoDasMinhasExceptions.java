package tratamentoexceptions;

public class TratamentoDasMinhasExceptions extends RuntimeException{


	//private static final long serialVersionUID = -8979287603121916169L; // versão grande

	private static final long serialVersionUID = 1L; //(numero abreviado); ajuda a identificar a informação gerada na classe RuntimeException ou através dela como única. Cria um cógigo (1L)de identificação como se fosse um CPF.

	public TratamentoDasMinhasExceptions (String ex) {
		super(ex);
	}
}
