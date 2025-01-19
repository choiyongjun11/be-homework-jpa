package com.springboot.member.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Stamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stampId;

    @Column
    private int stampCount;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(nullable = false, name = "LAST_CHANGE_DATE")
    private LocalDateTime modifiedAt = LocalDateTime.now();
}
