
public class rotacao {

	/*Nesta função está sendo feita a comparação de uma string com um vetor, para ver se as mesmas se condizem quando rotacionam
	 * O vetor contêm os caracteres que estão na posição (j/2) das strings, sendo que j é o tamanho-1 da string
	 * Comparo se a posição do meio da string passada por parâmetro e a posição do vetor são iguais. Se sim, retorna 'true', se não, retorna 'false'
	 * A ideia é o seguinte: As primeiras letras que estão nas strings tem maior probabilidade de respetirem entre strings, assim como as últimas também. Mas as do meio mudam
	 * conforme string. Por isso a ideia de fazer a comparação das strings por meio dos caracteres do meio.*/
	//s1 => a string errada, por 
	public static boolean verificaRotacao(String s1, char[] vetor, int j) {
		System.out.print(s1.charAt(j/2) +" "+vetor[0]+"\n"+s1.charAt(j/2)+" "+ vetor[1] + "\n");
		if(s1.charAt(j/2) == vetor[0] || s1.charAt(j/2) == vetor[1])
			return true;
		else
			return false;
	}

	
}
