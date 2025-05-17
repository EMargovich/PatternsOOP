public class ConcreteFactory1 implements  AbstractFactory {
    @Override
    public AbstractProductA createProductA(int n) {
        var ProdA1 = new ProductA1(n);
        return ProdA1;
    }

    @Override
    public AbstractProductB createProductB(int n) {
        var ProdB1 = new ProductB1(n);
        return ProdB1;
    }
}
