package tw.yukina.notion.sdk.model.database.property;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonDeserialize(using = JsonDeserializer.None.class)
public class RelationProperty extends Property {

    private static final String RELATION_FIELD = "relation";

    @JsonProperty(RELATION_FIELD)
    private RelationObject relationObject;

}