package com.gigglegig.service.impl;

import com.gigglegig.model.response.Response;
import com.gigglegig.service.IServiceService;
import org.springframework.stereotype.Service;

@Service
public class ServiceService implements IServiceService {
    @Override
    public com.gigglegig.model.Service addOrUpdateService(com.gigglegig.model.Service service) {
        return null;
    }

    @Override
    public Response activateService(Long serviceId) {
        return null;
    }

    @Override
    public Response deactivateService(Long serviceId) {
        return null;
    }
}
