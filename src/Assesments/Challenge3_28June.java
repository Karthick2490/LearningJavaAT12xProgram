package Assesments;

public class Challenge3_28June {
    public static void main(String[] args) {
        int ITERATIONS = 1000;
        long startTime = System.currentTimeMillis();
        String resultString = "";
        for (int i = 0; i < ITERATIONS; i++) {
            resultString += "a";
        }
        long stringTime = System.currentTimeMillis() - startTime;

        // Test StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append("a");
        }
        String resultBuilder = stringBuilder.toString();
        long builderTime = System.currentTimeMillis() - startTime;

        // Test StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append("a");
        }
        String resultBuffer = stringBuffer.toString();
        long bufferTime = System.currentTimeMillis() - startTime;

        // Print results
        System.out.println("Performance Results for " + ITERATIONS + " iterations:");
        System.out.println("String concatenation: " + stringTime + "ms");
        System.out.println("StringBuilder: " + builderTime + "ms");
        System.out.println("StringBuffer: " + bufferTime + "ms");
    }
}
