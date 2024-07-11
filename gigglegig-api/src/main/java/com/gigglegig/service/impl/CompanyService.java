package com.gigglegig.service.impl;

import com.gigglegig.model.Company;
import com.gigglegig.model.enums.ServiceRequest_Status;
import com.gigglegig.model.response.Response;
import com.gigglegig.service.ICompanyService;
import jakarta.annotation.Nullable;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyService {
    @Override
    public Company registerCompany(Company company) {
        return null;
    }

    @Override
    public Response getEarnings(Long companyId) {
        return null;
    }

    @Override
    public Response getServiceProviderEarningBreakdown(Long companyId) {
        return null;
    }

    @Override
    public Response getServicesProvidedByServiceProvider(Long companyId, Long serviceId) {
        return null;
    }

    @Override
    public Response getServicesProvidedByServiceProviderFilter(@Nullable ServiceRequest_Status status, @Nullable Long serviceProviderId) {
        return null;
    }
}
