// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package pulumirpc.analyzer

/** AnalyzerInfo provides metadata about a PolicyPack inside an analyzer.
  *
  * @param name
  *   Name of the PolicyPack.
  * @param displayName
  *   Pretty name for the PolicyPack.
  * @param policies
  *   Metadata about policies contained in PolicyPack.
  * @param version
  *   Version of the Policy Pack.
  * @param supportsConfig
  *   Whether the Policy Pack supports config.
  * @param initialConfig
  *   Map of policy name to config.
  */
@SerialVersionUID(0L)
final case class AnalyzerInfo(
    name: _root_.scala.Predef.String = "",
    displayName: _root_.scala.Predef.String = "",
    policies: _root_.scala.Seq[pulumirpc.analyzer.PolicyInfo] = _root_.scala.Seq.empty,
    version: _root_.scala.Predef.String = "",
    supportsConfig: _root_.scala.Boolean = false,
    initialConfig: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig] = _root_.scala.collection.immutable.Map.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[AnalyzerInfo] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = displayName
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      policies.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = version
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = supportsConfig
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(5, __value)
        }
      };
      initialConfig.foreach { __item =>
        val __value = pulumirpc.analyzer.AnalyzerInfo._typemapper_initialConfig.toBase(__item)
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = displayName
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      policies.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = version
        if (!__v.isEmpty) {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = supportsConfig
        if (__v != false) {
          _output__.writeBool(5, __v)
        }
      };
      initialConfig.foreach { __v =>
        val __m = pulumirpc.analyzer.AnalyzerInfo._typemapper_initialConfig.toBase(__v)
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def withName(__v: _root_.scala.Predef.String): AnalyzerInfo = copy(name = __v)
    def withDisplayName(__v: _root_.scala.Predef.String): AnalyzerInfo = copy(displayName = __v)
    def clearPolicies = copy(policies = _root_.scala.Seq.empty)
    def addPolicies(__vs: pulumirpc.analyzer.PolicyInfo *): AnalyzerInfo = addAllPolicies(__vs)
    def addAllPolicies(__vs: Iterable[pulumirpc.analyzer.PolicyInfo]): AnalyzerInfo = copy(policies = policies ++ __vs)
    def withPolicies(__v: _root_.scala.Seq[pulumirpc.analyzer.PolicyInfo]): AnalyzerInfo = copy(policies = __v)
    def withVersion(__v: _root_.scala.Predef.String): AnalyzerInfo = copy(version = __v)
    def withSupportsConfig(__v: _root_.scala.Boolean): AnalyzerInfo = copy(supportsConfig = __v)
    def clearInitialConfig = copy(initialConfig = _root_.scala.collection.immutable.Map.empty)
    def addInitialConfig(__vs: (_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig) *): AnalyzerInfo = addAllInitialConfig(__vs)
    def addAllInitialConfig(__vs: Iterable[(_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig)]): AnalyzerInfo = copy(initialConfig = initialConfig ++ __vs)
    def withInitialConfig(__v: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig]): AnalyzerInfo = copy(initialConfig = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = displayName
          if (__t != "") __t else null
        }
        case 3 => policies
        case 4 => {
          val __t = version
          if (__t != "") __t else null
        }
        case 5 => {
          val __t = supportsConfig
          if (__t != false) __t else null
        }
        case 6 => initialConfig.iterator.map(pulumirpc.analyzer.AnalyzerInfo._typemapper_initialConfig.toBase(_)).toSeq
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PString(displayName)
        case 3 => _root_.scalapb.descriptors.PRepeated(policies.iterator.map(_.toPMessage).toVector)
        case 4 => _root_.scalapb.descriptors.PString(version)
        case 5 => _root_.scalapb.descriptors.PBoolean(supportsConfig)
        case 6 => _root_.scalapb.descriptors.PRepeated(initialConfig.iterator.map(pulumirpc.analyzer.AnalyzerInfo._typemapper_initialConfig.toBase(_).toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: pulumirpc.analyzer.AnalyzerInfo.type = pulumirpc.analyzer.AnalyzerInfo
    // @@protoc_insertion_point(GeneratedMessage[pulumirpc.AnalyzerInfo])
}

object AnalyzerInfo extends scalapb.GeneratedMessageCompanion[pulumirpc.analyzer.AnalyzerInfo] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[pulumirpc.analyzer.AnalyzerInfo] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): pulumirpc.analyzer.AnalyzerInfo = {
    var __name: _root_.scala.Predef.String = ""
    var __displayName: _root_.scala.Predef.String = ""
    val __policies: _root_.scala.collection.immutable.VectorBuilder[pulumirpc.analyzer.PolicyInfo] = new _root_.scala.collection.immutable.VectorBuilder[pulumirpc.analyzer.PolicyInfo]
    var __version: _root_.scala.Predef.String = ""
    var __supportsConfig: _root_.scala.Boolean = false
    val __initialConfig: _root_.scala.collection.mutable.Builder[(_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig), _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig]] = _root_.scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __name = _input__.readStringRequireUtf8()
        case 18 =>
          __displayName = _input__.readStringRequireUtf8()
        case 26 =>
          __policies += _root_.scalapb.LiteParser.readMessage[pulumirpc.analyzer.PolicyInfo](_input__)
        case 34 =>
          __version = _input__.readStringRequireUtf8()
        case 40 =>
          __supportsConfig = _input__.readBool()
        case 50 =>
          __initialConfig += pulumirpc.analyzer.AnalyzerInfo._typemapper_initialConfig.toCustom(_root_.scalapb.LiteParser.readMessage[pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry](_input__))
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    pulumirpc.analyzer.AnalyzerInfo(
        name = __name,
        displayName = __displayName,
        policies = __policies.result(),
        version = __version,
        supportsConfig = __supportsConfig,
        initialConfig = __initialConfig.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[pulumirpc.analyzer.AnalyzerInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      pulumirpc.analyzer.AnalyzerInfo(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        displayName = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        policies = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[pulumirpc.analyzer.PolicyInfo]]).getOrElse(_root_.scala.Seq.empty),
        version = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        supportsConfig = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        initialConfig = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Seq[pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry]]).getOrElse(_root_.scala.Seq.empty).iterator.map(pulumirpc.analyzer.AnalyzerInfo._typemapper_initialConfig.toCustom(_)).toMap
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AnalyzerProto.javaDescriptor.getMessageTypes().get(8)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AnalyzerProto.scalaDescriptor.messages(8)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 3 => __out = pulumirpc.analyzer.PolicyInfo
      case 6 => __out = pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = pulumirpc.analyzer.AnalyzerInfo(
    name = "",
    displayName = "",
    policies = _root_.scala.Seq.empty,
    version = "",
    supportsConfig = false,
    initialConfig = _root_.scala.collection.immutable.Map.empty
  )
  @SerialVersionUID(0L)
  final case class InitialConfigEntry(
      key: _root_.scala.Predef.String = "",
      value: _root_.scala.Option[pulumirpc.analyzer.PolicyConfig] = _root_.scala.None,
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[InitialConfigEntry] {
      @transient
      private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
      private[this] def __computeSerializedSize(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = key
          if (!__value.isEmpty) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        if (value.isDefined) {
          val __value = value.get
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
        };
        __size += unknownFields.serializedSize
        __size
      }
      override def serializedSize: _root_.scala.Int = {
        var __size = __serializedSizeMemoized
        if (__size == 0) {
          __size = __computeSerializedSize() + 1
          __serializedSizeMemoized = __size
        }
        __size - 1
        
      }
      def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
        {
          val __v = key
          if (!__v.isEmpty) {
            _output__.writeString(1, __v)
          }
        };
        value.foreach { __v =>
          val __m = __v
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(__m.serializedSize)
          __m.writeTo(_output__)
        };
        unknownFields.writeTo(_output__)
      }
      def withKey(__v: _root_.scala.Predef.String): InitialConfigEntry = copy(key = __v)
      def getValue: pulumirpc.analyzer.PolicyConfig = value.getOrElse(pulumirpc.analyzer.PolicyConfig.defaultInstance)
      def clearValue: InitialConfigEntry = copy(value = _root_.scala.None)
      def withValue(__v: pulumirpc.analyzer.PolicyConfig): InitialConfigEntry = copy(value = Option(__v))
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => value.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => value.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion: pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry.type = pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry
      // @@protoc_insertion_point(GeneratedMessage[pulumirpc.AnalyzerInfo.InitialConfigEntry])
  }
  
  object InitialConfigEntry extends scalapb.GeneratedMessageCompanion[pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry] = this
    def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry = {
      var __key: _root_.scala.Predef.String = ""
      var __value: _root_.scala.Option[pulumirpc.analyzer.PolicyConfig] = _root_.scala.None
      var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __key = _input__.readStringRequireUtf8()
          case 18 =>
            __value = Option(__value.fold(_root_.scalapb.LiteParser.readMessage[pulumirpc.analyzer.PolicyConfig](_input__))(_root_.scalapb.LiteParser.readMessage(_input__, _)))
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry(
          key = __key,
          value = __value,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
        pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry(
          key = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[pulumirpc.analyzer.PolicyConfig]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = pulumirpc.analyzer.AnalyzerInfo.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = pulumirpc.analyzer.AnalyzerInfo.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
      (__number: @_root_.scala.unchecked) match {
        case 2 => __out = pulumirpc.analyzer.PolicyConfig
      }
      __out
    }
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry(
      key = "",
      value = _root_.scala.None
    )
    implicit class InitialConfigEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.analyzer.PolicyConfig] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
      def optionalValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[pulumirpc.analyzer.PolicyConfig]] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    @transient
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry, (_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig)] =
      _root_.scalapb.TypeMapper[pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry, (_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig)](__m => (__m.key, __m.getValue))(__p => pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry(__p._1, Some(__p._2)))
    def of(
      key: _root_.scala.Predef.String,
      value: _root_.scala.Option[pulumirpc.analyzer.PolicyConfig]
    ): _root_.pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry = _root_.pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry(
      key,
      value
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[pulumirpc.AnalyzerInfo.InitialConfigEntry])
  }
  
  implicit class AnalyzerInfoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.analyzer.AnalyzerInfo]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, pulumirpc.analyzer.AnalyzerInfo](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def displayName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.displayName)((c_, f_) => c_.copy(displayName = f_))
    def policies: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[pulumirpc.analyzer.PolicyInfo]] = field(_.policies)((c_, f_) => c_.copy(policies = f_))
    def version: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.version)((c_, f_) => c_.copy(version = f_))
    def supportsConfig: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.supportsConfig)((c_, f_) => c_.copy(supportsConfig = f_))
    def initialConfig: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig]] = field(_.initialConfig)((c_, f_) => c_.copy(initialConfig = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val DISPLAYNAME_FIELD_NUMBER = 2
  final val POLICIES_FIELD_NUMBER = 3
  final val VERSION_FIELD_NUMBER = 4
  final val SUPPORTSCONFIG_FIELD_NUMBER = 5
  final val INITIALCONFIG_FIELD_NUMBER = 6
  @transient
  private[analyzer] val _typemapper_initialConfig: _root_.scalapb.TypeMapper[pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry, (_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig)] = implicitly[_root_.scalapb.TypeMapper[pulumirpc.analyzer.AnalyzerInfo.InitialConfigEntry, (_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig)]]
  def of(
    name: _root_.scala.Predef.String,
    displayName: _root_.scala.Predef.String,
    policies: _root_.scala.Seq[pulumirpc.analyzer.PolicyInfo],
    version: _root_.scala.Predef.String,
    supportsConfig: _root_.scala.Boolean,
    initialConfig: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, pulumirpc.analyzer.PolicyConfig]
  ): _root_.pulumirpc.analyzer.AnalyzerInfo = _root_.pulumirpc.analyzer.AnalyzerInfo(
    name,
    displayName,
    policies,
    version,
    supportsConfig,
    initialConfig
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[pulumirpc.AnalyzerInfo])
}