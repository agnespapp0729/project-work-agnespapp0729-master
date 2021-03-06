package hu.uni.eku.tzs.controller.dto;

import hu.uni.eku.tzs.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActorDto {

    private int actorId;

    @NotBlank(message = "The gender of the actor mustn't be empty")
    private Gender actorGender;

    @NotBlank(message = "The quality of the actor mustn't be empty")
    private int actorQuality;

}
