import java.util.*;
class PharmacyDemo{
	public static void main(String[] args){
		String [] Medicine={"Combiflam", "Corex", "Azithromycin", "Phensedryl", "Banadryl", "Mavaflam"};
		for(int i=0;i<=Medicine.length-1;i++){
		System.out.println(Medicine[i]);
		
		}
			System.out.println("Please enter above medicine");
			Scanner sc=new Scanner(System.in);
			String str=sc.next();
			String yes="";
			Pharmacy1 phar=new Pharmacy1();
			 
				
			switch(str){
				case "Combiflam":{
					phar.Combiflam();
					 
					break;


				}
				case "Corex":{
					phar.Corex();
					
					break; 
				}
				case "Azithromycin":{
					phar.Azithromycin();
					
					break;
				}
				case "Phensedryl":{
					phar.Phensedryl();
					
					break;
				}
				case "Benadryl":{
					phar.Benadryl();
					
					break; 
				}
				case "Mavaflam":{
					phar.Mavaflam();
					break;
				}
				default:{
					System.out.println("Please enter Correct Medition");
				}
				
			}
			
		}
			
		
		
	
	
}

	



