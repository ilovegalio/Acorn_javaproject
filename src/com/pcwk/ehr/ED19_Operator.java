/**
	* <pre>
	*  Class name : ED19_Operator.java
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
public class ED19_Operator {
	public static void main(String[] args) {
		String str = "abc";
		String str2 = new String("abc");
		String str3 = new String("abc");
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println(str2 == str3);
	}
}
