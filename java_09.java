import java.util.Scanner;

public class java_09 {
	public static void main(String[] args){
		System.out.println("input number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if ((a&(a-1))==0)
			System.out.println("是2的整数次幂");
	}
}
