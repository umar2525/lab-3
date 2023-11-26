import java.util.Scanner;
public class L33{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int e = 0;
		int o = 0;
		for (int i = 1 ;i <=10 ; i++){
			System.out.println("Enter Number");
		int n = s.nextInt();
		if ( n%2==0){
			e++;
			
		}else {
			o++;
		}
		}
		System.out.println("EVEN : " + e);
		System.out.println("ODD : " + o);
		
	}
	
}
