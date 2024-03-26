package learn.fpoly.restapi.model;

public class Distributor {
    private String _id;
    private String name;

    public Distributor(String _id, String name) {
        this._id = _id;
        this.name = name;
    }

    public Distributor() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
