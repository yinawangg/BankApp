/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author ziwang CheckingsAccount inherits from Account
 */
public class CheckingsAccount extends Account {

    /**
     * CheckingsAccount constructor that calls the super constructor
     *
     * @param name
     * @param balance
     */
    public CheckingsAccount(String name, double balance) {
        super(name, balance);
    }

    /**
     * this is withdraw method charges $0.10 per withdrawal
     *
     * @param d
     * @return the new balance
     */
    public double withdraw(double d) {
        setBalance(Math.round((super.getBalance() - d - 0.10) * 100.0) / 100.0);
        return super.getBalance();
    }

    /**
     * toString method
     *
     * @return string representation of the info
     */
    public String toString() {
        return super.getName()
                + " has a total of $"
                + super.getBalance() + " in the Checkings Account.";
    }
}
