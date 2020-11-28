package fact.it.mvc1oef1.model;

public class Activiteit {
    private String omschrijving, dag;

    public Activiteit(String omschrijving, String dag) {
        this.omschrijving = omschrijving;
        this.dag = dag;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getDag() {
        return dag;
    }

    public void setDag(String dag) {
        this.dag = dag;
    }
}
