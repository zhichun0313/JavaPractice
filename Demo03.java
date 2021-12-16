/*
* Copyright(C) AnnaYei
*/
package tw.com.pu.demo;
/**
*
*
*
* @since jdk16
* Date:2021年12月15日.下午4:26:14
*/

public class Demo03 {
	
	public static void main(String[] args) {
		farmer();
		seller();
		cook();
		guest();
	}
	
	//櫥子
	public static void cook() {
		System.out.println("洗菜");
		System.out.println("切菜");
		System.out.println("炒菜");
		System.out.println("裝盒");
	}
	
	//客人
	public static void guest() {
		System.out.println("吃");
	}
	
	//商販
	public static void seller() {
		System.out.println("從農民購入商品");
		System.out.println("制定價格");
		System.out.println("叫賣");
		System.out.println("賣給櫥子");
	}
	
	//農民
	public static void farmer() {
		System.out.println("播種");
		System.out.println("澆水");
		System.out.println("施肥");
		System.out.println("除蟲");
		System.out.println("收割");
		System.out.println("賣給商販");
	}
	
}
