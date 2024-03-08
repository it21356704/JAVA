
package javaoperators_2;


public class JavaOperators_2 {


    public static void main(String[] args) {
        //Post Fix
        
        int China = 100;
        int SriLanka1 = China++;//100>>101
        int SriLanka2 = China--;//101>>100
        int SriLanka3 = China++;//100>>101
        int SriLanka4 = China--;//101>>100
        int SriLanka5 = China++;//100>>101
        int SriLanka6 = China--;//101>>100
        
        System.out.println(SriLanka6);
        System.out.println(China);
        
        //Pre Fix
        
        int x = 50;
        
        int y1 = --x;//49>>49
        int y2 = x++;//49>>50
        int y3 = x++;//50>>51
        int y4 = x++;//51>>52
        int y5 = ++x;//53>>53
        int y6 = --x;//52>>52
        int y7 = --x;//51>>51
        int y8 = x--;//51>>50
        
        System.out.println(x);
    }
    
}
