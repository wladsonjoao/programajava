import java.util.Scanner;

public class signodiames {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("entre com dia");
        int dia = in.nextInt();
        System.out.println("entre com mes");
        int mes = in.nextInt();
        
          String signo;

        switch (mes) {
            
             case 1:
               if(dia>=20) {
                      signo = "Aquario";
             }else{
               signo = "capricornio";
             }
                break;
                
           case 2:
                if(dia>=19) {
                      signo = "Peixes";
             }else{
               signo = "Aquario";
             }
                
                break;
                
             case 3:
                  if(dia>=21) {
                      signo = "Aries";
             }else{
               signo = "Peixes";
             }
                
                break;
                
              case 4:
                  if(dia>=20) {
                      signo = "Touro";
             }else{
               signo = "Aries";
             }
                
                break;
                
               case 5:
                  if(dia>=21) {
                      signo = "Gemeos";
             }else{
               signo = "Touro";
             }
                
                break;
                
               case 6:
                  if(dia>=21) {
                      signo = "Cancer";
             }else{
               signo = "Gemeos";
             }
                
                break;
                
              case 7:
                  if(dia>=23) {
                      signo = "Leao";
             }else{
               signo = "Cancer";
             }
                
                break;
                
                 case 8:
                  if(dia>=23) {
                      signo = "Virgem";
             }else{
               signo = "Leao";
             }
                
                break;
                
                 case 9:
                  if(dia>=23) {
                      signo = "Libra";
             }else{
               signo = "Virgem";
             }
                
                break;
                
                 case 10:
                  if(dia>=23) {
                      signo = "Escorpiao";
             }else{
               signo = "Libras";
             }
                
                break;
                
                 case 11:
                  if(dia>=22) {
                      signo = "Sagitario";
             }else{
               signo = "Escorpiao";
             }
                
                break;
                
                 case 12:
                  if(dia>=22) {
                      signo = "Capricornio";
             }else{
               signo = "Sagitario";
             }
                
                break;
                
            default:
                signo = "Mes invalido";
                
                
        }   
        
        System.out.println("Seu Signo e:" + signo);
    }
}
