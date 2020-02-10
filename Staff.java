package advance_programming;

public class Staff {

    String JoiningDate;
    String Education;

    Staff() {

    }

    Staff(String joinDate, String educ) {
        JoiningDate = joinDate;
        Education = educ;
    }

    void PrintStaff() {
        System.out.println("Joining Date :: " + JoiningDate);
        System.out.println("Education :: " + Education);
        System.out.println();
    }
}
