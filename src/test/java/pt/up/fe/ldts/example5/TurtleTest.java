package pt.up.fe.ldts.example5;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TurtleTest {

    @Test
    public void testRotateLeft() {
        Turtle turtle = new Turtle(5, 5, 'N');
        turtle.execute('L'); assertEquals('W', turtle.getPosition().getDirection());
        turtle.execute('L'); assertEquals('S', turtle.getPosition().getDirection());
        turtle.execute('L'); assertEquals('E', turtle.getPosition().getDirection());
        turtle.execute('L'); assertEquals('N', turtle.getPosition().getDirection());
        assertEquals(5, turtle.getPosition().getRow());
        assertEquals(5, turtle.getPosition().getColumn());
    }

    @Test
    public void testRotateRight() {
        Turtle turtle = new Turtle(5, 5, 'N');
        turtle.execute('R'); assertEquals('E', turtle.getPosition().getDirection());
        turtle.execute('R'); assertEquals('S', turtle.getPosition().getDirection());
        turtle.execute('R'); assertEquals('W', turtle.getPosition().getDirection());
        turtle.execute('R'); assertEquals('N', turtle.getPosition().getDirection());
        assertEquals(5, turtle.getPosition().getRow());
        assertEquals(5, turtle.getPosition().getColumn());
    }

    @Test
    public void testForward() {
        Turtle turtleN = new Turtle(5, 5, 'N');

        turtleN.execute('F');
        assertEquals(4, turtleN.getPosition().getRow());
        assertEquals(5, turtleN.getPosition().getColumn());

        Turtle turtleW = new Turtle(5, 5, 'W');

        turtleW.execute('F');
        assertEquals(5, turtleW.getPosition().getRow());
        assertEquals(4, turtleW.getPosition().getColumn());

        Turtle turtleS = new Turtle(5, 5, 'S');

        turtleS.execute('F');
        assertEquals(6, turtleS.getPosition().getRow());
        assertEquals(5, turtleS.getPosition().getColumn());

        Turtle turtleE = new Turtle(5, 5, 'E');

        turtleE.execute('F');
        assertEquals(5, turtleE.getPosition().getRow());
        assertEquals(6, turtleE.getPosition().getColumn());
    }

}