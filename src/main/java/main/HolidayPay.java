package main;

public class HolidayPay {

    private final float averageNumberDays = 29.4f;
    private float averageSalary;
    private int numVacationDays;
    private float vacationPay;

    public HolidayPay(float averageSalary, int numVacationDays){
            this.averageSalary = averageSalary;
            this.numVacationDays = numVacationDays;
            vacationPay = this.averageSalary / averageNumberDays * this.numVacationDays;
    }

    public float getVacationPay() {
        return vacationPay;
    }

    public void setVacationPay(float vacationPay) {
        this.vacationPay = vacationPay;
    }

    public int getNumVacationDays() {
        return numVacationDays;
    }

    public float getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(float averageSalary) {
        this.averageSalary = averageSalary;
    }

    public void setNumVacationDays(int numVacationDays) {
        this.numVacationDays = numVacationDays;
    }

}