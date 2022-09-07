package fcu.sep.fcushop.model;

public class Record {
  private String id;
  private String name;

  private String point;

  public Record(String id,String name, String point) {
    this.id = id;
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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
