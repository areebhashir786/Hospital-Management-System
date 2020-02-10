package advance_programming;

import java.util.*;

public class List {

    Faisal_Hospital h;
    ArrayList<Faisal_Hospital> EntranceList;
    ArrayList<Faisal_Hospital> PatientList;
    ArrayList<Faisal_Hospital> StaffList;

    public List() {
    }

    void addEnterRecord(ArrayList<Faisal_Hospital> a) {
        EntranceList = a;
    }

    void addPatientRecord(ArrayList<Faisal_Hospital> a1) {
        PatientList = a1;
    }

    void addStaffRecord(ArrayList<Faisal_Hospital> a2) {
        StaffList = a2;
    }

    void PrintEntryRecord() {
        System.out.println("\tHospital Entry Record:: ");
        if (EntranceList != null) {
            for (Faisal_Hospital s : EntranceList) {
                if (s != null) {
                    s.PrintEntryRecord();
                }

            }
        }
    }

    void PrintPatientRecord() {
        System.out.println("\tPatient Record:: ");
        if (PatientList != null) {
            for (Faisal_Hospital s2 : PatientList) {
                if (s2 != null) {
                    s2.w.p1.Display_Patient();
                }
            }
        }
    }

    void PrintStaffRecord() {
        System.out.println("\tMedical Staff Details:");
        if (StaffList != null) {
            for (Faisal_Hospital f : StaffList) {
                if (f != null) {
                    f.s.PrintStaff();
                    //f.PrintEntryRecord();
                }

            }
        }
    }
}
