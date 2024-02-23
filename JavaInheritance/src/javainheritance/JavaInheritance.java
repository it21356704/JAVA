package javainheritance;


class Mobile2020{
    //15000 code lines
    final public static String brand = "Samsung s20";
    final public static String IMIE = "ABC1234HSJ";
    
    public void Call(String no) {
        //5000
        System.out.println("Calling... to "+no);
    }
    public void SMS(String no,String txt) {
        //5000
        System.out.println("Sending SMS... to "+no);
    }
    public void NETWORK(String no) {
        //5000
        System.out.println("4G LTE");
    }
}

class Mobile2021 extends Mobile2020{
    
    @Override
    public void Call(String no){
        super.Call(no);
        super.NETWORK(no);
    }
}

public class JavaInheritance {

    public static void main(String[] args) {
        Mobile2020 obj1 = new Mobile2020();
        obj1.Call("0766713205");
        
        Mobile2021 obj2 = new Mobile2021();
        obj2.Call("0858837484");
    }
    
}
