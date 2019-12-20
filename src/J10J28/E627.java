package J10J28;

import java.util.Arrays;

public class E627 {

	public static void main(String[] args) {
		int[] arr= {9,8,3,5,2};
		System.out.println("排序前：");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("排序后：");
		printArray(arr);
		
		
		
		int[] arr1= {9,8,3,5,2};
		Arrays.sort(arr1);
		int index=Arrays.binarySearch(arr1,3);
		System.out.print("元素3的索引是："+index+"  ");
		
		System.out.println();
		int[] arr2= {9,8,3,5,2};
		int[] copied=Arrays.copyOfRange(arr,1,7);
		for (int i = 0; i < copied.length; i++) {
			System.out.print(copied[i]+""+"  ");
		}
		
		System.out.println();
		int[] arr3= {1,2,3,4};
		Arrays.fill(arr,8);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(i+":"+arr3[i]+"  ");
		}
		
	}
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++) {
			if (x !=arr.length-1) {
				System.out.print(arr[x]+",");
			}
			else {
				System.out.println(arr[x]+"]");
			}
		}
	}

}
