/**
	* <pre>
	*  Class name : Testclass.java
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
public class Testclass {
	public static void main(String args[]) {
			String arr[] = {"					⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",
							"					⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠤⠖⠚⠉⠉⠀⠀⠀⠀⠉⠉⠙⠒⠤⣄⡀⠀⠀⣀⣠⣤⣀⡀⠀⠀⠀",
							"					⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠖⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⢯⡀⠀⠀⠀⠉⠳⣄⠀",
							"					⠀⠀⣀⠤⠔⠒⠒⠒⠦⢤⣀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣄⠀⠀⠀⠀⠀⣴⢶⣄⠀⠀⠀⠉⢢⡀⠀⠀⠀⠘⡆",
							"					⢠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠈⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠀⢹⣧⠀⠀⠀⠀⣿⠀⢹⣇⠀⠀⠀⠀⠙⢦⠀⠀⠀⣧",
							"					⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣦⣼⣿⡇⠀⠀⠀⢿⣿⣿⣿⡄⠀⠀⠀⠀⠈⢳⡀⢀⡟",
							"					⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⡿⠿⠿⣿⠀⠀⠀⠘⣿⡛⣟⣧⠀⠀⠀⠀⠀⠀⢳⠞⠀",
							"					⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣷⡄⢴⡿⠀⠀⠀⠀⠘⣿⣷⡏⠀⢀⡠⠤⣄⠀⠀⣇⠀",
							"					⠀⢳⡀⠀⠀⠀⠀⠀⠀⢠⠏⠀⠀⠀⠀⠀⣠⠄⠀⠀⠀⠀⠀⠈⠛⠛⠁⣀⡤⠤⠤⠤⢌⣉⠀⠀⢠⡀⠀⠀⡱⠀⢸⡄",
							"					⠀⠀⠙⠦⣀⠀⠀⠀⣰⠋⠀⠀⠀⠀⠀⠸⣅⠀⠀⢀⡀⠀⠀⠀⢀⠴⠋⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠈⠉⠉⠀⠀⢘⣧",
							"					⠀⠀⠀⠀⠈⠙⢲⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠁⠀⠀⠀⣰⣋⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠈⢧⠀⠀⠀⠀⠀⢐⣿",
							"					⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠁⠀⠀⠀⠀⠀⠉⠙⠒⢤⣀⠀⠀⠈⣇⠀⠀⠀⠀⠀⣿",
							"					⠀⠀⠀⠀⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⢸⠀⠀⠀⠀⢠⡏",
							"					⠀⠀⠀⠀⠀⠀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠘⣧⠀⠀⠀⣸⠀",
							"					⠀⠀⠀⠀⠀⠀⠀⡟⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⢰⠏⠀⠀⢠⠇⠀",
							"					⠀⠀⠀⠀⠀⠀⢸⠁⠘⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⣸⠀⠀⢀⠏⠀⠀",
							"					⠀⠀⠀⠀⠀⠀⣿⠀⠀⠘⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⣣⠃⠀⣠⠏⠀⠀⠀",
							"					⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠞⡱⠋⢀⡴⠁⠀⠀⠀⠀",
							"					⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠈⠣⣄⠀⠀⠀⠀⠀⠀⠀⠹⣄⠀⠀⠀⠀⢀⣀⡤⠖⢋⡠⠞⢁⡴⠋⡇⠀⠀⠀⠀⠀",
							"					⠀⠀⠀⠀⠀⠀⠸⡄⠀⠀⠀⠀⠀⠀⠈⠙⠢⣄⡀⠀⠀⠀⠀⠈⠙⠯⠭⢉⠡⠤⠴⠒⣉⠴⠚⠁⠀⢰⠃⠀⠀⠀⠀⠀",
							"					⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢹⠖⠲⠤⠤⠤⠤⠤⠤⢶⡖⠚⠉⠀⠀⠀⠀⢀⡞⠀⠀⠀⠀⠀⠀",
							"					⠀⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⠤⠤⠤⠤⠔⠋⠀⠀⠀⠀⠀⠀⠀",
							"					⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢤⡀⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀",
							"					⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠒⠒⠋    ⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"};
			while(true){
				for(int i=0; i<arr.length; i++) {
					System.out.println(arr[i]);
					try {
						Thread.sleep(100); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
	}
}


