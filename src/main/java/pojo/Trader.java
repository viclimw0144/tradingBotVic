package pojo;

public class Trader implements User {

    private String uName;
    private String uPassword;
    private String uID;

    @Override
    public String getuName() {
        return uName;
    }

    @Override
    public void setuName(String uName) {
        this.uName = uName;
    }

    @Override
    public String getuPassword() {
        return this.uPassword;
    }

    @Override
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    @Override
    public String getuID() {
        return this.uID;
    }

    @Override
    public void setuID(String uID) {
        this.uID = uID;
    }
}
