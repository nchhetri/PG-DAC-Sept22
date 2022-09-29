class pp4{

	public static void main(String[] args){
		int k =17;
		for(int i=1; i<=9;i++){
			
			for(int j=1; j<k; j++){
			
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++){
				
				System.out.print(j+ " ");
				
				
			}
			for(int j=(i-1);j>=1; j--){
					
					System.out.print(j+ " ");
					
			}
			k -= 2;
			System.out.println();
		}
		
	}
}