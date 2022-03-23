package Task21;

public class Task21 {
    public static void main(String[] args) {
        int[] array = {11, 27, 3, 4, 5, 1, 1,27, 1, 1, 1};
        int maxNumber = -999999999;
        int minNumber = 999999999;
        int[] maxIndexArray = new int[array.length];
        int[] minIndexArray = new int[array.length];

        int maxCurrentIndexMax = -1;
        int minCurrentIndexMax = array.length;
        int maxCurrentIndexMin = -1;
        int minCurrentIndexMin = array.length;

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            maxIndexArray[i] = -1;
            minIndexArray[i] = -1;
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        if (maxNumber == minNumber) {
            System.out.println(sum);
        } else {
            for (int i = 0; i < array.length; i++) {
                if (maxNumber == array[i]) {
                    maxIndexArray[i] = i;
                }
                if (minNumber == array[i]) {
                    minIndexArray[i] = i;
                }
            }

            for (int i = 0; i < array.length; i++) {
                System.out.println("max: " + maxIndexArray[i]);
                System.out.println("min: " + minIndexArray[i]);
            }
            for (int i = 0; i < array.length; i++) {
                if (maxCurrentIndexMax < maxIndexArray[i] && maxIndexArray[i] != -1) {
                    maxCurrentIndexMax = i;
                }
                if (minCurrentIndexMax > maxIndexArray[i] && maxIndexArray[i] != -1) {
                    minCurrentIndexMax = i;
                }
                if (maxCurrentIndexMin < minIndexArray[i] && minIndexArray[i] != -1) {
                    maxCurrentIndexMin = i;
                }
                if (minCurrentIndexMin > minIndexArray[i] && minIndexArray[i] != -1) {
                    minCurrentIndexMin = i;
                }
            }

            System.out.println("maxIndexMax: " + maxCurrentIndexMax + " minIndexMax: " + minCurrentIndexMax);
            System.out.println("maxIndexMin: " + maxCurrentIndexMin + " minIndexMin: " + minCurrentIndexMin);

            int defference = Math.abs(maxCurrentIndexMax - minCurrentIndexMin);
            int maxFinishIndex = maxCurrentIndexMax;
            int minFinishIndex = minCurrentIndexMin;

            if (defference < Math.abs(maxCurrentIndexMax - maxCurrentIndexMin)) {
                defference = Math.abs(maxCurrentIndexMax - maxCurrentIndexMin);
                minFinishIndex = maxCurrentIndexMin;
            } else if (defference < Math.abs(minCurrentIndexMax - minCurrentIndexMin)) {
                defference = Math.abs(minCurrentIndexMax - minCurrentIndexMin);
                maxFinishIndex = minCurrentIndexMax;
            } else if (defference < Math.abs(minCurrentIndexMax - maxCurrentIndexMin)) {
                defference = Math.abs(minCurrentIndexMax - maxCurrentIndexMin);
                maxFinishIndex = minCurrentIndexMax;
                minFinishIndex = maxCurrentIndexMin;
            }

            System.out.println(defference + " " + maxFinishIndex + " " + minFinishIndex);

            if (maxFinishIndex > minFinishIndex) {
                for (int i = minFinishIndex + 1; i < maxFinishIndex; i++) {
                    sum += array[i];
                }
            } else {
                for (int i = maxFinishIndex + 1; i < minFinishIndex; i++) {
                    sum += array[i];
                }
            }
        }
        System.out.println(sum);
    }
}



