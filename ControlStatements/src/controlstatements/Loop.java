package controlstatements;

public class Loop {
    
    public static void main(String[] args){
    
    //For Loop
    //Welcome to java -> 10
    
//    for (int i=1; i<=5; i++){
//        System.out.println("Welcome to Java");
//        
//    }
//       
//        for (int i=100; i>=0; i-=10){
//        System.out.println(i);    
//    }

        //While loop
//        int start = 1;
//        
//        while(start<=10){
//       
//        System.out.println("# "+start);
//        start++;
//        }
        
        //Do-while
//        int start=100;
//        do{
//            System.out.println(start +"Do while");
//            
//            start+=5;
//        
//        }while(start<=10);
//        
//        
//        
//        int input =25;
//        do{
//            System.out.println("Input Value"+input);
//            input++;
//            
//        }while((input> 11) && (input<=50));

           //Break
           
           for (int i=1; i<=20; i++){
               
               if(i==11){
                   break;
               }
               
               System.out.println("X "+i);
           }
           
           //Continue
           
           for (int i=1; i<=20; i++){
               
               if(i==11){
                   continue;
               }
               
               System.out.println("X "+i);
           }
           
           //Post Fix
        
        int china_loan = 10;
        int lanka =china_loan++;
        
        System.out.println(lanka);
        System.out.println(china_loan);
        
        int x=10;
        
        int ans1 = x++;
        int ans2 = x++;
        int ans3 = x++;
        int ans4 = x++;
        
        System.out.println(x);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    
    }
    
}
