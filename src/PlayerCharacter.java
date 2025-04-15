
public class PlayerCharacter
{
    //Players stats overall
    private String name;
    private String playerClass;
    private int playerHealth;
    private int playerArmor;
    private int playerMana;

    //players current stats
    private int currentHealth;
    private int currentArmor;
    private int currentMana;

    public PlayerCharacter()
    {

    }

    //Starting Stats

    //
    public boolean setName(String name)
    {
        if(name == null || name.isEmpty())
        {
            return false;
        }
        else
        {
            this.name = name;
            return true;
        }
    }


    public void setPlayerClass(String playerClass)
    {
        this.playerClass = playerClass;
    }


    public void setPlayerHealth(int playerHealth)
    {
        this.playerHealth = playerHealth;
    }

    public void setPlayerArmor(int playerArmor)
    {
        this.playerArmor = playerArmor;
    }

    public void setPlayerMana(int playerMana)
    {
        this.playerMana = playerMana;
    }


    public void setCurrentHealth(int currentHealth)
    {
        this.currentHealth = currentHealth;
    }

    public void setCurrentArmor(int currentArmor)
    {
        this.currentArmor = currentArmor;
    }

    public void setCurrentMana(int currentMana)
    {
        this.currentMana = currentMana;
    }

    public void playerInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Class: " + playerClass);
        System.out.println("Health: " + currentHealth + "/" + playerHealth);
        System.out.println("Armor: " + currentArmor + "/" + playerArmor);
        System.out.println("Mana: " + currentMana + "/" + playerMana );
    }

}

