package com.philiphyw.server.service;

import com.philiphyw.server.model.Server;

import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress);
    Server get(Long id);

    Server update(Server server);

    Boolean delete(Long id);
    Collection<Server> list(int limit);

}
