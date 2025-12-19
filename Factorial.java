class Factorial {
	public static void main(String[] args){
		System.out.print("Enter the number: ");
		int n=Integer.parseInt(args[0]);
		int result=1;
		for (int i=1; i<=n; i++){
			result=result*1;
		}
		System.out.println("factorial of "+n+"="+result);
	}
}