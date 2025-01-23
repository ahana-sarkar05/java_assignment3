public class StudentArray {
    public static void main(String[] args) {
        if (args.length != 9) { 
            return;
        }

      
        int[] rolls = new int[3];
        String[] names = new String[3];
        double[] marks = new double[3];

      
        for (int i = 0; i < 3; i++) {
            rolls[i] = Integer.parseInt(args[i * 3]);      
            names[i] = args[i * 3 + 1];                  
            marks[i] = Double.parseDouble(args[i * 3 + 2]);
        }

    
        System.out.println("Initial Student Details:");
        printStudents(rolls, names, marks);

        
        updateMarks(rolls, names, marks, 102, "OCJP"); 
        updateMarks(rolls, names, marks, 103, "GCP"); 

      
        System.out.println("Updated Student Details:");
        printStudents(rolls, names, marks);
    }

  
    public static void updateMarks(int[] rolls, String[] names, double[] marks, int rollToUpdate, String certification) {
        int index = -1;

   
        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] == rollToUpdate) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Student with roll " + rollToUpdate + " not found.");
            return;
        }

     
        double increment = 0;
        switch (certification.toUpperCase()) {
            case "OCJP":
                increment = 90;
                break;
            case "OCA":
                increment = 80;
                break;
            case "MCSA":
                increment = 77;
                break;
            case "GCP":
                increment = 92;
                break;
            default:
                System.out.println("Invalid certification: " + certification);
                return;
        }

        
        marks[index] += increment;
        System.out.println("Updated marks for " + names[index] + " (Roll: " + rolls[index] + ") with " + certification + ": " + marks[index]);
    }

  
    public static void printStudents(int[] rolls, String[] names, double[] marks) {
        for (int i = 0; i < rolls.length; i++) {
            System.out.println("Roll: " + rolls[i] + ", Name: " + names[i] + ", Marks: " + marks[i]);
        }
    }
}
