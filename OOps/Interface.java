public class Interface {
    public static void main(String[] args) {
      King q= new King();
      q.moves();
    }
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void  moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 dirns)");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(moves in all 4 dirns)");
    }
}
