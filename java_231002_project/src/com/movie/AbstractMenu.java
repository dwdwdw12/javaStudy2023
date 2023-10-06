package com.movie;

import java.util.Scanner;

abstract public class AbstractMenu implements Menu{	//추상클래스로 상속받을 경우, 인터페이스의 모든 메서드를 구현할 필요는 없음

	protected String menuText;	//기본문구
	protected Menu prevMenu;	//이전메뉴
	
	protected static final Scanner sc = new Scanner(System.in);
	
	public AbstractMenu(String menuText, Menu prevMenu) {
		this.menuText = menuText;
		this.prevMenu = prevMenu;
	}

	@Override
	public void print() {
		System.out.print("\n" + menuText);
	}
	
	public void SetPrevMenu(Menu prevMenu) {
		this.prevMenu = prevMenu;
	}
	
	

}
