package fcu.sep.fcushop.model;

public class Record {
  private String id;
  private String gameid;
  private String name;
  private String point;
  private String mate;

  public Record(String id,String gameid, String name, String point, String mate) {
    this.id = id;
    this.gameid = gameid;
    this.name = name;
    this.point = point;
    this.mate = mate;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getgameId() {
    return gameid;
  }

  public void setgameId(String gameid) {
    this.gameid = gameid;
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

  public String getMate() {
    return mate;
  }

  public void setMate(String mate) {
    this.mate = mate;
  }
}
