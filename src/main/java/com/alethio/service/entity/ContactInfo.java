package com.alethio.service.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
public class ContactInfo {

    private String contactEmail;

    private String contactName;

    private String mobile;

}
