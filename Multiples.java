
import java.util.Scanner;
public class Multiples {
	//System.out.println("Enter a limit number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int b=0;
	public int Multiple() {
	for(int i=1;i<=n;i++) {
		if(i%3==0||i%5==0) {
			b=b+i;
		}
	}
	return b;
	}
	
	
	
	
	
	
   public static void main(String[] args) {
	Multiples m=new Multiples();
	m.Multiple();
}
}
