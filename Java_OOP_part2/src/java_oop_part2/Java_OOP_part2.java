package java_oop_part2;

//    class home{
//        
//        public static int roomCount = 3;
//        
//        public void Masterbedroom() {
//        System.out.println("Welcome to Master Bed Room");
//        }
//        
//        public void room1(){
//        System.out.println("Welcome to Room1");
//        }
//        
//        public void room2(){
//        System.out.println("Welcome to Room2");
//        }
//        
//        public void kitchen(){
//        System.out.println("Welcome to Kitchen");
//        }
//        
//        public void watertank(){
//        System.out.println("Water tank 2000l");
//        }
//        
//        public void bridge() {
//        System.out.println("Road");}
//        
//    }

        class cal {
            
            int x = 90;
            static int y = 80;
            
            public static String abc(){
                return "Static Method";
            }
            
            public int sum(int no1,int no2, int no3){
                System.out.println("Integer Method");
                return no1+no2+no3;
            }
            
            public double sum(double no1, double no2, double no3){
                System.out.println("Double method");
                return no1+no2+no3;
            }
            
            public int sum(int no1, int no2){
                return no1+no2;
            }
            
            public double sum(double no1, double no2){
                return no1+no2;
            }
        }


public class Java_OOP_part2 {

    public static void main(String[] args) {
//        home home1 = new home();
//        home home2 = new home();
//        home home3 = new home();
//        home home4 = new home();
//        home home5 = new home();
//        
//        home1.Masterbedroom();
//        home2.Masterbedroom();

//          cal cal1 = new cal();
//          System.out.println(cal1.sum(100, 20, 70));
//          System.out.println(cal1.x);
//          System.out.println(cal.y);
//          System.out.println(cal.abc());
          
          
          cal cal2 = new cal();
          System.out.println(cal2.sum(100.35, 200.778, 300.5));
          
          cal cal3 = new cal();
          System.out.println(cal3.sum(100, 200, 300));
    }
    
}
