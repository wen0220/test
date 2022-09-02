package fcu.sep.fcushop.service;

import fcu.sep.fcushop.database.Sql2oDbHandler;

import fcu.sep.fcushop.model.People;
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

  public String score(String name, String point) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "insert into cardgame.record ( NAME, POINT) "
          + "VALUES(:name, :point)";
      connection.createQuery(query)
          .addParameter("name", name)
          .addParameter("point", point)
          .executeUpdate();
      return "s";
    }
  }

  public List<Record> rank() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select NAME name, POINT point"
          + " from cardgame.record order by point desc";

      //return connection.createQuery(query).executeScalar(String.class);
      return connection.createQuery(query)
          //.addParameter("name", name)
          .executeAndFetch(Record.class);
    }
  }

  public List<Record> myrecord(String name) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select POINT point from cardgame.record " +
          "where NAME = :name order by point desc";
      return connection.createQuery(query)
          .addParameter("name", name)
          .executeAndFetch(Record.class);
    }
  }

}
