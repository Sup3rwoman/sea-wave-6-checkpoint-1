package dev.wilders;

public class ITPersonRepair {

    public static String repairName(ITPerson person) {
        // Get the name of the ITPerson, repair it and return the new name
        // EG: person.getName() -> "Super_Admin" -> return "Super Admin"
        if(person.getName().contains("_")){
            String[] splitName = person.getName().split("_");
            return (splitName[0] + " " + splitName[1]);
        }else{
            return person.getName();
        }
    }
}
