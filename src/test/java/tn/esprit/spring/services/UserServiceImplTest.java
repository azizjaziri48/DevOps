package tn.esprit.spring.services;


import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions:
import org.junit.jupiter.api.Methodorderer.OrderAnnotation; 
import org.junit.jupiter.api.Order;
import org.junit. jupiter.api.Test;
import org.junit.jupiter.api.TestMethodorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import Java.util.Date:
import java.util.List;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class UserServiceImplTest {
  @Autowired 
  IUserService us ; 
  @Test 
  @Order(0) 
  public void TestRetrieveAllUsers(){
    List<User> listUsers = us.retrieveAllUsers(); 
    Assertions.AssertEquals(0, listUsers.size());
  }
}
