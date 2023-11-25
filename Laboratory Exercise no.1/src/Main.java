public class Main {
    public static void main(String[] args) {
        
        Student student = new Student("Jaysash Gundaya", 2001, "Programming");

        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Year of Birth: " + student.getYearOfBirth());
        System.out.println("Major: " + student.getMajor());
        System.out.println(student);

        System.out.println();

        Instructor instructor = new Instructor("Ma'am Phoebe Ruth Alithea Sudaria", 1987, 69000.0);

        System.out.println("Instructor Information:");
        System.out.println("Name: " + instructor.getName());
        System.out.println("Year of Birth: " + instructor.getYearOfBirth());
        System.out.println("Salary: P" + instructor.getSalary());
        System.out.println(instructor);
    }
}
