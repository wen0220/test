package fcu.sep.fcushop.controller;

import fcu.sep.fcushop.model.People;
import fcu.sep.fcushop.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Peoplecontroller.
 */

@RestController
public class PeopleController {

  @Autowired
  PeopleService peopleManager;


//  @RequestMapping(value = "/register_product", method = RequestMethod.GET)
//  @ResponseBody
//  public String registerProduct(
//      @RequestParam("account") String account,
//      @RequestParam("password") String password,
//      @RequestParam("name") String name,
//      @RequestParam("address") String address,
//      @RequestParam("birthday") String birthday,
//      @RequestParam("sex") String sex,
//      @RequestParam("mail") String mail
//  ) {
//    return peopleManager.aaRegister(account, password, name, address, birthday, sex, mail);
//  }

//  @RequestMapping(value = "/profile", method = RequestMethod.GET)
//  @ResponseBody
//  public String updatePeople(
//      @RequestParam("account") String account,
//      @RequestParam("password") String password,
//      @RequestParam("orginpass") String orginpass
//  ) {
//    return peopleManager.aaUpdatePeople(account, password, orginpass);
//  }

  /**
   * 登入.
   */
  @GetMapping("/products")
  public List<People> getProducts() {
    return peopleManager.getProducts();
  }

  @PostMapping("/login")//PostMapping
  public String login(
      @RequestParam("username") String name,
      @RequestParam("password") String password
  ) {
    return peopleManager.login(name, password);//name, password
  }
  /**
   * 註冊.
   */
//  @RequestMapping(value = "/register", method = RequestMethod.GET)//, method = RequestMethod.GET
//  @ResponseBody
  @PostMapping("/register")
  public String register(
      @RequestParam("username") String name,
      @RequestParam("password") String password,
      @RequestParam("sid") String sid,
      @RequestParam("email") String email
  ) {
    return peopleManager.register(name, password, sid, email);
  }
//  @GetMapping("/register")//PostMapping
//  public String register(
//  ) {
//    return peopleManager.Register();//name, password
//  }
}