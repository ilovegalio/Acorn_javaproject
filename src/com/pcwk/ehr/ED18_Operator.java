/**
	* <pre>
	*  Class name : ED18_Operator.java
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
public class ED18_Operator {
	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		System.out.printf("10.0 == 10.f \t %b\n",10.0 == 10.0f);
		
		System.out.printf("0.1 == 0.1f \t %b\n",0.1 == 0.1f);
		System.out.printf("0.1 == 0.1f %19.17f, %19.17f\n", f, d);
	}
}
