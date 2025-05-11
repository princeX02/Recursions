public class RecursionSubSequence {
    public static void subseq(int idx,String s,String f){
        if(idx==s.length()){
            System.out.println(f+" ");
            return ;
        }
        subseq(idx+1, s, f+s.charAt(idx));
        subseq(idx+1, s, f);

    }
    public static void main(String[] args) {
        subseq(0, "abc","");
    }
    
}
