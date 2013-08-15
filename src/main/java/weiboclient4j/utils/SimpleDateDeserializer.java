package weiboclient4j.utils;

//import org.codehaus.jackson.JsonParseException;
//import org.codehaus.jackson.JsonParser;
//import org.codehaus.jackson.map.DeserializationContext;
//import org.codehaus.jackson.map.deser.std.DateDeserializer;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Hover Ruan
 */
public class SimpleDateDeserializer extends DateDeserializers.DateDeserializer {

    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    protected Date _parseDate(JsonParser jp, DeserializationContext ctxt) throws IOException {
        try {
            return DATE_FORMAT.parse(jp.getText());
        } catch (ParseException e) {
            throw new JsonParseException(e.getMessage(), jp.getCurrentLocation());
        }
    }
}
