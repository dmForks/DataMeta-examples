package org.ebay.datameta.ser.jackson.fasterxml.gen.v1_0_0

import org.ebay.datameta.ser.jackson.fasterxml.JacksonUtil._
import org.ebay.datameta.ser.jackson.fasterxml.Jsonable
import com.fasterxml.jackson.core.{JsonFactory, JsonGenerator, JsonParser, JsonToken}
import com.fasterxml.jackson.core.JsonToken.{END_ARRAY, END_OBJECT}

/**

 * This class is generated by
 * <a href='https://github.com/eBayDataMeta/DataMeta'>DataMeta</a>.
 */
object WithoutIdentity_JSONable extends Jsonable[WithoutIdentity] {

  override def write(out: JsonGenerator, value: WithoutIdentity) {
    value.verify()

    out.writeNumberField("a", value.getA)
    out.writeNumberField("b", value.getB)
  }

  override def read(in: JsonParser, value: WithoutIdentity): WithoutIdentity = {
    while(in.nextToken() != END_OBJECT) {
      val fldName = in.getCurrentName
      if(fldName != null) {
        in.nextToken()
        fldName match {

          case "a" =>
            value.setA(in.getIntValue)

          case "b" =>
            value.setB(in.getLongValue)

          case _ => throw new IllegalArgumentException(s"""Unhandled field "$fldName" """)
        }
      }
    }
    value
  }

  override def read(in: JsonParser): WithoutIdentity = {
    read(in, new WithoutIdentity())
  }
}
