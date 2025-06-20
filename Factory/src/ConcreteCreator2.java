public class ConcreteCreator2 extends Creator {

    @Override
    public Product factoryMethod(String info) {
        return new ConcreteProduct2(info);
    }
}
