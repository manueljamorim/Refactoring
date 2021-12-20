package pt.up.fe.ldts.example5;

public class CommandR extends Command{
    public CommandR(Position p) {
        super(p);
    }

    @Override
    public Position execute() {
        if (position.getDirection() == 'N') position.setDirection('E');
        else if (position.getDirection() == 'E') position.setDirection('S');
        else if (position.getDirection() == 'S') position.setDirection('W');
        else if (position.getDirection() == 'W') position.setDirection('N');
        return position;
    }
}
