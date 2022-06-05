import java.util.*;
interface Pharmacy{
	void Combiflam();
	void Corex();
	void Azithromycin();
	void Phensedryl();
	void Benadryl();
	void Mavaflam();
	
}

class Pharmacy1 implements Pharmacy{
	public void Combiflam(){
		System.out.println("This is a paracetamol tablet. Used for fever.");
					System.out.println("Price 2 Rs/tablet");
					System.out.println("if you want to purchase please press 1");
					Scanner sc=new Scanner(System.in);
					int addToCart=sc.nextInt();
					if(addToCart==1){
						System.out.println("Please enter quantity in multiple of 10");
						int quantity=sc.nextInt();
						int price=0;
						if (quantity>=10){
							for(int i=10;i<=100;i++){
								price=quantity*2;
							}
							System.out.println("Price: "+price);
							System.out.println("You will get your medicine within 38 minutes");
						}
						
						else{
							System.out.println("Minimum Quantity 10");
						}
					}
					else{
						System.out.println("Thanks");
					}
		
		
	}
	public void Corex(){
	                System.out.println("This is a cough relief tablet. Used for Cough.");
					System.out.println("Price 3 Rs/tablets");
					System.out.println("if you want to purchase please press 1");
					Scanner sc=new Scanner(System.in);
					int addToCart=sc.nextInt();
					if(addToCart==1){
						System.out.println("Please enter quantity in multiple of 10");
						int quantity=sc.nextInt();
						int price=0;
						if (quantity>=10){
							for(int i=10;i<=100;i++){
								price=quantity*3;
							}
							System.out.println("Price: "+price);
							System.out.println("You will get your medicine within 38 minutes");
						}
						
						else{
							System.out.println("Minimum Quantity 10");
						}
					}
					else{
						System.out.println("Thanks");
					}
		
		
	}
	public void Azithromycin(){
		
		            System.out.println("This is a Anti-biotic tablet.");
					System.out.println("Price 20Rs/tablets");
					System.out.println("if you want to purchase please press 1");
					Scanner sc=new Scanner(System.in);
					int addToCart=sc.nextInt();
					if(addToCart==1){
						System.out.println("Please enter quantity in multiple of 10");
					    int quantity=sc.nextInt();
						int price=0;
						if (quantity>=10){
							for(int i=10;i<=100;i++){
								price=quantity*20;
							}
							System.out.println("Price: "+price);
							System.out.println("You will get your medicine within 38 minutes");
						}
						
						else{
							System.out.println("Minimum Quantity 10");
						}
					}
					else{
						System.out.println("Thanks");
					}
					
	}
	public void Phensedryl(){
		System.out.println("This is a cough relief tablet.");
					System.out.println("Price 5 rs/tablets");
					System.out.println("if you want to purchase please press 1");
					Scanner sc=new Scanner(System.in);
					int addToCart=sc.nextInt();
					if(addToCart==1){
						System.out.println("Please enter quantity in multiple of 10");
						int quantity=sc.nextInt();
						int price=0;
						if (quantity>=10){
							for(int i=10;i<=100;i++){
								price=quantity*5;
							}
							System.out.println("Price: "+price);
							System.out.println("You will get your medicine within 38 minutes");
						}
						
						else{
							System.out.println("Minimum Quantity 10");
						}
					}
					else{
						System.out.println("Thanks");
					}
	}
	public void Benadryl(){
		System.out.println("This is a cough relief tablet");
					System.out.println("Price 5 rs/10tablets");
					System.out.println("if you want to purchase please press 1");
					Scanner sc=new Scanner(System.in);
					int addToCart=sc.nextInt();
					if(addToCart==1){
						System.out.println("Please enter quantity in multiple of 10");
						int quantity=sc.nextInt();
						int price=0;
						if (quantity>=10){
							for(int i=10;i<=100;i++){
								price=quantity*5;
							}
							System.out.println("Price: "+price);
							System.out.println("You will get your medicine within 38 minutes");
						}
						
						else{
							System.out.println("Minimum Quantity 10");
						}
					}
					else{
						System.out.println("Thanks");
					}
	}
	
	@Override
	public void Mavaflam(){
		            System.out.println("This is a paracetamol tablet. Used for fever.");
					System.out.println("Price 2 rs/10tablets");
					System.out.println("if you want to purchase please press 1");
					Scanner sc=new Scanner(System.in);
					int addToCart=sc.nextInt();
					if(addToCart==1){
						System.out.println("Please enter quantity in multiple of 10");
						int quantity=sc.nextInt();
						int price=0;
						if (quantity>=10){
							for(int i=10;i<=100;i++){
								price=quantity*2;
							}
							System.out.println("Price: "+price);
							System.out.println("You will get your medicine within 38 minutes");
						}
						
						else{
							System.out.println("Minimum Quantity 10");
						}
					}
					else{
						System.out.println("Thanks");
					}
	}
	
}
