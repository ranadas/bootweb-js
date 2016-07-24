package com.rdas.spring.model;

import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by rdas on 23/07/2016.
 */
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserCreateForm {

    @NotEmpty
    @Size(max = 64)
    private String id;
    @NotEmpty
    @Size(max = 64)
    private String password1;
    private String password2;
}
