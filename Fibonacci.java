import java.util.Scanner;
public class Fibonacci {
  public static void main(String[]args) {
  Scanner in = new Scanner(System.in);
  
  System.out.println("Digite valor de n");
    int n = in.nextInt();
    
         //Inicializando os primeiros termos da s�rie
    int pt = 0;
    int st = 1;
    
    //Imprimindo os primeiros n termos da s�rie de finabocci
    
    System.out.println("S�rie deFibonaci at� o" + n + " ");
    
    System.out.println(pt + " ");
    
    int i = 1; //contador
    
    //La�o de repeti��o para calcular os termos subsequentes da s�rie
    while(i<n){
       System.out.println(st + " ");
       
       //Calculando o pr�ximo termo da s�rie
       int proximoTermo = pt + st;
       pt = st;
       st = pt;
       i++;
       
    
    }
      
  }
}