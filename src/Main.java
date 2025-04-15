import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        int menu;
        boolean nameCheck;

        classInfo classes = new classInfo();
        PlayerCharacter player = new PlayerCharacter();

        nameCheck = false;
        name = "";

        System.out.println("Welcome Adventurer");

        System.out.println("Whats is your name?");
        while(!nameCheck)
        {
            name = input.nextLine();
            player.setName(name);
            nameCheck = player.setName(name);

                if(!nameCheck)
                {
                    System.out.println("You must enter a valid name");
                }
        }

        System.out.println("Welcome " + name);
        System.out.println("You must now pick a class  \n");

        System.out.println("1. View Warrior  ");
        System.out.println("2. View Assassin  ");
        System.out.println("3. View Archer  ");
        System.out.println("4. View Mage ");
        menu = input.nextInt();
        classSelection(input, menu, classes);

    }
    public static void classSelection(Scanner input, int menu, classInfo classes)
    {
        switch(menu)
        {
            case 1:
                classes.WarriorStatsShow();
                break;
            case 2:
                classes.AssassinStatsShow();
                break;
            case 3:
                classes.ArcherStatsShow();
                break;
            case 4:
                classes.MageStatsShow();
                break;
        }

    }
}