/**
 * IDEA
 * APCS, p1, 10/18/22
 * This program will sequentially print out a song with repetition and recurring lines
 *
 * @author Daniel Nelson
 * @version v1
 */
public class Song {
    public static void main(String[] args) {
        int i;
        for(i=99;i>=1;i--){
            line(i);
        }
    }
    public static void line(int lineNumber) {
        System.out.println(lineNumber + " bottles of beer on the wall " + lineNumber + " bottles of beer\ntake one down pass it around " + (lineNumber - 1) + " bottles of beer on the wall.");
    }
}
