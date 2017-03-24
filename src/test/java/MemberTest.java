import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member member = new Member("Aaron");
    assertEquals(true, member instanceof Member);
  }

  @Test
  public void getMemName_instantiatesWithMemberName_String() {
    Member member = new Member("Aaron");
    assertEquals("Aaron", member.getMemName());
  }

  @Test
  public void all_returnsAllInstancesOfMember_true() {
    Member memberOne = new Member("Aaron");
    Member memberTwo = new Member("Beth");
    assertEquals(true, Member.all().contains(memberOne));
    assertEquals(true, Member.all().contains(memberTwo));
  }
}
