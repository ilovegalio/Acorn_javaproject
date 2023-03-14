/**
	* <pre>
	*  Class name : ED05_Operator5.java
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
public class ED05_Operator5 {
	public static void main(String[] args) {
		int x = 10;
		int y = 4;

		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		System.out.printf("%d / %d = %d\n", x, y, x/y);
		System.out.printf("%d / %d = %f\n", x, y, (double)x/y);
		
		System.out.println(x%0.0 +10); 	//zero division error
	}
}
