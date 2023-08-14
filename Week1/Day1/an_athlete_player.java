import java.io.*;
class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String input = br.readLine();
      
      String [] inputs = input.split(" ");
      
      
      
      
      double rm = Double.parseDouble(inputs[0]) * (1+ (Double.parseDouble(inputs[1])/30));
      System.out.println((int) Math.round(Math.floor(rm)));
   }
}