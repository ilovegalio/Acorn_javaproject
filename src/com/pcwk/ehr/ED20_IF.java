/**
	* <pre>
	*  Class name : ED20_IF.java
	*  Description:
	*  Author : user
	*  Create date : 2023-03-14
	*  Version : 0.5
	*  Copyright 저요
	*  Modification information
	*  수정일	수정자	수정내용
	*-----------------------------------------------
	*
	*-----------------------------------------------
	* </pre>
 */
package com.pcwk.ehr;

/**
 * Description : 비교 연산자를 공부해본 class
 * Date : 2023. 3. 14
 * History : 2번째 commit
 * - 작성자 : 민윤홍, 날짜 : 2023. 3. 14, 설명 : 비교 연산자를 공부 해 봤어요
 *
 * @author 민윤홍
 * @version 1.0
 */
public class ED20_IF {
	public static void main(String args[]) {
		/*
		for (int i=1; i<=100; i++) {
			if (((i % 2 ==0) || (i % 3 ==0)) && (i % 6 !=0))
				System.out.printf("%d는 2의수 or 3의 배수지만 6의배수는 아닌 경우다.\n", i);
			else
				System.out.printf("%d는 예외 경우다.\n", i);
		}
		char askii1 = '0';
		char askii2 = '9';
		for (int i=1; i<=126; i++) {
			if (i >= askii1 && i <= askii2) System.out.printf("%c는 0~9사이\n", (char)i);
			else System.out.printf("%c는 0~9사이아님\n", (char)i);
		}
		*/

		int x= 0;
		
		x = 15;
		System.out.printf("x=%2d 10<x<20 = %b %n", x ,x>10 && x<20);
		System.out.printf("x= %-3d, x %% 2 ==0 || x %%3 ==0 \t %b \n",x ,((x % 2 ==0) || (x % 3 ==0)));
		
		char ch = '2';
		System.out.printf("0 < %c < 9 = %b",ch,ch >= '0' && ch <= '9');
		System.out.println("나는 수정을 했다. ㅇㅈ?");
	}
}
