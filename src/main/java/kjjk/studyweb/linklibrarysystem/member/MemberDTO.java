package kjjk.studyweb.linklibrarysystem.member;

public class MemberDTO {
    private Long Mid;
    private String FullName;
    private String Email;
    private String pw;
    private String ZipCode;

    public Long getMid() { return Mid; }

    public void setMid(Long mid) { Mid = mid; }

    public String getFullName() { return FullName; }

    public void setFullName(String fullName) { FullName = fullName; }

    public String getEmail() { return Email; }

    public void setEmail(String email) { Email = email; }

    public String getPw() { return pw; }

    public void setPw(String pw) {  this.pw = pw; }

    public String getZipCode() { return ZipCode; }

    public void setZipCode(String zipCode) { ZipCode = zipCode;}
}
