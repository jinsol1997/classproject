package BruteForce_BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class MaxGap {

	static int N;
	static int[] input, numbers;
	static boolean[] isSelected;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		input = new int[N];
		numbers = new int[N];
		isSelected = new boolean[N];

		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();

		permutation(0);
	}

	public static void permutation(int cnt) {
		System.out.println("permutation 진입...");

		if (cnt == N) {
			System.out.println(Arrays.toString(numbers));
			return;
		}

		for (int i = 0; i < N; i++) {// 모든 수를 한 번씩 체크할 것이기 때문에!
			if (isSelected[i])
				continue;

			numbers[cnt] = input[i];
			isSelected[i] = true;
			permutation(cnt + 1);
			isSelected[i] = false;
			System.out.println("permutation for문 내부, i : " + i + "  cnt : " + cnt);

		}

	}

}
