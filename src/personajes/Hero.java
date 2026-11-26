package personajes;

public abstract class Hero extends Personaje {
    private int nivel;
    private int experiencia;

    public Hero(String nombre, int vida, int ataque) {
        super(nombre, vida, ataque);
        this.nivel = 1;
        this.experiencia = 0;
    }

    public void ganarExperiencia(int xp) {
        experiencia += xp;
        while (experiencia >= nivel * 100) {
            experiencia -= nivel * 100;
            subirNivel();
        }
    }

    protected void subirNivel() {
        nivel++;
        setAtaque(getAtaque() + 2);
    }

    public int getNivel() { 
        return nivel; 
    }
    public int getExperiencia() { 
        return experiencia; 
    }
}

