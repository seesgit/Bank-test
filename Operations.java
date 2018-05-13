
public class Operations {
	private String operation;
	private String date;
	private int amount;
	private int balance;

	public Operations(String clientOperation, String clientDate, int clientAmount, int clientBalance) {
		this.operation = clientOperation;
		this.date = clientDate;
		this.amount = clientAmount;
		this.balance = clientBalance;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
