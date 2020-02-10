
package advance_programming;


public class Technician{
    String Name;
    String TechId;
    
    public Technician(String name, String techid) {
        Name = name;
        TechId = techid;
    }
    
    void PrintTechnicianInfo() {
        System.out.println("Name :: " + Name);
        System.out.println("TechID :: " + TechId);
    }
    
}
