import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String [] timess = br.readLine().split(" ");
		int [] times = new int[2];
		times[0] = Integer.parseInt(timess[0]);
		times[1] = Integer.parseInt(timess[1]);
		int time = (times[0]*60)+times[1];
		for(int i=0; i<Integer.parseInt(input); i++){
			
			int a = Integer.parseInt(br.readLine());
			
			time +=a;
			
			
		}
		times[0]=time/60;
		times[1]=time%60;
		if(times[0]>24){
			times[0]=times[0]%24;
		}
		System.out.println(times[0]+" "+times[1]);
	}
}