public class ConcreteCreator1 extends Creator {

    @Override
    public Product factoryMethod(String info) {
        return new ConcreteProduct1(info);
    }
}
