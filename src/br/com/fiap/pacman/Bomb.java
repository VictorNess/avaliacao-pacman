package br.com.fiap.pacman;

// TODO construtor e métodos sets devem ser validados
public class Bomb extends Item {
    
    private int dano;

    public Bomb() {

    }

    public Bomb(int x, int y) {
        super(x, y);
        setDano(1);
    }

    public int getDano() {
        return dano;
    }

    private void setDano(int dano) {
        this.dano = dano;
    }

    


}
