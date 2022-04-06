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

public class BookingDetail {

    @EmbeddedId
    private BookingDetailKey Id;
    @ManyToOne
    @MapsId("BookingId")
    @JoinColumn(name = "BookingId")
    private Booking Booking;
    @ManyToOne
    @MapsId("SeatTypeId")
    @JoinColumn(name = "SeatTypeId")
    private SeatType seatType;
    private long NoofSeats;
}
