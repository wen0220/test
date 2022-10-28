package fcu.sep.fcushop.controller;
import fcu.sep.fcushop.model.Card;
import fcu.sep.fcushop.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CardController {

  @Autowired

  CardService cardManager;

  @GetMapping("/cards")
  public List<Card> getProducts() {
    return cardManager.getProducts();
  }

  @PostMapping("/oinfo")
  public String oinfo(
      @RequestParam("cardid") String id
  ) {
    return cardManager.oinfo(id);
  }

  @PostMapping("/ginfo")
  public String ginfo(
      @RequestParam("cardid") String id
  ) {
    return cardManager.ginfo(id);
  }

  @PostMapping("/binfo")
  public String binfo(
      @RequestParam("cardid") String id
  ) {
    return cardManager.binfo(id);
  }

  @GetMapping("/info")
  public String info(
  ) {
    return cardManager.info();
  }
}


