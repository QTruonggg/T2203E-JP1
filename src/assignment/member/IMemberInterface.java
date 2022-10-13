package assignment.member;

public interface IMemberInterface {
    ArrayList<Member> list();
    void create(Member member);
    void update(Member member);
    void delete(Member member);
}
