package advance_programming;

import java.util.*;

class Faisal_Hospital {

    String Name;
    String birthDate;
    String Gender;
    Ward w;
    Staff s;

    Faisal_Hospital() {
        w = new Ward();
        s = new Staff();
    }

    Faisal_Hospital(String name, String birthdate, String gender) {
        Name = name;
        birthDate = birthdate;
        Gender = gender;
    }

    void SetPatients(String name, int patientId, String gender) {
        w.p1.SetPatient(name, patientId, gender);
    }

    void SetStaff(String name, int id, String educ, String speciality, String joinDate) {

        s = new Medical_Staff(name, id, speciality);
        s.Education = educ;
        s.JoiningDate = joinDate;

    }

    void PrintEntryRecord() {

        System.out.println("Name :: " + Name);
        System.out.println("BirthDate :: " + birthDate);
        System.out.println("Gender :: " + Gender);
        System.out.println();
    }
}

public class Advance_Programming {

    public static void main(String[] args) {
        // ENTRANCE RECORD
        Faisal_Hospital h1 = new Faisal_Hospital("Ali", "2/3/1999", "Male");
        Faisal_Hospital h2 = new Faisal_Hospital("Ayesha", "2/3/2002", "Female");
        Faisal_Hospital h3 = new Faisal_Hospital("Hassan", "8/8/2001", "Male");

        ArrayList<Faisal_Hospital> Arr1 = new ArrayList<Faisal_Hospital>();
        Arr1.add(h1);
        Arr1.add(h2);
        Arr1.add(h3);

        List L1 = new List();
        L1.addEnterRecord(Arr1);
        L1.PrintEntryRecord();

        // PATIENT RECORD
        Faisal_Hospital h4 = new Faisal_Hospital();
        Faisal_Hospital h5 = new Faisal_Hospital();
        Faisal_Hospital h6 = new Faisal_Hospital();
        Faisal_Hospital h11 = new Faisal_Hospital();
        h4.SetPatients("Taha", 4121, "Male");
        h5.SetPatients("Usman", 4122, "Male");
        h6.SetPatients("Nida", 4123, "Female");
      //  h11.SetPatients("Nida", 4123, "Female");

        ArrayList<Faisal_Hospital> Arr2 = new ArrayList<Faisal_Hospital>();
        Arr2.add(h4);
        Arr2.add(h5);
        Arr2.add(h6);
        Arr2.add(h11);
        List L2 = new List();
        L2.addPatientRecord(Arr2);
        L2.PrintPatientRecord();
//         int length = L2.PatientList.size();
//        for (int i = 0; i < length; i++) {
//            if (L2.PatientList.get(i).w.p1.PatientID == patientId) {
//                //System.out.println(name + " with " + patientId + " has already visited");
//                break;
//            }
//        }
        

        //STAFF RECORD
        Faisal_Hospital h7 = new Faisal_Hospital();
        Faisal_Hospital h8 = new Faisal_Hospital();
        Faisal_Hospital h9 = new Faisal_Hospital();
        h7.SetStaff("Dr.Sarim", 2314, "MBBS", "Child spec", "5/7/2");
        h8.SetStaff("Dr.Aswand", 2315, "MBBS", "Surgical spec", "2/1/20");
        h9.SetStaff("Dr.Amir", 2316, "MBBS", "Child spec", "4/1/20");
        ArrayList<Faisal_Hospital> Arr3 = new ArrayList<Faisal_Hospital>();
        Arr3.add(h7);
        Arr3.add(h8);
        Arr3.add(h9);
        List L3 = new List();
        L3.addStaffRecord(Arr3);
        L3.PrintStaffRecord();

    }
}
