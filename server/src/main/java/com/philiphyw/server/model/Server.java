package com.philiphyw.server.model;

import com.philiphyw.server.enumeration.Status;

import javax.persistence.Id;

public class Server {
    @Id
    private long id;

    private String ipAddress;

    private String name;
    private String type;
    private String imageUrl;
    private Status status;
}
