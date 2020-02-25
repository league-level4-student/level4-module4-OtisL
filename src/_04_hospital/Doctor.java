package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	boolean performsSurgery = false;
	boolean makesHouseCalls = false;

	Doctor() {

	}

	public void assignPatient(Patient p) throws DoctorFullException {
		if (patients.size() < 3) {
			patients.add(p);
		} else {
			throw new DoctorFullException();
		}
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public boolean makesHouseCalls() {
		return this.makesHouseCalls;
	}

	public boolean performsSurgery() {
		return this.performsSurgery;
	}

	public void doMedicine() {
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}
}

class DoctorFullException extends Exception {

}
