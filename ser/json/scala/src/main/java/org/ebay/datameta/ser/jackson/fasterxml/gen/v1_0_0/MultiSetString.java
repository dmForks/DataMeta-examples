package org.ebay.datameta.ser.jackson.fasterxml.gen.v1_0_0;

import org.ebay.datameta.dom.BitSetImpl;
import org.ebay.datameta.util.jdk.SemanticVersion;


/**

 * This class is generated by
 * <a href='https://github.com/eBayDataMeta/DataMeta'>DataMeta</a>.
 */
public final class MultiSetString extends BitSetImpl<String>{
    public static final int MAX_BIT = 131;
    public static final int COUNT = MAX_BIT + 1;
  // we do not expect huge arrays here, the sizes should be very limited and likely continuous.
    private static final String[] mapping = new String[COUNT];
    static {
        mapping[0] = " a ";
        mapping[1] = "  First choice ";
        mapping[2] = " Uninterpolated \\t stringwith wha\\teve\\reven with multiline";
        mapping[3] = "Interpolated \t String \nWith all \n\tescapes active";
        mapping[4] = "Uninterpolated \\t string angled  delimiters";
        mapping[65] = "sixty Five";
        mapping[66] = "sixty Six";
        mapping[96] = "ninety Six";
        mapping[128] = "one twenty eight";
        mapping[131] = "one thirty one";
    }

    public MultiSetString() {
    }

    public MultiSetString(long[] image) {
        super(image);
    }

    public final int getCount() { return COUNT; }
    public final String[] getMap() { return mapping;}
    public static final SemanticVersion VERSION = SemanticVersion.parse("1.0.0");

    public final SemanticVersion getVersion() { return VERSION; }
}
