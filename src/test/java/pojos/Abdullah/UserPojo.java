package pojos.Abdullah;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPojo {
    /*
    {
        "id": 3309,
        "login": "jonathan",
        "firstName": "Gok",
        "lastName": "Ahmet1",
        "ssn": "128-65-1234",
        "email": "ahmet@gmail.com",
        "imageUrl": null,
        "activated": true,
        "langKey": "en",
        "createdBy": "anonymousUser",
        "createdDate": "2021-12-25T15:59:36.508061Z",
        "lastModifiedBy": "team08",
        "lastModifiedDate": "2022-11-21T06:02:12.860169Z",
        "authorities": [
            "ROLE_PATIENT",
            "ROLE_PHYSICIAN",
            "ROLE_STAFF",
            "ROLE_ADMIN"
        ]
    },
     */
    //1) Tüm keyler için private variable'lar oluşturuyoruz
    private Integer id;
    private String login;
    private String firstName;
    private String lastName;
    private String ssn;
    private String email;
    private Object imageUrl;
    private Boolean activated;
    private String langKey;
    private String createdBy;
    private String createdDate;
    private String lastModifiedBy;
    private String lastModifiedDate;
    private ArrayList<String> authorities;

    private String password;


    //2) parametreli ve parametresiz Constructorlar oluşturuyoruz


    public UserPojo(Integer id, String login, String firstName, String lastName, String ssn, String email, Object imageUrl, Boolean activated, String langKey, String createdBy, String createdDate, String lastModifiedBy, String lastModifiedDate, ArrayList<String> authorities) {
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.email = email;
        this.imageUrl = imageUrl;
        this.activated = activated;
        this.langKey = langKey;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.authorities = authorities;
    }

    public UserPojo() {
    }

    public UserPojo(Integer id, String login, String firstName, String lastName, String ssn, String email, Object imageUrl, Boolean activated, String langKey, String createdBy, String createdDate, String lastModifiedBy, String lastModifiedDate, ArrayList<String> authorities, String password) {
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.email = email;
        this.imageUrl = imageUrl;
        this.activated = activated;
        this.langKey = langKey;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.authorities = authorities;
        this.password = password;
    }
    //3 public getter ve setter methodlari oluşturuyoruz

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public ArrayList<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(ArrayList<String> authorities) {
        this.authorities = authorities;
    }

    //4)toString methodu oluşturuyoruz

    @Override
    public String toString() {
        return "MedunnaUserPogo{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", email='" + email + '\'' +
                ", imageUrl=" + imageUrl +
                ", activated=" + activated +
                ", langKey='" + langKey + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}
