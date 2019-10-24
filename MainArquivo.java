import java.io.*;

public class MainArquivo {

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

}
//Faço o código em um arquivo .java e depois colo aqui o script