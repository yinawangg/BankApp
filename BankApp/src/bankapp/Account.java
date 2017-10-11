/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

import static java.lang.Math.round;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author ziwang
 */
public class Account {

    /**
     * constructor for the Account class
     *
     * @param name, a string
     * @param balance, an integer
     */
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    /**
     * getter for name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name
     *
     * @param name , the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for balance
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * setter for balance
     *
     * @param balance , the new balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * a withdraw method
     *
     * @param d , the amount withdrawn
     * @return the new balance
     */
    public double withdraw(double d) {
        setBalance(Math.round((balance - d) * 100.0) / 100.0);
        return balance;
    }

    /**
     * a deposit method
     *
     * @param d , the amount deposited
     * @return the new balance
     */
    public double deposit(double d) {
        setBalance(Math.round((balance + d) * 100.0) / 100.0);
        return balance;

    }

    /**
     * makes it into a string
     *
     * @return string
     */
    public String toString() {
        return getName()
                + " has a total of $"
                + getBalance() + " in their account.";
    }

    // declaring fields
    private String name;
    private double balance;

}
