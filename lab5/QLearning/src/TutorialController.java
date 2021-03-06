<<<<<<< HEAD
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class TutorialController extends Controller {

    public SpringObject object;

    ComposedSpringObject cso;

    /* These are the agents senses (inputs) */
	DoubleFeature x; /* Positions */
	DoubleFeature y;
	DoubleFeature vx; /* Velocities */
	DoubleFeature vy;
	DoubleFeature angle; /* Angle */

    /* Example:
     * x.getValue() returns the vertical position of the rocket 
     */

	/* These are the agents actuators (outputs)*/
	RocketEngine leftRocket;
	RocketEngine middleRocket;
	RocketEngine rightRocket;

    /* Example:
     * leftRocket.setBursting(true) turns on the left rocket 
     */
	
	DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US); 
	
	public void init() {
		cso = (ComposedSpringObject) object;
		x = (DoubleFeature) cso.getObjectById("x");
		y = (DoubleFeature) cso.getObjectById("y");
		vx = (DoubleFeature) cso.getObjectById("vx");
		vy = (DoubleFeature) cso.getObjectById("vy");
		angle = (DoubleFeature) cso.getObjectById("angle");

		leftRocket = (RocketEngine) cso.getObjectById("rocket_engine_left");
		rightRocket = (RocketEngine) cso.getObjectById("rocket_engine_right");
		middleRocket = (RocketEngine) cso.getObjectById("rocket_engine_middle");
	}

    public void tick(int currentTime) {

    	/* TODO: Insert your code here */
    	System.out.println("SENSORS: angle=" + df.format(angle.getValue()) + " vx=" + df.format(vx.getValue()) + 
				" vy=" + df.format(vy.getValue()));
    	
    	if (vy.getValue() >= 3) {
    		leftRocket.setBursting(false);
    		rightRocket.setBursting(false);
    		middleRocket.setBursting(false);
    	}
    	
//    	if (y.getValue() <= 0.1) {
//    		leftRocket.setBursting(true);
//    		rightRocket.setBursting(true);
//    		middleRocket.setBursting(true);
//    	}
    	
    }

}
=======
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class TutorialController extends Controller {

    public SpringObject object;

    ComposedSpringObject cso;

    /* These are the agents senses (inputs) */
	DoubleFeature x; /* Positions */
	DoubleFeature y;
	DoubleFeature vx; /* Velocities */
	DoubleFeature vy;
	DoubleFeature angle; /* Angle */

    /* Example:
     * x.getValue() returns the vertical position of the rocket 
     */

	/* These are the agents actuators (outputs)*/
	RocketEngine leftRocket;
	RocketEngine middleRocket;
	RocketEngine rightRocket;

    /* Example:
     * leftRocket.setBursting(true) turns on the left rocket 
     */
	
	DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US); 
	
	public void init() {
		cso = (ComposedSpringObject) object;
		x = (DoubleFeature) cso.getObjectById("x");
		y = (DoubleFeature) cso.getObjectById("y");
		vx = (DoubleFeature) cso.getObjectById("vx");
		vy = (DoubleFeature) cso.getObjectById("vy");
		angle = (DoubleFeature) cso.getObjectById("angle");

		leftRocket = (RocketEngine) cso.getObjectById("rocket_engine_left");
		rightRocket = (RocketEngine) cso.getObjectById("rocket_engine_right");
		middleRocket = (RocketEngine) cso.getObjectById("rocket_engine_middle");
	}

    public void tick(int currentTime) {

    	/* TODO: Insert your code here */
    	System.out.println("SENSORS: angle=" + df.format(angle.getValue()) + " vx=" + df.format(vx.getValue()) + 
				" vy=" + df.format(vy.getValue()));
    	
//    	if (vy.getValue() >= 3) {
//    		leftRocket.setBursting(false);
//    		rightRocket.setBursting(false);
//    		middleRocket.setBursting(false);
//    	}
    	
//    	if (y.getValue() <= 0.1) {
//    		leftRocket.setBursting(true);
//    		rightRocket.setBursting(true);
//    		middleRocket.setBursting(true);
//    	}
    	
    }

}
>>>>>>> 729d599ed6493ac5b59074bba5da5e15c5514a1d
