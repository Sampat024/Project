package com.mbs.Multiplex_Booking_System.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Shows {

    @Id
    @SequenceGenerator(
            name = "Shows_Sequence",
            sequenceName = "Shows_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Shows_Sequence"
    )
    private long ShowId;
    private int SlotNo;
    private Date FromDate;
    private Date ToDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name="HallID",
            referencedColumnName = "HallID"
    )
    private Hall hall;
}
