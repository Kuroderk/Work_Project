package data.user_info.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "dates")
public class Datee {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name = "Duration")
    private Date duration;
    @Column(name = "Start_Date")
    private Date start_date;
    @Column(name = "End_Date")
    private Date end_date;
}
