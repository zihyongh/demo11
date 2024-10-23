package com.example.demo11;

public class Bank {

	// 賦予balance新的預設值，而不是程式本身的預設值null
	// 屬性通常會設為private
	private String branch = "TTA分行";

	private String user;

	private int balance;

	// 預設建構方法，格式:方法的存取權限 類別名稱(){}
	// public Bank(){}
	// 預設建構方法 --> 就是沒有參數的建構方法、方法名稱就是類別名稱、而且沒有回傳值
	// 當類別中沒有建立帶有參數的建構方法時，沒有參數的建構方法就是預設建構方法，其省略不寫也可以使用
	// 類別中有建立帶有參數的建構方法時，沒有參數的建構方法就不再是預設建構方法，沒寫就不能使用
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 帶有參數的建構方法，實作內容和set一樣，實際作用在於縮短程式碼的行數
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}

	// 建立屬性的存(set)取(get)方法
	// 一般方法
	// 格式: 方法的存取權限 方法的回傳值型態 方法名稱(參數資料型態 參數變數名稱){方法的實作內容}
	// public String getBranch(){}
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 存款
	public void saving(int amount) {
		System.out.println("存款前剩餘:" + balance);
		// 判斷amount是否為正數
		if (amount >= 0) {
			// 原本金額+存款金額
			balance = balance + amount;
		} else {
			System.out.println("存款金額不能為負數!!");
		}
		System.out.println("存款後剩餘:" + balance);
	}

	// 提款
//	public void withdraw(int amount) {
//		System.out.println("提款前剩餘:" + balance);
//		
//		if (amount < 0) {
//			System.out.println("提款金額不能為負數!!");
//		} else {
//			// 原本金額-提款金額
//			balance = balance - amount;
//		}
//		if (balance < 0) {
//			System.out.println("餘額不足");
//		} else {
//			System.out.println("提款後剩餘:" + balance);
//		}
//	}

	// 提款(老師寫的)
	public void withdraw(int amount) {
		// 排除金額是負數
		// amount:提款金額 ; balance:原本的餘額
		if (amount < 0) {
			System.out.println("餘額不能是負數!!");
			return; // 一定要return，不然程式會一直運行下去
		}
		// 排除餘額不足
		if (amount > balance) {
			System.out.println("餘額不足");
			return;
		}
		System.out.println("提款前剩餘:" + balance);
		balance = balance - amount;
		System.out.println("提款後剩餘:" + balance);
	}

	// 回傳值
	// 類別也可以是回傳值
	public Bank withdraw(String branch) {
		return new Bank();
	}

	// 參數
	// 實參可以傳入記憶體位址(如:array,class)
	public void withdraw2(Bank bank) {
		System.out.println(bank.getBranch());
	}

	// 實參也可以傳入
	public void withdraw3(String title, String branch, String user, int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
	}

	// 可變參數
	public void withdraw4(int balance, String... params) {
		// params 是陣列(但不需要再String後面加上中括號)，包含了 title, branch, user
		// 一個方法只能有一個可變參數，而且必須在最右邊
		String title = params[0];
		String branch = params[1];
		String user = params[2];
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
	}
	
	
	public static void withdraw5(String title, String branch, String user, int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
	}

}
