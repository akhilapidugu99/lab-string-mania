package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Type your code
public class StringMethod{
		String s;
	
		public  String lower(String s) {
			s=s.toLowerCase();
			return s;
		}
			
		public  String upper(String s) {
			s=s.toUpperCase();
			return s;
		}
		
		public  String firstCharacter(String s) {
			return String.valueOf(s.charAt(0));
		}
	
		public  String length(String s) {
			int i;
			String x;
			i=s.length();
			x=String.valueOf(i);
			return x;
		}
		public  String trim(String s) {
			s=s.trim();
			return s;
		}

		public void setInput(String input) {
			// TODO Auto-generated method stub
			this.s=input;
			
			
		}

		public String getInput() {
			// TODO Auto-generated method stub
			return s;
		}

		
}