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

public class SeatType {

    @Id
    @SequenceGenerator(
            name = "SeatType_Sequence",
            sequenceName = "SeatType_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SeatType_Sequence"
    )
    private long SeatTypeId;
    private String SeatTypeDesc;
    private Float SeatFare;
}
