package com.example.demo11;

// ���O�n��@�����ϥΪ�����r�O impiements
public class MyInterfaceImpl implements MyInterface{
	
	// ���O�����n���s�w�q"�Ҧ�"�w�q�b����������k
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	// �w�]��k���j��@�w�n���s�w�q
	@Override
	public void flying(String name) {
		// TODO Auto-generated method stub
		MyInterface.super.flying(name);
	}

}
