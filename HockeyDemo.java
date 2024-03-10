public class HockeyDemo implements Hockey, Event {
    public void setHomeTeam(String name) {
        System.out.println("Home team: " + name);
    }

    public void setVisitingTeam(String name) {

    }

    public void homeGoalScored() {

    }

    public void visitingGoalScored() {

    }

    public void endOfPeriod(int period) {

    }

    public void overTimePeriod(int out) {

    }

    public static void main(String[] args) {
        Hockey hockeyDemo = new HockeyDemo();
        hockeyDemo.setHomeTeam("Tanzania.");
        ((HockeyDemo) hockeyDemo).organize(); // casting to class hockeyDemo
    }

    public void organize() {
        System.out.println("Match organized.");
    }
}
