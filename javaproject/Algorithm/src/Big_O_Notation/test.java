package Big_O_Notation;

import java.util.*;

public class test {

	public static int solution(int[] array) {

		int answer = 0;
		int temp = 1;
		int count = 1;
		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {

			if (i + 1 < array.length && array[i] == array[i + 1]) {
				count++;
			} else {
				if (count > temp) {
					temp = count;
					count = 1;
					answer = array[i];
				}
			}

		}
		if (count > temp) {
			temp = count;
			answer = array[array.length - 1];
		}
		count = 1;

		for (int i = 0; i < array.length; i++) {
			if (i + 1 < array.length && array[i] == array[i + 1] && array[i] != answer) {
				count++;
			} else {

				if (count == temp) {
					return -1;
				}
				count = 1;
			}

		}
		return answer;
	}

	public static void main(String[] args) {

		int[] test = { 5, 5, 5, 3, 3,3, 2, 2, 1 };

		int a = solution(test);
		System.out.println(a);
	}
}