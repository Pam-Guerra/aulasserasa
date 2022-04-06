package fgabank;

public class TesteBanco {
	
	public static void main(String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa (); //criar uma instancia = copia
//		pessoaNumero1.nome = "José das Couves";
//		pessoaNumero1.profissao = "Agricultor";
//		pessoaNumero1.cpf = "643.829.641-48"; //CPF sem valor gerado no site
//		
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Profissão: " + pessoaNumero1.profissao);
//		System.out.println("CPF: " + pessoaNumero1.cpf);
//		
//		Pessoa pessoaNumero2 = new Pessoa ();
//		pessoaNumero2.nome = "João das Abelhas";
//		pessoaNumero2.profissao = "Apicultor";
//		pessoaNumero2.cpf = "419.979.231-73";
//		
//		System.out.println( "==============================");
//		
//		System.out.println("Nome: " + pessoaNumero2.nome);
//		System.out.println("Profissão: " + pessoaNumero2.profissao);
//		System.out.println("CPF: " + pessoaNumero2.cpf);
		
		
//		Pessoa pessoaNova = new Pessoa (); // instanciar a classe pessoa
//		pessoaNova.setNome(" Jose das Couves");
//		System.out.println("Nome: " + pessoaNova.getNome());
//		
//		System.out.println("=========================");
//		
//		Pessoa pessoaComConstrutor1 = new Pessoa("João dos Tomates", "419.979.231-73", "1234567-9");
//		
//		System.out.println("Nome: " +pessoaComConstrutor1.getNome());
//		System.out.println("CPF: " +pessoaComConstrutor1.getCpf());
//		System.out.println("RG: "+ pessoaComConstrutor1.getRg());
		
		PessoaFisica pfPamela = new PessoaFisica(); //pfPamela => referencia
		pfPamela.setNome("Pamela Guerra");
		pfPamela.setEmail("pamelatguerra@gmail.com");
		pfPamela.setTelefone("11-99999-7777");
		pfPamela.setCpf("879.359.983-88");
		pfPamela.setProfissao("Designer");
		pfPamela.setRg("12238888-7");
			
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		conta1.setTitular(pfPamela);
		
		//conta1.setSaldo(1000000.50);=> não se deve alterar diretamente essa informação. Ela apenas pode ser exibida.
		
		conta1.depositar(100000.00);
		
		
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("Número da Conta: " + conta1.getAgencia());
		System.out.println("Titular: " + conta1.getTitular().getNome());
		
		System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());
		
		if (conta1.sacar(20.0)) { // se eu colocasse 150,00 ele apresentaria Operação não realizada e manteria o saldo
			System.out.println("Saque Efetuado com sucesso !");
		} else {
			System.out.println("Operação não realizada. Por favor, verifique seu saldo");
		}
		
		System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo()); // forma de imprimir em formato de dinheiro
		
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(2234);
		
		conta1.transferir(10000, conta2);
		
		System.out.printf("Saldo Atual Pamela: R$ %.2f \n",conta1.getSaldo());
		System.out.printf("Saldo Atual Babakuxy: R$ %.2f \n",conta2.getSaldo());
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.depositar (1000);
		System.out.println("Saldo: " +cc1.getSaldo());
		System.out.println("Limite: " + cc1.getLimite());
		System.out.println("Saldo com Limite: " + cc1.getSaldoComLimite());
		cc1.sacar (1500);
		System.out.println("Saldo: " + cc1.getSaldo());
		System.out.println("Saldo com limite: " + cc1.getSaldoComLimite());
		
		
		
		
	}

}
