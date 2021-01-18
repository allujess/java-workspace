package loopExample;

import java.math.BigInteger;

import sun.nio.cs.ext.Big5;

public class prac {

	public static void main(String[] args) {

//		//num을 담을 
//		int sum = 0;
//		
//		for(int num = 1 ; num <= 100; num++) {
//			sum += num;
//			num++;
//			
//		}
//		
//		System.out.println(sum);
		
		BigInteger big = new BigInteger("1");
		
		for(int i = 1; i <= 100; i++) {
			big = big.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(big);
	}

}
