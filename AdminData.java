import java.util.Scanner;

public class AdminData {
	//int[] array= new int[10];
	
	//��ʾ��ʾ��Ϣ�ķ���
	public void notice(){
	System.out.println();
	System.out.println("**************************");
	System.out.println("         1--��������");
	System.out.println("         2--��ʾ��������");
	System.out.println("         3--��ָ��λ�ô���������");
	System.out.println("         4--��ѯ�ܱ�3����������");
	System.out.println("         0--�˳�");
	System.out.println("**************************");
	System.out.println("�������Ӧ�����ֽ��в�����");
	}
	
	//��������
	public int[] insertData(int[] array){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<9;i++)
		{
			System.out.println("�������"+(i+1)+"�����ݣ�");
			array[i]=sc.nextInt();
		}
		System.out.println("����Ԫ��Ϊ:");
		for(int i=0;i<9;i++)
			System.out.print(array[i]+" ");
		return array;
	}
	
	//��ʾ��������
	public void showData(int[] a,int length){
		for(int i=0;i<length;i++)
			System.out.print(a[i]+" ");
	}
	
	//��ָ��λ�ô���������
	public void insertAtArray(int[] array,int n,int k){
		array[k-1]=n;
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	
	//��ѯ�ܱ�3����������
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
			System.out.print("�˳�����! ");
			
			break;
		}
		if(c==1){
			ad.insertData(array);
		}
		if(c==2){
			ad.showData(array, array.length);

		}
		if(c==3){
			System.out.print("������Ҫ��������ݣ�");
			int n= sc.nextInt();
			System.out.print("������Ҫ�����λ�ã�");
			int k= sc.nextInt();
			ad.insertAtArray(array, n, k);
		}
		if(c==4){
			ad.divThree(array);
		}
		
		
	}
		
		
	}

}