/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccount;

/**
 *
 * @author rodrigodelascio
 */
public class AccountDetails {
    public int accNum;
    protected String type;
    private String owner;
    private float balance;
    private boolean status;

    public AccountDetails() {
        this.balance = 0;
        this.status = false;
    }
    
    public void currentStatus() {
        System.out.println("_________________________");
        System.out.println("Account: " + this.getAccNum());
        System.out.println("Type: " + this.getType());
        System.out.println("Owner: " + this.getOwner());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Status: " + this.getStatus());
        System.out.println("_________________________");
    }
    
    public void openAccount(String t) {
        this.setType(t);
        this.setStatus(true);
        
        switch (this.getType()) {
            case "CA" -> this.setBalance(50);
            case "SA" -> this.setBalance(150);
            default -> System.out.println("Invalid account type.");
        }
        
        System.out.println("Account opened successfully.");
    }
    
    public void closeAccount() {
            if (this.balance > 0) {
                System.out.println("There is money in this account, withdraw it before closing!");
            } else if (this.balance < 0) {
                System.out.println("Your account is in debt, pay up before closing.");
            } else {
                this.setStatus(false);
            }
    }
    
    public void deposit(float a) {
        if (this.getStatus()) {
            this.setBalance(this.getBalance() + a);
            System.out.println("Deposit made to " + this.getOwner());
        } else {
            System.out.println("This account is permanently closed, you cannot make deposits.");
        }
    }
    
    public void withdraw(float a) {
        if (this.getStatus()) {
            if (this.balance >= a) {
                this.setBalance(this.getBalance() - a);
                System.out.println("Withdrawal made from " + this.getOwner() + "'s account.");
            } else {
                System.out.println("You don't have enough funds. You have " + this.balance + " available.");
            }
        } else {
            System.out.println("This account is permanently closed, you cannot make withdrawals.");
        }
    }
    
    public void monthlyFee() {
        int a = 0;
        if (this.getType().equals("CA")) {
            a = 12;
        } else if (this.getType().equals("SA")) {
            a = 20;
        }
        
        if(this.getStatus()) {
            if (this.balance > a) {
                this.setBalance(this.getBalance() - a);
                System.out.println("Monthly fee paid successfully for " + this.getOwner());
            } else {
                System.out.println("You don't have enough funds. You have " + this.balance + " available.");
            }
        } else {
            System.out.println("This account is permanently closed, you cannot pay fees.");
        }
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
