package Task31;

public class MainTask31 {


        public static String buildString() {
            String result = "aaabbbccc";
            for (int i = 0; i <= 100000; i++) {
                result = result + "aaabbbccc";
            }
            return result;
        }

        public static String buildStringBuilder() {
            StringBuilder result = new StringBuilder("aaabbbccc");
            for (int i = 0; i <= 100000; i++) {
                result.append("aaabbbccc");
            }
            return result.toString();
        }

        public static void main(String[] args) {
            long t1 = System.currentTimeMillis();
            buildString();
            long t2 = System.currentTimeMillis();

            System.out.println("Result String: " + (t2-t1));
            long t3 =System.currentTimeMillis();
            buildStringBuilder();
            long t4=System.currentTimeMillis();
            System.out.println("Result StringBuilder: " + (t4-t3));

        }
}
