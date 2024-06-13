package com.aj.SmartConnectPro.forms;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserForm {
    @NotBlank(message = "Username is required")
    @Size(message = "Min 3 Characters is required",min = 3)
    private String name;
    @Email(message = "Invalid Email Address")
    private String email;
    @NotBlank(message = "Password is missing")
    @Size(message = "Minimum 6 characters is reuqired", min = 6)
    private String password;
    @NotBlank(message = "About is required")
    private String about;
    @Size(min = 10 )
    private String phoneNumber;


}
