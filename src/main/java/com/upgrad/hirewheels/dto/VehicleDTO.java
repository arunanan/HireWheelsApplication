package com.upgrad.hirewheels.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDTO {

    private int vehicleId;

    private String vehicleModel;

    private String vehicleNumber;

    private int vehicleSubCategoryId;

    private String color;

    private int fuelTypeId;

    private int locationId;

    private String vehicleImageUrl;

    private int availabilityStatus;

    private int pricePerDay;
}
