package tw.yukina.notion.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Color {
    DEFAULT("default"),
    GRAY("gray"),
    BROWN("brown"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    PURPLE("purple"),
    PINK("pink"),
    RED("red"),
    GRAY_BACKGROUND("gray_background"),
    BROWN_BACKGROUND("brown_background"),
    ORANGE_BACKGROUND("orange_background"),
    YELLOW_BACKGROUND("yellow_background"),
    GREEN_BACKGROUND("green_background"),
    BLUE_BACKGROUND("blue_background"),
    PURPLE_BACKGROUND("purple_background"),
    PINK_BACKGROUND("pink_background"),
    RED_BACKGROUND("red_background");

    private final String field;

    Color(String field) {
        this.field = field;
    }

    @JsonValue
    public String getField(){
        return field;
    }

}
