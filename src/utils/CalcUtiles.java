package utils;

public class CalcUtiles {
    static  public int Addition(int a,int b){
        return a+b;

    }
    public  static int Multiplication(int a,int b){
        return a*b;
    }

    public static int Devided(int a,int b){

        if (a<b){
            System.out.println("\n \s    The First Number Should Be bigger Then The Second");
            return 0;
        }
        else { return a/b;}
    }

    public static int subtraction(int a,int b){
        return a-b;
    }

    public static int Puissane(int a,int b){
        return (int) Math.pow(a,b);
    }
    public static int Factorial(int a){
        if (a==0){
            a=1;
            return a;
        }
        else {
            for (int i = a-1; i >= 1; i--) {
                a = a * i;
            }

            return a;
        }
    }
    public static int SquireRoot(int a){
        return (int)Math.sqrt(a);
    }


}
