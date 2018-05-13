import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bank {

	private static final String HEADER_OF_THE_TABLE = "|operation\t|date\t\t|amount\t|balance";
	private static final String TOP_AND_END_OF_THE_TABLE = "------------------------------------------------------------";
	private static final String DATE_FORMAT = "dd-MM-yy";
	private static final String OPERATION_WITHDRAWAL = "withdrawal";
	private static final String OPERATION_DEPOSIT = "deposit";
	private int account;
	private List<Operations> operations;

	public Bank() {
		this.account = 0;
		this.operations = new ArrayList<Operations>();
	}

	// US 2
	public void withdrawal(int sum) {
		// Check if the value enter by the client is correct
		if (!isAuthorizedValue(sum)) {
			System.out.println(BankMessage.UNAUTHORIZED_VALUE_MESSAGE);
		} else {
			// Check if the client has enough money
			if (!isClientHasEnoughMoney(sum)) {
				System.out.println(BankMessage.NOT_ENOUGH_MONEY_MESSAGE);
			} else {
				this.account = this.account - sum;
				// Display balance
				newBalanceMessage(this.account);
				// Save operation
				saveOperation(sum, OPERATION_WITHDRAWAL);
			}
		}
	}

	// US 1
	public void deposit(int sum) {
		// Check if the value enter by the client is correct
		if (!isAuthorizedValue(sum)) {
			System.out.println(BankMessage.UNAUTHORIZED_VALUE_MESSAGE);
		} else {
			this.account = this.account + sum;
			// Display balance
			newBalanceMessage(this.account);
			// Save operation
			saveOperation(sum, OPERATION_DEPOSIT);
		}
	}

	private boolean isAuthorizedValue(int value) {
		if (value < 0) {
			return false;
		}
		return true;
	}

	private boolean isClientHasEnoughMoney(int value) {
		if (this.account - value < 0) {
			return false;
		}
		return true;
	}

	private void newBalanceMessage(int balance) {
		System.out.println(BankMessage.NEW_BALANCE_PREFIX_MESSAGE + balance);
	}

	// US 3
	private void saveOperation(int sum, String operationName) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		operations.add(new Operations(operationName, sdf.format(new Date()), sum, this.account));
	}

	// US 3
	public void displayOperations() {
		// TABLE_TOP
		System.out.println(TOP_AND_END_OF_THE_TABLE);
		// TABLE_HEADER
		System.out.println(HEADER_OF_THE_TABLE);

		for (Operations operation : operations) {
			System.out.println("|" + operation.getOperation() + "\t|" + operation.getDate() + "\t|"
					+ operation.getAmount() + "\t|" + operation.getBalance());
		}

		// TABLE_END
		System.out.println(TOP_AND_END_OF_THE_TABLE);
	}
}
