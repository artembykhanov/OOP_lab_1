public class Account {
    public String type;
    public String owner;

    public Account(String type, String owner) {
        this.type = type;
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void checkBalance(){

    }
}
