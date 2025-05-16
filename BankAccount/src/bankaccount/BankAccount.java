/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccount;

/**
 *
 * @author rodrigodelascio
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AccountDetails p1 = new AccountDetails();
        p1.setAccNum(1111);
        p1.setOwner("Kimberly Maria");
        p1.openAccount("CA");
         
        
        AccountDetails p2 = new AccountDetails();
        p2.setAccNum(2222);
        p2.setOwner("Thalita Lascio");
        p2.openAccount("SA");
        
        p1.deposit(100);
        p2.deposit(500);
        
        p2.withdraw(100);
        
        p1.currentStatus();
        p2.currentStatus();
        
       
    }
    
}
