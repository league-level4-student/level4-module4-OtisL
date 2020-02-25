package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> docs = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public void addDoctor(Doctor d) {
		docs.add(d);
	}

	public ArrayList<Doctor> getDoctors() {
		return docs;
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void assignPatientsToDoctors() {
		int currentPatient = 0;
		for (int i = 0; i < docs.size(); i++) {
			for(int j=0; j<3; j++) {
				try {
					docs.get(i).assignPatient(patients.get(currentPatient));
					currentPatient++;
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					break;
				}
				if(currentPatient>patients.size()-1) {
					break;
				}
			}
		}
	}
}
