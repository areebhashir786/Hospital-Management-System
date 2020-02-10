package advance_programming;

public class OrthopedicWard extends Ward {

    Patient p2;

    OrthopedicWard() {

    }

//    void SetOrthopedicWard(String name, int id,String gender){
//        p2.PatientName = name;
//        p2.PatientID = id;
//        p2.PatientGender = gender;
//    }
    
    void PrintOrthopedicWard() {
        System.out.println("This is Orthopedic Ward");
        System.out.println("Patient List in Orthopedic Ward");
        p2.Display_Patient();
    }
}
