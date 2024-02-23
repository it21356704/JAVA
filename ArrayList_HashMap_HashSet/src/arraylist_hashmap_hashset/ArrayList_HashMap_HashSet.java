package arraylist_hashmap_hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class ArrayList_HashMap_HashSet {
                        
                        //ARRAY LIST
    
    int[] Mark2=new int[10];
    
    static int[] marks = {12,24,36,42,45,33,56};


    public static void main(String[] args) {
        
        
        //Java Arraylist
        //int-short-double
        //Wrapper class
        //int -> Integer
        //short -> Short
        //double -> Double
        //float -> Float
        //long ->Long
        //byte -> Byte
        //String
        
        ArrayList<Integer> My_marks = new ArrayList<Integer>();
        
        //Insert
        My_marks.add(90);//0
        My_marks.add(100);//1
        My_marks.add(70);//2
        My_marks.add(80);//3
        
//        System.out.println(My_marks);//ArrayList
//        System.out.println(Arrays.toString(marks));//Array
        
        //Access / Get
//        System.out.println(My_marks.get(1));
        
        //Change Values
//        My_marks.set(3, 75);
//        System.out.println(My_marks);//ArrayList
       
        //Remove
//        marks[3]=0;
//        System.out.println(Arrays.toString(marks));
        
//        My_marks.remove(2);
        
//        System.out.println(My_marks);
        
        //ArrayList->size
//        System.out.println(My_marks.size());
        
        My_marks.add(40);
        My_marks.add(60);
        
        System.out.println(My_marks);
        
        
        //Loop
        //1) For each
        
//        for(int value:My_marks){
//            System.out.println(value);
//        }
//        
//        //2) For loop
//        
//        for(int i=0; i<My_marks.size() ; i++){
//            System.out.println(My_marks.get(i));
//        }
        
                        //HASH MAP
        HashMap<String,String> students =  new HashMap<String,String>();
        
        students.put("200078701240v","Kamal");
        students.put("200078567891v","Thamara");
        students.put("199967701240v","Sunil");
        students.put("199281561240v","Amara");
        
        
        students.put("199967701240v","Nayana");
        System.out.println(students );
        
        //Access
//        String ans = students.get("200078701240v");
//        System.out.println(ans);
        
        //Remove
//        students.remove("199281561240v");
//        System.out.println(students);
        
        //Clear
//        students.clear();
//        System.out.println(students);
        
        //Size
//        System.out.println(students.size());
        
        
        //Loop
        
        //1)For each
        //value
//        for(String HashMapvalue:students.values()){
//            System.out.println(HashMapvalue);
//        }
//        
//        for(String HashMapkey:students.keySet()){
//            System.out.println(HashMapkey+" "+students.get(HashMapkey));
//        }
        
        
                        //HASH SET
                        
            HashSet<Integer> numbers = new HashSet<Integer>();
            
            //Insert
            numbers.add(1);
            numbers.add(1);
            numbers.add(1);
            numbers.add(1);
            numbers.add(2);
            numbers.add(2);
            numbers.add(2);
            numbers.add(2);
            numbers.add(5);
            numbers.add(7);
            numbers.add(10);
            
            //Check
            System.out.println(numbers.contains(1));
            
            //Remove
            numbers.remove(2);
            
            //Size
            System.out.println(numbers.size());
            
            //Clear
//            numbers.clear();

            //Loop
            //For loop
            
            for (int hashsetvalue:numbers){
                System.out.println(hashsetvalue);
            }
           
            
            System.out.println(numbers); 
                                    
        

    }
    
}
