package hudala.mvc.commom;

import java.util.ArrayList;

public class CatChuoi {

	public static ArrayList<String> catChuoi(String kitu)
	{
		ArrayList<String> item= new ArrayList<String>();
		String array[] = kitu.split(",");
		  for (String temp : array) {
			  item.add(temp);
		  }
		
		return item;
		
	}
	
	public static void main(String[] args) throws Exception{
		
		
		String hung = "con heo, con ga, con meo, con lon";
		
		ArrayList<String> ds= catChuoi(hung);
		for(String item:ds)
		{
			System.out.println(item.trim());
		}
		
		
	}
}
