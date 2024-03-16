
package encapsulation;

class ABCBank{
    //Encapsulation
    private String username = null;
    private String password = null;
    private int pin = 0;
    private static double Balance = 1000;
    
    //Setters and Getters
    //Setter
     public void Setusername(String username){
         this.username= username;
     }
     public void Setpassword(String password){
         this.password= password;
     }
     public void Setpin(int pin){
         this.pin=pin;
     }
     public void SetBalance(double bal){
         this.Balance = this.Balance+bal;
     }
     
     //Getter
     public  double GetBalance(){
         return this.Balance;
     }
     public  double GetCash(double req){
         if(this.Balance >= req){
             this.Balance -= req;
             return req;
         }else{
             return 0;
         }
         
     }
}



public class Encapsulation {

    public static void main(String[] args) {
        
        ABCBank obj1 = new ABCBank();
        obj1.Setusername("myUsername");
        obj1.Setpassword("BANK123");
        obj1.Setpin(4321);
        obj1.SetBalance(1000);
        
        System.out.println(obj1.GetBalance());
        System.out.println(obj1.GetCash(500));
        System.out.println(obj1.GetBalance());
        
    }
    
}
