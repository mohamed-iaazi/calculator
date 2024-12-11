import utils.CalcUtiles;
import utils.CostumUtiles;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Main {
   static int selected,a,b;
   static CostumUtiles costumTitle=new CostumUtiles();
   static Scanner input=new Scanner(System.in);



    public static void main(String[] args) {

        while (selected != 8){
            // To keep The Console Runing

            MainMenu();
        }


    }

    public static void MainMenu(){


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
                     getinput(selected,"Addition");
                    Result(CalcUtiles.Addition(a,b),"Addition"); ;

                     break;
                 case 2:
                     getinput(selected,"Division",f.Devided(a,b));
                     Result(CalcUtiles.);
                     break;
                 case 3:
                     getinput(selected,"subtraction",f.subtraction(a,b));

                     break;
                 case 4:
                     getinput(selected,"Multiplication",f.Multiplication(a,b));
                     break;

                 case 5:
                     getinput(selected,"Puissance",f.Puissane(a,b));
                     break;
                 case 6:
                     getinput(selected,"Squire Root",f.SquireRoot(a));

                     break;
                 case 7:
                     getinput(selected,"Factorial",f.Factorial(a));

                     break;
                 case 8 : case 0:
                     costumTitle.Title("Exit");
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

    protected static void getinput(int index,String title){
        costumTitle.Title(title);
        if (index<5) {
            System.out.print("\n    Enter First Number : ");
            a = input.nextInt();
            System.out.print("\n    Enter Second Number : ");
            b = input.nextInt();
        }
        else {
            System.out.print("\n    Enter  Number : ");
            a = input.nextInt();
        }

    }
    protected static void Result(int returned, String title){
        System.out.printf("\n " +
                        "  The %s of  %d + %d is %d",title,
                a,b,returned);
    }
}