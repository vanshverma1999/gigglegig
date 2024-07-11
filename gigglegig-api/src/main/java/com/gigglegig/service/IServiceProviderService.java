package com.gigglegig.service;

import com.gigglegig.model.ServiceProviders;
import com.gigglegig.model.response.Response;

import java.util.List;

public interface IServiceProviderService {
    List<ServiceProviders> getAllServiceProviderByCompany(Long companyId);
    Response hireServiceProvider(Long companyId, Long serviceProviderId);
    Response removeServiceProviderFromCompany(Long companyId, Long serviceProviderId);

    //TODO: Add DTO
    Response getServiceProviderPerformance(Long serviceProviderId);

}
