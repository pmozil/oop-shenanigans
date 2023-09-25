package ua.edu.ucu.apps.lotr;

public class GemeManager {
    public static void fight(Character firstCharacter, Character secondCharacter) {
        System.out.println("Character 1:" + firstCharacter);
        System.out.println("Character 2:" + secondCharacter);
        while (firstCharacter.isAlive() && secondCharacter.isAlive()) {
            firstCharacter.kick(secondCharacter);
            System.out.println("First character lands a kick!");
            System.out.println("Character 1:" + firstCharacter);
            System.out.println("Character 2:" + secondCharacter);

            secondCharacter.kick(firstCharacter);
            System.out.println("Second character lands a kick!");
            System.out.println("Character 1:" + firstCharacter);
            System.out.println("Character 2:" + secondCharacter);
        }
    }
    
}
