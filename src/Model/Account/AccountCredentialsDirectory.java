/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model.Account;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;


/**
 *
 * @author ABHINAVCHINTA
 */
public class AccountCredentialsDirectory {
    private ArrayList<AccountCredentials> accountCredentialsList;

    public AccountCredentialsDirectory() {
        accountCredentialsList = new ArrayList<>();
    }

    public ArrayList<AccountCredentials> getAccountCredentialsList() {
        return accountCredentialsList;
    }

    public void setAccountCredentialsList(ArrayList<AccountCredentials> accountCredentialsList) {
        this.accountCredentialsList = accountCredentialsList;
    }

    public AccountCredentials addAccountCredentials(Account account, String userID, String password) {
        AccountCredentials newAccountCredentials = new AccountCredentials(account, userID, password);
        accountCredentialsList.add(newAccountCredentials);
        return newAccountCredentials;
    }

    public void deleteAccountCredentials(AccountCredentials accountCredentials) {
        accountCredentialsList.remove(accountCredentials);
    }

    public AccountCredentials findAccountCredentials(String userID) {
        for (AccountCredentials credentials : accountCredentialsList) {
            if (credentials.getUserID().equals(userID)) {
                return credentials;
            }
        }
        return null;
    }

    public AccountCredentials authenticateUser(String userID, String password) {
        String hashedPassword = hashPassword(password);
        for (AccountCredentials credentials : accountCredentialsList) {
            if (credentials.getUserID().equals(userID) && credentials.getPassword().equals(hashedPassword)) {
                return credentials;
            }
        }
        return null; // Authentication failed
    }

    private String hashPassword(String newPassword) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(newPassword.getBytes());
            byte[] passwordByte = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : passwordByte) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public boolean isUsernameExists(String username) {
        for (AccountCredentials credentials : accountCredentialsList) {
            if (credentials.getUserID().equals(username)) {
                return true; // Username exists
            }
        }
        return false; // Username doesn't exist
    }

    public void addAccountCredentials(AccountCredentials newCredentials) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}