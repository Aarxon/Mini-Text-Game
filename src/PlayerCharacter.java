import java.util.Scanner;

public class PlayerCharacter
{
    Scanner input = new Scanner(System.in);
    private String name;
    private String playerClass;

    public PlayerCharacter()
    {

    }

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

    public String getName(String name)
    {
        return name;
    }

    public void setPlayerClass(String playerClass)
    {
        this.playerClass = playerClass;
    }
}

