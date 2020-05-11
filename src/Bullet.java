public class Bullet {

    public static int count  =0;
    private int position;


    public int getPosition() {
        return position;
    }

    public Bullet setPosition(int position) {
        this.position = position;
        return this;
    }
    public  Bullet(){
        count++;
    }

    public void  move(){
        position++;
    }


}
