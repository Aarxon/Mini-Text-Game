import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        boolean nameCheck;
        boolean menuCheck;

        classInfo classes = new classInfo();
        PlayerCharacter player = new PlayerCharacter();

        nameCheck = false;
        name = "";
        menuCheck = false;


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

        System.out.println("Hello " + name);
        System.out.println("You must now pick a class  \n");

        classSelection(input, classes, menuCheck, player);

        System.out.println("You arrive at level 1 of the dungeon ");
        System.out.println("What do you do? ");

        while(!menuCheck)
        {
            System.out.println("1. Fight the level 1 monster ");
            System.out.println("2. Check players stats ");
            System.out.println("3. Exit game");
            int choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    break;

                case 2:
                    player.playerInfo();
            }


        }

    }

    public static void classSelection(Scanner input,classInfo classes, boolean menuCheck, PlayerCharacter player)
    {
        int menu;
        int choice;

        while(!menuCheck)
        {
            System.out.println("1. View Warrior Stats  ");
            System.out.println("2. View Assassin Stats  ");
            System.out.println("3. View Archer Stats  ");
            System.out.println("4. View Mage Stats  ");
            System.out.println("5. Pick a class ");
            menu = input.nextInt();

            switch(menu)
            {
                case 1:
                    System.out.println("------------- ");
                    System.out.println("Warrior Stats ");
                    classes.WarriorStatsShow();
                    System.out.println("------------- \n");
                    break;
                case 2:
                    System.out.println("------------- ");
                    System.out.println("Assassin Stats ");
                    classes.AssassinStatsShow();
                    System.out.println("------------- \n");
                    break;
                case 3:
                    System.out.println("------------- ");
                    System.out.println("Archer Stats ");
                    classes.ArcherStatsShow();
                    System.out.println("------------- \n");
                    break;
                case 4:
                    System.out.println("------------- ");
                    System.out.println("Mage Stats ");
                    classes.MageStatsShow();
                    System.out.println("------------- \n");
                    break;
                case 5:
                    menuCheck = true;
                    System.out.println("1. Choose Warrior ");
                    System.out.println("2. Choose Assassin ");
                    System.out.println("3. Choose Archer ");
                    System.out.println("4. Choose Mage ");
                    choice = input.nextInt();

                    switch(choice)
                    {
                        //This is to set the class name and the starting stats and the current stats theres defo a better way to do this instead of 5 long method calls
                        case 1:
                                System.out.println("Warrior has been chosen ");
                                System.out.println("Good luck on your adventure \n");
                                System.out.println("Entering world.... ");

                                player.setPlayerClass(classes.getWarrior());
                                player.setPlayerHealth(classes.getWarriorHealth());
                                player.setCurrentHealth(classes.getWarriorHealth());
                                player.setPlayerArmor(classes.getWarriorArmor());
                                player.setCurrentArmor(classes.getWarriorArmor());
                                break;
                        case 2:
                                System.out.println("Assassin has been chosen ");
                                System.out.println("Good luck on your adventure \n");
                                System.out.println("Entering world.... ");

                                player.setPlayerClass(classes.getAssassin());
                                player.setPlayerHealth(classes.getAssassinHealth());
                                player.setCurrentHealth(classes.getAssassinHealth());
                                player.setPlayerArmor(classes.getAssassinArmor());
                                player.setCurrentArmor(classes.getAssassinArmor());
                                break;
                        case 3:
                                System.out.println("Archer has been chosen ");
                                System.out.println("Good luck on your adventure \n");
                                System.out.println("Entering world.... ");

                                player.setPlayerClass(classes.getArcher());
                                player.setPlayerHealth(classes.getArcherHealth());
                                player.setCurrentHealth(classes.getArcherHealth());
                                player.setPlayerArmor(classes.getArcherArmor());
                                player.setCurrentArmor(classes.getArcherArmor());
                                break;
                        case 4:
                                System.out.println("Mage has been chosen ");
                                System.out.println("Good luck on your adventure \n");
                                System.out.println("Entering world.... ");

                                player.setPlayerClass(classes.getMage());
                                player.setPlayerHealth(classes.getMageHealth());
                                player.setCurrentHealth(classes.getMageHealth());
                                player.setPlayerArmor(classes.getMageArmor());
                                player.setCurrentArmor(classes.getMageArmor());
                                player.setPlayerMana(classes.getMageMana());
                                player.setCurrentMana(classes.getMageMana());
                                break;
                    }
            }
        }
    }
}