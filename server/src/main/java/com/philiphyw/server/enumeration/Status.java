package com.philiphyw.server.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    SERVER_UP("Server_UP"),
    SERVER_DOWN("Server_DOWN");
    private final String status;

}
