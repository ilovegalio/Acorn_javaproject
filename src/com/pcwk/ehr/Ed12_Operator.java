/**
	* <pre>
	*  Class name : Ed12_Operator.java
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
public class Ed12_Operator {
	public static void main(String args[]) {
		char c = 'A'; // 97
		for (int i =0; i<26; i++) {
			System.out.printf("%c ", (c+32)+i);
		}
		System.out.println("");
		c = 'a';
		for (int i =0; i<26; i++) {
			System.out.printf("%c ", (c-32)+i);
		}
		System.out.println("");
		for (int i =0; i<10; i++) {
			System.out.print(i+" ");
		}
	}
}
