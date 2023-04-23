package web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import web.demo.model.*;
import web.demo.service.AdminService;

import java.util.List;




@RestController
@CrossOrigin(origins = "*")
public class AdminController {


    @Autowired
    private AdminService adminservice;

    @PostMapping("/admin/add")
    public Admin createAdmin(@RequestBody Admin adm){
        Admin Admin1 = adminservice.createAdmin(adm);
        return Admin1;
    }
    @GetMapping("/admin/getall")
    public List<Admin> getAllAdmins(){
        return adminservice.getAdmins();
    }
    @PutMapping("/admin/update/{id}")
    public Admin updateAminbyid(@RequestBody Admin Admin, @PathVariable("id") int id){
         return  adminservice.updateAdmin(Admin,id);
    }
    @DeleteMapping("/admin/delete/{id}")
    public String deleteadmin(@PathVariable("id") int id){
        adminservice.deleteAdmin(id);
        return "admin deleted successfully";
    }
    @GetMapping("/admin/getadminbyid/{id}")
    public Admin getadminbyid(@PathVariable("id") int id){
        return adminservice.getAdminbyId(id);
    }








    //login later
    @GetMapping("admin/{username2}/{password2}")
    //@CrossOrigin(origins = "http://localhost:4200/")
    public int adminlogin(@PathVariable("username2") String username1,@PathVariable("password2") String password1){
        int flag= adminservice.loginValidation(username1, password1);
        if(flag==0){
            return  0;
        }
        else{
            return flag;
        }
    };
}
