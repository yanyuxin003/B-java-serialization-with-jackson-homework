package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class AgeSerializer extends StdSerializer<Integer> {
    private AgeSerializer() {
        super(Integer.class);
     }

    @Override
    public void serialize(Integer age, JsonGenerator gen, SerializerProvider serializerProvider) throws IOException {
        gen.writeNumber(0);
    }
}
