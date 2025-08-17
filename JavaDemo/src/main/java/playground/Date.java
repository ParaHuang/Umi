package playground;

public class Date {
    private int year;
    private int month;
    private int day;

    //Constructor must have same name like class
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(int year, int month) {
        this.year = year;
        this.month = month;
        this.day = 1;
    }

    public Date(int year) {
        this.year = year;
        this.month = 1;
        this.day = 1;
    }

    public Date() {
        this.year = 2025;
        this.month = 1;
        this.day = 1;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}