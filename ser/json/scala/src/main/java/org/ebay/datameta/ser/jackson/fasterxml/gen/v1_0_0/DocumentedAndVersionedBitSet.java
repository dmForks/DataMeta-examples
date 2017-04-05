package org.ebay.datameta.ser.jackson.fasterxml.gen.v1_0_0;

import org.ebay.datameta.dom.BitSetImpl;
import org.ebay.datameta.util.jdk.SemanticVersion;

import java.math.BigDecimal;
/**
This Bit Set maps:
<ul>
<li>zero to ten and one hundredth</li>
<li>one to all ones</li>
<li>maps two to all twos</li>
</ul>
And that's <b><i>it</i></b> to it!

 * This class is generated by
 * <a href='https://github.com/eBayDataMeta/DataMeta'>DataMeta</a>.
 */
public final class DocumentedAndVersionedBitSet extends BitSetImpl<BigDecimal>{
    public static final int MAX_BIT = 2;
    public static final int COUNT = MAX_BIT + 1;
  // we do not expect huge arrays here, the sizes should be very limited and likely continuous.
    private static final BigDecimal[] mapping = new BigDecimal[COUNT];
    static {
        mapping[0] =  new BigDecimal(10.01) ;
        mapping[1] =  new BigDecimal(111.111) ;
        mapping[2] =  new BigDecimal(2222.2222) ;
    }

    public DocumentedAndVersionedBitSet() {
    }

    public DocumentedAndVersionedBitSet(long[] image) {
        super(image);
    }

    public final int getCount() { return COUNT; }
    public final BigDecimal[] getMap() { return mapping;}
    public static final SemanticVersion VERSION = SemanticVersion.parse("1.0.0");

    public final SemanticVersion getVersion() { return VERSION; }
}
