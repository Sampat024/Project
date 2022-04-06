package com.mbs.Multiplex_Booking_System.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class HallCapacityKey implements Serializable {
    @Column(name = "HallID")
    private long HallID;
    @Column(name = "SeatTypeId")
    private long SeatTypeId;
}
