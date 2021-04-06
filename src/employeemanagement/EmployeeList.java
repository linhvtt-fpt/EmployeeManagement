/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thuy Linh
 */
public class EmployeeList {
    private List<EmployeeDTO> list=new ArrayList<>();
    private EmployeeDTO dto=new EmployeeDTO();
    public List<EmployeeDTO> getAll(){
       return list;
    }
    public EmployeeDTO findID(String id){
        for(int i=0;i<list.size();i++){
            dto=list.get(i);
            if(dto.getEmpID().equals(id)){               
                return dto;
            }
        }
        return null;
    }
    public void AddEmployee(EmployeeDTO dto){
       list.add(dto);
    }
    public boolean UpdateEmployee(EmployeeDTO dto){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getEmpID().equals(dto.getEmpID())){
                list.set(i, dto);
                return true;
            }
        }
        return false;
    }
    public boolean RemoveEmployee(String id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getEmpID().equals(id)){
                  dto= new EmployeeDTO(list.get(i).getEmpID(), list.get(i).getFullname(), list.get(i).getPhone(), list.get(i).getEmail(), list.get(i).getAddress(),list.get(i).getDateOfBirth(), true);
                  list.set(i, dto);
//                list.remove(i);
                return true;
            }
        }
        return false;
    }
}
