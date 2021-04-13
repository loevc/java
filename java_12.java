import java.util.Scanner;

public class java_12 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();
		s.close();
		score /= 10;
		switch(score) {
			case 10 :
				System.out.println("优");
				break;
			case 9 :
				System.out.println("优");
				break;
			case 8 :
				System.out.println("良");
				break;
			case 7 :
				System.out.println("中");
				break;
			case 6 :
				System.out.println("及格");
				break;
			default :
				System.out.println("不及格");
				break;
		}

	}
}
