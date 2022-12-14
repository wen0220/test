package fcu.sep.fcushop.service;

import fcu.sep.fcushop.database.Sql2oDbHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;
import fcu.sep.fcushop.model.Record;
import java.util.List;

@Service
public class RecordService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  public RecordService() {

  }

  public List<Record> getPoint() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select NAME name, POINT point"
          + " from cardgame.record";

      return connection.createQuery(query).executeAndFetch(Record.class);
    }
  }

  public List<Record> rank() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select NAME name, POINT point"
          + " from cardgame.record order by point desc";
      System.out.println("rank");
      return connection.createQuery(query)
          .executeAndFetch(Record.class);
    }
  }

  public List<Record> myrecord(String name) {//String name
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select POINT point, MATE mate, GAMEID gameid from cardgame.record "+
          "where NAME = :name order by id desc";
      System.out.println("myrecord");
      return connection.createQuery(query)
          .addParameter("name", name)
          .executeAndFetch(Record.class);
    }
  }

  public String gameid(String name) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select MAX(gameid) gameid from cardgame.record ";
      String c;
      c=connection.createQuery(query)
          .executeScalar(String.class);
      System.out.println(c);
      return c;
    }
  }

  public String storeid(String name, String mate, String gameid) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "insert into cardgame.record (GAMEID, NAME, MATE) "
          + " VALUES(:gameid, :name, :mate)";
      connection.createQuery(query)
          .addParameter("gameid", gameid)
          .addParameter("name", name)
          .addParameter("mate", mate)
          .executeUpdate();
      return "success";
    }
  }

  public String storepoint(String name, String gameid, String point) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "UPDATE cardgame.record  set POINT = :point where gameid = :gameid and name = :name";
      connection.createQuery(query)
          .addParameter("gameid", gameid)
          .addParameter("name", name)
          .addParameter("point", point)
          .executeUpdate();
      return "success";
    }
  }

}
