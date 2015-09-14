import java.util.Date;

/**
 * Created by Jeremy on 9/12/2015.
 */
public class Guest {

    private String firstName;
    private String lastName;
    private String occupants;
    private String remarks;
    private String gender;
    private String ethnicity;
    private String city;
    private String country;
    private String email;
    private String address;
    private String state;
    private int age;
    private int telephoneNumber;
    private Date birthDate;

    CreditCard card = new CreditCard();






    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    private int zip;









   //setters

    public void setState(String state) {
        this.state = state;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOccupants(String occupants) {
        this.occupants = occupants;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }



//Getters
    public String getState() {
        return state;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getOccupants() {
        return occupants;
    }

    public String getRemarks() {
        return remarks;
    }
    public Date getBirthDate() {
        return birthDate;
    }







}
