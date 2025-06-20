public class ApeCreator extends AnimalCreator {
    @Override
    Animal createAnimal(int ind, String name) {
        Animal ape;
        switch (ind) {
            case 0 -> ape = new Gorilla(name);
            case 1 -> ape = new Orangutan(name);
            case 2 -> ape = new Chimpanzee(name);
            default -> {
                ape = null;
                System.out.println("Index error!");
            }
        }
        return ape;
    }
}
