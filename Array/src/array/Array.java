package array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        
        //Single Dimention Array
        String[] names = {"Ann","Ben","Jack","Rose","Jane","Mark","Bella","Henna"} ;
        
//        int x;
//        x = 100;
//        x = 500;
        
//        String[] Mobiles;
//        Mobiles = {"Apple", "Nokia"};
//        Mobiles = {"Apple", "Nokia", "Redmi"};
        
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
        
//        for(int i=1; i<=names.length;i++){
//            System.out.println(names[i-1]);
//        }
        
        //for each loop
        for(String value : names){
            System.out.println(value + " For each");
        }
        
        
    }
    
}
