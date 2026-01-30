class TextScrubberBruteForce {
    public static void main(String[] args) {
        String s="H3ll0 W0rld! Th1s is J4v4";
        String result="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!Character.isLetter(c) && !(c==' ')){
                result+="*";
            }
        
            else
                result+=c;
        }
        System.out.println(result);
    }
}
