package Java_Assignment;

import java.util.Scanner;

public class Question05 {
	public static void main(String[] args) {
		int num[] = new int[5];
		int sum = 0;
		float average=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The 5 values");
		for( int i = 0; i<5; i++) {
			num[i]= sc.nextInt();
			sum += num[i];

		}
		average = (float)sum/5;
		System.out.println(sum);
		System.out.println(average);


		sc.close();
	}

}


