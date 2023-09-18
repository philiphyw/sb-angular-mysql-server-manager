package com.philiphyw.server.service;

import com.philiphyw.server.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Server get(Long id);

    Server update(Server server);

    Boolean delete(Long id);
    Collection<Server> list(int limit);

}
