package src.entities;

import java.util.Arrays;

public class SIM {

    private String phoneNumber;
    private double credit;

    private Call[] callRegister;

    public SIM(String phoneNumber, double credit, Call[] callRegister) {
        this.phoneNumber = phoneNumber;
        this.credit = credit;
        this.callRegister = callRegister;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        } else {
            System.err.println("Il numero di telefono deve avere almeno 10 caratteri.");
        }
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public Call[] getCallRegister() {
        return callRegister;
    }

    public void setCallRegister(Call[] callRegister) {
        this.callRegister = callRegister;
    }

    @Override
    public String toString() {
        return "SIM{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", credit=" + credit +
                ", callRegister=" + Arrays.toString(callRegister) +
                '}';
    }

    public void registerCall(int durationMinutes, String calledNumber) {
        for (int i = 0; i < callRegister.length; i++) {
            if (callRegister[i] == null) {
                callRegister[i] = new Call(durationMinutes, calledNumber);
                break;
            }
        }
    }
}

