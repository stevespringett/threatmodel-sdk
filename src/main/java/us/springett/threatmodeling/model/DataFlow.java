package us.springett.threatmodeling.model;

/**
 * The dataflow between two assets.
 *
 * @since 1.0.0
 */
public class DataFlow {
    String id;
    String name;
    Asset source;
    Asset destination;

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

    public Asset getDestination() {
        return destination;
    }

    public void setDestination(Asset destination) {
        this.destination = destination;
    }

    public Asset getSource() {
        return source;
    }

    public void setSource(Asset source) {
        this.source = source;
    }
}
