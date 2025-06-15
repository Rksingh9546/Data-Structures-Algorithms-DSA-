public class FriendPairingProblem {
    public static int friendPairing(int n){
        if( n==1 || n==2){
            return n;
        }
        int single = friendPairing(n-1);

        int pair = (n-1) * friendPairing(n-2);

        int totalway = single + pair;
        return totalway;
    }

    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }
}
