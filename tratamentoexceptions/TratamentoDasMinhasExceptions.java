package tratamentoexceptions;

public class TratamentoDasMinhasExceptions extends RuntimeException{


	//private static final long serialVersionUID = -8979287603121916169L; // vers�o grande

	private static final long serialVersionUID = 1L; //(numero abreviado); ajuda a identificar a informa��o gerada na classe RuntimeException ou atrav�s dela como �nica. Cria um c�gigo (1L)de identifica��o como se fosse um CPF.

	public TratamentoDasMinhasExceptions (String ex) {
		super(ex);
	}
}
