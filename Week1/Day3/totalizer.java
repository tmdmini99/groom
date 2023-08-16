import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int fi = 0;
		for(int i=0; i<Integer.parseInt(input); i++){
			String a = br.readLine();
			
			if(a.contains("/")){
				String [] inputs = a.split("/");
				fi=fi+(Integer.parseInt(inputs[0].trim())/Integer.parseInt(inputs[1].trim()));
			}else if(a.contains("-")){
				String [] inputs = a.split("-");
				fi=fi+(Integer.parseInt(inputs[0].trim())-Integer.parseInt(inputs[1].trim()));
			}else if(a.contains("+")){
				String [] inputs = a.split("\\+");
				fi=fi+(Integer.parseInt(inputs[0].trim())+Integer.parseInt(inputs[1].trim()));
			}else{
				String [] inputs = a.split("\\*");
				fi=fi+(Integer.parseInt(inputs[0].trim())*Integer.parseInt(inputs[1].trim()));
			}
			
			
		}
		System.out.println(fi);
	}
}