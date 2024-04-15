package com.SAR.ReservationsSAR.shared.application.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiErrorResponse {
    private String message;
    private String error;
    private int status;
}
