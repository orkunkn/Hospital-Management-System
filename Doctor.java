public class Doctor {


    public String doctorName;
    private String doctorSpecialty;
    private int doctorID;
    private int doctorExperiment;

    Doctor(String doctorName){
        this.doctorName = doctorName;
    }

    void printInfos(){
        System.out.println("Doctor's name: " + doctorName);
        System.out.println("ID: " + doctorID);
        System.out.println("Specialty: " + doctorSpecialty);
        System.out.println("Experiment(Year): " + doctorExperiment);
    }

    public String getDoctorSpecialty() {
        return doctorSpecialty;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public int getDoctorExperiment() {
        return doctorExperiment;
    }

    public void setDoctorSpecialty(String doctorSpecialty) {
        this.doctorSpecialty = doctorSpecialty;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public void setDoctorExperiment(int doctorExperiment) {
        this.doctorExperiment = doctorExperiment;
    }

}
