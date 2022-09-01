public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyAttributes method
        knight.sayMyAttributes();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyAttributes method
        mage.sayMyAttributes();

        // Creates a new object named "thief" from Character class
        Character thief = new Character(5, 10, 0, "Gondar");
        // Calls the sayMyAttributes method
        thief.sayMyAttributes();

        // Creates a new object named "archer" from Character class
        Character archer = new Character(5, 10, 0, "Robbin Hood");
        // Calls the sayMyAttributes method
        archer.sayMyAttributes();

    }
}
