package javaoperators;

public class JavaOperators {


    public static void main(String[] args) {
        //Operators(8)
        
        //1) Arithmatic Operators
        
        //+
        int no1=50000;
        int no2=100000;
        int answer= no1+no2;
        System.out.println(answer);
        
        //-
        int Ans = 5000-3000;
        System.out.println(Ans);
        
        // /
        int n1=100;
        int n2=50;
        System.out.println(n1/n2);
        System.out.println(100/4.0);
        System.out.println(100/4);
        System.out.println(101/4.0);
        System.out.println(105.3/2);
        
        float N1=100.5f;
        float N2=5.0f;
        System.out.println(N1/N2);
        
        //*
        System.out.println(100*5);
        
        //% - Modulas
        int a=105;
        int b=2;
        System.out.println(a%b); 
        
        //2) Relational Operators
        
        //  >  -Greater than
        boolean status = 1>100;
        System.out.println(status);

        //  >= -Greater than 
        boolean status1 = 100 >= 100;
        System.out.println(status1);        
        
        //  <  -Less than
        System.out.println(300<30000);
        
        //  <= -Less than or Equal
        System.out.println(5000<=500);
        
        //  == -Equal
        System.out.println(100==100);
        
        //  != -Not Equal
        System.out.println(900!=100);
        
        //Ternary Operator ?:
        int age = 19;
        String ans2 = (age >= 18)?"Adult":"Child";
        System.out.println(ans2);
        
        int Age = 50;
        int ans3 = (Age >= 40)?50000:20000;
        System.out.println(ans3);
        
        int ans4 = (int)((Age >= 18)?5.5d:1.5d);
        System.out.println(ans4);
        
        //Nested Operator ?:
        String ans5 = (age >= 18)? ((age>100)?"Invalid Age":"Adult") : ((age<=0?"Invalid Age":"Child"));
        System.out.println(ans5);
        
        char Charvar = 'a';
System.out.println(Charvar);
System.out.println((int) Charvar);
      
    }
    
}
