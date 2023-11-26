import java.util.Scanner;
public class L31{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 2 number");
		float a = s.nextFloat();
		float b = s.nextFloat();
		System.out.println("Enter 1-5  number for operation /n 1 : + (Addition) /n  2: - (Subtraction) /n3:  * (Multiplication) /n 4:  / (Division) /n 5 : % (Modulo or remainder)");
		
		int n = s.nextInt();
		
		switch(n) {
   case 1 :
       System.out.println(a+b);
       break;
   case 2 :
       System.out.println(a-b);
       break;
   case 3 :
       System.out.println(a*b);
       break;
   case 4 :
       System.out.println(a/b);
       break;
   case 5:
       System.out.println(a%b);
       break;
   default :
       System.out.println("Invalid operator");
}

		
		
	}
	
}
