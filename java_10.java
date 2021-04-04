import java.util.Scanner;

public class java_10 {
	public static void main(String[] args){
		System.out.println("input a number 1-7");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		switch(a){
			case 1:
				System.out.println("星期一");
			case 2:
				System.out.println("星期二");
			case 3:
				System.out.println("星期三");
			case 4:
				System.out.println("星期四");
			case 5:
				System.out.println("星期五");
			case 6:
				System.out.println("星期六");
			case 7:
				System.out.println("星期日");
		}
	}
}
