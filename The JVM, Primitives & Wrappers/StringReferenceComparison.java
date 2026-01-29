public class StringReferenceComparison
 {
	public static void main(String[] arges) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		System.out.println("s1 hashCode "+System.identityHashCode(s1));
		System.out.println("s2 hashCode "+System.identityHashCode(s2));
		System.out.println("s3 hashCode "+System.identityHashCode(s3));
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
		
		
		
	}

}
