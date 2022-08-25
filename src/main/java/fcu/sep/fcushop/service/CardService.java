package fcu.sep.fcushop.service;

import fcu.sep.fcushop.database.Sql2oDbHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;
import fcu.sep.fcushop.model.Card;

import java.util.List;

@Service
public class CardService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  public CardService() {

  }

  public List<Card> getProducts() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select ID id,  NAME name, POINT point, DAY day"
          + " from cardgame.card";

      return connection.createQuery(query).executeAndFetch(Card.class);
    }
  }

}