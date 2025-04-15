
public class classInfo
{
    final private String Warrior = "Warrior";
    final private String Assassin = "Assassin";
    final private String Archer = "Archer";
    final private String Mage = "Mage";

    //WarriorsStats
    final private int warriorHealth = 250;
    private int warriorArmor = 300;

    //AssassinStats
    private int assassinHealth = 150;
    private int assassinArmor = 200;

    //ArcherStats
    private int archerHealth = 200;
    private int archerArmor = 150;

    //MageStats
    private int mageHealth = 100;
    private int mageArmor = 100;
    private int mageMana = 300;




    public classInfo() // constructor
    {

    }

    //To print out the stats for each class before picking
    public void WarriorStatsShow()
    {
        System.out.println("Health : " + warriorHealth);
        System.out.println("Armor : " + warriorArmor);
    }

    public void AssassinStatsShow()
    {
        System.out.println("Health : " + assassinHealth);
        System.out.println("Armor : " + assassinArmor);
    }

    public void ArcherStatsShow()
    {
        System.out.println("Health : " + archerHealth);
        System.out.println("Armor : " + archerArmor);
    }

    public void MageStatsShow()
    {
        System.out.println("Health : " + mageHealth);
        System.out.println("Armor : " + mageArmor);
        System.out.println("Mana : " + mageMana);
    }

    //Getting the class names
    public String getWarrior()
    {
        return Warrior;
    }

    public String getAssassin()
    {
        return Assassin;
    }

    public String getArcher()
    {
        return Archer;
    }

    public String getMage()
    {
        return Mage;
    }

    //Using this to get the stats to later set to the player stats when they choose a character... feel like theres a better way to do this that isnt as long
    public int getWarriorHealth()
    {
        return warriorHealth;
    }
    public int getWarriorArmor()
    {
        return warriorArmor;
    }

    public int getAssassinHealth()
    {
        return assassinHealth;
    }

    public int getAssassinArmor()
    {
        return assassinArmor;
    }

    public int getArcherHealth()
    {
        return archerHealth;
    }

    public int getArcherArmor()
    {
        return archerArmor;
    }

    public int getMageHealth()
    {
        return mageHealth;
    }

    public int getMageArmor()
    {
        return mageArmor;
    }

    public int getMageMana()
    {
        return mageMana;
    }

}

