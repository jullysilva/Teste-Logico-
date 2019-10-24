import java.io.*;

public class MainArquivo {

	public static void main(String[] args) {
		
		String nome = "teste.txt", texto = null;
		BufferedReader entrada = null;
		
		//PARTE 1
		/* Nesta parte � feita a abertura do arquivo txt, o FileReader recebe como par�metro a vari�vel que cont�m o nome do arquivo.
		 * � usado o try e catch para fazer tratamento de exce��o, por exemplo, caso o arquivo n�o exista */
		try {
			entrada = new BufferedReader(new FileReader(nome));
		}
		catch (FileNotFoundException excecao) {
			System.out.println("Arquivo n�o encontrado!");
		}
		
		//PARTE 2
		/* Ap�s aberto o arquivo, ser� feita a leitura do arquivo para imprimir os dados para o usu�rio. Tamb�m � usado o try e catch para tratamento de exce��es */
		do {
			try {
				texto = entrada.readLine();
			}
			catch (IOException excecao) {
				System.out.println("Erro de leitura! ");
			}
		}while(texto != null);
		
		//PARTE 3
		/* Finalizando, � fechado o arquivo, caso arquivo ter sido exclu�do, ou movido para outro diret�rio, ser� informado erro de fechamento */
		try {
			entrada.close();
		}
		catch (IOException excecao) {
			System.out.println("Erro no fechamento do arquivo!");	
		}
	}

}
//Fa�o o c�digo em um arquivo .java e depois colo aqui o script