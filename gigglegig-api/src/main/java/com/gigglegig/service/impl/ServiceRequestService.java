package com.gigglegig.service.impl;

import com.gigglegig.model.ServiceRequest;
import com.gigglegig.model.enums.ServiceRequest_Status;
import com.gigglegig.service.IServiceRequestService;
import jakarta.annotation.Nullable;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ServiceRequestService implements IServiceRequestService {
    @Override
    public List<ServiceRequest> getAllServiceRequests() {
        return List.of();
    }

    @Override
    public List<ServiceRequest> getFilteredServiceRequests(@Nullable ServiceRequest_Status status, @Nullable Instant startDate, @Nullable Instant endDate, @Nullable String serviceType) {
        return List.of();
    }

    @Override
    public ServiceRequest updateServiceRequest(Long serviceRequestId, ServiceRequest_Status status) {
        return null;
    }
}
