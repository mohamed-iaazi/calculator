import utils.CalcUtiles;
import utils.CostumUtiles;

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
        CostumUtiles costumTitle=new CostumUtiles();
// Main Menu
  System.out.print("""
          
          
          -----------------------Menu ---------------------------
          
                  Enter (1) To calculate The  + Addition         \s
          
                  Enter (2) To calculate The  / Division        \s
          
                  Enter (3) To calculate The  / subtraction     \s
          
                  Enter (4) To calculate The  * Multiplication  \s
          
                  Enter (5) To calculate The   Puisance        \s
          
                  Enter (6) To calculate The   Racine Carre     \s
          
                  Enter (7) To calculate The   Factorial         \s
          
                           Enter (8) To Exit  \
                            \s
          
          
                  Enter You Choice Number :\s""");
        selected=input.nextInt();

             try {

                 switch (selected){
                 case 1:
                     costumTitle.Title("Addition");
                     System.out.print("\n    Enter First Number : ");
                     a=input.nextInt();
                     System.out.print("\n    Enter Second Number : ");
                     b=input.nextInt();
                     System.out.printf("\n   The Multiplication of  %d is %d", a, f.subtraction(a,b));
                     System.out.printf("\n   The Multiplication of  %d is %d", a, f.Addition(a,b));
                     break;
                 case 2:
                     System.out.print("\n    Enter First Number : ");
                     a=input.nextInt();
                     System.out.print("\n    Enter Second Number : ");
                     b=input.nextInt();
                     System.out.printf("\n   The Multiplication of  %d is %d", a, f.Devided(a,b));
                     break;
                 case 3:
                     System.out.print("\n    Enter First Number : ");
                     a=input.nextInt();
                     System.out.print("\n    Enter Second Number : ");
                     b=input.nextInt();
                     System.out.printf("\n   The Multiplication of  %d is %d", a, f.subtraction(a,b));

                     break;
                 case 4:
                     System.out.print("\n    Enter First Number : ");
                     a=input.nextInt();
                     System.out.print("\n    Enter Second Number : ");
                     b=input.nextInt();
                     System.out.printf("\n   The Multiplication of  %d is %d", a,  f.Multiplication(a,b));


                     break;

                 case 5:
                     System.out.print("\n    Enter The base of the logarithm : ");
                     a=input.nextInt();
                     System.out.print("\n    Enter The Exponent : ");
                     b=input.nextInt();
                     System.out.printf("\n   The Puissance of  %d is %d", a,  f.Puissane(a,b));
                     break;
                 case 6:
                     System.out.print("\n    Enter The squire root Number : ");
                     a=input.nextInt();
                     System.out.printf("\n     The squire root of %d is %d", a, f.SquireRoot(a));
                     break;
                 case 7:
                     System.out.print("\n    Enter Factorial Integer n! : ");
                     a=input.nextInt();
                     System.out.printf("\n   The Factorial of  %d is %d", a, f.Factorial(a));
                     break;
                 case 8 : case 0:
                     System.exit(0);

                     break;
                     default:
                         System.out.print(""" 
                                 \s
                                 Enter Valid
                                 \s""");

                 }

             } catch (Exception e) {
                 System.out.print("\n    Invalid Input "+e+"\n\n");

             }

    }
}