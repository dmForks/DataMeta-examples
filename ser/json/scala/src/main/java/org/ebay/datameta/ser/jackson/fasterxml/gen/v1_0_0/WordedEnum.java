package org.ebay.datameta.ser.jackson.fasterxml.gen.v1_0_0;
import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

import org.ebay.datameta.dom.DataMetaEntity;
import org.ebay.datameta.util.jdk.SemanticVersion;
import static java.util.Collections.unmodifiableMap;

/**
<b>Worded enum</b>: can specify any count separated by commas and/or whitespace
must start with a word character such as a letter.
Used in {@link KitchenSink}

 * This enum is generated by
 * <a href='https://github.com/eBayDataMeta/DataMeta'>DataMeta</a>.
 */
public enum WordedEnum implements DataMetaEntity {
  Int, Long, String, VarString, Bool, _Date, Time, Bitset, DateTime;
  /**
   * Staple Java lazy init idiom.
   * See <a href="http://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom">this article</a>.
   */
  private static class LazyInit {
      final static Map<String, WordedEnum> NAME_TO_ENUM;
      final static WordedEnum[] ORD_TO_ENUM = new WordedEnum[values().length];

      static {
          final Map<String, WordedEnum> map = new HashMap<>(values().length * 3 / 2 + 1);
          for (int ix = 0; ix < values().length; ix++) {
              final WordedEnum val = values()[ix];
              ORD_TO_ENUM[ix] = val;
              map.put(val.name(), val);
          }
          NAME_TO_ENUM = unmodifiableMap(map);
      }
  }

  /**
   * Retrieve a value for the given textual form.
   * Lenient replacement for {@link Enum#valueOf(Class, java.lang.String)} that returns null
   * instead of throwing an exception.
   */
  @Nullable public static WordedEnum forName(final String textual) {
      return LazyInit.NAME_TO_ENUM.get(textual);
  }

  /**
   * Fast instance retrieval for the given ordinal, works super fast because it uses an array
   * indexing, not a map.
   */
  @Nullable public static WordedEnum forOrd(final int ordinal) {
      return LazyInit.ORD_TO_ENUM[ordinal];
  }

  public static interface Visitor<IN, OUT> {
        OUT visitInt(IN input);
        OUT visitLong(IN input);
        OUT visitString(IN input);
        OUT visitVarString(IN input);
        OUT visitBool(IN input);
        OUT visit_Date(IN input);
        OUT visitTime(IN input);
        OUT visitBitset(IN input);
        OUT visitDateTime(IN input);
    }

    /** Use this switch with your {@link Visitor} implementation,
     * There should be no other switches of this kind in your program.
     * If the enum changes, all implementations will break and will need to be fixed.
     * This will ensure that no unhandled cases will be left in the program.
     */
     public static <IN, OUT> OUT visit(final WordedEnum value, final Visitor<IN, OUT> visitor, final IN input) {
        switch(value) {
          case Int:
              return visitor.visitInt(input);
          case Long:
              return visitor.visitLong(input);
          case String:
              return visitor.visitString(input);
          case VarString:
              return visitor.visitVarString(input);
          case Bool:
              return visitor.visitBool(input);
          case _Date:
              return visitor.visit_Date(input);
          case Time:
              return visitor.visitTime(input);
          case Bitset:
              return visitor.visitBitset(input);
          case DateTime:
              return visitor.visitDateTime(input);
            default:
                throw new IllegalArgumentException("Unsupported enum value: " + value);
        }
     }
    public static final SemanticVersion VERSION = SemanticVersion.parse("1.0.0");

    public final SemanticVersion getVersion() { return VERSION; }
}
