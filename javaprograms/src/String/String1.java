package String;

public class String1 {
public static void main(String[] args) {
/*	String  s = "AnjaliPadwekar";
	String res = s.substring(6,s.length());
	System.out.println(res);*/
	
	
	
	StringBuilder sb = new StringBuilder("ANJALI");
	/*sb.insert(6, 'P');
	System.out.println(sb);
	
	sb.delete(6, sb.length());
	System.out.println(sb);*/
	
	
	//APPEND
	
	sb.append("P");
	sb.append("ADWEKAR");
	System.out.println(sb); //ANJALIPADWEKAR
	System.out.println(sb.length());//14
	
	
	
	
	

}
}
