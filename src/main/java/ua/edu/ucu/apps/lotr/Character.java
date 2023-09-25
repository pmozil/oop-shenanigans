package ua.edu.ucu.apps.lotr;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.kick.KickStrategy;

@AllArgsConstructor
public abstract class Character {
    @Getter @Setter
    private int hp;
    @Getter @Setter
    private int power;
    private KickStrategy kick;
    
    public boolean isAlive() {
        return getHp() > 0;
    }
    
    public void kick(Character opponent) {
        kick.kick(this, opponent);
    }
    
    public void setHp(int newHp) {
        this.hp = newHp > 0 ? newHp : 0;
    }
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
