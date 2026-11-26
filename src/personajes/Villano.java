package personajes;

public abstract class Villano extends Personaje {
    private int recompensaXp;

    public Villano(String nombre, int vida, int ataque, int recompensaXp) {
        super(nombre, vida, ataque);
        this.recompensaXp = recompensaXp;
    }

    public int getRecompensaXp() { 
        return recompensaXp; 
    }
}