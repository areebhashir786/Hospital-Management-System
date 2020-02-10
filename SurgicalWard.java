package advance_programming;

public class SurgicalWard extends Ward {

    Patient p3;

    SurgicalWard() {

    }

//    void SetSurgicalWard(String name, int id, String gender) {
//        p3.PatientName = name;
//        p3.PatientID = id;
//        p3.PatientGender = gender;
//    }

    void PrintSurgicalWard() {
        System.out.println("This is Surgical Ward");
        System.out.println("Patient List in Surgical Ward");
        p3.Display_Patient();
    }
}
