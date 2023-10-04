package src.entities;

public class Call {
    private int durationMinutes;
    private String calledNumber;

    public Call(int durationMinutes, String calledNumber) {
        this.durationMinutes = durationMinutes;
        this.calledNumber = calledNumber;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getCalledNumber() {
        return calledNumber;
    }

    @Override
    public String toString() {
        return "Call{" +
                "durationMinutes=" + durationMinutes +
                ", calledNumber='" + calledNumber + '\'' +
                '}';
    }
}