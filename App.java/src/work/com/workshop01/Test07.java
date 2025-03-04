package work.com.workshop01;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'G';
		printResult(ch);
	}
	public static boolean isAlphabet(char ch) {
		return (ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z');
	}
	public static void printResult(char ch) {
		String result = isAlphabet(ch)?"입력한 문자 "+ch+"는 영문자입니다.":"입력한 문자 "+ch+"는 영문자가 아닙니다.";
		System.out.println(result);
	}
}
