package fcu.sep.fcushop.service;

import fcu.sep.fcushop.database.Sql2oDbHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;
import fcu.sep.fcushop.model.People;

import java.util.List;

/**
 * peopleservice.
 */

@Service
public class PeopleService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  public PeopleService() {

  }

  /**
   * peopleservice.
   */

  public String login(String name, String password) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select count(*)"
          + " from cardgame.people where NAME = :name and password =:password";
      int c;
      c = connection.createQuery(query)
          .addParameter("name", name)
          .addParameter("password", password)
          .executeScalar(Integer.class);
      if (c == 1) {
        return "success";//登入成功
      } else {
        return "fail";
      }
    }
  }

  /**
   * peopleservice.
   */

  public String register(String name, String password, String sid,
                         String email) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select count(*)"
          + " from cardgame.people where sid = :sid";
      int c;
      c = connection.createQuery(query)
          .addParameter("sid", sid)
          .executeScalar(Integer.class);

      if(c == 0){
        String query1 = "insert into cardgame.people ( NAME, PASSWORD, SID, EMAIL) "
            + "VALUES(:name, :password, :sid, :email)";
        connection.createQuery(query1)
            //.addParameter("ID", count)
            .addParameter("name", name)
            .addParameter("password", password)
            .addParameter("sid", sid)
            .addParameter("email", email)
            .executeUpdate();
        return "success";
      }
      else if(c == 1){//帳號存在
        return "exist";
      }
    }
    return "fail";
  }
//  public String Register(){
//    return "111";
//  }
  /**
   * peopleservice.
   */

  public String aaUpdatePeople(String account, String password, String orginpass) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select PASSWORD" + " from bookstore.people where ACCOUNT =:account";
      var c = connection.createQuery(query)
          .addParameter("account", account)
          .executeScalar(String.class);
      int result = c.compareTo(orginpass);
      System.out.println(result);

      if (result == 0) {
        String query1 = "Update bookstore.people "
            + "SET PASSWORD=:password WHERE ACCOUNT = :account";
        System.out.println(query1);
        connection.createQuery(query1)
            .addParameter("account", account)
            .addParameter("password", password)
            .executeUpdate();
        return "OK";
      } else {
        return "NO";
      }
    }
  }

  public List<People> getProducts() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select ID id, SID sid, NAME name, PASSWORD password, EMAIL mail"
          + " from cardgame.people";

      return connection.createQuery(query).executeAndFetch(People.class);
    }
  }

//  public String login(){
//    return "111";
//  }
}








