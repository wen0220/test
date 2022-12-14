package fcu.sep.fcushop.controller;

import fcu.sep.fcushop.model.Record;
import fcu.sep.fcushop.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RecordController {

  @Autowired
  RecordService recordManager;


  @GetMapping("/getpoints")
  public List<Record> getPoints() {
    return recordManager.getPoint();
  }

  //@GetMapping("/ranking")
  @PostMapping("/ranking")
  public List<Record> ranking() {
    //return recordManager.rank();
    return recordManager.rank();
  }

  @PostMapping("/myrecord")
  public List<Record> myrecord(
      @RequestParam("username") String name
  ) {
    System.out.println("myrecord1");
    return recordManager.myrecord(name);//name
  }

  @PostMapping("/gameid")
  public String gameid(
      @RequestParam("username") String name
  ) {
    return recordManager.gameid(name);
  }

  @PostMapping("/storeid")
  public String storeid(
      @RequestParam("username") String name,
      @RequestParam("mate") String mate,
      @RequestParam("gameid") String gameid
  ) {
    return recordManager.storeid(name, mate, gameid);
  }


  @PostMapping("/storepoint")
  public String storepoint(
      @RequestParam("username") String name,
      @RequestParam("gameid") String gameid,
      @RequestParam("point") String point
  ) {
    return recordManager.storepoint(name, gameid, point);
  }
}
