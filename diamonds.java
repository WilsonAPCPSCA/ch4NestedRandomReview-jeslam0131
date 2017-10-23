import java.util.Scanner;
public class diamonds {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = in.nextInt();
		for (int i=1;i<= (num); i++){
		for (int k = 1; k<= num-i; k++) System.out.print (" ");
			for (int j=1;j<=(2*i)-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		  for (int j=num;j>1;j--){
			    for (int k= (num-j);k>=0 ;k--){
			      System.out.print(" ");
			    }
			    for (int n=1;n<(2*j-2);n++){
			      System.out.print("*");
			    }
			    System.out.println();
			  }
	}

}

