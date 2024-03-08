
package javascanner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class JavaScanner {


    public static void main(String[] args) {
        
        /*
        String >>>> nextLine()
        double >>>> nextDouble()
        */
        
        Scanner obj = new Scanner(System.in);
        
//        int x = obj.nextInt();
//        float x1 = obj.nextFloat();
//        byte x2 = obj.nextByte();
//        boolean x3 = obj.nextBoolean();

        System.out.println("Enter your Name: ");
        String name = obj.nextLine();

        System.out.println("Enter your NIC: ");
        String NIC = obj.nextLine();
        
        System.out.println("Subject count");
        int count = obj.nextInt();
        
        double sum = 0;
        double avg = 0;
        HashMap<Integer,Double> Marks = new HashMap<Integer,Double>();
        
        for(int i=1; i<=count; i++){
            
            System.out.println("Subject "+ i +" Mark: ");
            Marks.put(i,obj.nextDouble());
            
        }
        
        for (Map.Entry<Integer,Double> mark : Marks.entrySet()) {
            sum +=mark.getValue();
        }
        
        avg = sum/(count);
        System.out.println("Hi ".concat(name) + " ".concat(NIC) + ": Sum - " + sum + " Avg - " + avg);

//        System.out.println("Subject 01 mark :");
//        double mark1 = obj.nextDouble();
//        System.out.println("Subject 02 mark :");
//        double mark2 = obj.nextDouble();
//        System.out.println("Subject 03 mark :");
//        double mark3 = obj.nextDouble();
//        System.out.println("Subject 04 mark :");
//        double mark4 = obj.nextDouble();
//        System.out.println("Subject 05 mark :");
//        double mark5 = obj.nextDouble();

//        double sum = mark1 + mark2 + mark3 + mark4 + mark5;
//        double avg = sum / 5;

        //System.out.println("Hi ".concat(name) + " ".concat(NIC) + ": Sum - " + sum + " Avg - " + avg);

        
    }
    
}
