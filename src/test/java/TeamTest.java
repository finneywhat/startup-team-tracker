import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void Team_instantiatesCorrectly_true() {
    Team myTeam = new Team("Code Conquerors");
    assertEquals(true, myTeam instanceof Team);
  }
}
