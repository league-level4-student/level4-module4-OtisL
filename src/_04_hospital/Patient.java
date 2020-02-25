package _04_hospital;

public class Patient {
	boolean feelsCaredFor = false;

	public void checkPulse() {
		feelsCaredFor = true;
	}

	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}
}
