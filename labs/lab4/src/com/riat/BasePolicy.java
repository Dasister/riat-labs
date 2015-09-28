package com.riat;

abstract public class BasePolicy {
    private String name;
    private int expiresIn;

    BasePolicy(String name, int expiresIn) {
        this.name = name;
        this.expiresIn = expiresIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public abstract void print();

}
