import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void Team_instantiatesCorrectly_true() {
    Team myTeam = new Team("Code Conquerors");
    assertEquals(true, myTeam instanceof Team);
  }

  @Test
  public void getTeamName_instantiatesWithTeamName_String() {
    Team myTeam = new Team("Code Conquerors");
    assertEquals("Code Conquerors", myTeam.getTeamName());
  }

  @Test
  public void all_returnsAllInstancesOfTeam_true() {
    Team teamOne = new Team("Code Conquerors");
    Team teamTwo = new Team("Bare Metal");
    assertEquals(true, Team.all().contains(teamOne));
    assertEquals(true, Team.all().contains(teamTwo));
  }
}
