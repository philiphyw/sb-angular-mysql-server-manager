package com.philiphyw.server.model;

import com.philiphyw.server.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty(message ="IP address cannot be empty or null")
    @Column(unique = true)
    private String ipAddress;

    private String name;
    private String type;
    private String imageUrl;
    private Status status;
}
