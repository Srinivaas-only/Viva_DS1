package Task1;

public class Main {
    public static void main(String[] args) {
        //Step 1:Create course objects 2 each
        LectureCourse lec1 = new LectureCourse("WIA1002", "Data Structure", "Dr. Zainab Malik", 3);
        LectureCourse lec2 = new LectureCourse("WIA1005", "Network Technology", "Prof. Lee", 4);
        LabCourse lab1 = new LabCourse("WIA1002L", "Data Structure Lab", "Dr. Uzair Ishtiaq", 2.5, 2);
        LabCourse lab2 = new LabCourse("WIA1005L", "Network Technology Lab", "Dr. Brown", 2.0, 1);

        // Step 2: Create a CourseManager instance
        CourseManager<Course> manager = new CourseManager<>();

        // Step 3: Add all courses to the manager
        System.out.println("===== Adding Courses =====");
        manager.addCourse(lec1);
        manager.addCourse(lec2);
        manager.addCourse(lab1);
        manager.addCourse(lab2);
        System.out.println();

        // Step 4: Print the course with the highest total worklaod
        System.out.println("===== Course with Highest Workload =====");
        Course highest = manager.getCourseWithHighestWorkload();
        if(highest != null){
            highest.printCourseDetails();
        }
        System.out.println();

        //Step 5; Sort courses by workload and print all
        System.out.println("===== Sorting Courses by Workload =====");
        manager.sortCoursesByWorkload();
        manager.printAllCourses();
        System.out.println();

        //Step 6: Remove a course and print remaining
        System.out.println("===== Removing a Course =====");
        manager.removeCourse("WIA1005L");
        System.out.println();
        manager.printAllCourses();
    }
}
