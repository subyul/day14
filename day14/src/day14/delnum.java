package day14;
public class delnum {
	public static void main(String[] args) {
		int [] test1 = {1,2,3,2,1};
		int [] test2 = {1,3,4,4,2};
		int [] test3 = {1,1,1,2,1};
		int [] temp = new int [4];
		int count = 0;
		
		for(int i = 0; i<test1.length;i++)
		{
			temp[count] = test1[i];
			int check=0;
			for(int j = 0;j<test1.length;j++)
			{
				if(i!=j && test1[i]==test1[j])
				{
					check = 1;
				}
			}
			if(check == 1)
			{
				count++;
			}
		}
		
		System.out.println("test1");
		
		for(int i = 0;i<count;i++)
		{
			System.out.println(temp[i]+" ");
		}
		System.out.println();
		
		
		count = 0;
		
		for(int i = 0; i<test2.length;i++)
		{
			temp[count] = test2[i];
			int check = 0;
			for(int j = 0;j<test2.length;j++)
			{
				if(i!=j && test2[i]==test2[j])
				{
					check = 1;
				}
			}
			if(check == 1)
			{
				count++;
			}
			
		}
		System.out.println("test2");
		for(int i = 0;i<count;i++)
		{
			System.out.println(temp[i]+" ");
		}
		System.out.println();
	}
}