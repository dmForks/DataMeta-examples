package org.ebay.datameta.ser.jackson.fasterxml.gen.v1_0_0;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


import org.ebay.datameta.dom.DataMetaSame;
import org.ebay.datameta.util.jdk.SemanticVersion;

/**
An example of <b>everything</b> thrown at it,
All we have.

 * This class is generated by
 * <a href='https://github.com/eBayDataMeta/DataMeta'>DataMeta</a>.
 */
public class KitchenSink_DmSameFull implements DataMetaSame<KitchenSink>{
    /**
    * Convenience instance.
    */
    public final static KitchenSink_DmSameFull I = new KitchenSink_DmSameFull();
    @Override public boolean isSame(final KitchenSink one, final KitchenSink another) {
        if(one == another) return true; // same object or both are null
        //noinspection SimplifiableIfStatement
        if(one == null || another == null) return false; // whichever of them is null but the other is not
        
        final List<EmbeddedType> embeds___1__ = one.getEmbeds();
        final List<EmbeddedType> embeds___2__ = another.getEmbeds();
        if(embeds___1__ != embeds___2__ )  {
            if(embeds___1__ == null || embeds___2__ == null ) return false; // one of them is null but not both -- not equal short-circuit
            java.util.ListIterator<EmbeddedType> embeds___li1__ = embeds___1__.listIterator();
            java.util.ListIterator<EmbeddedType> embeds___li2__ = embeds___2__.listIterator();
            while(embeds___li1__.hasNext() && embeds___li2__.hasNext()) {
                final EmbeddedType o1 = embeds___li1__.next(), o2 = embeds___li2__.next();
                if(!(o1 == null ? o2 == null : EmbeddedType_DmSameFull.I.isSame(o1, o2))) return false; // shortcircuit to false
            }
            if(embeds___li1__.hasNext() || embeds___li2__.hasNext()) return false; // leftover elements in one
        }

        final LinkedList<Integer> ints___1__ = one.getInts();
        final LinkedList<Integer> ints___2__ = another.getInts();
        if(ints___1__ != ints___2__ )  {
            if(ints___1__ == null || ints___2__ == null ) return false; // one of them is null but not both -- not equal short-circuit
            java.util.ListIterator<Integer> ints___li1__ = ints___1__.listIterator();
            java.util.ListIterator<Integer> ints___li2__ = ints___2__.listIterator();
            while(ints___li1__.hasNext() && ints___li2__.hasNext()) {
                final Integer o1 = ints___li1__.next(), o2 = ints___li2__.next();
                if(!(o1 == null ? o2 == null : EQ.isSame(o1, o2))) return false; // shortcircuit to false
            }
            if(ints___li1__.hasNext() || ints___li2__.hasNext()) return false; // leftover elements in one
        }

        return EQ.isSame(one.getId(), another.getId()) && EQ.isSame(one.getContext(), another.getContext()) && EQ.isSame(one.getFieldName(), another.getFieldName()) && (one.getStrings() != null && one.getStrings().equals(another.getStrings())) && (one.getTimes() != null && one.getTimes().equals(another.getTimes())) && (one.getIdLessNess() != null && one.getIdLessNess().equals(another.getIdLessNess())) && EQ.isSame(one.getName(), another.getName()) && EQ.isSame(one.getCode(), another.getCode()) && (one.getColor() == another.getColor()) && (one.getType() == another.getType()) && EQ.isSame(one.getChoices(), another.getChoices()) && EQ.isSame(one.getLength(), another.getLength()) && EQ.isSame(one.getBearing(), another.getBearing()) && EQ.isSame(one.getFrequency(), another.getFrequency()) && EQ.isSame(one.getAmplitude(), another.getAmplitude()) && EQ.isSame(one.getWeight(), another.getWeight()) && EQ.isSame(one.getDiameter(), another.getDiameter()) && EQ.isSame(one.getRadius(), another.getRadius()) && EQ.isSame(one.getTemperature(), another.getTemperature()) && EQ.isSame(one.getIsRequired(), another.getIsRequired()) && EQ.isSame(one.getIsMeasurable(), another.getIsMeasurable()) && EQ.isSame(one.getComments(), another.getComments()) && EQ.isSame(one.getCreated(), another.getCreated()) && EQ.isSame(one.getAltered(), another.getAltered()) && EQ.isSame(one.getSalary(), another.getSalary()) && EQ.isSame(one.getHomePage(), another.getHomePage()) && EQ.isSame(one.getWorkPage(), another.getWorkPage()) && EQ.isSame(one.getHomeEmail(), another.getHomeEmail()) && EQ.isSame(one.getMobilePhone(), another.getMobilePhone()) && EQ.isSame(one.getHomeZip(), another.getHomeZip()) && EQ.isSame(one.getWorkZip(), another.getWorkZip()) && EQ.isSame(one.getLastFirstName(), another.getLastFirstName()) && EQ.isSame(one.getBytes(), another.getBytes()) && EmbeddedType_DmSameFull.I.isSame(one.getEmb(), another.getEmb()) && Embodiment_DmSameFull.I.isSame(one.getEmbo(), another.getEmbo());
    }
    public static final SemanticVersion VERSION = SemanticVersion.parse("1.0.0");
}
