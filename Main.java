
public class Main {

	public static void main(String[] args) {
		Client clientA = new Client();
		clientA.depositMoney(500);
		clientA.withdrawMoney(500);
		clientA.withdrawMoney(500);
		clientA.depositMoney(500);
		clientA.displayMyOperations();
	}

}
