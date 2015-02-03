package shaoyanfei.cc.string;

public class CountString {

	public static String countString(String s){
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char alphabet = s.charAt(0);
		for (int i=1;i<s.length();i++){
			if (s.charAt(i)==alphabet){
				count ++;
			}else{
				sb.append(alphabet);
				sb.append(count);
				alphabet = s.charAt(i);
				count = 1;
			}
		}
		sb.append(alphabet);
		sb.append(count);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countString("ABBCDEEEFQQQEESDCXXXXXXXXXXXXXSEEEEE"));
	}

}
