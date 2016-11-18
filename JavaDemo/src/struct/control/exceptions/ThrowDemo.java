package struct.control.exceptions;

class RemoteException extends Exception {
	private static final long serialVersionUID = 1L;
	RemoteException() {
		super("Remote Access Error!");
	}
}

public class ThrowDemo {
	public static void main(String[] args) {
		try {
			deposit(100);
		} catch (RemoteException r) {
			System.out.println(r.getMessage());
		}
		
		try {
			withdraw(100);
		} catch (RemoteException r) {
			System.out.println(r.getMessage());
		} catch (InsufficientFundsException i) {
			System.out.println("Insufficient funds: " + i.getAmount());
		}
		
		try {
			withdraw(0);
		} catch (RemoteException r) {
			System.out.println(r.getMessage());
		} catch (InsufficientFundsException i) {
			System.out.println("Insufficient funds: " + i.getAmount());
		}
	}
	
	public static void deposit(double amount) throws RemoteException {
		// Method implementation
		throw new RemoteException();
	}
	
	public static void withdraw(double amount) 
			throws RemoteException, InsufficientFundsException {
		// Method implementation
		if (amount <= 0)
			throw new InsufficientFundsException(amount);
		else
			throw new RemoteException();
	}
}