package pt.up.fe.ldts.example5;

public abstract class Command {
    protected Position position;

    public Command(Position position) {
        this.position = position;
    }
    public abstract Position execute();
}