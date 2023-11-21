package numerospares1;
import java.util.Scanner;

public class leridade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		do {
			 System.out.println("Digite o ano atual");
			 int anoAtual = scanner.nextInt();
			 
			 System.out.println("Digite o ano Nascimento: ");
			 int anoNasc = scanner.nextInt();
			 
			 int idade = anoAtual - anoNasc;
			 
			 System.out.println("sua idade é:" + idade);
			 
			 if (idade>=18) {
				 System.out.println("você é maior de idade.");
			 } else {
				System.out.println("você é menor de idade.");
			 }
			 System.out.println("deseja continuar digite - 1 se não digite - 2.");
				opcao = scanner.nextInt();

			
		}while(opcao != 2);
		scanner.close();
	}

}
