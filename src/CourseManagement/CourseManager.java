package Task1;

import java.util.ArrayList;

public class CourseManager<T extends Course> {
    private ArrayList<T> courses;

    /**
     * Constructor inlitialsizes an empty list of courses.
     */
    public CourseManager(){
        courses = new ArrayList<>();
    }

    /**
     * Adds a course to the manager's collection.
     * @param course The course object to be added.
     */
    public void addCourse(T course){
        courses.add(course);
        System.out.println("Course added: " + course.getCourseCode() + " - " + course.getCourseTitle());
    }
    /**
     * Removes a course from the collection by its unique course code.
     * Iterates through the list to find and remove the matching course.
     * @param courseCode The course code of the course to be removed.
     */
    public void removeCourse(String courseCode){
        for(int i =0; i< courses.size(); i++){
            if(courses.get(i).getCourseCode().equals(courseCode)){
                System.out.println("Course removed: " + courses.get(i).getCourseCode() + " - " + courses.get(i).getCourseTitle());
                courses.remove(i);
                return;
            }
        }
        System.out.println("Course with code "+ courseCode + " not found.");
    }
    /**
     * Finds and returns the course with the highest total workload.
     * Compares all courses in the list by their calculateTotalWorkload() value.
     * @return The course with the highest workload, or null if the list is empty.
     */
    public T getCourseWithHighestWorkload() {
        if(courses.isEmpty()){
            System.out.println("No courses available");
            return null;
        }
        T highest = courses.get(0);
        for(int i =1; i < courses.size(); i++){
            if(courses.get(i).calculateTotalWorkload() > highest.calculateTotalWorkload()){
                highest = courses.get(i);
            }
        }
        return highest;
    }
    /**
     * Sorts all courses in the collection by their total workload in ascending order.
     * Uses a simple bubble sort algorithm to compare and swap courses.
     */
    public void sortCoursesByWorkload() {
        for (int i = 0; i < courses.size() - 1; i++) {
            for (int j = 0; j < courses.size() - 1 - i; j++) {
                if (courses.get(j).calculateTotalWorkload() > courses.get(j + 1).calculateTotalWorkload()) {
                    // Swap
                    T temp = courses.get(j);
                    courses.set(j, courses.get(j + 1));
                    courses.set(j + 1, temp);
                }
            }
        }
        System.out.println("Courses sorted by workload (ascending).");
    }
    /**
     * Prints the details of all courses currently in the collection.
     * Calls printCourseDetails() on each course object.
     */
    public void printAllCourses(){
        if(courses.isEmpty()){
            System.out.println("No courses to display.");
            return;
        }
        System.out.println("========== All Courses ==========");
        for(T course: courses){
            course.printCourseDetails();
            System.out.println("---------------------------------");
        }
    }




}
