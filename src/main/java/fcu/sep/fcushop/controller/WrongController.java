package fcu.sep.fcushop.controller;

import fcu.sep.fcushop.model.Wrong;
import fcu.sep.fcushop.service.WrongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class WrongController {

  @Autowired
  WrongService wrongManager;

  @GetMapping("/getwrong")
  public List<Wrong> getWrong() {
    return wrongManager.getWrong();
  }

  @PostMapping("/owrong")
  public String owrong(
      @RequestParam("gameid") String gameid,
      @RequestParam("username") String username,
      @RequestParam("myanswer") String myanswer,
      @RequestParam("question") String cardid,
      @RequestParam("color") String color
  ) {
    return wrongManager.addowrong( gameid,username, cardid, myanswer,color);
  }

  @PostMapping("/gwrong")
  public String gwrong(
      @RequestParam("gameid") String gameid,
      @RequestParam("username") String username,
      @RequestParam("myanswer") String myanswer,
      @RequestParam("question") String cardid,
      @RequestParam("color") String color
  ) {
    return wrongManager.addgwrong( gameid,username, cardid, myanswer,color);
  }

  @PostMapping("/bwrong")
  public String bwrong(
      @RequestParam("gameid") String gameid,
      @RequestParam("username") String username,
      @RequestParam("myanswer") String myanswer,
      @RequestParam("question") String cardid,
      @RequestParam("color") String color
  ) {
    return wrongManager.addbwrong( gameid,username, cardid, myanswer,color);
  }

  //@GetMapping("/seewrong")
  @PostMapping("/seewrong")
  public List<Wrong> seewrong(
      @RequestParam("username") String username,
      @RequestParam("gameid") String gameid
  ) {
    return wrongManager.seewrong(username,gameid);
  }

  @GetMapping("/swrong")
  public List<Wrong> sWrong() {
    return wrongManager.sWrong();
  }
}
