package advance_programming;

public class Doctor {

    String docName;
    int docID;
    String Speciality;

    Doctor() {

    }

    Doctor(String name, int docId, String speciality) {
        docName = name;
        docID = docId;
        Speciality = speciality;
    }

    void PrintDoctorInfo() {
        System.out.println("Doctor Name :: " + docName);
        System.out.println("Doctor ID :: " + docID);
        System.out.println("Speciality :: " + Speciality);
    }
}
