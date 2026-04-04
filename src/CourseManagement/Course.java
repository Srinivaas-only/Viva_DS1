package Task1;

public interface Course {
    /*
     *Returns the course's unique code.
     *@return A String representing the course code (e.g WIX1002)
     */
    String getCourseCode();
    /*
     *Returns the course's title .
     *@return A String representing the course title (e.g., "Fundamentals Of Programming").
     */
    String getCourseTitle();
    /**
     * Calculates and returns the total workload hours for the course per semester.
     * The calculation method may vary depending on the type of course.
     * @return int representing total workload hours in the semester.
     */
    int calculateTotalWorkload();

    /**
     * Returns the name of the instructor assigned to this course.
     * @return A String representing the instructor's name.
     */
    String getInstructorName();

    /**
     * Prints all relevant information about the course to the console
     * This includes course code,title,instructor, and workload details.
     */
    void printCourseDetails();
}
