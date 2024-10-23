
package com.example.demo11;

public class Bank2 extends IdName{
	
	// 常數(固定不變的數): 變數名稱全大寫，不同英文字母間用底線串接
	public final int MAX_NUMBER = 10;
	
	// 一般的屬性變數，用小駝峰方式命名變數
	private String branchTitle;

	public Bank2() {
		super();
	}

	public Bank2(String id, String name) {
		super(id, name);
	}

	public Bank2(String branchTitle) {
		super();
		this.branchTitle = branchTitle;
	}

	public String getBranchTitle() {
		return branchTitle;
	}

}
