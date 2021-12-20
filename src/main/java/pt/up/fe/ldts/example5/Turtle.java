package pt.up.fe.ldts.example5;

public class Turtle {
    private Position position;

    public Turtle(int row, int column, char direction) {
        this.position = new Position(row, column, direction);
    }

    public void setPosition(Position p) {
        this.position = p;
    }

    public Position getPosition(){
        return position;
    }

    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            setPosition(new CommandL(position).execute());
        } else if (command == 'R') { // ROTATE RIGHT
            setPosition(new CommandR(position).execute());
        } else if (command == 'F'){ // MOVE FORWARD
            setPosition(new CommandF(position).execute());
        }
    }
}