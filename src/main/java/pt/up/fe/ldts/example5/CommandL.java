package pt.up.fe.ldts.example5;

public class CommandL extends Command {

    public CommandL(Position p) {
        super(p);
    }

    @Override
    public Position execute() {
        if (position.getDirection() == 'N') position.setDirection('W');
        else if (position.getDirection() == 'W') position.setDirection('S');
        else if (position.getDirection() == 'S') position.setDirection('E');
        else if (position.getDirection() == 'E') position.setDirection('N');
        return position;
    }

}