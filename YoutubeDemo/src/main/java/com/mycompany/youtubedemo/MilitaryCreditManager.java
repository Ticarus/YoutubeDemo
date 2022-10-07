package com.mycompany.youtubedemo;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{

    @Override
    public void Calculate() {
        throw new UnsupportedOperationException("Military credit calculated");
    }
}
