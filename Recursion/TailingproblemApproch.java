public class TailingproblemApproch {
    public static int TilingProblem(int n){
        if(n == 0||n ==1){
            return 1;
        }
        int vertical = TilingProblem(n-1);
        int horizential = TilingProblem(n-2);

        int totalways = vertical + horizential;

        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(TilingProblem(5));
    }

}
