/**
	* <pre>
	*  Class name : ED04_Operator.java
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
public class ED04_Operator {

	/**
	 * Main 메소드요 ㅠㅡㅠ
	 * @param args
	 */
	public static void main(String[] args) {
		int i = -10;
		i = +i;
		
		System.out.printf("i=%d\n", i);
		
		i = -10;
		i = -i;
		System.out.printf("i=%d\n", i);
	}

}
