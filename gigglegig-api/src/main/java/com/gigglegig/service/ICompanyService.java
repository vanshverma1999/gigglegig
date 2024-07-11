package com.gigglegig.service;

import com.gigglegig.model.Company;
import com.gigglegig.model.enums.ServiceRequest_Status;
import com.gigglegig.model.response.Response;
import jakarta.annotation.Nullable;

public interface ICompanyService {
    Company registerCompany(Company company);
    //TODO: Change DTO
    Response getEarnings(Long companyId);
    Response getServiceProviderEarningBreakdown(Long companyId);
    Response getServicesProvidedByServiceProvider(Long companyId, Long serviceId);
    Response getServicesProvidedByServiceProviderFilter(@Nullable ServiceRequest_Status status, @Nullable Long serviceProviderId);

}
