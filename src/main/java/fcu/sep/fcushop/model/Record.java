package fcu.sep.fcushop.model;

public class Record {
  private String name;

  private String point;

  public Record(String name, String point) {
    this.name = name;
    this.point = point;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPoint() {
    return point;
  }

  public void setPoint(String point) {
    this.point = point;
  }
}
