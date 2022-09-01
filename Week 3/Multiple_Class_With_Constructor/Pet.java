public class Pet {
    // Pet Attributes
    String name;
    String type;
    String owner;
    int loyalty;
    Boolean isHappy;
    String skill;

    // Pet Method
    public void petDescription() {
        System.out.println("Name: " + name + "\n" + "Owner: " + owner + " | Loyalty: " + loyalty + "\n" + "Is happy: " + isHappy + " | Skill: " + skill + "\n");
    }

    //Constructor
    public Pet(String petName, String petType, String petOwner, int petLoyalty, Boolean isPetHappy, String petSkill) {
        name = petName;
        type = petType;
        owner = petOwner;
        loyalty = petLoyalty;
        isHappy = isPetHappy;
        skill = petSkill;
    }
}
