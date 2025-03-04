package work.com.workshop01;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 45678;
		int result = ((num/1000)<<10)-1080;
		System.out.println("기존 숫자: " + num);
		System.out.println("비트 연산 후 변환된 숫자: " + result);

	}

}
