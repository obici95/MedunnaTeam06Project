package pojos.Lokman;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class PatientCountryPojo {
    /*
     "country": {
        "name": "Türkiyem"
    },
     */
    private String name;

    public PatientCountryPojo() {
    }

    public PatientCountryPojo(String name) {
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
        return "PatientCountryPojo{" +
                "name='" + name + '\'' +
                '}';
    }
}
