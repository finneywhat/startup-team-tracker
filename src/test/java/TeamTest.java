import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Before
  public void tearDown() {
    Team.clearList();
  }

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

  @Test
  public void clearList_emptiesAllTeamsFromArrayList_0() {
    Team myTeam = new Team("Code Conquerors");
    Team.clearList();
    assertEquals(0, Team.all().size());
  }

  @Test
  public void getId_instantiatesTeamInstanceWithAnId_1() {
    Team myTeam = new Team("Code Conquerors");
    assertEquals(1, myTeam.getId());
  }

  @Test
  public void find_returnsTeamWithSameId_teamTwo() {
    Team teamOne = new Team("Code Conquerors");
    Team teamTwo = new Team("Bare Metal");
    assertEquals(teamTwo, Team.find(teamTwo.getId()));
  }

  @Test
  public void getMembers_initiallyReturnsEmptyList_ArrayList() {
    Team testTeam = new Team("Code Conquerors");
    assertEquals(0, testTeam.getMembers().size());
  }

  @Test
  public void addMember_addsMemberToList_true() {
    Team testTeam = new Team("Code Conquerors");
    Member testMember = new Member("Aaron", "Woodbridge, VA", "New Relic", "Java, Android");
    testTeam.addMember(testMember);
    assertTrue(testTeam.getMembers().contains(testMember));
  }
}
