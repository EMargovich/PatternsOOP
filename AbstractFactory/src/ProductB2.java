public class ProductB2 implements AbstractProductB {

    String info;

    public ProductB2() {
    }

    public ProductB2(int num) {
        this.info = String.valueOf(num);
    }

    @Override
    public String getInfo() {
        return info;
    }

    //In product type B define method B with parameter type AbstractProductA
    //для класса-продукта ProductB2 вызов objB.B(objA) добавляет в конец строки objB.info строку objA.info
    // и сохраняет результат в поле objB.info.
    @Override
    public void b(AbstractProductA productA) {
        this.info = this.info + productA.getInfo();
    }

}
