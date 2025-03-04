package work.com.workshop01;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		double d = 3.14;
		char ch = 'A';
		boolean bo = true;
		
		System.out.println("정수형 변수의 값은 "+i+"이며, 자료형은 "+((Object)i).getClass().getSimpleName()+" 입니다.");
		System.out.println("실수형 변수의 값은 "+d+"이며, 자료형은 "+((Object)d).getClass().getSimpleName()+" 입니다.");
		System.out.println("문자형 변수의 값은 "+ch+"이며, 자료형은 "+((Object)ch).getClass().getSimpleName()+" 입니다.");
		System.out.println("논리형 변수의 값은 "+bo+"이며, 자료형은 "+((Object)bo).getClass().getSimpleName()+" 입니다.");
	}

}
