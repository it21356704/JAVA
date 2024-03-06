package stringmethods;

public class StringMethods {

    
    public static void main(String[] args) {
        
        //String Methods

        String text = "Welcome to JAVA 2024";
        
        String FirstName=" Chami Gunawardane   ";
        String SecondName=" ";

        //(1) UPPER case
        
        String ans = text.toUpperCase();
        String ans1 = FirstName.trim();
        boolean ans2 = text.startsWith("W");
        int ans3 = text.indexOf("2024");
        String ans4 = text.replace("A","$");
        
        //isEmpty
        //isBlank
        if(SecondName.isBlank()){
            System.err.println("Second name is required");
        }else{
            System.out.println("Second name OK");
        }
        
        System.out.println(text);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        
    }
    
}
