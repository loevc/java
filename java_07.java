public class java_07 {
	public static void main(String[] args){
		int a = -487;
		int i = a>>31;
		int b = (a^i)-i;
		System.out.println(b);
	}
}
