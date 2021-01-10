public class StringDemo2 {
	public static void main(String[] args) {
		String s = new String("durga");
		String s1=s;
		System.out.println(s.hashCode());
		s=s.concat(" software");
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s==s1);

	}
}