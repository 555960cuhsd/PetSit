public class Pet {
    private String typeAnimal; // Has to be a type in validPets
    private String name;
    private boolean isMale;
    private boolean canFly;
    private boolean isMammal;
    private boolean hungry;
    private static final String[] validPets = {"dog", "cat", "guinea pig", "rabbit", "fish", "bird"};

    public Pet(String typeAnimal, String name, boolean isMale, boolean canFly, boolean isMammal) {
        try {
            this.typeAnimal = typeAnimal ;
        }
        catch (IllegalArgumentException)
        this.name = name;
        this.isMale = isMale;
        this.canFly = canFly;
        this.isMammal = isMammal;
        hungry = (int) (Math.random() * 2) != 0;
    }

    public Pet(String typeAnimal, boolean isMale, boolean canFly, boolean isMammal) {
        this.typeAnimal = typeAnimal;
        this.name = "No name";
        this.isMale = isMale;
        this.canFly = canFly;
        this.isMammal = isMammal;
        hungry = (int) (Math.random() * 2) != 0;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }
    public String getName() {
        return name;
    }
    public boolean getIsMale() {
        return isMale;
    }
    public boolean getCanFly() {
        return canFly;
    }
    public boolean getIsMammal() {
        return isMammal;
    }
    public boolean isHungry() {
        return hungry;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void feed() {
        setHunger(false);
    }
    protected void setHunger(boolean hungry) {
        this.hungry = hungry;
    }
}
