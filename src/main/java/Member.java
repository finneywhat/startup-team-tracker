import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mMemberName;
  private static List<Member> instances = new ArrayList<Member>();
  private int mId;
  private String mHomeTown;
  private String mEmployer;
  private String mCoding;

  public Member(String memberName, String homeTown, String employer, String coding) {
    mMemberName = memberName;
    mHomeTown = homeTown;
    mEmployer = employer;
    mCoding = coding;
    instances.add(this);
    mId = instances.size();
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

  public int getId() {
    return mId;
  }

  public static Member find(int id) {
    return instances.get(id - 1);
  }

  public String getHomeTown() {
    return mHomeTown;
  }

  public String getEmployer() {
    return mEmployer;
  }

  public String getCoding() {
    return mCoding;
  }
}
