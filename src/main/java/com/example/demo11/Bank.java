package com.example.demo11;

public class Bank {

	// �ᤩbalance�s���w�]�ȡA�Ӥ��O�{���������w�]��null
	// �ݩʳq�`�|�]��private
	private String branch = "TTA����";

	private String user;

	private int balance;

	// �w�]�غc��k�A�榡:��k���s���v�� ���O�W��(){}
	// public Bank(){}
	// �w�]�غc��k --> �N�O�S���Ѽƪ��غc��k�B��k�W�ٴN�O���O�W�١B�ӥB�S���^�ǭ�
	// �����O���S���إ߱a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc��k�N�O�w�]�غc��k�A��ٲ����g�]�i�H�ϥ�
	// ���O�����إ߱a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc��k�N���A�O�w�]�غc��k�A�S�g�N����ϥ�
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	// �a���Ѽƪ��غc��k�A��@���e�Mset�@�ˡA��ڧ@�Φb���Y�u�{���X�����
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}

	// �إ��ݩʪ��s(set)��(get)��k
	// �@���k
	// �榡: ��k���s���v�� ��k���^�ǭȫ��A ��k�W��(�ѼƸ�ƫ��A �Ѽ��ܼƦW��){��k����@���e}
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

	// �s��
	public void saving(int amount) {
		System.out.println("�s�ګe�Ѿl:" + balance);
		// �P�_amount�O�_������
		if (amount >= 0) {
			// �쥻���B+�s�ڪ��B
			balance = balance + amount;
		} else {
			System.out.println("�s�ڪ��B���ର�t��!!");
		}
		System.out.println("�s�ګ�Ѿl:" + balance);
	}

	// ����
//	public void withdraw(int amount) {
//		System.out.println("���ګe�Ѿl:" + balance);
//		
//		if (amount < 0) {
//			System.out.println("���ڪ��B���ର�t��!!");
//		} else {
//			// �쥻���B-���ڪ��B
//			balance = balance - amount;
//		}
//		if (balance < 0) {
//			System.out.println("�l�B����");
//		} else {
//			System.out.println("���ګ�Ѿl:" + balance);
//		}
//	}

	// ����(�Ѯv�g��)
	public void withdraw(int amount) {
		// �ư����B�O�t��
		// amount:���ڪ��B ; balance:�쥻���l�B
		if (amount < 0) {
			System.out.println("�l�B����O�t��!!");
			return; // �@�w�nreturn�A���M�{���|�@���B��U�h
		}
		// �ư��l�B����
		if (amount > balance) {
			System.out.println("�l�B����");
			return;
		}
		System.out.println("���ګe�Ѿl:" + balance);
		balance = balance - amount;
		System.out.println("���ګ�Ѿl:" + balance);
	}

	// �^�ǭ�
	// ���O�]�i�H�O�^�ǭ�
	public Bank withdraw(String branch) {
		return new Bank();
	}

	// �Ѽ�
	// ��ѥi�H�ǤJ�O�����}(�p:array,class)
	public void withdraw2(Bank bank) {
		System.out.println(bank.getBranch());
	}

	// ��Ѥ]�i�H�ǤJ
	public void withdraw3(String title, String branch, String user, int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
	}

	// �i�ܰѼ�
	public void withdraw4(int balance, String... params) {
		// params �O�}�C(�����ݭn�AString�᭱�[�W���A��)�A�]�t�F title, branch, user
		// �@�Ӥ�k�u�঳�@�ӥi�ܰѼơA�ӥB�����b�̥k��
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
