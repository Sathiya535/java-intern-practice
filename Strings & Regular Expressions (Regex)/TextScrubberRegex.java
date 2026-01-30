
public class TextScrubberRegex {
    public static void main(String[] args) {
        String expression="H3ll0 W0rld! Th1s is J4v4";
        //  Replace all numbers with *
        expression=expression.replaceAll("\\d","*");

        //Remove all punctuation
        expression=expression.replaceAll("[^a-zA-Z\\s*]","");
    
        System.out.print(expression);

        
    }
}
    

