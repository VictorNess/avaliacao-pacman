package br.com.fiap.pacman;

// TODO construtor e os métodos sets devem ser validados
// TODO criar métodos para validação da movimentação e movimentar Ghost
public class Ghost extends GameObject {

    private int direcao;

    public Ghost() {

    }

    public Ghost(int x, int y, int direcao) {
        super(x, y);
        this.direcao = direcao;
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }

}
