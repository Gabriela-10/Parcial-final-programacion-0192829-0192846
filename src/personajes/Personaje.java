package personajes;

public abstract class Personaje {
    private String nombre;
    private int vida;
    private int vidaMaxima;
    private int ataque;

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.ataque = ataque;
    }

    // Cada subclase define su tipo
    public abstract String getTipo();

    // Cada subclase puede atacar de forma distinta
    public abstract void atacar(Personaje objetivo);

    public void recibirDanio(int danio) {
        vida = Math.max(0, vida - danio);
    }

    public void curar(int cantidad) {
        vida = Math.min(vidaMaxima, vida + cantidad);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    // Getters y setters
    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public int getVida() { 
        return vida; 
    }
    public void setVida(int vida) {
        this.vida = Math.max(0, Math.min(vida, vidaMaxima));
    }

    public int getVidaMaxima() { 
        return vidaMaxima; 
    }

    public int getAtaque() { 
        return ataque; 
    }
    public void setAtaque(int ataque) { 
        this.ataque = ataque; 
    }

    @Override
    public String toString() {
        return getTipo() + " " + nombre + " [Vida: " + vida + "/" + vidaMaxima + ", Ataque: " + ataque + "]";
    }
}