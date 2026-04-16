package Git_Java.cdac_java_learning.Java_OOPS.Generics;

public class DemoGeneric <T>{
    T obj;
    public DemoGeneric(T obj)
    {
        this.obj = obj;

    }    
    public String getClassName()
    {
        return obj.getClass().getName();
    }

    public static void main(String[] args) {
        DemoGeneric<Integer> iobj = new DemoGeneric<Integer>(100);
        System.out.println(iobj.getClassName());

        DemoGeneric<String> sobj = new DemoGeneric<String>("100");
        System.out.println(sobj.getClassName());
    }
}
