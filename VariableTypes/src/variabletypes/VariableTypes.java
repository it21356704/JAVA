package variabletypes;

public class VariableTypes {
    
    public String USD = "10 000";//Class Variable
    public static String version = "V 1.22.12.7";//Static Variable
    final public static String x = "3.14";//Static Variable ->can't change this value because that variable use key word "final"
    
    public void abc(){
        version = "V 3.1";
        //x = "4.12";
    }
    
    public void SriLanka(){
        String currency = "LKR"; //Local Variable
        System.out.println(USD);
        System.out.println(version);
    
    }
    
    public void India(){
        String currency = "INR";//Local Varaible
        
        System.out.println(currency);
        System.out.println(USD);
        System.out.println(version);

    }


    public static void main(String[] args) {
        
        int local = 100;// Local Variable
        System.out.println(local);
        //System.out.println(USD);
        System.out.println(version);
        
        //String

        String text = "Welcome to JAVA 2024";
        
        String FirstName=" Chami Gunawardane   ";
        String SecondName=" ";

        //String Methods
        //(1) UPPER case
        
        String ans = text.toUpperCase();
        String ans1 = FirstName.trim();
        boolean ans2 = text.startsWith("W");
        int ans3 = text.indexOf("2024");
        String ans4 = text.replace("A","$");
        
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
