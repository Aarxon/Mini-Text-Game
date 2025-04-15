public class classInfo
{
    private String Warrior;
    private String Assassin;
    private String Archer;
    private String Mage;

    //WarriorsStats
    private int warriorHealth = 250;
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

}
