package SelfStudy;

import java.util.Scanner;

/*	자유 낙하 물체의 위치 구하기
 	1000m 상공에서 물체를 정지상태에서 가만히 놓아 자유 낙하 시키려 한다. 
	(저항은 없고, 중력 가속도는 9.81m/s로 한다.) 
	몇초 후의 위치는?
	등가속 운동 물체의 위치 공식은 아래와 같습니다. 
	𝑥(𝑡)=1/2 𝑎𝑡^2+𝑣0𝑡+𝑥0 
 	(𝑥(𝑡)  : 위치, a : 가속도, t : 이동 시간, v0 : 초기 속도, x0 : 초기 위치)

*/
public class Practice9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("★★자유 낙하 물체의 위치 구하는 프로그래밍★★");
		System.out.print("[몇초 후 인가요??] (종료는 0)  ");
		int a;
		while ((a = sc.nextInt()) != 0) {
			System.out.println("[" + a + "초 후 위치 : " + (1000 - (a * a * 9.81) / 2 ) + "m]");
			System.out.println("");
			System.out.print("[몇 km/h 인가요??] (종료는 0)  ");
		}
		System.out.println("[종료합니다!]");

	}

}
