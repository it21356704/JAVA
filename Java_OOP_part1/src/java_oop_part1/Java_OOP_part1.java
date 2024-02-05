package java_oop_part1;


        class home{
            
        int roomcount = 4;
        
            public void MasterBedroom(){
                System.out.println("Welcome to Master Bedroom");
            }
            
            public void room1(){
                System.out.println("Welcome to Master Bedroom");
            }
                        
            public void room2(){
                System.out.println("Welcome to Master Bedroom");
            }
            
            public void gate(){
                System.out.println("Welcome to Master Bedroom");
            }
        }  

public class Java_OOP_part1 {
    
//    public void Avg(int n1, int n2, int n3){ 
//    
//        int no1 = n1;
//        int no2 = n2;
//        int no3 = n3;
//        int avg = (no1+no2+no3)/3;
//        System.out.println(avg );}
    
        //Type1
//    public void Nescafe(){
//        System.out.println("Nescafe");
//    }
    
        //Type2
//      public String Nescafe(){
//          
//          return "Nescafe Cup";
//      }
    
         //Type3
         //Parameterized Methothods 
//        public String Nescafe(String power230v, String water, String nescafe){
//            
//            String FinalNescafe = power230v+water+nescafe;
//            
//            return FinalNescafe;
//        }
   
        
  

    public static void main(String[] args) {
        
//        Java_OOP_part1 x = new Java_OOP_part1();
//        x.Avg(12, 30, 7);//Method call


           //Type1
//          Java_OOP_part1 y = new Java_OOP_part1();
//          y.Nescafe();  

           //Type2
//           Java_OOP_part1 z = new Java_OOP_part1();
//           String cup = z.Nescafe();
//           System.out.println(cup);

           //Type3
//             Java_OOP_part1 a = new Java_OOP_part1();
//             String cup = a.Nescafe("230V", " water-50ml", " Nescafe");
//             System.out.println(cup + " Suger");

               short x = 100;
               String y = "Java";
               
               home Jack = new home(); //New Object
               home Ben = new home(); //New Object
               home Ann = new home(); //New Object

              
               Jack.MasterBedroom();
               Ben.MasterBedroom();
               Ann.MasterBedroom();

    }
    
}
