package array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        
        //Single Dimention Array
        String[] names = {"Ann","Ben","Jack","Rose","Jane","Mark","Bella","Henna"} ;
        
        int size1 =names.length;
        System.out.println(size1);
        System.out.println(Arrays.toString(names));
        
//        int x;
//        x = 100;
//        x = 500;
        
//        String[] Mobiles;
//        Mobiles = {"Apple", "Nokia"};
//        Mobiles = {"Apple", "Nokia", "Redmi"}; //CAN NOT BE
        
        String[] Mobiles;
        Mobiles = new String[3];
        
        Mobiles[0] = "Apple";
        Mobiles[1] = "Redmo";
        Mobiles[2] = "OnePlus";
        
        names[0] = "Mark";
        
        //Java . Util > Arrays > toString(String[] x)
        
        int size = names.length;
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]);
        
        //for - 1/ 0 / 100 / 1000
        for(int i=1; i<=names.length;i++){
            System.out.println(names[i-1]);
        }
        
        //for each loop
        System.out.println();
        System.out.println("FOR EACH");
        System.out.println();
        
        for(String value : names){
            
            System.out.println(value + " Student");
        }
        
        int[] a = {1,2,3,4,5};
        
        for(double value : a){
            System.out.println(value );
        }
        
        for(int value : a){
            System.out.println(value +" for each" );
        }
        
        
    }
    
}
