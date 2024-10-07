public class Zoo {
   private Animal[] animals;
    private String name, city;
    private final int NBR_CAGES = 3;
    private int nbrAnimals = 0;

    Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
    }

     Animal[] getAnimals() {
        return this.animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    String getName(String name){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String getCity (String city){
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "name : " + name + " city : " + city + "nbrCages : " + NBR_CAGES + "animals numbers  : " + nbrAnimals;

    }

    boolean addAnimal(Animal animal) {
        if (this.searchAnimal(animal.name) == -1 && nbrAnimals < NBR_CAGES) {
            this.animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }

    int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }

        }
        return -1;
    }

    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.name);
        this.animals[index] = null;
        return true;
    }

    boolean isZooFull() {
        return nbrAnimals <= NBR_CAGES;

    }

    Zoo comparerZoo(Zoo zoo1, Zoo zoo2) {
        if (zoo1.nbrAnimals > zoo2.nbrAnimals)
            return zoo1;
        return zoo2;

    }

}
