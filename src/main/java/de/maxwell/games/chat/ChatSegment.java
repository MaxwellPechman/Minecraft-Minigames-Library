package de.maxwell.games.chat;

import de.maxwell.games.chat.code.ColorCode;
import de.maxwell.games.chat.code.FormatCode;

public interface ChatSegment extends CharSequence {

    boolean hasColor();

    ColorCode getColor();

    ColorCode[] getColors();

    void setColor(int index, ColorCode color);

    void removeColor(ColorCode color);

    void removeColorAt();

    void removeColors();

    boolean hasFormat();

    FormatCode getFormat();

    FormatCode[] getFormats();

    void setFormat(int index, FormatCode format);

    SegmentType getType();

    String getSegment();
}