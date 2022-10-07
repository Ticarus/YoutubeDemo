package com.mycompany.youtubedemo;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

    @Override
    public void Calculate() {
        throw new UnsupportedOperationException("Teacher credit calculated");
    }
}
