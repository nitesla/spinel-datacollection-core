package com.spinel.datacollection.core.dto.request;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class InviteEnumeratorRequest {
    private String enumeratorType;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private MultipartFile document;

    public InviteEnumeratorRequest(String email, String enumeratorType, String firstName, String lastName, String phoneNumber) {
        this.enumeratorType = enumeratorType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
