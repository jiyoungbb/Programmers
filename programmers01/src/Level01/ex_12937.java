package Level01;

/*
 * 문제
 * 
 * [짝수와 홀수]
 * 
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 * 
 * 단, num은 int 범위의 정수입니다.
 */

public class ex_12937 {
	String evenOrOdd(int num) {
		
		String result = "Odd";
		
		if(num % 2 == 0) {
			result = "Even";
		}
		
		return result;
		
	}

	    public static void main(String[] args) {

	        ex_12937 evenOrOdd = new ex_12937();
	        
	        //아래는 테스트로 출력해 보기 위한 코드입니다.
	        System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
	        System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
	    }
	    

}

	