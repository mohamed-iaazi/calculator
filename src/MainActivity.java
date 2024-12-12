import utils.CalcUtiles;
import utils.CostumUtiles;

import java.util.Scanner;

public class MainActivity {
  static   int selected;
  static  int a,b;
  static Scanner input=new Scanner(System.in);



    public static  void main(String[] args) {

        while (selected != 8){
            // To keep The Console Runing

            MainMenu();
        }


    }

    public static void MainMenu(){
String choix;


// Main Menu
  System.out.print("""
          
          
          -----------------------Menu ---------------------------
          
                  Enter (1) To calculate The  + Addition         \s
          
                  Enter (2) To calculate The  / Division        \s
          
                  Enter (3) To calculate The  - subtraction     \s
          
                  Enter (4) To calculate The  * Multiplication  \s
          
                  Enter (5) To calculate The   Puisance        \s
          
                  Enter (6) To calculate The   Racine Carre     \s
          
                  Enter (7) To calculate The   Factorial         \s
          
                           Enter (8) To Exit  \
                            \s
          
          
                  Enter You Choice Number :\s""");
        choix=input.nextLine();


             try {
                 selected= Integer.parseInt(choix);
                 switch (selected){
                 case 1:
                     getinput(selected,"Addition");
                    Result(CalcUtiles.Addition(a,b),"Addition",'+'); ;

                     break;
                 case 2:
                     a=0;b=0;
                     while (a==0||b==0){
                         getinput(selected,"Division");
                     }
                     Result(CalcUtiles.Devided(a,b),"Division",'/');
                     break;
                 case 3:
                     getinput(selected,"subtraction");
                     Result(CalcUtiles.subtraction(a,b),"subtraction",'-');


                     break;
                 case 4:
                     getinput(selected,"Multiplication");
                     Result(CalcUtiles.Multiplication(a,b),"Multiplication",'*');

                     break;

                 case 5:
                     getinput(selected,"Puissance");
                     Result(CalcUtiles.Puissane(a,b),"Puissance",':');

                     break;
                 case 6:
                     getinput(selected,"Squire Root");
                     Result(CalcUtiles.SquireRoot(a),"Squire Root",':');


                     break;
                 case 7:
                     getinput(selected,"Factorial");
                     Result(CalcUtiles.Factorial(a),"Factorial",'!');


                     break;
                 case 8 : case 0:
                     CostumUtiles.Title("Exit");
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
        CostumUtiles.Title(title);

        if (index<5) {
            System.out.print("\n    Enter First Number : ");
            a = setInput();
            System.out.print("\n    Enter Second Number : ");
            b =setInput();
        }
        else {
            System.out.print("\n    Enter The Number : ");
            a = setInput();
        }

    }
    protected static void Result(int returned, String title,char symbole){
        if (b==0){
            System.out.printf("\n " +
                            "  The %s of  %d %c  is : %d",title,
                    a,symbole,returned);
        } else if (b!=0 || a!=0) {
            System.out.printf("\n " +
                            "  The %s of  %d %c %d is %d", title,
                    a, symbole, b, returned);
        }

    }

    protected static int setInput(){
        Scanner s=new Scanner(System.in);
        return s.nextInt();

    }
}