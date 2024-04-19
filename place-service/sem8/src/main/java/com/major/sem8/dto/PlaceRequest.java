package com.major.sem8.dto;// PlaceRequest.java (DTO for creating a new place)

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlaceRequest {

    @NotNull
    private String placeName;

    private String discription;

    private String address;

    private String mainImage;

    @NotNull
    private String city;

    @NotNull
    private String category;

    private String ticketPrice;
}
