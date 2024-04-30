package org.example.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.models.VehicleType;

@Getter
@Setter

public class IssueTicketRequestDto {
    private Long gateID;
    private VehicleType vehicleType;
    private String vehicleNumber;
    private String ownerName;
}