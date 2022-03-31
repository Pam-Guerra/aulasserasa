package fgabank;

public class TesteBanco {
	
	public static void main(String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa (); //criar uma instancia = copia
//		pessoaNumero1.nome = "Jos� das Couves";
//		pessoaNumero1.profissao = "Agricultor";
//		pessoaNumero1.cpf = "643.829.641-48"; //CPF sem valor gerado no site
//		
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Profiss�o: " + pessoaNumero1.profissao);
//		System.out.println("CPF: " + pessoaNumero1.cpf);
//		
//		Pessoa pessoaNumero2 = new Pessoa ();
//		pessoaNumero2.nome = "Jo�o das Abelhas";
//		pessoaNumero2.profissao = "Apicultor";
//		pessoaNumero2.cpf = "419.979.231-73";
//		
//		System.out.println( "==============================");
//		
//		System.out.println("Nome: " + pessoaNumero2.nome);
//		System.out.println("Profiss�o: " + pessoaNumero2.profissao);
//		System.out.println("CPF: " + pessoaNumero2.cpf);
		
		
//		Pessoa pessoaNova = new Pessoa (); // instanciar a classe pessoa
//		pessoaNova.setNome(" Jose das Couves");
//		System.out.println("Nome: " + pessoaNova.getNome());
//		
//		System.out.println("=========================");
//		
//		Pessoa pessoaComConstrutor1 = new Pessoa("Jo�o dos Tomates", "419.979.231-73", "1234567-9");
//		
//		System.out.println("Nome: " +pessoaComConstrutor1.getNome());
//		System.out.println("CPF: " +pessoaComConstrutor1.getCpf());
//		System.out.println("RG: "+ pessoaComConstrutor1.getRg());
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		//conta1.setSaldo(1000000.50);=> n�o se deve alterar diretamente essa informa��o. Ela apenas pode ser exibida.
		conta1.setTitular(" Pamela Guerra");
		
		conta1.depositar(100000.00);
		
		
		System.out.println("Ag�ncia: " + conta1.getAgencia());
		System.out.println("N�mero da Conta: " + conta1.getAgencia());
		System.out.println("Titular: " + conta1.getTitular());
		
		System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());
		
		if (conta1.sacar(20.0)) { // se eu colocasse 150,00 ele apresentaria Opera��o n�o realizada e manteria o saldo
			System.out.println("Saque Efetuado com sucesso !");
		} else {
			System.out.println("Opera��o n�o realizada. Por favor, verifique seu saldo");
		}
		
		System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo()); // forma de imprimir em formato de dinheiro
		
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(2234);
		
		conta1.transferir(10000, conta2);
		
		System.out.printf("Saldo Atual Pamela: R$ %.2f \n",conta1.getSaldo());
		System.out.printf("Saldo Atual Babakuxy: R$ %.2f \n",conta2.getSaldo());
		
		
		
	}

}
