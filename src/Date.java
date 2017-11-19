public class Date implements Cloneable {

    private int month;
    private int day;
    private int year;

    public Date() {

    }

    public Date(int day, int month, int year) {
        if (!checkDate(day,month,year)){
            System.out.println("Invalid Date !");
            System.exit(0);
        }
        else {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public static boolean checkDate(int day, int month, int year){
        return !(day < 1  || day>31 || month <1 || month >12 || year <0 );
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int compareTo(Date date){
        if (year > date.getYear()) return +1;
        if (year < date.getYear()) return -1;
        if (month > date.getMonth()) return +1;
        if (month <date.getMonth()) return -1;
        if (day > date.getDay()) return +1;
        if (day < date.getDay()) return -1;
        return 0;
    }

    public boolean hasSameYear(Date date){
        return year == date.getYear();
    }

    @Override
    public String toString() {
        return "Date : " + day + "/" + month + "/" + year;
    }

    public Date clone() throws CloneNotSupportedException {
        return (Date) super.clone();
    }

}
