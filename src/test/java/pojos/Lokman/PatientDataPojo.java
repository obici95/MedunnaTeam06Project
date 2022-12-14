package pojos.Lokman;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class PatientDataPojo {
    /*
    {


    "firstName": "lokmanfake",
    "lastName": "user",
    "birthDate": "2000-12-10T22:00:00Z",
    "phone": "5355353535",
    "gender": "MALE",
    "bloodGroup": "Apositive",
    "adress": "merkez ankara",
    "email": "unvalidq@gmail.com",
    "description": "yeni hasta",
    "country": {
        "name": "Türkiyem"
    },
    "cstate": {
        "name": "Ankara",
    }
}
     */

    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String email;
    private String description;
    private PatientCountryPojo country;
    private PatientCstatePojo cstate;

    public PatientDataPojo() { }

    public PatientDataPojo(String firstName, String lastName, String birthDate, String phone, String gender,
                           String bloodGroup, String adress, String email, String description,
                           PatientCountryPojo country, PatientCstatePojo cstate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.email = email;
        this.description = description;
        this.country = country;
        this.cstate = cstate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PatientCountryPojo getCountry() {
        return country;
    }

    public void setCountry(PatientCountryPojo country) {
        this.country = country;
    }

    public PatientCstatePojo getCstate() {
        return cstate;
    }

    public void setCstate(PatientCstatePojo cstate) {
        this.cstate = cstate;
    }

    @Override
    public String toString() {
        return "PatientDataPojo{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", country=" + country +
                ", cstate=" + cstate +
                '}';
    }
}
