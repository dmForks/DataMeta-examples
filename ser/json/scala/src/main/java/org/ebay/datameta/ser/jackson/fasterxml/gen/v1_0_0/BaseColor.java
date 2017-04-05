package org.ebay.datameta.ser.jackson.fasterxml.gen.v1_0_0;
import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

import org.ebay.datameta.dom.DataMetaEntity;
import org.ebay.datameta.util.jdk.SemanticVersion;
import static java.util.Collections.unmodifiableMap;

/**

 * This enum is generated by
 * <a href='https://github.com/eBayDataMeta/DataMeta'>DataMeta</a>.
 */
public enum BaseColor implements DataMetaEntity {
  Red, Green, Blue;
  /**
   * Staple Java lazy init idiom.
   * See <a href="http://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom">this article</a>.
   */
  private static class LazyInit {
      final static Map<String, BaseColor> NAME_TO_ENUM;
      final static BaseColor[] ORD_TO_ENUM = new BaseColor[values().length];

      static {
          final Map<String, BaseColor> map = new HashMap<>(values().length * 3 / 2 + 1);
          for (int ix = 0; ix < values().length; ix++) {
              final BaseColor val = values()[ix];
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
  @Nullable public static BaseColor forName(final String textual) {
      return LazyInit.NAME_TO_ENUM.get(textual);
  }

  /**
   * Fast instance retrieval for the given ordinal, works super fast because it uses an array
   * indexing, not a map.
   */
  @Nullable public static BaseColor forOrd(final int ordinal) {
      return LazyInit.ORD_TO_ENUM[ordinal];
  }

  public static interface Visitor<IN, OUT> {
        OUT visitRed(IN input);
        OUT visitGreen(IN input);
        OUT visitBlue(IN input);
    }

    /** Use this switch with your {@link Visitor} implementation,
     * There should be no other switches of this kind in your program.
     * If the enum changes, all implementations will break and will need to be fixed.
     * This will ensure that no unhandled cases will be left in the program.
     */
     public static <IN, OUT> OUT visit(final BaseColor value, final Visitor<IN, OUT> visitor, final IN input) {
        switch(value) {
          case Red:
              return visitor.visitRed(input);
          case Green:
              return visitor.visitGreen(input);
          case Blue:
              return visitor.visitBlue(input);
            default:
                throw new IllegalArgumentException("Unsupported enum value: " + value);
        }
     }
    public static final SemanticVersion VERSION = SemanticVersion.parse("1.0.0");

    public final SemanticVersion getVersion() { return VERSION; }
}
