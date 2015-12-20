import java.util.ArrayList;

public class getClassDemo {
    public static void main(String args[]) {
        Integer i = new Integer(5);
        System.out.println("I value is " + i);
        System.out.println(i.getClass());
        Double d = new Double(5.0);
        System.out.println("d value is " + d);
        System.out.println(d.getClass());
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);
        System.out.println(arrayList.getClass());
    }
}
