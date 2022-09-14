package fcu.sep.fcushop.service;

import fcu.sep.fcushop.database.Sql2oDbHandler;
import fcu.sep.fcushop.model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;
import fcu.sep.fcushop.model.Wrong;

import java.util.List;

@Service
public class WrongService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  public WrongService() {

  }

  public List<Wrong> getWrong() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select * from cardgame.wrong";

      return connection.createQuery(query).executeAndFetch(Wrong.class);
    }
  }

  //橘色錯題
  public String addowrong(String gameid, String username, String cardid, String myanswer, String color) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "insert into cardgame.wrong ( GAMEID ,USERNAME, CARDID, MYANSWER, COLOR) "
          + "VALUES(:gameid, :username, :cardid, :myanswer, :color)";
      connection.createQuery(query)
          .addParameter("gameid", gameid)
          .addParameter("username", username)
          .addParameter("cardid", cardid)
          .addParameter("myanswer", myanswer)
          .addParameter("color", color)
          .executeUpdate();
      return "success";
    }
  }

  //綠色錯題
  public String addgwrong(String gameid, String username, String cardid, String myanswer, String color) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "insert into cardgame.wrong ( GAMEID ,USERNAME, CARDID, MYANSWER, COLOR) "
          + "VALUES(:gameid, :username, :cardid, :myanswer, :color)";
      connection.createQuery(query)
          .addParameter("gameid", gameid)
          .addParameter("username", username)
          .addParameter("cardid", cardid)
          .addParameter("myanswer", myanswer)
          .addParameter("color", color)
          .executeUpdate();
      return "success";
    }
  }

  //藍色錯題
  public String addbwrong(String gameid, String username, String cardid, String myanswer, String color) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "insert into cardgame.wrong ( GAMEID ,USERNAME, CARDID, MYANSWER, COLOR) "
          + "VALUES(:gameid, :username, :cardid, :myanswer, :color)";
      connection.createQuery(query)
          .addParameter("gameid", gameid)
          .addParameter("username", username)
          .addParameter("cardid", cardid)
          .addParameter("myanswer", myanswer)
          .addParameter("color", color)
          .executeUpdate();
      return "success";
    }
  }

  public List<Wrong> seewrong(String gameid) {//String gameid
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select *" +
          "from cardgame.wrong where GAMEID = :gameid order by color asc";

      return connection.createQuery(query)
          .addParameter("gameid", gameid)
          .executeAndFetch(Wrong.class);
    }
  }

  public List<Wrong> sWrong() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select * from cardgame.wrong where GAMEID = '46' order by color asc";

      return connection.createQuery(query).executeAndFetch(Wrong.class);
    }
  }
}
