package pt.up.fe.ldts.example5;

public class CommandF extends Command {

    public CommandF(Position p) {
        super(p);
    }

    @Override
    public Position execute() {
        if (position.getDirection() == 'N') position.setRow(position.getRow() - 1);
        if (position.getDirection() == 'S') position.setRow(position.getRow() + 1);
        if (position.getDirection() == 'W') position.setColumn(position.getColumn() - 1);
        if (position.getDirection() == 'E') position.setColumn(position.getColumn() + 1);
        return position;
    }
}
