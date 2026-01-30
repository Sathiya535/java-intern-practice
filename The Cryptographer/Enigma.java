import java.util.Scanner;
public class Enigma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Enter the Message: ");
    
        String message=sc.nextLine();
        
        System.out.println("Enter the Key Value:");
        int key=sc.nextInt();
        
        String encrypted=encryptedMessage(message,key);
        String decrypted=decryptedMessage(encrypted,key);
        
        
        System.out.println("Original Message : " + message);
        System.out.println("Encrypted Message: " + encrypted);
        System.out.println("Decrypted Message: " + decrypted);
        
    }
    public static String encryptedMessage(String original,int key){
        String cipher="";
        for(int i=0;i<original.length();i++){
            char originalChar=original.charAt(i);
            char encryptedChar=(char)(originalChar^key);
            cipher+=encryptedChar;
            
        }
        return cipher;
    }
    public static String decryptedMessage(String cipher,int key){
        String original="";
        for(int i=0;i<cipher.length();i++){
            char encryptedChar=cipher.charAt(i);
            char decryptedChar=(char)(encryptedChar^key);
            original+=decryptedChar;
            
        }
        return original;
        
    }
}