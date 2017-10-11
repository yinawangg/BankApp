/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author ziwang SavingsAccount class inherits from Account
 */
public class SavingsAccount extends Account {

    /**
     * SavingsAccount constructor that calls the super constructor
     *
     * @param name
     * @param balance
     */
    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    /**
     * toString method
     *
     * @return string representation of the info
     */
    public String toString() {
        return super.getName()
                + " has a total of $"
                + super.getBalance() + " in the Savings Account.";
    }

}
