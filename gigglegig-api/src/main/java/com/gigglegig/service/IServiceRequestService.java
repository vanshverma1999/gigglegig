package com.gigglegig.service;

import com.gigglegig.model.ServiceRequest;
import com.gigglegig.model.enums.ServiceRequest_Status;
import jakarta.annotation.Nullable;

import java.time.Instant;
import java.util.List;

public interface IServiceRequestService {
    List<ServiceRequest> getAllServiceRequests();
    List<ServiceRequest> getFilteredServiceRequests(@Nullable ServiceRequest_Status status, @Nullable Instant startDate, @Nullable Instant endDate, @Nullable String serviceType);
    ServiceRequest updateServiceRequest(Long serviceRequestId, ServiceRequest_Status status);

}
