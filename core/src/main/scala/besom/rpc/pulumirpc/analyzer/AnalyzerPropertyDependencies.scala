// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package pulumirpc.analyzer

/** AnalyzerPropertyDependencies describes the resources that a particular property depends on.
  *
  * @param urns
  *   A list of URNs this property depends on.
  */
@SerialVersionUID(0L)
final case class AnalyzerPropertyDependencies(
    urns: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[AnalyzerPropertyDependencies] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      urns.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
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
      urns.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def clearUrns = copy(urns = _root_.scala.Seq.empty)
    def addUrns(__vs: _root_.scala.Predef.String *): AnalyzerPropertyDependencies = addAllUrns(__vs)
    def addAllUrns(__vs: Iterable[_root_.scala.Predef.String]): AnalyzerPropertyDependencies = copy(urns = urns ++ __vs)
    def withUrns(__v: _root_.scala.Seq[_root_.scala.Predef.String]): AnalyzerPropertyDependencies = copy(urns = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => urns
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(urns.iterator.map(_root_.scalapb.descriptors.PString(_)).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: pulumirpc.analyzer.AnalyzerPropertyDependencies.type = pulumirpc.analyzer.AnalyzerPropertyDependencies
    // @@protoc_insertion_point(GeneratedMessage[pulumirpc.AnalyzerPropertyDependencies])
}

object AnalyzerPropertyDependencies extends scalapb.GeneratedMessageCompanion[pulumirpc.analyzer.AnalyzerPropertyDependencies] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[pulumirpc.analyzer.AnalyzerPropertyDependencies] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): pulumirpc.analyzer.AnalyzerPropertyDependencies = {
    val __urns: _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String] = new _root_.scala.collection.immutable.VectorBuilder[_root_.scala.Predef.String]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __urns += _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    pulumirpc.analyzer.AnalyzerPropertyDependencies(
        urns = __urns.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[pulumirpc.analyzer.AnalyzerPropertyDependencies] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      pulumirpc.analyzer.AnalyzerPropertyDependencies(
        urns = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AnalyzerProto.javaDescriptor.getMessageTypes().get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AnalyzerProto.scalaDescriptor.messages(4)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = pulumirpc.analyzer.AnalyzerPropertyDependencies(
    urns = _root_.scala.Seq.empty
  )
  implicit class AnalyzerPropertyDependenciesLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.analyzer.AnalyzerPropertyDependencies]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, pulumirpc.analyzer.AnalyzerPropertyDependencies](_l) {
    def urns: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.urns)((c_, f_) => c_.copy(urns = f_))
  }
  final val URNS_FIELD_NUMBER = 1
  def of(
    urns: _root_.scala.Seq[_root_.scala.Predef.String]
  ): _root_.pulumirpc.analyzer.AnalyzerPropertyDependencies = _root_.pulumirpc.analyzer.AnalyzerPropertyDependencies(
    urns
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[pulumirpc.AnalyzerPropertyDependencies])
}
