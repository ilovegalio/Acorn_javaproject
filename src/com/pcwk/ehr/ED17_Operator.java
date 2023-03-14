/**
	* <pre>
	*  Class name : ED16_Operator.java
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
 * Description : 클래스에 대한 설명을 입력해주세요.<br>
 * Date : 2023. 3. 14<br>
 * History :<br>
 * - 작성자 : user, 날짜 : 2023. 3. 14, 설명 : 최초작성<br>
 *
 * @author user
 * @version 1.0
 */
public class ED17_Operator {
	/**
	 * 메소드에 대한 설명을 입력해주세요. 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("10 == 10.0f \t %b\n", 10 == 10.0f);
		//1. 10-> 10.0f == 10.0f
		
		System.out.printf(" '0' == 0\t %b\n", '0'== 0);
		//'0'의 값이 46으로 치환  char>' '   String>" "
		
		System.out.printf(" 'A' == 65\t %b\n", 'A'== 65);
		//'A'의 값이 65으로 치환
		
		System.out.printf(" 'A' > 'b' \t %b\n", 'A' > 'B');
		//비교 연솬
		
		System.out.printf(" 'A'+1 != 'B'\t %b\n", 'A'+1 != 'B');
		//역시 비교 연솬
	}

}
