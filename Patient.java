public class Patient {
    private String patientName;
    private String patientIlness;
    private int patientID;
    // ilnessImportance, patient's
    // ilness importance rating(0-5)

    Patient(){}

    private int ilnessImportance;

    public String getPatientName() {
        return patientName;
    }

    public String getPatientIlness() {
        return patientIlness;
    }

    public int getPatientID() {
        return patientID;
    }

    public int getIlnessImportance() {
        return ilnessImportance;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientIlness(String patientIlness) {
        this.patientIlness = patientIlness;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setIlnessImportance(int ilnessImportance) {
        this.ilnessImportance = ilnessImportance;
    }
}
