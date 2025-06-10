public class ShortestPath {
    public static float getShortestpath(String path){
        int x =0;int y =0;

        for(int i=0;i<path.length();i++){     //O(n)
            char dr = path.charAt(i);
            if(dr == 'S'){
                y--;
            }
            else if(dr == 'N'){
                y++;
            }
            else if(dr == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String path ="WNEENESENNN";
        System.out.println(getShortestpath(path));
    }
}
