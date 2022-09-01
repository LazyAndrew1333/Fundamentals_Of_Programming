public class App {
    public static void main(String[] args) {

        // Character Class
        Item M4A1 = new Item("M4A1", 2000.00d, 50.00d, 60, "5.56", "Ammerican Rifle", true);
        M4A1.itemDescription();

        Item AK47 = new Item("AK47", 1500.00d, 45.00d, 100, "7.62", "Russian Rifle", true);
        AK47.itemDescription();

        Item Lynx = new Item("GM6 Lynx", 5000.00d, 70.00d, 50, ".50 BMG", "Hungarian Anti-Material Rifle", true);
        Lynx.itemDescription();

        // Pet Class
        Pet Dragon = new Pet("Yu Zhong", "Dragon", "Alucard", 50, true, "Dark Fire");
        Dragon.petDescription();

        Pet Fox = new Pet("Ahri", "Fox", "Tryndamere", 60, true, "Charm");
        Fox.petDescription();

        Pet Robot = new Pet("Blitz Crank", "Robot", "Yasuo", 70, true, "Physical");
        Robot.petDescription();
    }
}
