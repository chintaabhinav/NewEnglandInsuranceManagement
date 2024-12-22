package Model.Account;

/**
 *
 * @author ABHINAVCHINTA
 */
import java.util.ArrayList;

public class AccountDirectory {

    private ArrayList<Account> accounts;

    public AccountDirectory() {
        this.accounts = new ArrayList<>();
    }

    // Add an account to the directory
    public void addAccount(Account account) {
        accounts.add(account);

    }

    // Find an account by account ID
    public Account findAccount(int accountId) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        return null;
    }

    // Find an account by user ID
    public Account findAccountByUserID(String userID) {
        for (Account account : this.getAccounts()) {
            System.out.println("Checking account: " + account.getAccountCredentials().getUserID());
            if (account.getAccountCredentials().getUserID().equals(userID)) {
                System.out.println("Match found for userID: " + userID + ", Type: " + account.getClass().getName());
                return account;
            }
        }
        System.out.println("No account found for userID: " + userID);
        return null; // Return null if no matching account is found
    }

    // Delete an account by account ID
    public void deleteAccount(int accountId) {
        Account accountToRemove = findAccount(accountId);
        if (accountToRemove != null) {
            accounts.remove(accountToRemove);
            System.out.println("Account removed: " + accountToRemove.getAccountCredentials().getUserID());
        } else {
            System.out.println("Account not found for deletion: " + accountId);
        }
    }

    // Get all accounts
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    // Print all account profiles for debugging
    public void printAllAccountProfiles() {
        for (Account account : accounts) {
            System.out.println("Account ID: " + account.getAccountId() + ", UserID: " + account.getAccountCredentials().getUserID());
        }
    }
}
