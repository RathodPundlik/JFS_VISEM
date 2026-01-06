import java.util.Scanner;
class ArrSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n];
		int output[] = new int[n];
		System.out.pintln("Enter N number: ");
		for(int i=0; i<n; i++){
			input[i] = sc.nextInt();
			int sum = 0;
			int d = 0;
			while(input[i]>0){
				d = input[i]%10;
				output[i] = output[i]+d;
				input[i] = input[i]/10;
			}
		}
		System.out.println("Sum of digits: ");
		for(int j=0; j<n; j++){
			System.out.pintln("Sum of "+input[j]+" : "+output[j]);
		}
	}
}