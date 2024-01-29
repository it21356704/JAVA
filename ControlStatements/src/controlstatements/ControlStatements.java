package controlstatements;

public class ControlStatements {

    public static void main(String[] args) {
        /*
        Java Control Statements
        .Decision Making Statements
                IF Statement
                Switch Statement
        .Loop statement
                For loop
                While loop
                Do while loop
                For-each loop - Array
        .Jump statement
                Break and Continue Statements
        */
        
        //If
        if(100==100){
        }
        
        //If-else
        if(100<=50){
            System.out.println("Condition is True");
        }else{
            System.out.println("Condition is false");
        }
        
        //If-else if
        if(10>600){
            System.out.println("1 if else if : true");
        }else if(100!=100){
             System.out.println("2 if else if : true");
        }else if(1>1){
            System.out.println("3 if else if : true");
        }else{
            System.out.println("False");
        }
        
        //Nested if
        int age = 23;
        
        if(age>100){
            System.out.println("Invalid Age");
        }else if(age<=0){
            System.out.println("Invalidn Age");
        }else{
            if(age>=18){
                System.out.println("Adult");
            }else{
                System.out.println("Child");
            }
        }
        
        //Switch statement
        
        String Gem = "x"; // A B C D E
        
        switch(Gem){
            case "A":
                System.out.println("Case A : RS 100,000");
                break;
                
            case "B":
                System.out.println("Case B : RS 200,000");
                break;
                
            case "C":
                System.out.println("Case C : RS 300,000");
                break;
                
            case "D":
                System.out.println("Case D : RS 400,000");
                break;
                
            case "E":
                System.out.println("Case E : RS 500,000");
                break;
                
            default:
                System.out.println("Invalid Value");
        }
        
        int Day = 1;
        
        switch(Day){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        
    }
    
}
