package advance_programming;

public class ChildrenWard extends Ward {

    Patient p1;
    
    ChildrenWard() {
        
    }
    
//    void SetChildrenWard(String name, int id,String gender){
//        p1.PatientName = name;
//        p1.PatientID = id;
//        p1.PatientGender = gender;
//    }
    
    void PrintChildrenWard() {
        System.out.println("This is Children Ward");
        System.out.println("Patient List in Children Ward");
        p1.Display_Patient();
    }

}
