/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
*
*
* @since jdk16
* Date:2021�~12��15��.�U��2:40:48
*/

public class Demo02 {
	/**
	 * 1.�u���ܶq�~��ϥιB��šA�`�q����i��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a=10;
		/*a=10+5
		 * a=15
		 */
		a +=5;
		System.out.println(a);
		
		int x=10;
		/*
		 * x=x%3
		 * x=10%3
		 * x=1
		 */
		x %= 3;
		System.out.println(x);
		
		byte num=10;
		/*
		 * num=num+5
		 * num=byte+int
		 * num=int+int
		 * num=int
		 * num=(byte)int
		 */
		System.out.println(num);
	}
}
