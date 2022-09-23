package br.com.fiap.pacman;

public class Player extends GameObject {

    // TODO transformar o tipo de direction para enum
    // TODO construtor e os métodos sets devem ser validados
    // TODO criar métodos para validação do movimento e movimentar o Player
    private int direction;
    private int life;
    private boolean invencivel;

    public Player() {

    }

    public Player(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isInvencivel() {
        return invencivel;
    }

    public void setInvencivel(boolean invencivel) {
        this.invencivel = invencivel;
    }

    public boolean movimentar(int x, int y, int direction) {
        boolean validacao = false;
        switch (direction) {
            case 0:
                validacao = getY() - y >= 0;
                break;
            case 180:
                validacao = getY() + y <= getScreenSize();
                break;
            case 270:
                validacao = getX() - x >= 0;
                break;
            case 90:
                validacao = getX() + x <= getScreenSize();
                break;

    
        }

        return validacao;
    }

}
