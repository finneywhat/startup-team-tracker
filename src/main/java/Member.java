import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mMemberName;
  private static List<Member> instances = new ArrayList<Member>();

  public Member(String memberName) {
    mMemberName = memberName;
    instances.add(this);
  }

  public String getMemName() {
    return mMemberName;
  }

  public static List<Member> all() {
    return instances;
  }

  public static void clearList() {
    instances.clear();
  }
}
