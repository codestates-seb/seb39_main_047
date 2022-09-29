package com.codestates.danbi.baseEntity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column(name = "last_modified_date")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime lastModifiedDate;

    protected String getFormattedDate(LocalDateTime timestamp, String pattern) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return timestamp.format(formatter);
    }
}
