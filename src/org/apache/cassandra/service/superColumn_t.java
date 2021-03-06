/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.cassandra.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;

import org.apache.thrift.protocol.*;
import org.apache.thrift.transport.*;

public class superColumn_t implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("superColumn_t");
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField COLUMNS_FIELD_DESC = new TField("columns", TType.LIST, (short)2);

  public String name;
  public static final int NAME = 1;
  public List<column_t> columns;
  public static final int COLUMNS = 2;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean name = false;
    public boolean columns = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(COLUMNS, new FieldMetaData("columns", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, column_t.class))));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(superColumn_t.class, metaDataMap);
  }

  public superColumn_t() {
  }

  public superColumn_t(
    String name,
    List<column_t> columns)
  {
    this();
    this.name = name;
    this.__isset.name = (name != null);
    this.columns = columns;
    this.__isset.columns = (columns != null);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public superColumn_t(superColumn_t other) {
    __isset.name = other.__isset.name;
    if (other.name != null) {
      this.name = other.name;
    }
    __isset.columns = other.__isset.columns;
    if (other.columns != null) {
      List<column_t> __this__columns = new ArrayList<column_t>();
      for (column_t other_element : other.columns) {
        __this__columns.add(new column_t(other_element));
      }
      this.columns = __this__columns;
    }
  }

  @Override
  public superColumn_t clone() {
    return new superColumn_t(this);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
    this.__isset.name = (name != null);
  }

  public void unsetName() {
    this.__isset.name = false;
  }

  // Returns true if field name is set (has been asigned a value) and false otherwise
  public boolean isSetName() {
    return this.__isset.name;
  }

  public void setNameIsSet(boolean value) {
    this.__isset.name = value;
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<column_t> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(column_t elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<column_t>();
    }
    this.columns.add(elem);
    this.__isset.columns = true;
  }

  public List<column_t> getColumns() {
    return this.columns;
  }

  public void setColumns(List<column_t> columns) {
    this.columns = columns;
    this.__isset.columns = (columns != null);
  }

  public void unsetColumns() {
    this.columns = null;
    this.__isset.columns = false;
  }

  // Returns true if field columns is set (has been asigned a value) and false otherwise
  public boolean isSetColumns() {
    return this.__isset.columns;
  }

  public void setColumnsIsSet(boolean value) {
    this.__isset.columns = value;
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case NAME:
      setName((String)value);
      break;

    case COLUMNS:
      setColumns((List<column_t>)value);
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case NAME:
      return getName();

    case COLUMNS:
      return getColumns();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case NAME:
      return this.__isset.name;
    case COLUMNS:
      return this.__isset.columns;
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof superColumn_t)
      return this.equals((superColumn_t)that);
    return false;
  }

  public boolean equals(superColumn_t that) {
    if (that == null)
      return false;

    boolean this_present_name = true && (this.name != null);
    boolean that_present_name = true && (that.name != null);
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_columns = true && (this.columns != null);
    boolean that_present_columns = true && (that.columns != null);
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case NAME:
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
            this.__isset.name = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case COLUMNS:
          if (field.type == TType.LIST) {
            {
              TList _list18 = iprot.readListBegin();
              this.columns = new ArrayList<column_t>(_list18.size);
              for (int _i19 = 0; _i19 < _list18.size; ++_i19)
              {
                column_t _elem20;
                _elem20 = new column_t();
                _elem20.read(iprot);
                this.columns.add(_elem20);
              }
              iprot.readListEnd();
            }
            this.__isset.columns = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.columns != null) {
      oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.columns.size()));
        for (column_t _iter21 : this.columns)        {
          _iter21.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("superColumn_t(");
    boolean first = true;

    if (!first) sb.append(", ");
    sb.append("name:");
    sb.append(this.name);
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    sb.append(this.columns);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

