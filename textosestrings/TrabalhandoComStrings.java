package textosestrings;

public class TrabalhandoComStrings {
	
	public static void main(String[] args) {
		// metodos são da Classe Character
		
		//verifica se o valor é um número e retorna true ou false
		
		//isDigit => retorna verdadeiro se for digito
		
		System.out.println(Character.isDigit ('5'));
		System.out.println(Character.isDigit('a'));
		
		System.out.println("============================");
		
		//verifica se o valor é uma letra e retorna true ou false
		// isLetter -=> retorna verdadeiro se for letra
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetter('7'));
		
		System.out.println("============================");
		
		//isLetterOrDigit =>verifica se o valor é uma letra ou número. Se não for nenhum dos dois retorna falso
		System.out.println(Character.isLetterOrDigit('a'));
		System.out.println(Character.isLetterOrDigit('3'));
		System.out.println(Character.isLetterOrDigit('@'));
		
		System.out.println("============================");
		
		//isUpperCase => verifica se o valor está escrito com caracter maiusculo
		System.out.println(Character.isUpperCase('P'));
		System.out.println(Character.isUpperCase('p'));
		
		System.out.println("============================");
		//isLowerCase => verifica se o valor está escrito com caracter minusculo
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('a'));
		
		System.out.println("============================");
		// isWhitespace => verifica se o valor é um espaço em branco
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('z'));
		
		System.out.println("============================");
		
		System.out.println("=============STRINGS===============");
		//STRINGS
		
		String arquivo = "escola.java";
		System.out.println(arquivo);
		//replace => verifica valor antigo e substitui pelo valor novo
		arquivo = arquivo.replace("java", "class");
		System.out.println(arquivo);
		
		System.out.println("============================");
		
		// Compara 2 valores
		// equals => se são exatamente iguais; Maiusculas e minusculas sao relevantes
		//equalsIgnoreCase => compara conteudo e maiusculo e minusculo nao interfere. Muito utilizado em mecanismos de busca.
		
		String nome1 ="pamela";
		String nome2 = "Pamela";		
		System.out.println(nome1.equals(nome2)); // conteudo e caracteres tem que ser exatamente iguais
		System.out.println(nome1.equalsIgnoreCase(nome2)); // conteudo tem que ser igual, mas os caracteres não interfere
		
		System.out.println("============================");
		// starsWith => compara se o texto começa com a mesma sequencia de caracteres. Sensivel a maiuscula e minuscula
		System.out.println(nome1.startsWith("pam")); 
		System.out.println(nome1.startsWith("Pam"));
		
		System.out.println("============================");
		// endWith => compara se o texto acaba com a mesma sequencia de caracteres. Sensivel a maiuscula e minuscula
		System.out.println(nome1.endsWith("ela"));
		System.out.println(nome1.endsWith("ELA"));
		
		System.out.println("============================");
		//Compara as letras uma a uma; 
		// muito usado para colocar em ordem alfabetica: pode ser crescente, decrescente;
		// muito usado em colections
		System.out.println(nome1.compareTo(nome2)); // como ainda não estamos vendo a interface comparable para as com parações retorna 32 por que considera a tabela de caracteres do teclado
		
		System.out.println("============================");
		// verifica o tamanho da String
		System.out.println(nome1.length());
		
		System.out.println("============================");
		// mostra o valor armazenado em um determinado indice. As posições começam a contar como zero.
		System.out.println(nome1.charAt(4));
		
		System.out.println("============================");
		// retorna uma parte da String (voce informa de qual posição iniciar e qual terminar. Ele pega da primeira posição até o ultimo valor -1, ou seja, le posição 2 e 3.
		System.out.println(nome1.substring(2,4));
		
		System.out.println("============================");
		// retorna a posição da 1ª ocorrência de uma letra. Informa em qual posição a letra apareceu a primeira vez.
		System.out.println(nome1.indexOf("a"));
		
		System.out.println("============================");
		//Retorna qual posição aparece a ultima aparição da letra
		System.out.println(nome1.lastIndexOf("a"));
		
		
	}

}
