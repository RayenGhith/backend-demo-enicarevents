package web.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.demo.dbutil.DBUtil;
import web.demo.model.*;
import web.demo.repo.AdminRepository;
import web.demo.service.AdminService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class adminServiceimpl implements AdminService {


    Connection connection;
    @Autowired
    private AdminRepository adminrepository;

    @Override
    public Admin createAdmin(Admin ad) {
        return adminrepository.save(ad);
    }

    @Override
    public List<Admin> getAdmins() {
        return ((List<Admin>) adminrepository.findAll());
    }

    @Override
    public Admin getAdminbyId(Integer id) {
        return adminrepository.findById(id).get();
    }

    @Override
    public void deleteAdmin(Integer id) {
        adminrepository.deleteById(id);
    }

    @Override
    public Admin updateAdmin(Admin a, Integer id) {
        Admin Admin = adminrepository.findById(id).get();
        Admin.setCin(a.getCin());
        Admin.setMail(a.getMail());
        Admin.setUsername(a.getUsername());
        Admin.setPassword(a.getPassword());
        return adminrepository.save(Admin);
    }


    //login part later
    //Connection connection;
    int flag=0;
    public adminServiceimpl() throws SQLException {
        connection= DBUtil.getConnection();
    }

    @Override
    public int loginValidation(String username, String password) {
        try {
            PreparedStatement statement= connection
                    .prepareStatement("select * from admin where username='"+username+"'");
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                if(rs.getString(1).equals(username) && rs.getString(3).equals(password)){
                    flag=1;
                }else{
                    System.out.println("Invalid username or password");
                    flag=0;
                };
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
