package practice_9_19;
import java.util.Scanner;

public class AdminData {
	//int[] array= new int[10];
	
	//显示提示信息的方法
	public void notice(){
	System.out.println();
	System.out.println("**************************");
	System.out.println("         1--插入数据");
	System.out.println("         2--显示所有数据");
	System.out.println("         3--在指定位置处插入数据");
	System.out.println("         4--查询能被3整除的数据");
	System.out.println("         0--退出");
	System.out.println("**************************");
	System.out.println("请输入对应的数字进行操作：");
	}
	
	//插入数据
	public int[] insertData(int[] array){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<9;i++)
		{
			System.out.println("请输入第"+(i+1)+"个数据：");
			array[i]=sc.nextInt();
		}
		System.out.println("数组元素为:");
		for(int i=0;i<9;i++)
			System.out.print(array[i]+" ");
		return array;
	}
	
	//显示所有数据
	public void showData(int[] a,int length){
		for(int i=0;i<length;i++)
			System.out.print(a[i]+" ");
	}
	
	//在指定位置处插入数据
	public void insertAtArray(int[] array,int n,int k){
		array[k-1]=n;
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	
	//查询能被3整除的数据
	public void divThree(int[] a){
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%3==0)
				System.out.print(a[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] array= new int[10];
		AdminData ad=new AdminData();
		Scanner sc=new Scanner(System.in);
		int c;
		int m=array.length;
		
		for(;;){
		ad.notice();
		c=sc.nextInt();
		if(c==0){
			System.out.print("退出程序! ");
			
			break;
		}
		if(c==1){
			ad.insertData(array);
		}
		if(c==2){
			ad.showData(array, array.length);

		}
		if(c==3){
			System.out.print("请输入要插入的数据：");
			int n= sc.nextInt();
			System.out.print("请输入要插入的位置：");
			int k= sc.nextInt();
			ad.insertAtArray(array, n, k);
		}
		if(c==4){
			ad.divThree(array);
		}
		
		
	}
		
		
	}

}
