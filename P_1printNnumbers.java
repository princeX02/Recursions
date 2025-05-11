public class P_1printNnumbers {
    public static int fib(int n){
        if(n<3){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }
        public  static  void  main(String args[]){
           System.out.println(fib(4));
    }
}