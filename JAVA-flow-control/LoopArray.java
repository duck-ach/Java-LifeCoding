
public class LoopArray {

	public static void main(String[] args) {
		
		/*
		 * <li>egoing</li>
		 * <li>jinhuck</li>
		 * <li>heera</li>
		 */
		
		String[] users = new String[4];
		users[0] = "egoing";
		users[1] = "jinhuck";
		users[2] = "heera";
		users[3] = "ingook";
	
		for(int i=0; i<users.length; i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}
		
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i]+",");
		}
	}

}
