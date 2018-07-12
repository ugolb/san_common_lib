package models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Builder
@Getter
@Setter
public class UserAuthModel {

    @Size(min=1, max=20)
    private String userName;

    @NotNull
    @Size(min=5, max=30)
    private String email;

    @NotNull
    @Size(min=6, max=30)
    private String password;
}
