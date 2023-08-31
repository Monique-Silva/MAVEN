public class Board {
    private int squares;
    private int characterPin;
    //private int dice;

    public Board(){
        this.squares = 64;
        this.characterPin = 1;
    }
    public Board(int characterPin){
        this.squares = 64;
        this.characterPin = characterPin;
    }

    public Board(int squares, int characterPin){
        this.squares = squares;
        this.characterPin = characterPin;
    }

    public int getCharacterPin() {
        return characterPin;
    }

    public void setCharacterPin(int characterPin) {
        this.characterPin = characterPin;
    }

    public int getSquares() {
        return squares;
    }

    public void setSquares(int squares) {
        this.squares = squares;
    }
}