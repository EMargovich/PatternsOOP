public class ConcreteFactory1 implements  AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        var ProdA1 = new ProductA1();
        return ProdA1;
    }

    @Override
    public AbstractProductB createProductB() {
        var ProdB1 = new ProductB1();
        return ProdB1;
    }
}
