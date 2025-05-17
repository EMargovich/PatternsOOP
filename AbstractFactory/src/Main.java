public class Main {
    public static void main(String[] args) {
        int nf = 2;
        int na = 555, nb = 444;
        String s = "АВ";
        AbstractFactory f;
        AbstractProductA pa;
        AbstractProductB pb;


        //Если число Nf равно 1, то связать f с конкретной фабрикой 1, если Nf равно 2, то связать f с конкретной фабрикой 2.
        if(nf == 1) {
            f = new ConcreteFactory1();
        } else  {
            f = new ConcreteFactory2();
        }

        //Используя фабричные методы созданной фабрики, создать конкретные продукты типа A и B,
        // инициализировав их данными числами Na и Nb соответственно, и связать их с переменными pa и pb.
        pa = f.createProductA(na);
        pb = f.createProductB(nb);


        pb.b(pa);
        pa.a();

        System.out.println(pb.getInfo());
        System.out.println(pa.getInfo());
    }
}
