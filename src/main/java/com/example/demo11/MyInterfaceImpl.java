package com.example.demo11;

// 類別要實作介面使用的關鍵字是 impiements
public class MyInterfaceImpl implements MyInterface{
	
	// 類別必須要重新定義"所有"定義在介面中的方法
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	// 預設方法不強制一定要重新定義
	@Override
	public void flying(String name) {
		// TODO Auto-generated method stub
		MyInterface.super.flying(name);
	}

}
