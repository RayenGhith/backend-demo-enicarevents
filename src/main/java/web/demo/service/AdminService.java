package web.demo.service;

import org.springframework.stereotype.Service;
import web.demo.model.*;

import java.util.List;

@Service
public interface AdminService {
    public Admin createAdmin(Admin ad);

    public List<Admin> getAdmins();

    public Admin getAdminbyId(Integer id);
    public void deleteAdmin(Integer id);

    public Admin updateAdmin(Admin a , Integer id);
    public int loginValidation(String username,String password);
}
