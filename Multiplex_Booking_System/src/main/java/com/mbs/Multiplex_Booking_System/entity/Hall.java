package com.mbs.Multiplex_Booking_System.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Hall {

    @Id
    @SequenceGenerator(
            name = "Hall_Sequence",
            sequenceName = "Hall_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Hall_Sequence"
    )
    private long HallID;
    private String HallDesc;
    private long TotalCapacity;
}
