package tw.yukina.notion.sdk.model.block;

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
public class CalloutBlock extends Block implements TextBlock {
    private static final String CALLOUT_FIELD = "callout";

    @JsonProperty(CALLOUT_FIELD)
    private Callout callout;

    @Override
    public void setParagraph(Paragraph paragraph) {
        if(callout == null) callout = new Callout();
        callout.setRichTexts(paragraph.getRichTexts());
        callout.setChildren(paragraph.getChildren());
    }

    @Override
    public Paragraph getParagraph() {
        return callout;
    }
}
