/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

import java.util.ArrayList;

/**
 *
 * @author ziwang
 */
public class ListofAccounts {

    /**
     * constructor for listOfAcc creating new ArrayList
     */
    public ListofAccounts() {
        listOfAcc = new ArrayList<>();
    }

    /**
     * method to find accounts in the Account Class
     *
     * @param name
     * @return the index of the account
     */
    public int findAcc(String name) {
        for (int i = 0; i < listOfAcc.size(); i++) {
            if (listOfAcc.get(i).getName().equals(name)) {

                return i;
            }
        }
        return -1;
    }

    /**
     * finds accounts and returns a string too
     *
     * @param name
     * @return a string with the balance
     */
    public String findAccString(String name) {
        for (int i = 0; i < listOfAcc.size(); i++) {
            if (listOfAcc.get(i).getName().equals(name)) {

                return "You have $ " + listOfAcc.get(i).getBalance();
            }
        }
        return "Account can't be found";
    }

    /**
     * creating a new Savings account
     *
     * @param name
     * @param balance
     */
    public void createSavings(String name, double balance) {
        SavingsAccount toAdd = new SavingsAccount(name, balance);
        listOfAcc.add(toAdd);

    }

    /**
     * creating a new Checkings account
     *
     * @param name
     * @param balance
     */
    public void createCheckings(String name, double balance) {
        CheckingsAccount toAdd = new CheckingsAccount(name, balance);
        listOfAcc.add(toAdd);

    }

    /**
     * removing an account
     *
     * @param name , a string
     */
    public void removeAcc(String name) {
        int index = findAcc(name);
        if (index >= 0) {
            listOfAcc.remove(index);
        } else {
            System.out.print("Error: Could not find account.");
        }
    }

    /**
     * gets account
     *
     * @param i, the index
     * @return Account
     */
    public Account getAcc(int i) {
        return listOfAcc.get(i);
    }

    /**
     * gets size of arryList
     *
     * @return size
     */
    public int sizeAcc() {
        return listOfAcc.size();
    }

    /**
     * displays all savings accounts
     *
     * @return string
     */
    public String displaySavingsAcc() {
        String result = "";
        for (Account a : listOfAcc) {
            if (a instanceof SavingsAccount) {
                result += a.toString() + "\n";
            }
        }

        return result;
    }

    /**
     * displays all checkings accounts
     *
     * @return string
     */
    public String displayCheckingsAcc() {
        String result = "";
        for (Account a : listOfAcc) {
            if (a instanceof CheckingsAccount) {
                result += a.toString() + "\n";
            }
        }

        return result;
    }

    // declaring fields
    ArrayList<Account> listOfAcc;
}
