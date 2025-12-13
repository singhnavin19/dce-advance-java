package genericsss;

public class OwnGenericsCLass<T> {
    T t;//String
    public OwnGenericsCLass(T o){
        this.t=o;
    }
    public void showObject(){
        System.out.println(t);
    }
}
