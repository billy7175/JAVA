package E5_배열5_알고리즘;
import java.util.Arrays;

public class 배열5_알고리즘_배열두개정렬_문제 {

	public static void main(String[] args) {
		int[] arr1 = {9,10,3,2,20,19};
		int[] arr2 = {15,12,1,5,7,8};	
		int[] temp = null;
		int size1 = arr1.length;
		int size2 = arr2.length;
		
		temp = new int[size1 + size2];
		
		for(int i = 0; i < temp.length; i++) {
			if(i < arr1.length) {
				temp[i] = arr1[i];				
			}else {
				temp[i] = arr2[i - arr1.length];
			}	
		}
		
		System.out.println(Arrays.toString(temp));
		
	}

}
