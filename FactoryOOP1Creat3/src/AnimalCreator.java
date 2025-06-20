public abstract class AnimalCreator {

    abstract Animal createAnimal(int ind, String name);

    public Animal[] getZoo (int[] inds, String[] names) {
        //Check arrays lengths
        if(inds.length != names.length) {
            System.out.println("Error in array lengths.");
            return null;
        }

        //Create array of animals
        Animal[] zoo = new Animal[inds.length];

        //Create animals
        for (int i = 0; i < zoo.length; i++) {
            zoo[i] = createAnimal(inds[i], names[i]);
        }

        return zoo;
    }
}