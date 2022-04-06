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

public class HallCapacity {

    @EmbeddedId
    HallCapacityKey id;
    @ManyToOne
    @MapsId("HallID")
    @JoinColumn(name = "HallID")
    private Hall hall;
    @ManyToOne
    @MapsId("SeatTypeId")
    @JoinColumn(name="SeatTypeId")
    private SeatType seatType;
    private int SeatCount;
}
