/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import logic.Person;

/**
 *
 * @author josim
 */
public abstract class Account {

    private String accountNombre;
    private double balance;
    private Person client;
    
    public Account(String accountNombre, double balance, Person client) {
        this.accountNombre=accountNombre;
        this.balance=balance;
        this.client=client;
        
    }

    public String getAccountNombre() {
        return accountNombre;
    }

    public void setAccountNombre(String accountNombre) {
        this.accountNombre = accountNombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }


public abstract void deposit();
public abstract void withdraw();
public abstract void interestCalculation();

    @Override
    public String toString() {
        
        String result = "\nBANK ACCOUNT INFORMATION:"
                +"\n-------------------------------------"
                +"\nAccount Nombre: "+ this.getAccountNombre()
                + "\nBalance: "+ this.getBalance()
                +"\nAccount Owner: " + this.getClient().toString();
                        return result;
                                
                                
                                
    }
                
        
    
                
                }

