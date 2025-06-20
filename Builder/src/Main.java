public class Main {

    public static void main(String[] args) {
        ConcreteBuilder1 b1 = new ConcreteBuilder1();
        ConcreteBuilder2 b2 = new ConcreteBuilder2();

        Director d1 = new Director(b1);
        Director d2 = new Director(b2);

        String s1 = "AAABBB___CCC";
        String s2 = "CABCABCABuio";

        d1.construct(s1);
        System.out.println(d1.getResult());

        d2.construct(s1);
        System.out.println(d2.getResult());

        d1.construct(s2);
        System.out.println(d1.getResult());

        d2.construct(s2);
        System.out.println(d2.getResult());
    }
}
