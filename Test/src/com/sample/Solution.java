package com.sample;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public int solution(int[] A){
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		for(int i=0;i<A.length-1;i++){
			
			if(A[i]<0){
				return 1;
			}
			if((A[i+1]-A[i]) != 1 && (A[i+1]-A[i]) != 0){
				return A[i]+1;
			}else {
				continue;
			}
			
		}
		return A[A.length-1]+1;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter length of the array");
		int length = scan.nextInt();
		int[] inputArray = new int[length];
		System.out.println("enter the numbers of array");
		for(int i=0;i<length;i++){
			inputArray[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(inputArray));
		int result = new Solution().solution(inputArray);
		System.out.println("here is the answer "+result);

	}

}
