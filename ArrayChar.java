package com.pack;

	import java.lang.*;
	import java.util.Scanner;
	public class ArrayChar{
		int n;
		int count=0;
		char arr[]=new char[100];
		int readChar(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			n=sc.nextInt();
			System.out.println("Enter the "+n+" elements:");
			for(int i=0;i<n;i++){
				arr[i]=sc.next().charAt(0);
			}
			for(int i=0;i<n;i++){
				if(Character.isAlphabetic(arr[i])){
					continue;
				}
				else if(Character.isDigit(arr[i])){
					continue;
				}
				else{
					count++;
				}
			}
			return count;
		}
		public static void main(String []args){
			ArrayChar ob=new ArrayChar();
			System.out.println("The number of symbols that can be found in given array are:"+ob.readChar());
		}
	}

