package lib.xfy9326.coding.openapi.services.beans;

public class PersonalPublicKey {
    private int id;
    private int owner_id;
    private String finger_print;
    private String type;
    private String title;
    private boolean has_expired;
    private long created_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getFinger_print() {
        return finger_print;
    }

    public void setFinger_print(String finger_print) {
        this.finger_print = finger_print;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isHas_expired() {
        return has_expired;
    }

    public void setHas_expired(boolean has_expired) {
        this.has_expired = has_expired;
    }

    public long getCreated_at() {
        return created_at;
    }

    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "PersonalPublicKey{" +
                "id=" + id +
                ", owner_id=" + owner_id +
                ", finger_print='" + finger_print + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", has_expired=" + has_expired +
                ", created_at=" + created_at +
                '}';
    }
}
