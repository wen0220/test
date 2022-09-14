package fcu.sep.fcushop.controller;
import fcu.sep.fcushop.model.Card;
import fcu.sep.fcushop.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
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

  @GetMapping("/info")
  public String oinfo(
      //@RequestParam("cardid") String id
  ) {
    return cardManager.info();
  }
}


