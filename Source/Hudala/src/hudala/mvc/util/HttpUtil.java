package hudala.mvc.util;

import java.io.BufferedReader;
import java.io.IOException;



public class HttpUtil {
	
	private String value;
	
	public HttpUtil (String value) {
		this.value = value;
	}
	
	
	
	public static HttpUtil of (BufferedReader reader) {
		StringBuilder sb = new StringBuilder();
		try {
			String line;
		    while ((line = reader.readLine()) != null) {
		        sb.append(line);
		    }
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
		return new HttpUtil(sb.toString());
	}
}
