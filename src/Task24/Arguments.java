
package Task24;


public class Arguments {

    private int hours;
    private int min;
    private int sec;

    public Arguments(int hoursNum, int minNum, int secNum) {

        this.hours = hoursNum;
        this.min = minNum;
        this.sec = secNum;
    }

    public Arguments(int sec) {
        this.sec = sec;
    }

    public int getHours() {
        return hours;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

}

