package workout;

public class Main {
    public static void main(String[] args){
        Workout workout = new Workout(500, 100);
        workout.squat();
        workout.squat();
        workout.squat();
        workout.squat(5);
        workout.calculate();
        workout.jumping_jack();
        workout.jumping_jack(10);
        workout.rest();
        workout.calculate();
        workout.push_up(15);
        workout.rest();
        workout.calculate();
        workout.squat();
        workout.push_up();
        workout.jumping_jack();
        workout.calculate();
    }
}
