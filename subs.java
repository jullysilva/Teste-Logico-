
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
