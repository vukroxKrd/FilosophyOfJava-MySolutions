package ru.brown.chapters.Interfaces.page279;

import java.nio.CharBuffer;

public class AdaptedRandomDoubles extends RandomDoubles
        implements Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if (count-- == 0)
            return -1;
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }
}

