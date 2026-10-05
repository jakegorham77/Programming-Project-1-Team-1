/***
*Team 1
*Team Members: Victor, Anupa, Jake, Mubarak
*CS2430-502 Project 1
* Programming Project 1: Algorithm Performance_PLO-CS-3
*
*/

package Project1;

public class ComparisonCounter {
    private int count = 0;

    public boolean lessThan(int a, int b) {
        count++;
        return a < b;
    }

    public boolean greaterThan(int a, int b) {
        count++;
        return a > b;
    }

    public int getCount() {
        return count;
    }

    public void resetCount() {
        count = 0;
    }
}
