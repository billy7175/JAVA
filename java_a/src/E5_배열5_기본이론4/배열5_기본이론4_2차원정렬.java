package E5_배열5_기본이론4;
import java.util.Arrays;
import java.util.Random;
public class 배열5_기본이론4_2차원정렬 {

	public static void main(String[] args) {
		Random ran = new Random();
		int darr[][] = new int[4][3];
		
		for(int i=0; i < darr.length; i++) {
			for(int j=0; j < darr[i].length; j++) {
				darr[i][j] = ran.nextInt(100);
			}
		}
		
		for(int i =0; i < darr.length; i++) {
			System.out.println(Arrays.toString(darr[i]));
		}
		// -------------------------------------------------------
		int size = darr.length * darr[0].length;
		int arr[] = new int[size]; // 0 ~ 11 2차원 배열을 1차원으로 변환시 필요한 size;
				
		int k =0;
		for(int i = 0; i< darr.length; i++) {
			for(int j=0; j <darr[i].length; j++) {
				System.out.println(i);
				System.out.println(j);
				System.out.println("k : "+ k);
				System.out.println("darr[i][j] : " + darr[i][j]);
				arr[k] = darr[i][j];
				k += 1;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("------일차원 배열로 변환 완료--------- ");
		
		for(int i=0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("----일차원 배열 정렬 완료-------");
		
		k = 0;
		for(int i = 0; i < darr.length; i++) {
			for(int j = 0; j < darr[i].length; j++) {
				darr[i][j] = arr[k];
				k += 1;
			}
		}
		
		for(int i = 0; i < darr.length; i++) {
			System.out.println(Arrays.toString(darr[i]));
		}
		
	}

}
