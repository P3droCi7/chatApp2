package pl.skrzypczak.chathttpapp2;

public class ChatMessage {
  private String username;
  private String value;


  public ChatMessage() {
  }

  @Override
  public String toString() {
    return "ChatMessage{" +
            "username='" + username + '\'' +
            ", value='" + value + '\'' +
            '}';
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ChatMessage(String username, String value) {
    this.username = username;
    this.value = value;
  }
}
