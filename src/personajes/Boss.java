package personajes;

public abstract class Boss extends Villano {
    public Boss(String nombre, int vida, int ataque, int recompensaXp) {
        super(nombre, vida, ataque, recompensaXp);
    }

    // Habilidad especial propia de cada boss
    public abstract void habilidadEspecial(Personaje objetivo);
}