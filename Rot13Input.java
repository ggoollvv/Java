package È¥ÀÚ°øºÎ;


import java.io.*;

public class Rot13Input {
	public static void main(String []args) throws IOException{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(;;) {
			
			System.out.print("> ");
			String line = in.readLine();
			if((line == null) || line.equals("quit"))
			{
				break;
			}
			else 
			{
			StringBuffer buf = new StringBuffer(line);
			for(int i=0; i<buf.length(); i++)
			{
				buf.setCharAt(i, rot13(buf.charAt(i)));
			}
			System.out.println(buf);
			}
		}
	}	
	static char rot13(char c) {
		if((c>='A') && (c<= 'Z')) {
			c = (char) (c + 13);
			if(c>'Z')  c = (char) (c-26);
		}
		if((c>='a') && (c<='z')) {
			c = (char) (c + 13);
			if(c>'z') c = (char) (c-26);
		}
		return c;
		
	}
}
