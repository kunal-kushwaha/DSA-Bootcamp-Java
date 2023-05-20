package SolvedProblems.SomeConcepts;

public class RoughWork {
    public static void main(String[] args) {
        RoughWork obj = new RoughWork();
        obj.fun1();
    }

    void fun1(){
        System.out.println("Hello");
        fun2();
    }

    void fun2(){
        System.out.println("World");
    }
}

