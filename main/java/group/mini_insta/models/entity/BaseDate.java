package group.mini_insta.models.entity;

import javax.persistence.Column;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class BaseDate {
    @Column(name = "add_date")
    Date addDate;
    @Column(name = "edit_date")
    Date editDate;
    boolean active;

    @PrePersist
    protected void onCreate(){
        addDate = new Date();
        editDate = new Date();
    }

    @PreUpdate
    protected void update(){
        editDate = new Date();
    }

}
