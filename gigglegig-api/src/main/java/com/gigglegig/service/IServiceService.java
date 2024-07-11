package com.gigglegig.service;

import com.gigglegig.model.Service;
import com.gigglegig.model.response.Response;

public interface IServiceService {
    Service addOrUpdateService(Service service);
    Response activateService(Long serviceId);
    Response deactivateService(Long serviceId);
}
