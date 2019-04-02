package jeeproject.domain.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "UserAccounts")
public class UserAccount implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @OneToOne
    @JoinColumn(name="TypeId",referencedColumnName="id")
	private Type type;
    
    @OneToOne
    @JoinColumn(name="AddressId",referencedColumnName="id")
	private Address address;
    
    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;
     
    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "Password")
    private String password;
    
    @Column(name = "PHONE")
    private String phone;
    
    @Column(name = "UserActive")
    private String userActive;
  
    @Column(name = "CreationDate")    
    @Temporal(TemporalType.DATE)
    private Date creationDate;
    
    @Column(name = "LastModificationDate")    
    @Temporal(TemporalType.DATE)
    private Date lastModificationDate;

    @Column(name = "ResetPasswordLink")
    private String resetPasswordLink;
    
    @Column(name = "ResetLinkValidateDate")    
    @Temporal(TemporalType.DATE)
    private Date resetLinkValidateDate;
    
    @Column(name = "IsRemoved")
    private String isRemoved;
    
//getter et setter    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserActive() {
        return userActive;
    }

    public void setUserActive(String userActive) {
        this.userActive = userActive;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public String getResetPasswordLink() {
        return resetPasswordLink;
    }

    public void setResetPasswordLink(String resetPasswordLink) {
        this.resetPasswordLink = resetPasswordLink;
    }

    public Date getResetLinkValidateDate() {
        return resetLinkValidateDate;
    }

    public void setResetLinkValidateDate(Date resetLinkValidateDate) {
        this.resetLinkValidateDate = resetLinkValidateDate;
    }

    public String getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(String isRemoved) {
        this.isRemoved = isRemoved;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
    
}


/*
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
*/
//    @Id
//    @Column(name = "CUSTOMER_ID")
//    private int id;
//    
//    @Column(name = "DISCOUNT_CODE")
//    private String DiscountCode;
//    
//    @Column(name = "ZIP")
//    private String Zip;
//    
//    @Column(name = "NAME")
//    private String Name;
//    
//    @Column(name = "ADDRESSLINE1")
//    private String AddressLine1;
//    
//    @Column(name = "ADDRESSLINE2")
//    private String AddressLine2;
//    
//    @Column(name = "CITY")
//    private String City;
//    
//    @Column(name = "STATE")
//    private String State;
//    
    
//    
//    @Column(name = "FAX")
//    private String Fax;
//    

//    
//    @Column(name = "CREDIT_LIMIT")
//    private String CreditLimit;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getDiscountCode() {
//        return DiscountCode;
//    }
//
//    public void setDiscountCode(String DiscountCode) {
//        this.DiscountCode = DiscountCode;
//    }
//
//    public String getZip() {
//        return Zip;
//    }
//
//    public void setZip(String Zip) {
//        this.Zip = Zip;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String Name) {
//        this.Name = Name;
//    }
//
//    public String getAddressLine1() {
//        return AddressLine1;
//    }
//
//    public void setAddressLine1(String AddressLine1) {
//        this.AddressLine1 = AddressLine1;
//    }
//
//    public String getAddressLine2() {
//        return AddressLine2;
//    }
//
//    public void setAddressLine2(String AddressLine2) {
//        this.AddressLine2 = AddressLine2;
//    }
//
//    public String getCity() {
//        return City;
//    }
//
//    public void setCity(String City) {
//        this.City = City;
//    }
//
//    public String getState() {
//        return State;
//    }
//
//    public void setState(String State) {
//        this.State = State;
//    }
//
//    public String getPhone() {
//        return Phone;
//    }
//
//    public void setPhone(String Phone) {
//        this.Phone = Phone;
//    }
//
//    public String getFax() {
//        return Fax;
//    }
//
//    public void setFax(String Fax) {
//        this.Fax = Fax;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//
//    public void setEmail(String Email) {
//        this.Email = Email;
//    }
//
//    public String getCreditLimit() {
//        return CreditLimit;
//    }
//
//    public void setCreditLimit(String CreditLimit) {
//        this.CreditLimit = CreditLimit;
//    }
//*/


///////////////////////////////////////////////////////////////////////////
//初始model 包含测试的方法
/*@Entity
@Table(name = "UserAccounts")
public class UserAccount implements Serializable {

    @Id
    @Column(name = "id")
    private int ID;

    @Column(name = "name")
    private String name;

    @Column(name = "test")
    private String test;
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
*/
//    @Id
//    @Column(name = "CUSTOMER_ID")
//    private int id;
//    
//    @Column(name = "DISCOUNT_CODE")
//    private String DiscountCode;
//    
//    @Column(name = "ZIP")
//    private String Zip;
//    
//    @Column(name = "NAME")
//    private String Name;
//    
//    @Column(name = "ADDRESSLINE1")
//    private String AddressLine1;
//    
//    @Column(name = "ADDRESSLINE2")
//    private String AddressLine2;
//    
//    @Column(name = "CITY")
//    private String City;
//    
//    @Column(name = "STATE")
//    private String State;
//    
//    @Column(name = "PHONE")
//    private String Phone;
//    
//    @Column(name = "FAX")
//    private String Fax;
//    
//    @Column(name = "EMAIL")
//    private String Email;
//    
//    @Column(name = "CREDIT_LIMIT")
//    private String CreditLimit;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getDiscountCode() {
//        return DiscountCode;
//    }
//
//    public void setDiscountCode(String DiscountCode) {
//        this.DiscountCode = DiscountCode;
//    }
//
//    public String getZip() {
//        return Zip;
//    }
//
//    public void setZip(String Zip) {
//        this.Zip = Zip;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String Name) {
//        this.Name = Name;
//    }
//
//    public String getAddressLine1() {
//        return AddressLine1;
//    }
//
//    public void setAddressLine1(String AddressLine1) {
//        this.AddressLine1 = AddressLine1;
//    }
//
//    public String getAddressLine2() {
//        return AddressLine2;
//    }
//
//    public void setAddressLine2(String AddressLine2) {
//        this.AddressLine2 = AddressLine2;
//    }
//
//    public String getCity() {
//        return City;
//    }
//
//    public void setCity(String City) {
//        this.City = City;
//    }
//
//    public String getState() {
//        return State;
//    }
//
//    public void setState(String State) {
//        this.State = State;
//    }
//
//    public String getPhone() {
//        return Phone;
//    }
//
//    public void setPhone(String Phone) {
//        this.Phone = Phone;
//    }
//
//    public String getFax() {
//        return Fax;
//    }
//
//    public void setFax(String Fax) {
//        this.Fax = Fax;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//
//    public void setEmail(String Email) {
//        this.Email = Email;
//    }
//
//    public String getCreditLimit() {
//        return CreditLimit;
//    }
//
//    public void setCreditLimit(String CreditLimit) {
//        this.CreditLimit = CreditLimit;
//    }
//

 



