import java.util.ArrayList;
import java.util.List;

public class Team {
  private String mTeamName;
  private static List<Team> instances = new ArrayList<Team>();

  public Team(String teamName) {
    mTeamName = teamName;
    instances.add(this);
  }

  public String getTeamName() {
    return mTeamName;
  }

  public static List<Team> all() {
    return instances;
  }
}
