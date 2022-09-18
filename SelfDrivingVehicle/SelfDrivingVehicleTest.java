/*
Using your design from the last assignment (or using an improved design),
implement your design in whatever computer language you like to use.
I only expect "skeleton" code. That is given a class, for instance, car,
it perhaps has methods as forward, back, right, left, and stop.
Each method should have only a print statement contained within the method
so that we know it was called. For example, to drive around the block requires
four left turns. So, the output should look something like this:

Forward, Left, Left, Left, Left, Stop

Come up with a simple driving around the block program.
Something like "drive me to the store and back when I am finished shopping".

That's all you need to do.
Upload the code with a sample output and a brief description of your driving
plan like above.
*/

import java.util.Scanner; // FOR INPUT STREAM OBJECTS

public class SelfDrivingVehicleTest
{
	// SUPER CLASS
	public static abstract class SelfDrivingVehicle
	{

	} // END SelfDrivingVehicle ABSTRACT CLASS

	// SUB CLASS
	public static class Car extends SelfDrivingVehicle
	{
		// PRIVATE INSTANCE VARIABLES (ATTRIBUTES)
		private String manufacturer;
		private String model;
		private int modelYear;
		private double throttle;
		private double brake;
		private double fuelGauge;
		private String gpsCoordinates;
		private double steeringAngle;
		private boolean leftBlinkerStatus;
		private boolean rightBlinkerStatus;
		private String activeBlinker;
		private int currentSpeed;
		private int targetSpeed;
		private String currentHeading;
		private String targetHeading;
		private String currentGear;
		private String targetGear;
		// ADDITIONAL THINGS I THOUGHT OF BUT DIDN'T HAVE TIME TO IMPLEMENT...
		// SAFETY ATTRIBUTES / FEATURES (ie. EMERGENCY BRAKE)
		// ACCELEROMETER ATTRIBUTES (ie. G-FORCE VALUES)
		// GYRO ATTRIBUTES (ie. CURRENT VEHICLE ANGLE RELATIVE TO FLAT)
		// AMOUNT OF TIME TO PERFORM CERTAIN TASKS

		// DEFAULT CONSTRUCTOR (0 PARAMETERS)
		public Car()
		{
			this.manufacturer = "";
			this.model = "";
			this.modelYear = 0;
			this.throttle = 0.00;
			this.brake = 0.00;
			this.fuelGauge = 0.00;
			this.gpsCoordinates = "";
			this.steeringAngle = 0.00;
			this.leftBlinkerStatus = false;
			this.rightBlinkerStatus = false;
			this.activeBlinker = "";
			this.currentSpeed = 0;
			this.targetSpeed = 0;
			this.currentHeading = "";
			this.targetHeading = "";
			this.currentGear = "";
			this.targetGear = "";
		}

		// X PARAMETER CONSTRUCTOR
		public Car(
					String manufacturer,
					String model,
					int modelYear,
					double throttle,				// 0 - 100 %
					double brake,					// 0 - 100 %
					double fuelGauge,				// 0 - 100 %
					String gpsCoordinates,			// "(LATITUDE, LONGITUDE)"
					double steeringAngle,			// 0 - 360 DEGREES, 0 is NORTH, RANGE is +- 360 DEGREES
					boolean leftBlinkerStatus,
					boolean rightBlinkerStatus,
					String activeBlinker,			// "LEFT" OR "RIGHT"
					int currentSpeed,				// MPH
					int targetSpeed,				// MPH
					String currentHeading,			// CARDINAL DIRECTIONS: N, E, S, W, NE, SE, SW, NW
					String targetHeading,			// CARDINAL DIRECTIONS: N, E, S, W, NE, SE, SW, NW
					String currentGear,				// (P)ARK, (R)EVERSE, (N)EUTRAL, (D)RIVE, 3, 2, 1
					String targetGear				// (P)ARK, (R)EVERSE, (N)EUTRAL, (D)RIVE, 3, 2, 1
		)
		{
			// ALWAYS INITIALIZE ATTRIBUTES FIRST USING DEFAULT CONSTRUCTOR
			this();

			// THEN USE MUTATOR METHODS TO SAFELY SET ATTRIBUTES

			//this.manufacturer = manufacturer;
			setManufacturer(manufacturer);
			//this.model = model;
			setModel(model);
			//this.modelYear = modelYear;
			setModelYear(modelYear);
			//this.throttle = throttle;
			setThrottle(throttle);
			//this.brake = brake;
			setBrake(brake);
			//this.fuelGauge = fuelGauge;
			setFuelGauge(fuelGauge);
			//this.gpsCoordinates = gpsCoordinates;
			setGpsCoordinates(gpsCoordinates);
			//this.steeringAngle = steeringAngle;
			setSteeringAngle(steeringAngle);
			//this.leftBlinkerStatus = leftBlinkerStatus;
			setLeftBlinkerStatus(leftBlinkerStatus);
			//this.rightBlinkerStatus = rightBlinkerStatus;
			setRightBlinkerStatus(rightBlinkerStatus);
			//this.activeBlinker = activeBlinker;
			setActiveBlinker(activeBlinker);
			//this.currentSpeed = currentSpeed;
			setCurrentSpeed(currentSpeed);
			//this.targetSpeed = targetSpeed;
			setTargetSpeed(targetSpeed);
			//this.currentHeading = currentHeading;
			setCurrentHeading(currentHeading);
			//this.targetHeading = targetHeading;
			setTargetHeading(targetHeading);
			//this.currentGear = currentGear;
			setCurrentGear(currentGear);
			//this.targetGear = targetGear;
			setTargetGear(targetGear);
		}

		// ACCESSOR METHODS
		public String getManufacturer()
		{
			return manufacturer;
		}

		public String getModel()
		{
			return model;
		}

		public int getModelYear()
		{
			return modelYear;
		}

		public double getThrottle()
		{
			return throttle;
		}

		public double getBrake()
		{
			return brake;
		}

		public double getFuelGauge()
		{
			return fuelGauge;
		}

		public String getGpsCoordinates()
		{
			return gpsCoordinates;
		}

		public double getSteeringAngle()
		{
			return steeringAngle;
		}

		public boolean getLeftBlinkerStatus()
		{
			return leftBlinkerStatus;
		}

		public boolean getRightBlinkerStatus()
		{
			return rightBlinkerStatus;
		}

		public String getActiveBlinker()
		{
			return activeBlinker;
		}

		public int getCurrentSpeed()
		{
			return currentSpeed;
		}

		public int getTargetSpeed()
		{
			return targetSpeed;
		}

		public String getCurrentHeading()
		{
			return currentHeading;
		}

		public String getTargetHeading()
		{
			return targetHeading;
		}

		public String getCurrentGear()
		{
			return currentGear;
		}

		public String getTargetGear()
		{
			return targetGear;
		}

		// MUTATOR METHODS  --  COMPLETE ERROR CHECKING AND INPUT FILTERING NOT IMPLEMENTED YET
		private void setManufacturer(String manufacturer)
		{
			this.manufacturer = manufacturer;
		}

		private void setModel(String model)
		{
			this.model = model;
		}

		private void setModelYear(int modelYear)
		{
			if (modelYear >= 1650 && modelYear <= 2021)
				this.modelYear = modelYear;
		}

		private void setThrottle(double throttle)
		{
			if (throttle >= 0 && throttle <= 100)
				this.throttle = throttle;
		}

		private void setBrake(double brake)
		{
			if (brake >= 0 && brake <= 100)
				this.brake = brake;
		}

		private void setFuelGauge(double fuelGauge)
		{
			if (fuelGauge >= 0 && fuelGauge <= 100)
				this.fuelGauge = fuelGauge;
		}

		private void setGpsCoordinates(String gpsCoordinates)
		{
			// FILTER FOR DECIMAL DEGREES
			// FILTER FOR DMS (DEGREES, MINUTES, SECONDS)
			this.gpsCoordinates = gpsCoordinates;
		}

		private void setSteeringAngle(double steeringAngle)
		{
			if (steeringAngle >= -360 && steeringAngle <= 360)
				this.steeringAngle = steeringAngle;
		}

		private void setLeftBlinkerStatus(boolean leftBlinkerStatus)
		{
			// CHECK IF RIGHT BLINKER IS ON FIRST
			if (this.rightBlinkerStatus == true)
			{
				// TURN RIGHT BLINKER OFF BEFORE ACTIVATING LEFT BLINKER
				this.rightBlinkerStatus = false;
				this.leftBlinkerStatus = leftBlinkerStatus;
			}
			else // EITHER LEFT BLINKER IS ALREADY ON OR NO BLINKERS ARE ON
			{
				// ACTIVATE LEFT BLINKER
				this.leftBlinkerStatus = leftBlinkerStatus;
			}
		}

		private void setRightBlinkerStatus(boolean rightBlinkerStatus)
		{
			// CHECK IF LEFT BLINKER IS ON FIRST
			if (this.leftBlinkerStatus == false)
			{
				// TURN LEFT BLINKER OFF BEFORE ACTIVATING RIGHT BLINKER
				this.leftBlinkerStatus = false;
				this.rightBlinkerStatus = rightBlinkerStatus;	
			}
			else // EITHER RIGHT BLINKER IS ALREADY ON OR NO BLINKERS ARE ON
			{
				// ACTIVATE RIGHT BLINKER
				this.rightBlinkerStatus = rightBlinkerStatus;
			}
		}

		private void setActiveBlinker(String activeBlinker)
		{
			// ONLY ONE BLINKER CAN BE ON AT A TIME
			if (activeBlinker == "LEFT")
			{
				this.activeBlinker = activeBlinker;
				setLeftBlinkerStatus(true);
			}
			if (activeBlinker == "RIGHT")
			{
				this.activeBlinker = activeBlinker;
				setRightBlinkerStatus(true);
			}
			if (activeBlinker == "NONE")
			{
				this.activeBlinker = activeBlinker;
				setLeftBlinkerStatus(false);
				setRightBlinkerStatus(false);
			}
		}

		private void setCurrentSpeed(int currentSpeed)
		{
			if (currentSpeed >= 0 && currentSpeed <= 70)
				this.currentSpeed = currentSpeed;
		}
		
		private void setTargetSpeed(int targetSpeed)
		{
			if (targetSpeed >= 0 && targetSpeed <= 70)
				this.targetSpeed = targetSpeed;
		}

		private void setCurrentHeading(String currentHeading)
		{
			if (currentHeading == "N" ||
				currentHeading == "E" ||
				currentHeading == "S" ||
				currentHeading == "W" ||
				currentHeading == "NE" ||
				currentHeading == "SE" ||
				currentHeading == "SW" ||
				currentHeading == "NW"
			)
				this.currentHeading = currentHeading;
		}

		private void setTargetHeading(String targetHeading)
		{
			if (targetHeading == "N" ||
				targetHeading == "E" ||
				targetHeading == "S" ||
				targetHeading == "W" ||
				targetHeading == "NE" ||
				targetHeading == "SE" ||
				targetHeading == "SW" ||
				targetHeading == "NW"
			)
				this.targetHeading = targetHeading;
		}

		private void setCurrentGear(String currentGear)
		{// (P)ARK, (R)EVERSE, (N)EUTRAL, (D)RIVE, 3, 2, 1
			if (currentGear == "P" ||
				currentGear == "R" ||
				currentGear == "N" ||
				currentGear == "D" ||
				currentGear == "3" ||
				currentGear == "2" ||
				currentGear == "1"
			)
				this.currentGear = currentGear;
		}

		private void setTargetGear(String targetGear)
		{// (P)ARK, (R)EVERSE, (N)EUTRAL, (D)RIVE, 3, 2, 1
			if (targetGear == "P" ||
				targetGear == "R" ||
				targetGear == "N" ||
				targetGear == "D" ||
				targetGear == "3" ||
				targetGear == "2" ||
				targetGear == "1"
			)
				this.targetGear = targetGear;
		}

		// FUNCTIONAL METHODS
		public void accelerate(double throttle)
		{
			System.out.println("ACCELERATE");
			// ADDITIONAL CHECKS & NUANCE GO HERE
			
			setBrake(0);
			setThrottle(throttle);
		}

		public void coast()
		{
			System.out.println("COAST");
			// ADDITIONAL CHECKS & NUANCE GO HERE
			
			setBrake(0);
			setThrottle(0);
		}

		public void brake(double brake)
		{
			System.out.println("BRAKE");
			// ADDITIONAL CHECKS & NUANCE GO HERE
			
			setThrottle(0);
			setBrake(brake);
		}

		public void forward(double throttle)
		{
			System.out.println("FORWARD");

			setBrake(100);
			setCurrentGear("D");
			accelerate(throttle);
		}

		public void reverse(double throttle)
		{
			System.out.println("REVERSE");
			// ADDITIONAL CHECKS & NUANCE GO HERE
			
			// ONLY ALLOW UP TO 15% THROTTLE IN REVERSE FOR SAFETY
			if (throttle >= 0 && throttle <= 15)
			{
				setBrake(100);
				setCurrentGear("R");
				accelerate(throttle);
			}
		}

		public void turn(String direction)
		{
			System.out.print("TURN ");
			// ADDITIONAL CHECKS & NUANCE GO HERE

			if (direction == "LEFT")
			{
				System.out.println("LEFT");
				// LEFT TURN RANGE: 0 to -360
				setSteeringAngle(-90);
			}
			else if (direction == "RIGHT")
			{
				System.out.println("RIGHT");
				// RIGHT TURN RANGE: 0 to 360
				setSteeringAngle(90);
			}
			else if (direction == "STRAIGHT")
			{
				System.out.println("STRAIGHT");
				setSteeringAngle(0);
			}
		}

		public void stop(boolean emergency)
		{
			System.out.println("STOP");
			if (emergency == true)
				setBrake(100);
			else
			{
				// APPLY GRADUAL, LINEAR BRAKING FORCE UNTIL 100 % BRAKING ACHIEVED
				for (double i = 0; i < 100; i += 0.01)
					setBrake(i);
			}
		}

	} // END Car CLASS
	
	// main() PROGRAM
	public static void main(String[] args)
	{
		// OPEN STANDARD INPUT STREAM OBJECT
		Scanner input = new Scanner(System.in);	// NOT USED IN THIS PROGRAM

		System.out.println("Let's go for a ride around the block...");

		// INSTANTIATE OBJECT
		Car car = new Car();
		
		// MANUALLY SET INITIAL VALUES (I KNOW I COULD INCLUDE THESE IN THE LINE ABOVE)
		car.setManufacturer("Toyota");
		car.setModel("Prius");
		car.setModelYear(2008);
		car.setThrottle(0.00);
		car.setBrake(0.00);
		car.setFuelGauge(50);
		car.setGpsCoordinates("27.96861, -80.611642");
		car.setSteeringAngle(0.00);
		car.setLeftBlinkerStatus(false);
		car.setRightBlinkerStatus(false);
		car.setActiveBlinker("NONE");
		car.setCurrentSpeed(0);
		car.setTargetSpeed(0);
		car.setCurrentHeading("S");
		car.setTargetHeading("N");
		car.setCurrentGear("P");
		car.setTargetGear("P");

		// DRIVE THE CAR
		car.reverse(5);			// BACK OUT OF DRIVEWAY
		car.stop(false);		// STOP CAR
		car.turn("RIGHT");		// TURN WHEEL RIGHT
		car.forward(20);		// ACCELERATE FORWARD
		car.turn("STRAIGHT");	// STRAIGHTEN WHEEL WHILE ACCELERATING FORWARD
		car.stop(false);		// STOP AT STOP SIGN
		car.forward(30);		// START ACCELERATING FROM STOP
		car.turn("RIGHT");		// TURN RIGHT WHILE ACCELERATING
		car.turn("STRAIGHT");	// STRAIGHTEN WHEEL OUT WHILE ACCELERATING
		car.stop(false);		// STOP AT NEXT STOP SIGN
		car.forward(30);		// BEGIN ACCELERATING AGAIN
		car.turn("RIGHT");		// TURN RIGHT WHILE ACCELERATING AROUND STOP SIGN
		car.turn("STRAIGHT");	// STRAIGHTEN WHEEL OUT WHILE STILL ACCELERATING
		car.turn("RIGHT");		// TURN RIGHT AROUND CORNER WITH NO STOP SIGN
		car.turn("STRAIGHT");	// STRAIGHTEN PATH OF TRAVEL WHILE CONTINUING TO MOVE
		car.turn("RIGHT");		// TURN RIGHT AROUND ANOTHER CORNER WITH NO STOP SIGN
		car.turn("STRAIGHT");	// STRAIGHTEN PATH OF TRAVEL TO PREVENT CRASHING INTO WOODS
		car.stop(true);			// SIMULATED SQUIRREL RUNNING IN FRONT OF VEHICLE
		car.forward(20);		// FINISH DRIVING DOWN MY STREET
		car.turn("LEFT");		// TURN LEFT INTO DRIVEWAY WHILE STILL MOVING FORWARD
		car.turn("STRAIGHT");	// STRAIGHTEN STEERING WHEEL BEFORE STOPPING AND PARKING VEHICLE
		car.stop(false);		// BRING VEHICLE TO COMPLETE STOP & PARK
		
		// CLOSE INPUT STREAM OBJECT
		input.close(); // NOT USED IN THIS PROGRAM

	} // END main() PROGRAM

} // END SelfDrivingVehicleTest CLASS