import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String input2 = br.readLine();
		//최대 갯수
		Set<String> st = new HashSet<String>();
		int max = 0;
		
			for(int i=1; i<Integer.parseInt(input)-1; i++){
				
				for(int j=i+1; j<Integer.parseInt(input); j++){
					
						st.add(input2.substring(0,i));
						st.add(input2.substring(i,j));
						st.add(input2.substring(j));
						
				}
			}
			List<String> ar = new ArrayList<String>(st);
			
			//List 오름차순 정렬
			Collections.sort(ar);
			
			for(int i=1; i<Integer.parseInt(input)-1; i++){
				
				for(int j=i+1; j<Integer.parseInt(input); j++){
					int idx1 = ar.indexOf(input2.substring(0,i));
					int idx2 = ar.indexOf(input2.substring(i,j));
					int idx3 = ar.indexOf(input2.substring(j));
					if(idx1 >= 0 && idx2 >= 0 && idx3 >= 0) {
						 int data = idx1 + idx2 + idx3 + 3;
						 if(max < data){
								max = data;
						 }
					}
				}
			}
		
		
		System.out.println(max);
	}
}