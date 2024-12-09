import java.util.Scanner;

public class Main {
    
    static boolean ishere;

    public static void main(String[] args) {
        
                 ishere=true;
        do{

                    MainMenu();

        }
        while (ishere);

    }

    public static void MainMenu(){

        System.out.println("-----------------------Menu ---------------------------\n"
                  +"\n        Enter (1) To calculate The  + Addition          \n"
                  +"\n        Enter (2) To calculate The  / Division         \n"
                  +"\n        Enter (3) To calculate The  / subtraction      \n"
                  +"\n        Enter (4) To calculate The  * Multiplication   \n"
                  +"\n        Enter (5) To calculate The   Puissance         \n"
                  +"\n        Enter (6) To calculate The   Racine Carre      \n"
                  +"\n        Enter (7) To calculate The   Division          \n"
                  +"\n                 Enter (8) To Exit                     \n" );
        

    }
}