import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member member = new Member("Aaron", "Woodbridge, VA", "New Relic", "Java, Android");
    assertEquals(true, member instanceof Member);
  }

  @Test
  public void getMemName_instantiatesWithMemberName_String() {
    Member member = new Member("Aaron", "Woodbridge, VA", "New Relic", "Java, Android");
    assertEquals("Aaron", member.getMemName());
  }

  @Test
  public void getHomeTown_instantiatesWithHomeTownOfMember_String() {
    Member member = new Member("Aaron", "Woodbridge, VA", "New Relic", "Java, Android");
    assertEquals("Woodbridge, VA", member.getHomeTown());
  }

  @Test
  public void getEmployer_instantiatesWithCurrentEmployerOfMember_String() {
    Member member = new Member("Aaron", "Woodbridge, VA", "New Relic", "Java, Android");
    assertEquals("New Relic", member.getEmployer());
  }

  @Test
  public void getCoding_instantiatesWithCodingSpecialtiesOfMember_String() {
    Member member = new Member("Aaron", "Woodbridge, VA", "New Relic", "Java, Android");
    assertEquals("Java, Android", member.getCoding());
  }

  @Test
  public void all_returnsAllInstancesOfMember_true() {
    Member memberOne = new Member("Aaron", "Woodbridge, VA", "New Relic", "Java, Android");
    Member memberTwo = new Member("Beth", "Richmond, VA", "New Relic", "Java, Android");
    assertEquals(true, Member.all().contains(memberOne));
    assertEquals(true, Member.all().contains(memberTwo));
  }

  @Test
  public void clearList_emptiesAllMembersFromArrayList_0() {
    Member member = new Member("Aaron", "Woodbridge, VA", "New Relic", "Java, Android");
    Member.clearList();
    assertEquals(0, Member.all().size());
  }

  @Test
  public void getId_instantiatesMemberInstanceWithAnId_1() {
    Member.clearList();
    Member member = new Member("Aaron", "Woodbridge, VA", "New Relic", "Java, Android");
    assertEquals(1, member.getId());
  }

  @Test
  public void find_returnsMemberWithSameId_memberTwo() {
    Member.clearList();
    Member memberOne = new Member("Aaron", "Woodbridge, VA", "New Relic", "Java, Android");
    Member memberTwo = new Member("Beth", "Richmond, VA", "New Relic", "Java, Android");
    assertEquals(memberTwo, Member.find(memberTwo.getId()));
  }
}
