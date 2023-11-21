import java.util.Scanner;
public class potencia {
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Entre com a base");
    int base = in.nextInt();
    System.out.println("Entre com expoente");
    int expoente = in.nextInt();
    
    //Inicializando os valores para calcular a potência
    int x = expoente;
    int i = 0;
    int n = base;
    int r = 1;
    
    //Laço de repetição para calcular a potência
    while(i<x) {
      
      r*=n;
      i++;
    
      
    }
    //Imprimindo resultado da potência
    System.out.println("Resultado potencia " + r);
  
  }

}
  