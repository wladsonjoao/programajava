import java.util.Scanner;
public class fatorial {
  public static void main(String[]args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Digite um n�mero inteiro: ");
  int n = in.nextInt();
  
  //Inicializando contador
  int f = 1;
  int i = 1;
  
  //La�o de repeti��o para calcular o fatorial de um n�mero
  while(i<=n) {
 
    f *= i;
    i++;
  }
  //Imprimindo resultado da conta fatorial
  System.out.println("O fatorial de: " + n + " �: " + f);
  
  }

}