public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        var ProdA2 = new ProductA2();
        return ProdA2;
    }

    @Override
    public AbstractProductB createProductB() {
        var ProdB2 = new ProductB2();
        return ProdB2;
    }
}
