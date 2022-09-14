package fcu.sep.fcushop.model;

public class Card {

  private String id;

  private String name;

  private String point;

  private String day;

  private String detail;

  public Card(String id, String name, String point,
                String day, String detail) {
    this.id = id;
    this.name = name;
    this.point = point;
    this.day = day;
    this.detail = detail;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getname() {
    return name;
  }

  public void setname(String name) {
    this.name = name;
  }

  public String getPoint() {
    return point;
  }

  public void setPoint(String point) {
    this.point = point;
  }

  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

}
