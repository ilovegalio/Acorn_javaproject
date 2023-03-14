/**
	* <pre>
	*  Class name : ED13_Operator.java
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
public class ED14_Operator {
	public static void main(String args[]) {
		float pi = 3.141592f;
		
		System.out.println((int)(pi * 1000)/1000f);
		//1.	3.141592 >> 3141.592
		//2.	(int)3141.592 >> 3141
		//3.	3141/1000f >> 3.141
	}
}
