import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        String[] inputs = br.readLine().split(" ");

        int total = Integer.parseInt(inputs[0]); 
        boolean check = true;

        for (int i = 1; i < n; i++) {
            if (check) {
                total = total + Integer.parseInt(inputs[i]);
                if (Integer.parseInt(inputs[i]) < Integer.parseInt(inputs[i - 1])) {
                    check = false;
                }
            } else {
                if (Integer.parseInt(inputs[i]) > Integer.parseInt(inputs[i - 1])) {
                    total = 0;
                    break;
                } else {
                    total = total + Integer.parseInt(inputs[i]);
                }
            }
        }

        // 결과 출력
        System.out.println(total);
    }
}
