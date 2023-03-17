public class Doctor {
    String doctorName;
    String doctorSpecialty;
    int doctorID;
    int doctorExperiment;

    Doctor(String doctorName, String doctorSpecialty,
           int doctorID, int doctorExperiment){
        this.doctorName = doctorName;
        this.doctorSpecialty = doctorSpecialty;
        this.doctorID = doctorID;
        this.doctorExperiment = doctorExperiment;
    }

    void printInfos(){
        System.out.println("Doctor's name: " + doctorName);
        System.out.println("ID: " + doctorID);
        System.out.println("Specialty: " + doctorSpecialty);
        System.out.println("Experiment(Year): " + doctorExperiment);
    }



}
