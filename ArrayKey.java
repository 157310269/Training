package com.pack;


	import java.util.Scanner;
	public class ArrayKey{
		int n,key,count=0;
		int arr[]=new int[100];
		boolean search(){
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			n=in.nextInt();
			System.out.println("Enter "+n+" elements:");
			for(int i=0;i<n;i++){
				arr[i]=in.nextInt();
			}
			System.out.println("Enter a key to Search:");
			key=in.nextInt();
			for(int i=0;i<n;i++){
				if(key==arr[i]){
					break;
				}
				else{
					count++;
				}
			}
			if(count==n){
				return false;
			}
			else{
				return true;
			}
		}
		public static void main(String []args){
			ArrayKey ob=new ArrayKey();
			if(ob.search()){
				System.out.println("The key exists!!");
			}
			else{
				System.out.println("The key not exists!!");
			}
		}
	}

