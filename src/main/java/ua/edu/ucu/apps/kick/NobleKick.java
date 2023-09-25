package ua.edu.ucu.apps.kick;

import ua.edu.ucu.apps.lotr.Character;
import ua.edu.ucu.apps.lotr.Noble;

public class NobleKick implements KickStrategy {
    @Override
    public void kick(Character kicker, Character opponent) {
        int dec = ((Noble) kicker).random();
        
        opponent.setHp(opponent.getHp() - dec);
    }
    
}

