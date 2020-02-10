package advance_programming;

import java.util.*;
//import java.util.ArrayList;

public class Patient {

    String PatientName;
    int PatientID;
    String PatientGender;
    // int Count;
 //   List l;

    Patient() {

    }

    Patient(String patient_name, int patient_id, String gender) {
       // this.PatientName = patient_name;
       // this.PatientID = patient_id;
        //this.PatientGender = gender;
    }

    void SetPatient(String patient_name, int patient_id, String gender) {    
        this.PatientName = patient_name;
        this.PatientID = patient_id;       
        this.PatientGender = gender;
    }

    void Display_Patient() {
        System.out.println("Patient Name :: " + PatientName);
        System.out.println("Patient ID :: " + PatientID);
        System.out.println("Patient Gender :: " + PatientGender);
        System.out.println();
    }
}
