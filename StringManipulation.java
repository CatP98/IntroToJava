
/* StringManipulation.java */

class StringManipulation{ 

	public static void main(String[] args){
		System.out.println("Hey!");
		
		String str = "check in on us at: https://codeforall.com";
		String domain = str.substring(27); // codeforall.com
		String name = "<Code for All_>"; // Code for All_>
		
		System.out.println("I am a learner at " + name + ", " + domain);
	}
};
