
public class Client {
	private Bank bank;

	public Client() {
		this.bank = new Bank();
	}

	public void depositMoney(int sum) {
		this.bank.deposit(sum);
	}

	public void withdrawMoney(int sum) {
		this.bank.withdrawal(sum);
	}

	public void displayMyOperations() {
		this.bank.displayOperations();
	}

}
