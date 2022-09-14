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
          + " from cardgame.ocard";

      return connection.createQuery(query).executeAndFetch(Card.class);
    }
  }

  public String oinfo(String id){
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select DETAIL detail from cardgame.ocard" +
          "where ID =:id";
      String c;
      c=connection.createQuery(query)
          .addParameter("id", id)
          .executeScalar(String.class);
      return c;
    }
  }

  public String info(){
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select DETAIL detail from cardgame.ocard" +
          "where ocard.ID = '2'";
      String c;
      c=connection.createQuery(query)
          .executeScalar(String.class);
      return c;
    }
  }
}