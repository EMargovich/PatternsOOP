public class ProductB1 implements AbstractProductB {

    String info;

    public ProductB1() {
    }

    public ProductB1(int num) {
        this.info = String.valueOf(num);
    }

    @Override
    public String getInfo() {
        return info;
    }

    //In product type B define method B with parameter type AbstractProductA
    //Для класса-продукта ProductB1 вызов objB.B(objA) преобразует поля objB.info и objA.info в целые числа,
    // складывает их и сохраняет строковое представление результата в поле objB.info
    @Override
    public void b(AbstractProductA productA) {
        int temp = Integer.parseInt(productA.getInfo()) + Integer.parseInt(this.info);
        this.info = String.valueOf(temp);
    }
}
