package jeeproject.domain.model;
public class LoginBean {
    
    private int id;
    private String name;
    private String password;

    public LoginBean(int ID, String userName, String userPass) {
        id = ID;
        name = userName;
        password = userPass;
    }
    
    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String pass) {
        this.password = pass;
    }
    
    @Override
    public String toString() {
        String tmp = id+" "+name+" "+password;
        return tmp;
    }
}
