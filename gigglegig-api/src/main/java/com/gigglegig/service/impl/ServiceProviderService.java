package com.gigglegig.service.impl;

import com.gigglegig.model.ServiceProviders;
import com.gigglegig.model.response.Response;
import com.gigglegig.service.IServiceProviderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProviderService implements IServiceProviderService {
    @Override
    public List<ServiceProviders> getAllServiceProviderByCompany(Long companyId) {
        return List.of();
    }

    @Override
    public Response hireServiceProvider(Long companyId, Long serviceProviderId) {
        return null;
    }

    @Override
    public Response removeServiceProviderFromCompany(Long companyId, Long serviceProviderId) {
        return null;
    }

    @Override
    public Response getServiceProviderPerformance(Long serviceProviderId) {
        return null;
    }
}
