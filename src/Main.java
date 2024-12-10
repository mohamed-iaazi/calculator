import utils.CalcUtiles;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
   static int selected,a,b;


    public static void main(String[] args) {

        while (selected != 8){
            // To keep The Console Runing

            MainMenu();
        }


    }

    public static void MainMenu(){
        Scanner input=new Scanner(System.in);
        CalcUtiles f=new CalcUtiles();
// Main Menu
        System.out.print("-----------------------Menu ---------------------------\n"
                  +"\n        Enter (1) To calculate The  + Addition          \n"
                  +"\n        Enter (2) To calculate The  / Division         \n"
                  +"\n        Enter (3) To calculate The  / subtraction      \n"
                  +"\n        Enter (4) To calculate The  * Multiplication   \n"
                  +"\n        Enter (5) To calculate The   Puissance         \n"
                  +"\n        Enter (6) To calculate The   Racine Carre      \n"
                  +"\n        Enter (7) To calculate The   Division          \n"
                  +"\n                 Enter (8) To Exit  " +
                "                   \n"
                  +"\n\n        Enter You Choice Number : " );
        selected=input.nextInt();

             try {

                 switch (selected){
                 case 1:
                 System.out.print("\n    Enter First Number : ");
                 a=input.nextInt();
                 System.out.print("\n    Enter Second Number : ");
                 b=input.nextInt();
                 f.Addition(a,b);
                 break;
                 case 2:
                     System.out.print("\n    Enter First Number : ");
                     a=input.nextInt();
                     System.out.print("\n    Enter Second Number : ");
                     b=input.nextInt();
                     f.Devided(a,b);
                     break;
                 case 3:
                     System.out.print("\n    Enter First Number : ");
                     a=input.nextInt();
                     System.out.print("\n    Enter Second Number : ");
                     b=input.nextInt();
                     f.subtraction(a,b);
                     break;
                 case 4:
                     System.out.print("\n    Enter First Number : ");
                     a=input.nextInt();
                     System.out.print("\n    Enter Second Number : ");
                     b=input.nextInt();
                     f.Multiplication(a,b);
                     break;

                 }

             } catch (Exception e) {
                 System.out.print("\n Error  Try again "+e+"\n\n");

             }

    }
}