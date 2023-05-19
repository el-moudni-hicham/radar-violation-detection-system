// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstract_json_schema_property_object.proto

package openapitools;

public final class AbstractJsonSchemaPropertyObjectOuterClass {
  private AbstractJsonSchemaPropertyObjectOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbstractJsonSchemaPropertyObjectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:openapitools.AbstractJsonSchemaPropertyObject)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string title = 110371416;</code>
     * @return The title.
     */
    java.lang.String getTitle();
    /**
     * <code>string title = 110371416;</code>
     * @return The bytes for title.
     */
    com.google.protobuf.ByteString
        getTitleBytes();

    /**
     * <code>bool readOnly = 330812831;</code>
     * @return The readOnly.
     */
    boolean getReadOnly();
  }
  /**
   * Protobuf type {@code openapitools.AbstractJsonSchemaPropertyObject}
   */
  public  static final class AbstractJsonSchemaPropertyObject extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:openapitools.AbstractJsonSchemaPropertyObject)
      AbstractJsonSchemaPropertyObjectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbstractJsonSchemaPropertyObject.newBuilder() to construct.
    private AbstractJsonSchemaPropertyObject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbstractJsonSchemaPropertyObject() {
      title_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbstractJsonSchemaPropertyObject();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbstractJsonSchemaPropertyObject(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 882971330: {
              java.lang.String s = input.readStringRequireUtf8();

              title_ = s;
              break;
            }
            case -1648464648: {

              readOnly_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return openapitools.AbstractJsonSchemaPropertyObjectOuterClass.internal_static_openapitools_AbstractJsonSchemaPropertyObject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return openapitools.AbstractJsonSchemaPropertyObjectOuterClass.internal_static_openapitools_AbstractJsonSchemaPropertyObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject.class, openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject.Builder.class);
    }

    public static final int TITLE_FIELD_NUMBER = 110371416;
    private volatile java.lang.Object title_;
    /**
     * <code>string title = 110371416;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      }
    }
    /**
     * <code>string title = 110371416;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int READONLY_FIELD_NUMBER = 330812831;
    private boolean readOnly_;
    /**
     * <code>bool readOnly = 330812831;</code>
     * @return The readOnly.
     */
    public boolean getReadOnly() {
      return readOnly_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getTitleBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 110371416, title_);
      }
      if (readOnly_ != false) {
        output.writeBool(330812831, readOnly_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTitleBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(110371416, title_);
      }
      if (readOnly_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(330812831, readOnly_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject)) {
        return super.equals(obj);
      }
      openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject other = (openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject) obj;

      if (!getTitle()
          .equals(other.getTitle())) return false;
      if (getReadOnly()
          != other.getReadOnly()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
      hash = (37 * hash) + READONLY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getReadOnly());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code openapitools.AbstractJsonSchemaPropertyObject}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:openapitools.AbstractJsonSchemaPropertyObject)
        openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObjectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return openapitools.AbstractJsonSchemaPropertyObjectOuterClass.internal_static_openapitools_AbstractJsonSchemaPropertyObject_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return openapitools.AbstractJsonSchemaPropertyObjectOuterClass.internal_static_openapitools_AbstractJsonSchemaPropertyObject_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject.class, openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject.Builder.class);
      }

      // Construct using openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        title_ = "";

        readOnly_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return openapitools.AbstractJsonSchemaPropertyObjectOuterClass.internal_static_openapitools_AbstractJsonSchemaPropertyObject_descriptor;
      }

      @java.lang.Override
      public openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject getDefaultInstanceForType() {
        return openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject.getDefaultInstance();
      }

      @java.lang.Override
      public openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject build() {
        openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject buildPartial() {
        openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject result = new openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject(this);
        result.title_ = title_;
        result.readOnly_ = readOnly_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject) {
          return mergeFrom((openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject other) {
        if (other == openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject.getDefaultInstance()) return this;
        if (!other.getTitle().isEmpty()) {
          title_ = other.title_;
          onChanged();
        }
        if (other.getReadOnly() != false) {
          setReadOnly(other.getReadOnly());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object title_ = "";
      /**
       * <code>string title = 110371416;</code>
       * @return The title.
       */
      public java.lang.String getTitle() {
        java.lang.Object ref = title_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          title_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string title = 110371416;</code>
       * @return The bytes for title.
       */
      public com.google.protobuf.ByteString
          getTitleBytes() {
        java.lang.Object ref = title_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          title_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string title = 110371416;</code>
       * @param value The title to set.
       * @return This builder for chaining.
       */
      public Builder setTitle(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        title_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string title = 110371416;</code>
       * @return This builder for chaining.
       */
      public Builder clearTitle() {
        
        title_ = getDefaultInstance().getTitle();
        onChanged();
        return this;
      }
      /**
       * <code>string title = 110371416;</code>
       * @param value The bytes for title to set.
       * @return This builder for chaining.
       */
      public Builder setTitleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        title_ = value;
        onChanged();
        return this;
      }

      private boolean readOnly_ ;
      /**
       * <code>bool readOnly = 330812831;</code>
       * @return The readOnly.
       */
      public boolean getReadOnly() {
        return readOnly_;
      }
      /**
       * <code>bool readOnly = 330812831;</code>
       * @param value The readOnly to set.
       * @return This builder for chaining.
       */
      public Builder setReadOnly(boolean value) {
        
        readOnly_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool readOnly = 330812831;</code>
       * @return This builder for chaining.
       */
      public Builder clearReadOnly() {
        
        readOnly_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:openapitools.AbstractJsonSchemaPropertyObject)
    }

    // @@protoc_insertion_point(class_scope:openapitools.AbstractJsonSchemaPropertyObject)
    private static final openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject();
    }

    public static openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbstractJsonSchemaPropertyObject>
        PARSER = new com.google.protobuf.AbstractParser<AbstractJsonSchemaPropertyObject>() {
      @java.lang.Override
      public AbstractJsonSchemaPropertyObject parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbstractJsonSchemaPropertyObject(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbstractJsonSchemaPropertyObject> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbstractJsonSchemaPropertyObject> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public openapitools.AbstractJsonSchemaPropertyObjectOuterClass.AbstractJsonSchemaPropertyObject getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openapitools_AbstractJsonSchemaPropertyObject_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_openapitools_AbstractJsonSchemaPropertyObject_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*abstract_json_schema_property_object.p" +
      "roto\022\014openapitools\"J\n AbstractJsonSchema" +
      "PropertyObject\022\020\n\005title\030\330\304\3204 \001(\t\022\024\n\010read" +
      "Only\030\237\233\337\235\001 \001(\010b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_openapitools_AbstractJsonSchemaPropertyObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_openapitools_AbstractJsonSchemaPropertyObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_openapitools_AbstractJsonSchemaPropertyObject_descriptor,
        new java.lang.String[] { "Title", "ReadOnly", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
