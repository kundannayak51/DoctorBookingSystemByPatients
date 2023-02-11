package model;

import java.util.HashMap;
import java.util.List;

public class Patient {
    Integer patientId;
    String patientName;
    HashMap<Doctor, List<TimeSlot>> bookedSlot;

    public Patient(Integer patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public HashMap<Doctor, List<TimeSlot>> getBookedSlot() {
        return bookedSlot;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setBookedSlot(HashMap<Doctor, List<TimeSlot>> bookedSlot) {
        this.bookedSlot = bookedSlot;
    }
}
