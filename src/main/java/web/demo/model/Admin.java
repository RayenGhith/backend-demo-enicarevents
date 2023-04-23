package web.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
    @Id
    //@GeneratedValue
    Integer cin;
    String username;
    String mail;
    String password;


    public Admin(String username, Integer cin,String mail, String password) {
        super();
        this.username = username;
        this.cin = cin;
        this.mail = mail;
        this.password = password;
    }
    public Admin(){
        super();
    }

    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

