
public class subs {

	public static void main(String[] args) {
		String frase = "Batatinha quando nasce se esparrama pelo ch�o";
		char c = 'a';
		char r = '#'; 
		
		subsLetra(c, r, frase, frase.length());
	}
	
	
	
	// c => letra que o usu�rio quer que seja mudado, por exemplo, a letra 'a'
	// r => letra a qual o usu�rio quer que mude, por exemplo, todas as letras 'a' v�o mudar para '#'
	// frase => Texto a qual pode ser dado pelo usu�rio ou est� contido j� no sistema, neste caso, ser� "Batatinha quando nasce se esparrama pelo ch�o"
	
	/* Foi criado um vetor para receber os caracteres conforme forem feitas as verifica��es de letra por letra.
	 * Vai ser verificado se cada letra daquele texto � igual a letra que o usu�rio quer mudar, se sim, a posi��o do caractere no vetor vai receber a letra cujo o usu�rio realmente quer. Se n�o, o vetor recebe normalmente o caractere do texto */
	
	/* Um exemplo � a string que est� na vari�vel texto, se for feita a substitui��o conforme dados acima ficar�:
	 * "B#t#tinh# qu#ndo n#sce se esp#rr#m# pelo ch�o" */
	
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
