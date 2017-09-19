package practice9_18;

import java.util.Scanner;

public class PraticeDemo {

	public static void main(String[] args) {
		/*char c=95;
		System.out.println(c+"****");
		System.out.println(args.length);
		if(args.length==0||args[0].equals("-h"))
			System.out.println("hello");

		int[] score = new int[]{1,2,3,4,5,6};
		System.out.println(score);
		
		String[] bird=new String[3];
		bird[0]="11";
		bird[1]="22";
		
		String[] taste =new String[] {"酸","甜","苦","辣"};
		for (int i = 0; i < taste.length; i++) {
			System.out.print(taste[i]+"\t");
		}
		
		for (String s : taste) {
			System.out.println(s);
		}
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please input 5 numbers");
		int[] arrInt=new int[5];
		int arrMin;
		for(int i=0;i<arrInt.length;i++) {
			arrInt[i]=scanner.nextInt();
		}
		arrMin=arrInt[0];
		for (int i : arrInt) {
			if(i<arrMin)
				arrMin=i;
		}
		System.out.println(arrMin);*/
		
		int score[]= {4,1,5,9,8};
		for (int i : score) {
			System.out.print(i+" ");
		}
		System.out.println();
		//冒泡
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length-1-i; j++) {
				if(score[j]<score[j+1])
				{
					int temp=score[j];
					score[j]=score[j+1];
					System.out.print(score[j]+" ");
					score[j+1]=temp;
					System.out.print(score[j+1]+" ");
				}
			}
			System.out.print(i+1+"_________");
			for (int k : score) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
