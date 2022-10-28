package fcu.sep.fcushop.controller;

import fcu.sep.fcushop.model.People;
import fcu.sep.fcushop.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Peoplecontroller.
 */

@RestController

@CrossOrigin
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
  @PostMapping("/register")
  public String register(
      @RequestParam("username") String name,
      @RequestParam("password") String password,
      @RequestParam("sid") String sid,
      @RequestParam("email") String email
  ) {
    return peopleManager.register(name, password, sid, email);
  }

  @PostMapping("/update")//PostMapping
  public String update(
      @RequestParam("username") String name,
      @RequestParam("sid") String sid,
      @RequestParam("newpassword") String password
  ) {
    return peopleManager.update(name, sid, password);//name, password
  }
//  @GetMapping("/register")//PostMapping
//  public String register(
//  ) {
//    return peopleManager.Register();//name, password
//  }
}