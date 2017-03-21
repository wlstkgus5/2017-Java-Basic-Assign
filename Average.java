package test2;

import java.util.*;

public class Cirde {
	public static void main(String[] args) {
System.out.println("입력 할 수 있는 최대 갯수를 입력하십시요");

 java.util.Scanner input= new java.util.Scanner(System.in);

	int size = input.nextInt();
	
 System.out.println("실수" + size + " 개를 입력하세요");
 System.out.println("\n중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");
 double[]count = new double[size];
 double sum =0;
 
for(int i=0 ; i<size; i++){
	
      count[i] = input.nextDouble();
      if(count[i] == 0){
    	  size = i;
    	  break;
      }
      sum +=count[i];
}
      System.out.println("합은:" + sum);
      System.out.println("평균은:" + sum/size);
 

 
	
	}
}
