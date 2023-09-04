package com.juaracoding.utils;

public enum TestCases {
    T1("Login admin with registered username and password"),
    T2("Login sales with registered username and password");

    private String testCaseName;
    TestCases(String value){

        testCaseName = value;
    }

    public String getTestCaseName(){

        return testCaseName;
    }
}
