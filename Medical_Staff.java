package advance_programming;

public class Medical_Staff extends Staff {

    Doctor d;
    Nurse n;

    public Medical_Staff() {

    }

    Medical_Staff(String name, int id, String speciality) {
        d = new Doctor();
        d.docName = name;
        d.docID = id;
        d.Speciality = speciality;
    }

    @Override
    void PrintStaff() {
        d.PrintDoctorInfo();
        super.PrintStaff();
    }
}
