import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int bulletCount = 1000;

    public void firePool(){
        BulletPool bulletPool = new BulletPool();
        List<Bullet> list = new ArrayList<>();
        for (int i =0;i<bulletCount;i++){
            Bullet p = new Bullet();
            p.setPosition(0);
            list.add(p);
            for (int j =0;j<list.size();j++){
                Bullet pp = list.get(j);
                pp.move();
                System.out.println("-"+pp.getPosition());
                if (pp.getPosition()==10){
                    bulletPool.freeItem(pp);
                    list.remove(pp);
                }

            }
            System.out.println();
        }
    }

    public void fire(){
        List<Bullet> list = new ArrayList<>();
        for (int i =0;i<bulletCount;i++){
            Bullet p = new Bullet();
            p.setPosition(0);
            list.add(p);
            for (int j =0;j<list.size();j++){
                Bullet pp = list.get(j);
                pp.move();
                System.out.println("-"+pp.getPosition());
                if (pp.getPosition()==10){
                    list.remove(pp);
                }
            }
            System.out.println();
        }
    }
}
