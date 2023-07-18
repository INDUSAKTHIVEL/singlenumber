package Single_num;

import java.util.Scanner;

public class Number_single {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		{
		for( int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
		int result =Number_single(arr);
		System.out.println("Output:"+result);
		}
		

	}

	private static int Number_single(int[] arr) {
		int result =0;
		for(int num :arr)
		{
			result^=num;
		}
		return result;
	}
	}

