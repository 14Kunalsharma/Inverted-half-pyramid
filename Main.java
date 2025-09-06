import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int x=sc.nextInt();
		for (int i=1; i<=x; i++){
			for (int j=1; j<=x; j++){
				if(j<=i-1){
				System.out.print(" ");
				} else{
				System.out.print("x");
				}
			}
			System.out.println();
		}
    }
}
