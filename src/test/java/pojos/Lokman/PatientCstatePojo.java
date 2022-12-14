package pojos.Lokman;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class PatientCstatePojo {
    /*
    "cstate": {
        "name": "Ankara",
     */
    private String name;

    public PatientCstatePojo() { }

    public PatientCstatePojo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PatientCstatePojo{" +
                "name='" + name + '\'' +
                '}';
    }
}
