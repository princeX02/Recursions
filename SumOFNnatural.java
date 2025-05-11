public class SumOFNnatural {
    public static void  printSum(int sum,int n ){
        if(n==0){
            System.out.println(sum);
            return ;
        }
         printSum(sum+n, n-1);
    }

    public static int func(int n){
        if(n==0 || n==1)
            return n;
        return n+func(n-1);
    }
    public static void main(String[] args) {
        printSum(0, 5);
        System.out.println(func(5));
    }
}
