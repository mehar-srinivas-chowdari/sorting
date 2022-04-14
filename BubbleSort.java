import java.util.*;
public class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		boolean flag=true;
		for(int i=0;i<n && flag;i++)
		{
			flag=false;
			for(int j=1;j<n-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int tmp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
					flag=true;
				}
			}
		}
		for(int i=0;i<n;i++)System.out.print(arr[i]+" ");
	}
}