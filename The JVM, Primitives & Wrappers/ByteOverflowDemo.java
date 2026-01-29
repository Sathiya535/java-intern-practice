public class ByteOverflowDemo {
     public static void main(String args[]) {
    	Byte b = 125;
    	for(int i = 1;i<=200;i++) {
    		b++;
    		System.out.println("Byte "+i+ "= " + b);
    	}

    }
    
}
