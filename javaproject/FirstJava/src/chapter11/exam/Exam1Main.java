package chapter11.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam1Main {

	public static void main(String[] args) {

		List<FootballPlayer> players = new ArrayList<>();

		// List<E> => 저장메소드 add(new FootballPlayer())
		FootballPlayer player = new FootballPlayer("손흥민", 7, "토트넘", 20);
		players.add(player);
		players.add(new FootballPlayer("케인", 10, "토트넘", 25));
		players.add(new FootballPlayer("이강인", 25, "토트넘", 19));
		players.add(new FootballPlayer("박지성", 7, "멘유", 35));
		players.add(new FootballPlayer("루니", 10, "멘유", 35));
		players.add(new FootballPlayer("손흥민", 7, "토트넘", 20));
		

		// List<E> : 저장 순서를 유지 -> index 값을 가지고 일괄처리
		// 나의 선수 리스트
		System.out.println("나의 선수 리스트 ===========");
		for(FootballPlayer p : players) {
			System.out.println(p);
		}
		

	}

}
