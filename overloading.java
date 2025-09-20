public class overloading {

    public static void main(String[] args) {
        fun(5, 10);
        fun("Hello");
    }
    static void fun(int a,int b){
        int c=a+b;
    System.out.println(c);
    }
    static  void fun(String name)
    {
        System.out.println(name);
    }
}
