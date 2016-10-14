
public class User {
    private int id;
    private String names;
    private int number;
    private int win;
    private int fall;

    public User() {

    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+"{id:" +id
                +" username:"+names
                +" number:"+number
                +" win:"+win
                +" fall:"+fall
                +"}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWin() {
        return this.win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getFall() {
        return this.fall;
    }

    public void setFall(int fall) {
        this.fall = fall;
    }


}
