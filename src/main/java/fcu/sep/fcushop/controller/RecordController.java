package fcu.sep.fcushop.controller;

import fcu.sep.fcushop.model.People;
import fcu.sep.fcushop.model.Record;
import fcu.sep.fcushop.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RecordController {

  @Autowired
  RecordService recordManager;

  @GetMapping("/getpoints")
  public List<Record> getPoints() {
    return recordManager.getPoint();
  }

  @PostMapping("/point")
  public String point(
      @RequestParam("username") String name,
      @RequestParam("point") String point
  ) {
    return recordManager.score(name, point);//name, password
  }

}
