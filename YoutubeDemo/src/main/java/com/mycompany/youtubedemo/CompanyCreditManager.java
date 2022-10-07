package com.mycompany.youtubedemo;

public class CompanyCreditManager extends BaseCreditManager implements ICreditManager{

    @Override
    public void Calculate() {
        throw new UnsupportedOperationException("Company credit calculated");
    }
}
