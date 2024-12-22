/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model.Account;

import Model.Account.Account;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;


/**
 *
 * @author ABHINAVCHINTA
 */
public class AccountCredentials {
    private Account account;
    private String userID;
    private String password;
    private ArrayList<String> passwordHistory = new ArrayList<>();
    
    public AccountCredentials(Account account, String userID, String pass) {
        this.account = account;
        this.userID = userID;
        this.password = hashPassword(pass);
        this.addPasswordToHistory(hashPassword(pass));
        account.setUserAccountCredentials(this);
    }   

    public AccountCredentials(String userId, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addPasswordToHistory(String pass) {
        passwordHistory.add(pass);
    }

    public ArrayList<String> getPasswordHistory() {
        return passwordHistory;
    }

    public void setPasswordHistory(ArrayList<String> passwordHistory) {
        this.passwordHistory = passwordHistory;
    }

    public Account getAccount() {
        return account;
    }
    
    public void setAccount(Account account) {
        this.account = account;
    }

    public String getUserID() {
        return userID;
    }
    
    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = hashPassword(password);
        addPasswordToHistory(hashPassword(password));
    }
    
    public int getAccountID() {
        return account.getAccountId();
    }
    
    public String getRole() {
        return account.getRole();
    }
    
    private String hashPassword(String newPassword) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(newPassword.getBytes());
            byte[] passwordByte = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for(byte b : passwordByte) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}

