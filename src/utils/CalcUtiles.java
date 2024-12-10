package utils;

public class CalcUtiles {
    public int Addition(int a,int b){
        return a+b;

    }
    public int Multiplication(int a,int b){
        return a*b;
    }

    public int Devided(int a,int b){
        return a/b;
    }

    public int subtraction(int a,int b){
        return a-b;
    }

    public int Puissane(int a,int b){
        return (int) Math.pow(a,b);
    }
    public int Factorial(int a){
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
    public int SquireRoot(int a){
        return (int)Math.sqrt(a);
    }


}
