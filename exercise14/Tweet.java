public class Tweet {
  private String created_at;
  private int favorite_count;
  private boolean favorited;
  private long id;
  private int retweeted_count;
  private boolean retweeted;
  private String text;

  public Tweet(String created_at, int favorite_count, boolean favorited,
               long id, int retweeted_count, boolean retweeted, String text)
  {
    this.created_at = created_at;
    this.favorite_count = favorite_count;
    this.favorited = favorited;
    this.id = id;
    this.retweeted_count = retweeted_count;
    this.retweeted = retweeted;
    this.text = text;
  }

  public String toString() {
    String out = "";
    out += this.text + "\n";
    if(this.retweeted_count > 0) {
      out += "Retweets: " + this.retweeted_count + " ";
    }
    if(favorite_count > 0) {
      out += "Favorites: " + favorite_count + "\n";
    }
    else {
      out += "\n";
    }
    out += this.created_at + "\n";
    if(retweeted) {
      out += "[^v]";
    }
    else {
      out += "[ ]";
    }
    if(this.favorited) {
      out += "[*]";
    }
    else {
      out += "[ ]";
    }
    return out;
  }

}
