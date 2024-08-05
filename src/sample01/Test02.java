package sample01;

public class Test02 {
	public static void main(String[] args) {
		int a=10;
		char b ='c';
		double c= 20;
		String d ="apple";
		// = 뒤에 있는 결과를 앞에 저장한다.
		// = 는 대입연산자;
		System.out.println(a+10);
		System.out.println(d+10);
		//자료형에 따라 사용되는 연산자의 의미가 달라짐.
		c=a+10/2;
		System.out.println(a+10);
		int k = a+a/4;
		System.out.println(k);
		int cc =a;
		a=a/3+2;
		cc=cc+a;
		System.out.println(cc);
		a=10;
		double p = 4;
		System.out.println(a/p);   // 형변화
		System.out.println(a==10); // 비교연산자
		System.out.println(a!=10);
		// a의 value는 10입니다.
		System.out.println(a=a+1);
		System.out.println(a==10);
		// 위 두 줄의 코드를 다음과 같이 하나로 줄일 수 있다.
		System.out.println((a=a+1)==10);
	}

}
