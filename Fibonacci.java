import java.util.Scanner;
public class Fibonacci {
  public static void main(String[]args) {
  Scanner in = new Scanner(System.in);
  
  System.out.println("Digite valor de n");
    int n = in.nextInt();
    
         //Inicializando os primeiros termos da série
    int pt = 0;
    int st = 1;
    
    //Imprimindo os primeiros n termos da série de finabocci
    
    System.out.println("Série deFibonaci até o" + n + " ");
    
    System.out.println(pt + " ");
    
    int i = 1; //contador
    
    //Laço de repetição para calcular os termos subsequentes da série
    while(i<n){
       System.out.println(st + " ");
       
       //Calculando o próximo termo da série
       int proximoTermo = pt + st;
       pt = st;
       st = pt;
       i++;
       
    
    }
      
  }
}