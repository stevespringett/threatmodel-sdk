package us.springett.threatmodeling.model;

/**
 * The dataflow between two components.
 * TODO: Add the source, destination and additional details about the flow
 *
 * @since 1.0.0
 */
public class DataFlow {
    String id;
    String name;

    public DataFlow(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
