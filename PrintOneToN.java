public class PrintOneToN {
    public static void pritn(int i,int n){
        if(i>n){
            return ;
        }
        System.out.println(i);
        pritn(i+1, n);
    }
    public static void main(String[] args) {
        pritn(1,5);
    }
}
