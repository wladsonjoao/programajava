import java.util.Scanner;
public class fatorial {
  public static void main(String[]args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Digite um número inteiro: ");
  int n = in.nextInt();
  
  //Inicializando contador
  int f = 1;
  int i = 1;
  
  //Laço de repetição para calcular o fatorial de um número
  while(i<=n) {
 
    f *= i;
    i++;
  }
  //Imprimindo resultado da conta fatorial
  System.out.println("O fatorial de: " + n + " é: " + f);
  
  }

}