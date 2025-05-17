public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA(int n) {
        var ProdA2 = new ProductA2(n);
        return ProdA2;
    }

    @Override
    public AbstractProductB createProductB(int n) {
        var ProdB2 = new ProductB2(n);
        return ProdB2;
    }
}
