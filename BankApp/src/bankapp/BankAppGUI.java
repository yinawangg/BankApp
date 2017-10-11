/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ziwang
 */
public class BankAppGUI {

    /**
     * BankAppGUI constructor
     */
    public BankAppGUI() {
        //giving some initial accounts 
        accounts.createCheckings("Yina", 520.22);
        accounts.createCheckings("Piper", 5.22);
        accounts.createSavings("Travers", 52.21);
        accounts.createSavings("Rebecca", 52.00);
        accounts.createSavings("Nic", 87.95);
        
        // making some frames and panels and buttons
        JFrame frame = new JFrame("Bank App");

        JPanel pan = new JPanel(new BorderLayout());
        JPanel panel = new JPanel(new GridLayout(3, 3));
        JPanel panz = new JPanel(new BorderLayout());

        JTextArea text = new JTextArea(10, 10);
        text.setEditable(false);

        JButton find = new JButton("Find Account");
        JButton create = new JButton("Create Account");
        JButton remove = new JButton("Remove Account");
        JButton withdraw = new JButton("Withdraw");
        JButton deposit = new JButton("Deposit");
        JButton savings = new JButton("Display All Savings");
        JButton checkings = new JButton("Display All Checkings");

        //coloring the buttons' background
        find.setBackground(BACKGROUND);
        create.setBackground(BACKGROUND);
        remove.setBackground(BACKGROUND);
        withdraw.setBackground(BACKGROUND);
        deposit.setBackground(BACKGROUND);
        savings.setBackground(BACKGROUND);
        checkings.setBackground(BACKGROUND);

        // setting the forecolor
        find.setForeground(FOREGROUND);
        create.setForeground(FOREGROUND);
        remove.setForeground(FOREGROUND);
        withdraw.setForeground(FOREGROUND);
        deposit.setForeground(FOREGROUND);
        savings.setForeground(FOREGROUND);
        checkings.setForeground(FOREGROUND);

        pan.add(find, BorderLayout.CENTER);
        panel.add(create);
        panel.add(remove);
        panel.add(withdraw);
        panel.add(deposit);
        panel.add(savings);
        panel.add(checkings);
        panz.add(text, BorderLayout.CENTER);

        frame.add(panel);
        frame.add(pan, BorderLayout.NORTH);
        frame.add(panz, BorderLayout.SOUTH);
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        // making create popup: checking or savings
        JFrame createFrame = new JFrame("Select type of account. ");
        createFrame.setLayout(new FlowLayout());
        JButton checkings1 = new JButton("Checkings");
        JButton savings1 = new JButton("Savings");

        createFrame.add(checkings1);
        createFrame.add(savings1);
        createFrame.setVisible(false);
        createFrame.setSize(300, 100);

        //making Checkings create popup: enter name + balance
        JFrame kreateFrame = new JFrame("Enter Information");
        kreateFrame.setLayout(new BorderLayout());
        JLabel namez = new JLabel("Name: ");
        JTextField nameText = new JTextField("Enter Name");
        JLabel balancez = new JLabel("Balance: ");
        JTextField balanceText = new JTextField("Enter Balance");

        JPanel panelz = new JPanel(new GridLayout(3, 2));
        panelz.add(namez);
        panelz.add(nameText);
        panelz.add(balancez);
        panelz.add(balanceText);
        JPanel submitt = new JPanel(new FlowLayout());
        JButton submittButton = new JButton("SUBMIT");
        submitt.add(submittButton);

        kreateFrame.add(panelz, BorderLayout.CENTER);
        kreateFrame.add(submitt, BorderLayout.SOUTH);
        kreateFrame.setVisible(false);
        kreateFrame.setSize(300, 420);

        //making Savings create popup: enter name + balance
        JFrame qreateFrame = new JFrame("Enter Information");
        qreateFrame.setLayout(new BorderLayout());
        JLabel nameq = new JLabel("Name: ");
        JTextField nameqText = new JTextField("Enter Name");
        JLabel balanceq = new JLabel("Balance: ");
        JTextField balanceqText = new JTextField("Enter Balance");

        JPanel panelq = new JPanel(new GridLayout(3, 2));
        panelq.add(nameq);
        panelq.add(nameqText);
        panelq.add(balanceq);
        panelq.add(balanceqText);
        JPanel submitq = new JPanel(new FlowLayout());
        JButton submitqButton = new JButton("SUBMIT");
        submitq.add(submitqButton);

        qreateFrame.add(panelq, BorderLayout.CENTER);
        qreateFrame.add(submitq, BorderLayout.SOUTH);
        qreateFrame.setVisible(false);
        qreateFrame.setSize(300, 420);

        // making findAcc popup
        JFrame findFrame = new JFrame("Find Account");
        findFrame.setLayout(new BorderLayout());
        JLabel myLabelf = new JLabel("Name: ");
        JTextField myTextFieldf = new JTextField("Enter Name");
        JTextArea textArea = new JTextArea(10, 10);
        textArea.setEditable(false);

        JPanel panelf = new JPanel(new GridLayout(3, 2));
        panelf.add(myLabelf);
        panelf.add(myTextFieldf);
        panelf.add(textArea);
        JPanel submitf = new JPanel(new FlowLayout());
        JButton submitButtonf = new JButton("SUBMIT");
        submitf.add(submitButtonf);

        findFrame.add(panelf, BorderLayout.CENTER);
        findFrame.add(submitf, BorderLayout.SOUTH);
        findFrame.setVisible(false);
        findFrame.setSize(300, 420);

        // making remove popup
        JFrame removeFrame = new JFrame("Remove Account");
        removeFrame.setLayout(new BorderLayout());
        JLabel myLabelr = new JLabel("Name: ");
        JTextField myTextFieldr = new JTextField("Enter Name");

        JPanel panelr = new JPanel(new GridLayout(3, 2));
        panelr.add(myLabelr);
        panelr.add(myTextFieldr);
        JPanel submitr = new JPanel(new FlowLayout());
        JButton submitButtonr = new JButton("SUBMIT");
        submitr.add(submitButtonr);

        removeFrame.add(panelr, BorderLayout.CENTER);
        removeFrame.add(submitr, BorderLayout.SOUTH);
        removeFrame.setVisible(false);
        removeFrame.setSize(300, 420);

        // making withdraw popup
        JFrame withdrawFrame = new JFrame("Withdraw Amount");
        withdrawFrame.setLayout(new BorderLayout());
        JLabel myLabel = new JLabel("Name: ");
        JTextField myTextField = new JTextField("Enter Name");
        JLabel myLabel2 = new JLabel("Amount: ");
        JTextField myTextField2 = new JTextField("Amount to Withdraw");
        //JTextArea withdrawT = new JTextArea(10, 10);

        JPanel panel1 = new JPanel(new GridLayout(3, 2));
        panel1.add(myLabel);
        panel1.add(myTextField);
        panel1.add(myLabel2);
        panel1.add(myTextField2);
        JPanel submit = new JPanel(new FlowLayout());
        JButton submitButton = new JButton("SUBMIT");
        submit.add(submitButton);

        withdrawFrame.add(panel1, BorderLayout.CENTER);
        withdrawFrame.add(submit, BorderLayout.SOUTH);
        withdrawFrame.setVisible(false);
        withdrawFrame.setSize(300, 420);

        // making deposit popup
        JFrame depositFrame = new JFrame("Deposit Amount");
        depositFrame.setLayout(new BorderLayout());
        JLabel myLabel3 = new JLabel("Name: ");
        JTextField myTextField3 = new JTextField("Enter Name");
        JLabel myLabel4 = new JLabel("Amount: ");
        JTextField myTextField4 = new JTextField("Amount to Withdraw");

        JPanel panel2 = new JPanel(new GridLayout(3, 2));
        panel2.add(myLabel3);
        panel2.add(myTextField3);
        panel2.add(myLabel4);
        panel2.add(myTextField4);
        JPanel submit1 = new JPanel(new FlowLayout());
        JButton submitButton1 = new JButton("SUBMIT");
        submit1.add(submitButton1);

        depositFrame.add(panel2, BorderLayout.CENTER);
        depositFrame.add(submit1, BorderLayout.SOUTH);
        depositFrame.setVisible(false);
        depositFrame.setSize(300, 420);

        find.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                findFrame.setVisible(true);
                myTextFieldf.setText("");

            }
        });

        submitButtonf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = myTextFieldf.getText();
                textArea.setText(accounts.findAccString(name));
            }
        });

        create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createFrame.setVisible(true);
            }
        });

        checkings1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kreateFrame.setVisible(true);
                nameText.setText("");
                balanceText.setText("");

            }
        });

        submittButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                double balance = Double.parseDouble(balanceText.getText());
                accounts.createCheckings(name, balance);
                createFrame.dispose();
                kreateFrame.dispose();
            }
        });

        savings1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                qreateFrame.setVisible(true);
                nameqText.setText("");
                balanceqText.setText("");

            }
        });

        submitqButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameqText.getText();
                double balance = Double.parseDouble(balanceqText.getText());
                accounts.createSavings(name, balance);
                createFrame.dispose();
                qreateFrame.dispose();
            }
        });

        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeFrame.setVisible(true);
                myTextFieldr.setText("");

            }
        });

        submitButtonr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = myTextFieldr.getText();
                accounts.removeAcc(name);
                removeFrame.dispose();

            }
        });

        withdraw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                withdrawFrame.setVisible(true);
                myTextField.setText("");
                myTextField2.setText("");

                submitButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String name = myTextField.getText();
                        double amount = Double.parseDouble(myTextField2.getText());
                        int index = accounts.findAcc(name);
                        accounts.getAcc(index).withdraw(amount);
                        withdrawFrame.setVisible(false);
                    }
                });

            }
        });

        deposit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                depositFrame.setVisible(true);
                myTextField3.setText("");
                myTextField4.setText("");

                submitButton1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String name = myTextField3.getText();
                        double amount = Double.parseDouble(myTextField4.getText());
                        int index = accounts.findAcc(name);
                        accounts.getAcc(index).deposit(amount);
                        depositFrame.setVisible(false);
                    }
                });

            }
        });

        checkings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                String result = "";
//                for (int i = 0; i < accounts.sizeAcc(); i++) {
//                    if (accounts.getAcc(i) instanceof CheckingsAccount) {
//                        result += accounts.getAcc(i).toString() + "\n";
//                    }
//                }
                text.setText(accounts.displayCheckingsAcc());
            }
        });

        savings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                String result = "";
//                for (int i = 0; i < accounts.sizeAcc(); i++) {
//                    if (accounts.getAcc(i) instanceof SavingsAccount) {
//                        result += accounts.getAcc(i).toString() + "\n";
//                    }
//                }
//                text.setText(result);
                text.setText(accounts.displaySavingsAcc());
            }
        });
    }

    private ListofAccounts accounts = new ListofAccounts();
    private final Color BACKGROUND = Color.WHITE;
    private final Color FOREGROUND = Color.BLACK;

}
