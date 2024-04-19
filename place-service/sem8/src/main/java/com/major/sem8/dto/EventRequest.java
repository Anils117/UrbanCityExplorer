package com.major.sem8.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventRequest {
    private String eventName;
    private String description;

    private String mainImage;

    @NotNull
    private String address;

    @NotNull
    private String city;

    private String ticketPrice;

    private Date date;

}
