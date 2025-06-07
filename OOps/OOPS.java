public class OOPS {
    public static void main(String[] args) {
       pen p1 = new pen();
       p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTIp());
    }
}
class pen {
    String color;
    int tip;

    String getColor(){
        return this.color;
    }
    int getTIp(){
        return this.tip;
    }

    void setColor(String newColor){
       this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}
