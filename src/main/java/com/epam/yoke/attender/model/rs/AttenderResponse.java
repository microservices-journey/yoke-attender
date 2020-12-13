package com.epam.yoke.attender.model.rs;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Schema(description = "Attender response")
public class AttenderResponse {

    @Schema(description = "Requested name")
    private String name;

    @Schema(description = "Requested email")
    private String email;

    @Schema(description = "Requested id")
    private String id;
}
