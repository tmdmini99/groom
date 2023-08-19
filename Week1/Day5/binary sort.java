import java.io.*;
import java.util.*;

class Main {
    static class Number {
        int value;
        int oneCount;

        Number(int value, int oneCount) {
            this.value = value;
            this.oneCount = oneCount;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputTokensLine = br.readLine();
        String[] inputTokens = inputTokensLine.split(" ");
        int n = Integer.parseInt(inputTokens[0]);
        int k = Integer.parseInt(inputTokens[1]);

        String inputNumbersLine = br.readLine();
        String[] inputNumbers = inputNumbersLine.split(" ");
        PriorityQueue<Number> maxHeap = new PriorityQueue<>(new Comparator<Number>() {
            public int compare(Number num1, Number num2) {
                if (num1.oneCount != num2.oneCount) {
                    return Integer.compare(num2.oneCount, num1.oneCount);
                } else {
                    return Integer.compare(num2.value, num1.value);
                }
            }
        });

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(inputNumbers[i]);
            int oneCount = countOnes(number);
            maxHeap.add(new Number(number, oneCount));
        }

        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }

        System.out.println(maxHeap.poll().value);
    }

    static int countOnes(int number) {
        int count = 0;
        while (number > 0) {
            if (number % 2 == 1) {
                count++;
            }
            number /= 2;
        }
        return count;
    }
}