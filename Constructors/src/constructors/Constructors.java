package constructors;

class Kottu{
    
    String KottuType = "Veg Kottu";//Veg Fish Chicken
    String SpiceLevel = "  Spice-Medium"; //Spice - Low | Spice - Medium | Spice - High
    String Potion = "  Small"; //Small Medium Large
    
    //Constructor Overloading (1)
    Kottu(){
        
        System.out.println("Default Constructor");
    }
    
    //UserDefine Constructor - Parameterize constructor (2)
    Kottu(String Type, String PotionSize, String SpiceLevel){
        this.KottuType = Type;
        this.SpiceLevel = SpiceLevel;
        this.Potion = PotionSize; 
    }
     
    //(3)
    Kottu(String PotionSize, String SpiceLevel){
        this.KottuType = "Cheese";
        this.SpiceLevel = SpiceLevel;
        this.Potion = PotionSize; 
    }   

    
    public String GenerateKottu(){
        
        return this.KottuType+this.SpiceLevel+this.Potion;
    }

}

public class Constructors {

   
    public static void main(String[] args) {
        
          //(1)
          Kottu MyFirstKottu = new Kottu();
          
          String MyKottu = MyFirstKottu.GenerateKottu();
          System.out.println(MyKottu);

          //(2)
          Kottu MySecondKottu = new Kottu("Fish Kottu","Large"," Spice-High ");
          System.out.println(MySecondKottu.GenerateKottu());
          
          //(3)
          Kottu MyThirdKottu = new Kottu("Large"," Spice-High ");
          System.out.println(MyThirdKottu.GenerateKottu());
          
          //(1) Same way
          Kottu example = new Kottu();
          System.out.println(example.GenerateKottu());
        
    }
    
}
