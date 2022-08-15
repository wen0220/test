package fcu.sep.fcushop.model;

/**
 * People.
 */

public class People {

  private String id;

  private String sid;

  private String name;

  private String password;

  private String mail;


  /**
   * People.
   */

  public People(String id, String sid, String name,
                String password, String mail) {
    this.id = id;
    this.sid = sid;
    this.name = name;
    this.password = password;
    this.mail = mail;
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

  public String getPeople_name() {
    return name;
  }

  public void setPeople_name(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }




}