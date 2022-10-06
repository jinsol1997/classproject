package chapter12;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {

		List<Integer> answer = new ArrayList<Integer>();

		String my_string = "adsf14afd";

		int count = 0;
		
		for (int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i)>=0 && my_string.charAt(i)<=9) {
				answer.set(count, (int)my_string.charAt(i));
				count++;
			}

		}

		
		answer.toArray(new int[answer.size()]);
	}

}
