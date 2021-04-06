package employeemanagement;


import java.util.Date;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thuy Linh
 */
public class EmployeeDTO {
    String EmpID,Fullname,Phone,Email,Address;
    Date DateOfBirth;
    boolean IsDelete;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String EmpID, String Fullname, String Phone, String Email, String Address, Date DateOfBirth, boolean IsDelete) {
        this.EmpID = EmpID;
        this.Fullname = Fullname;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.DateOfBirth = DateOfBirth;
        this.IsDelete = IsDelete;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

  

    

    public boolean isIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(boolean IsDelete) {
        this.IsDelete = IsDelete;
    }
    public Vector toVector(){
        Vector v= new Vector();
        v.add(EmpID);
        v.add(Fullname);
        v.add(Phone);
        v.add(Email);
        return v;
    }
    
}
