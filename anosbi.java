package numerospares1;

public class anosbi {
	

	public static void main(String[] args) {
		
		for(int ai = 1, af = 2023, ano = ai; ano <= af; ano++) {
			
			if(ano%4==0 && (ano % 100 !=0 || ano %400==0)) {
				
				System.out.println(ano);
			}
			
		}
		

	}

}
