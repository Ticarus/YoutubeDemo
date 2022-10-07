package com.mycompany.youtubedemo;

public class PersonCreditManager extends BaseCreditManager implements ICreditManager{

    @Override
    public void Calculate() {
        throw new UnsupportedOperationException("Person credit calculated"); 
    }
}
