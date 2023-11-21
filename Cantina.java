import java.util.Scanner;

public class Cantina {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int codigos;
        
        System.out.println("itens codigo 1,2,3,4,5");
        codigos = in.nextInt();

        switch (codigos) {
           
         
           case 1:
            System.out.println("Cachorro quente"); 
             System.out.println("Valor: 8,00 Reais"); 
            
                break;

             case 2:
            System.out.println("Cheeseburguer"); 
             System.out.println("Valor: 12,00 Reais"); 
            
                break;
                
             case 3:
            System.out.println("X-Salada"); 
             System.out.println("Valor: 15,00 Reais"); 
            
                break;
                
             case 4:
            System.out.println("Misto Quente"); 
             System.out.println("Valor: 11,00 Reais"); 
            
                break;
                
            case 5:
            System.out.println("Pão na chapa"); 
             System.out.println("Valor: 6,00 Reais"); 
            
                break;
                
            default:
                System.out.println("sem informações");
        }
    }
}