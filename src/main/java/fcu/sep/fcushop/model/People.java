package fcu.sep.fcushop.model;

/**
 * People.
 */

public class People {

  private String id;

  private String sid;

  private String name;

  private String password;

  private String email;


  /**
   * People.
   */

  public People(String id, String sid, String name,
                String password, String email) {
    this.id = id;
    this.sid = sid;
    this.name = name;
    this.password = password;
    this.email = email;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public String getname() {
    return name;
  }

  public void setname(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getMail() {
    return email;
  }

  public void setMail(String email) {
    this.email = email;
  }




}