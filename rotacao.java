
public class rotacao {

	/*Nesta fun��o est� sendo feita a compara��o de uma string com um vetor, para ver se as mesmas se condizem quando rotacionam
	 * O vetor cont�m os caracteres que est�o na posi��o (j/2) das strings, sendo que j � o tamanho-1 da string
	 * Comparo se a posi��o do meio da string passada por par�metro e a posi��o do vetor s�o iguais. Se sim, retorna 'true', se n�o, retorna 'false'
	 * A ideia � o seguinte: As primeiras letras que est�o nas strings tem maior probabilidade de respetirem entre strings, assim como as �ltimas tamb�m. Mas as do meio mudam
	 * conforme string. Por isso a ideia de fazer a compara��o das strings por meio dos caracteres do meio.*/
	//s1 => a string errada, por 
	public static boolean verificaRotacao(String s1, char[] vetor, int j) {
		System.out.print(s1.charAt(j/2) +" "+vetor[0]+"\n"+s1.charAt(j/2)+" "+ vetor[1] + "\n");
		if(s1.charAt(j/2) == vetor[0] || s1.charAt(j/2) == vetor[1])
			return true;
		else
			return false;
	}

	
}
