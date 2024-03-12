package hw.hw9;

public class Month {
    private String monthName;
    private int days;
    private int daysWorking;

    public Month(String monthName, int days, int daysWorking) {
        this.monthName = monthName;
        this.days = days;
        this.daysWorking = daysWorking;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDaysWorking() {
        return daysWorking;
    }

    public void setDaysWorking(int daysWorking) {
        this.daysWorking = daysWorking;
    }
}
