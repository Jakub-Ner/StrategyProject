package StrategyProject.characters;

public class DisplayCharacter {
    int counter = 1;
    final char[] front = new char[]{
            '/', '\\',
            'd', 'b'};

    final char[] back = new char[]{
            '/', '\\',
            'b', 'd'};

    final char[] leftSide = new char[]{
            'J', 'J',
            'd', 'd'};

    final char[] rightSide = new char[]{
            'L', 'L',
            'b', 'b'};

    public char[] characterShape(int goFurther) {
        if (goFurther == 8) {
            return back;
        }
        if (goFurther == 2 || (counter == 1 && goFurther == 0)) {
            counter--;
            return front;
        }
        if (goFurther == 4) {
            return leftSide;
        }
        if (goFurther == 6) {
            return rightSide;
        }
        return new char[0];
    }
}
