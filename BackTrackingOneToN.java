public class BackTrackingOneToN {
    //do not used f(i+1,n);

    public static void print(int n){
        if(n==0)
            return ;
        
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        print(5);
    }
}
