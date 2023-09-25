package ua.edu.ucu.apps.kick;

import ua.edu.ucu.apps.lotr.Character;
import ua.edu.ucu.apps.lotr.Noble;

public class NobleKick implements KickStrategy {
    @Override
    public void kick(Noble kicker, Character opponent) {
        int dec = kicker.random();
        
        opponent.setHp(opponent.getHp() - dec);
    }
    
}

