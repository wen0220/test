package fcu.sep.fcushop.model;

public class Wrong {

  private String id;

  private String gameid;

  private String username;

  private String cardid;

  private String myanswer;

  private String color;

  public Wrong(String id, String gameid,String username, String cardid, String myanswer, String color) {
    this.id = id;
    this.gameid = gameid;
    this.username = username;
    this.cardid = cardid;
    this.myanswer = myanswer;
    this.color = color;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) { this.id = id;}

  public String getGameId() {
    return gameid;
  }

  public void setGameId(String gameid) { this.gameid = gameid;}

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getCardId() {
    return cardid;
  }

  public void setCardId(String cardid) {
    this.cardid = cardid;
  }

  public String getmyanswer() {
    return myanswer;
  }

  public void setmyanswer(String myanswer) {
    this.myanswer = myanswer;
  }

  public String getcolor() {
    return color;
  }

  public void setcolor(String color) {
    this.color = color;
  }
}
