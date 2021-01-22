package utility;

// Type your code
	public class StringAdvanceMethod{
		
		String s1;
		String s2;
		public String getInput1() {
			return s1;
		}

		public void setInput1(String s1) {
			this.s1 = s1;
		}

		public String getInput2() {
			return s2;
		}

		public void setInput2(String s2) {
			this.s2 = s2;
		}

		public String concat(String s1,String s2) {
			s1=s1+s2;
			return s1;
		}
		
		public String split(String s1,String s2) {
			String res[] = s1.split(s2);
			return res[0] + "  " + res[1];
			
		}
		public String indexOf(String s1,String s2) {
			String x;
			x=String.valueOf(s1.indexOf(s2));
			return x;
		}

		


		
	}