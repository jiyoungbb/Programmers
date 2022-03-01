package Level01;

/*
 * 문제
 * 
 * [평균 구하기]
 * 
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 * 
 * 단, arr은 길이 1 이상, 100 이하인 배열입니다.
 * 	  arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 */

public class ex_12944 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		
		double answer = 0;
        double sum = 0;
        
        for(int i=0; i<arr.length; i++){
        	sum += arr[i];    
        }
        
        answer = sum/(arr.length);
        
        System.out.println("배열의 평균값: " + answer);
        
	}

}
