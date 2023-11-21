import java.util.Scanner;

public class aluno {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int aluno;
        System.out.println("entre com idade aluno");
        aluno = in.nextInt();

        switch (aluno) {
            case 6:
            System.out.println("dente de leite");
                
                break;

            case 7:
            System.out.println("junior");
                
                break;    
           
           case 8:
            System.out.println("junior max"); 
            
                break;
         
           case 9:
            System.out.println("junior master"); 
            
                break;

            case 10:
            System.out.println("master"); 
            
                break;    
                
            default:
                System.out.println("sem informações");
        }
    }
}
