import java.util.ArrayList;
public class PetSit {
    private ArrayList<Pet> pets;
    public PetSit() {
        pets = new ArrayList<>();
    }
    public void feedAll() {
        for (Pet pet : pets) {
            pet.feed();
        }
    }
    public void walk() {
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                Dog dog = (Dog) pet;
                dog.walk();
            }
        }
    }

    public String whoIsHungry() {
        String message = "";
        for (Pet pet : pets) {
            if (pet.isHungry()) {
                message += pet.getName() + ", ";
            }
        }
        return message.substring(0, message.length()-2);
    }
}
