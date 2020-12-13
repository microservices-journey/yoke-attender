package com.epam.yoke.attender.model.rq;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Schema(description = "Body for create attender")
public class AttenderBody {

    @NotNull(message = "Name is mandatory")
    @Schema(required = true, description = "Requested name")
    private String name;

    @NotNull(message = "Email is mandatory")
    @Schema(required = true, description = "Requested locationId")
    private String email;
}
