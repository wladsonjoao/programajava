import java.util.Scanner;
public class potencia {
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Entre com a base");
    int base = in.nextInt();
    System.out.println("Entre com expoente");
    int expoente = in.nextInt();
    
    //Inicializando os valores para calcular a pot�ncia
    int x = expoente;
    int i = 0;
    int n = base;
    int r = 1;
    
    //La�o de repeti��o para calcular a pot�ncia
    while(i<x) {
      
      r*=n;
      i++;
    
      
    }
    //Imprimindo resultado da pot�ncia
    System.out.println("Resultado potencia " + r);
  
  }

}
  