import java.util.*;
class equilibriumIndex{
	public static void main(String[] arr){
		Scanner sc=new Scanner(System.in);
		int sum=0,temp=0;
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		System.out.println("Enter array of size "+n);
		int arr1[]=new int[n];
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++){			
			if(j==n/2){
				temp=sum;
				sum=0;
				//System.out.println("temp "+temp);
				continue;
			}
			sum=sum+arr1[j];
		}
		if(temp==sum){
			System.out.println("yes "+n/2+" is an equilibrium index");
		}else{
			System.out.println("-1");
		}
	}
}