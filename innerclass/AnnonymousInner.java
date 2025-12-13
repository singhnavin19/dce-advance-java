package innerclass;
interface Priti{
    void hobby();
}
class PritiPerson implements Priti{

    @Override
    public void hobby() {
        System.out.println("Sleeping");
    }
}
public class AnnonymousInner {
    public static void main(String[] args) {
        Priti p=new Priti() {
            @Override
            public void hobby() {
                System.out.println("Sleeping");
            }
        };
        p.hobby();
        Priti reshma=new Priti() {
            @Override
            public void hobby() {
                System.out.println("Sleeping");
            }
        };
        reshma.hobby();
    }
}
