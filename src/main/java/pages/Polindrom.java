package pages;

public class Polindrom {

	public static void main(String[] args) {
		
		int temp,sum=0;
		
		int num= 121;
		
		temp=num;
		
		while(num>0){
			
			int n= num%10;
			
			sum=(sum*10)+n;
			}
		if (sum==num){
			
			System.out.println("this is polyndrom");
		}else{
				System.out.println("Not polindrome");
			}
			
				
		

	}

}
