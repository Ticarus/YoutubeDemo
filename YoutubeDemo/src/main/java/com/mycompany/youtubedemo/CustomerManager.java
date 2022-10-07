package com.mycompany.youtubedemo;

public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;
    
    public CustomerManager(Customer customer, ICreditManager creditManager){
        _customer = customer;
        _creditManager = creditManager;
    }
    
    public void Save(){
        System.out.println("Customer saved : " + _customer.getId());
    }
    
    public void Delete(){
        System.out.println("Customer deleted : " + _customer.getId());
    }
    
    public void GiveCredit(){
        _creditManager.Calculate();
        System.out.println("Credit given");
    }
}
