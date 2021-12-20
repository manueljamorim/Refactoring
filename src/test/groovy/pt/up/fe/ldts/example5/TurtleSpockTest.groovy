package pt.up.fe.ldts.example5

import spock.lang.Specification

class TurtleSpockTest extends Specification {

    def 'Rotate Left'() {
        given:
            def turtle = new Turtle(5, 5, 'N' as char);

        when:
            turtle.execute('L' as char);

        then:
            'W' == turtle.getPosition().getDirection()

        and:
            turtle.execute('L' as char);

        then:
            'S' == turtle.getPosition().getDirection()


        and:
            turtle.execute('L' as char);

        then:
            'E' == turtle.getPosition().getDirection()


        and:
            turtle.execute('L' as char);

        then:
            'N' == turtle.getPosition().getDirection()


        and:
            5 == turtle.getPosition().getRow()
            5 == turtle.getPosition().getColumn()
    }

    def 'Rotate Right'() {
        given:
            def turtle = new Turtle(5, 5, 'N' as char);

        when:
            turtle.execute('R' as char);

        then:
            'E' == turtle.getPosition().getDirection()


        and:
            turtle.execute('R' as char);

        then:
            'S' == turtle.getPosition().getDirection()


        and:
            turtle.execute('R' as char);

        then:
            'W' == turtle.getPosition().getDirection()


        and:
            turtle.execute('R' as char);

        then:
            'N' == turtle.getPosition().getDirection()


        and:
            5 == turtle.getPosition().getRow()
            5 == turtle.getPosition().getColumn()
    }

    def 'Forward'() {
        given:
            def turtleN = new Turtle(5, 5, 'N' as char)
            def turtleW = new Turtle(5, 5, 'W' as char);
            def turtleS = new Turtle(5, 5, 'S' as char);
            def turtleE = new Turtle(5, 5, 'E' as char);

        when:
            turtleN.execute('F' as char)
            turtleW.execute('F' as char);
            turtleS.execute('F' as char);
            turtleE.execute('F' as char);

        then:
            4 == turtleN.getPosition().getRow()
            5 == turtleN.getPosition().getColumn()

        and:
            5 == turtleW.getPosition().getRow()
            4 == turtleW.getPosition().getColumn()

        and:
            6 == turtleS.getPosition().getRow()
            5 == turtleS.getPosition().getColumn()

        and:
            5 == turtleE.getPosition().getRow()
            6 == turtleE.getPosition().getColumn()
    }
}
