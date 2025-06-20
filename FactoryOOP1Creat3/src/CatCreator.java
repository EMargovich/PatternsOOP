public class CatCreator extends AnimalCreator{
    @Override
    Animal createAnimal(int ind, String name) {
        Animal cat;
        switch (ind) {
            case 0 -> cat = new Tiger(name);
            case 1 -> cat = new Lion(name);
            case 2 -> cat = new Leopard(name);
            default -> {
                cat = null;
                System.out.println("Index error!");
            }
        }
        return cat;
    }
}
