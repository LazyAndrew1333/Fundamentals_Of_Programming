public class Character {
    double speed;
    int range;
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }
    
    public void sayMySpeed() {
        System.out.println("My speed is Mach " + speed);
    }

    public void sayMyRange() {
        System.out.println("My range is " + range + "nmi" + "\n");
    }

    public void sayMyStrength() {
        System.out.println("My strength is " + strength);
    }

    public void sayMyAgility() {
        System.out.println("My agility is " + agility);
    }
    
    public void sayMyIntelligence() {
        System.out.println("My intelligence is " + intelligence + "\n");
    }
}
