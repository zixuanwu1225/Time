public class Runner {
    public static void main(String[] args) {
        Time t = new Time(8,9,10);
        System.out.println(t);
        Time f = new Time(6,5,4);
        t.add(f);
        System.out.println(t);
        Time p = new Time(10,10,10);
        t.add(p);
        t.tick();
        System.out.println(t);
    }

}
