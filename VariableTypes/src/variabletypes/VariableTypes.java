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
        
    }
    
}
