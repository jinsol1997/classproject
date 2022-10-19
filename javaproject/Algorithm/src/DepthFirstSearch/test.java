package DepthFirstSearch;

import java.util.ArrayList;
import java.util.Collections;

public class test {

	public static int solution(int[] cards) {
		int answer = 0;
		boolean[] visited = new boolean[cards.length];
		ArrayList<Integer> li = new ArrayList<>();

		for (int i = 0; i < cards.length; i++) {
			if (!visited[i]) {
				dfs(cards, i, 0, visited, li);
			}
		}

		if(li.size() == 1) {
			return answer;
		}
		
		Collections.sort(li, Collections.reverseOrder());
		answer = li.get(0) * li.get(1);
		return answer;
	}
	
	public static void dfs(int[] cards, int index, int count, boolean[] visited, ArrayList<Integer> li) {
		
		if(visited[index]) {
			li.add(count);
			return;
		}
		
		
		visited[index] = true;
		dfs(cards, cards[index]-1, count+1, visited, li);
	}
	
	

	public static void main(String[] args) {

		int[] test = {8,6,3,7,2,5,1,4};
		int result = solution(test);
		System.out.println(result);
	}

}
