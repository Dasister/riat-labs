package com.riat;

public class MedicalPolicy extends BasePolicy {
    private String hospital;

    MedicalPolicy(String name, int expiresIn, String hospital) {
        super(name, expiresIn);
        this.hospital = hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public void print() {
        System.out.println("Name of person = " + this.getName() + "\n\tHospital = " + this.getHospital() + "\n\tExpires = " + this.getExpiresIn());
    }
}
