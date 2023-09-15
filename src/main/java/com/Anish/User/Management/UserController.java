package com.Anish.User.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
     List<User> userList; //1

    //Get AddUser   in user Management

    @PostMapping("Adduser")
     public String addUser(@RequestBody User myUser) {
        /* 1 */
         userList.add(myUser);
         return "Add User";
    }

    // getUser api

    //get all User Management:

    @GetMapping("UsersManagementGet")
    public List<User> getAllUser() {
       return userList;
     }

    //update Information in User Management  :

    // send a info,Userid :id1 and Name for Updating Because UserId is Same as for Any One.

     @PutMapping("User/UserId/{UserId}/UserName")
     public String setUserIdAndUserName(@PathVariable Integer UserId,@RequestParam String UserName) {
         for (User user : userList) {
            if(user.getUserId().equals(UserId)){  //1
                 user.setUserName(UserName);  //2
                return "User is"+" "+UserId+" "+"Updated Now"+" "+UserName;
            }
         }
         return "Invalid UserId and User Name";
     }

    //delete api in User Management System

    //Delete an Api in UserManagement System.
     @DeleteMapping("User/UserId/{UserId}")
     public String removeUserId(@PathVariable Integer UserId) {
        for(User user : userList){
            if(user.getUserId().equals(UserId)){
                userList.remove(user);
                return "User"+" "+UserId+" "+"Removed";
            }
        }
        return "Invalid UserId";
     }
}
