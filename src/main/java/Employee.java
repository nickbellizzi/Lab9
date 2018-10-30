/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/9/">Lab 9 Description</a>
 */
public class Employee {

    /** Name of the employee. */
    private String name;
    /** Name of the manager. */
    private String manager;

    /**
     * Constructor for initialization.
     * @param n name of the employee
     * @param m name of the manager
     */
    public Employee(final String n, final String m) {
        this.name = n;
        this.manager = m;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param n new name of the employee
     */
    public void setName(final String n) {
        this.name = n;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param m name of the new manager
     */
    public void setManager(final String m) {
        this.manager = m;
    }
}
