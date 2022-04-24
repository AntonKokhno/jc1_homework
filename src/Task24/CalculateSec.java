package Task24;

public class CalculateSec {

    public static int calculateSec(Arguments args) {
        return (args.getHours() * 3600) + (args.getMin() * 60) + args.getSec();
    }
}
