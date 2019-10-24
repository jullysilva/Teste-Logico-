# Teste Lógico 3 questões

## Ler dados de um arquivo


`
	public static void main(String[] args) {
		
		String nome = "teste.txt", texto = null;
		BufferedReader entrada = null;
		
		//PARTE 1
		/* Nesta parte é feita a abertura do arquivo txt, o FileReader recebe como parâmetro a variável que contÊm o nome do arquivo.
		 * É usado o try e catch para fazer tratamento de exceção, por exemplo, caso o arquivo não exista */
		try {
			entrada = new BufferedReader(new FileReader(nome));
		}
		catch (FileNotFoundException excecao) {
			System.out.println("Arquivo não encontrado!");
		}
		
		//PARTE 2
		/* Após aberto o arquivo, será feita a leitura do arquivo para imprimir os dados para o usuário. Também é usado o try e catch para tratamento de exceções */
		do {
			try {
				texto = entrada.readLine();
			}
			catch (IOException excecao) {
				System.out.println("Erro de leitura! ");
			}
		}while(texto != null);
		
		//PARTE 3
		/* Finalizando, é fechado o arquivo, caso arquivo ter sido excluído, ou movido para outro diretório, será informado erro de fechamento */
		try {
			entrada.close();
		}
		catch (IOException excecao) {
			System.out.println("Erro no fechamento do arquivo!");	
		}
	}
`



## Função que altera um caractere específico da String

`
public class subs {

	public static void main(String[] args) {
		String frase = "Batatinha quando nasce se esparrama pelo chão";
		char c = 'a';
		char r = '#'; 
		
		subsLetra(c, r, frase, frase.length());
	}
	
	
	
	// c => letra que o usuário quer que seja mudado, por exemplo, a letra 'a'
	// r => letra a qual o usuário quer que mude, por exemplo, todas as letras 'a' vão mudar para '#'
	// frase => Texto a qual pode ser dado pelo usuário ou está contido já no sistema, neste caso, será "Batatinha quando nasce se esparrama pelo chão"
	
	/* Foi criado um vetor para receber os caracteres conforme forem feitas as verificações de letra por letra.
	 * Vai ser verificado se cada letra daquele texto é igual a letra que o usuário quer mudar, se sim, a posição do caractere no vetor vai receber a letra cujo o usuário realmente quer. Se não, o vetor recebe normalmente o caractere do texto */
	
	/* Um exemplo é a string que está na variável texto, se for feita a substituição conforme dados acima ficará:
	 * "B#t#tinh# qu#ndo n#sce se esp#rr#m# pelo chão" */
	
	public static void subsLetra(char c, char r, String frase, int tam) {
		int i;
		char[] texto = new char[tam];
		for(i=0; i < tam; i++) {
			if(frase.charAt(i) == c)
				texto[i] = r;
			else
				texto[i] = frase.charAt(i);
			System.out.print(texto[i]);
		}
	}

}
`

## Função que verifica se uma String é rotativa

`
public class rotacao {

	/*Nesta função está sendo feita a comparação de uma string com um vetor, para ver se as mesmas se condizem quando rotacionam
	 * O vetor contêm os caracteres que estão na posição (j/2) das strings, sendo que j é o tamanho-1 da string
	 * Comparo se a posição do meio da string passada por parâmetro e a posição do vetor são iguais. Se sim, retorna 'true', se não, retorna 'false'
	 * A ideia é o seguinte: As primeiras letras que estão nas strings tem maior probabilidade de respetirem entre strings, assim como as últimas também. Mas as do meio mudam
	 * conforme string. Por isso a ideia de fazer a comparação das strings por meio dos caracteres do meio.*/

	public static boolean verificaRotacao(String s1, char[] vetor, int j) {
		System.out.print(s1.charAt(j/2) +" "+vetor[0]+"\n"+s1.charAt(j/2)+" "+ vetor[1] + "\n");
		if(s1.charAt(j/2) == vetor[0] || s1.charAt(j/2) == vetor[1])
			return true;
		else
			return false;
	}	
}
`
