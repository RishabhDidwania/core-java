package Day02;

public class Lab05 {
    public static void main(String[] args) {
        Person p1 = new Person("Sam");
        p1.friend = new Friend("Ram");
        p1.carCollection.add(new Car("Bmw", "black", new Engine("2000 CC")));
        p1.carCollection.add(new Car("Santro", "yellow", new Engine("1000 CC")));
        System.out.println(p1);
    }
}
