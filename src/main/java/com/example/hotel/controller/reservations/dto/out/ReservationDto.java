package com.example.hotel.controller.reservations.dto.out;

import com.example.hotel.model.reservations.ActualStatus;
import com.example.hotel.model.reservations.PayStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDto {
    private Integer reservationId;
    private Integer guestId;
    private Integer workerId;
    private Integer roomId;
    private Date beginDate;
    private Date endDate;
    private ActualStatus actualStatus;
    private Integer paymentMethodId;
    private PayStatus payStatus;
    private Integer receipt;
    private Integer money;
    private String comment;
}