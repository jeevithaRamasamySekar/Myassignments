package Episode1;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arr[]= {1,2,3,1};
		//int arr[]= {1,2,3,4};
		int arr[]= {1,1,1,3,3,4,3,2,4,2};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=true;
			
				}
			
			}
		}
		System.out.println(flag);
	}

}
