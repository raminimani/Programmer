package JavaClass08;

public class SumArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array on integers and calculate the sum of all elements in an array
		
		int nums[]= {20,55,65,22,44,87};
		
		int sum=0;
		
		for (int x=0 ; x<nums.length ; x++) {
			
			sum+=nums[x];
			
			
		}
		System.out.println("The total sum of the above array is : "+sum);
	}

}
