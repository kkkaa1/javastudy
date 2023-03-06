package ch10;

public class OperatorTest {

	public static void main(String[] args) {
		int total = 10;
		int add= 20;
		total += add;
		System.out.println(total);
		
		int gamescore = 100;
		int myscore;
		myscore = ++gamescore;
		System.out.println(myscore+","+gamescore);
		myscore = gamescore++;
		System.out.println(myscore+","+gamescore);
		
	}

}
