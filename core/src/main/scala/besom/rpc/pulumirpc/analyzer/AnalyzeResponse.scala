// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package pulumirpc.analyzer

/** @param diagnostics
  *   information about policy violations.
  */
@SerialVersionUID(0L)
final case class AnalyzeResponse(
    diagnostics: _root_.scala.Seq[pulumirpc.analyzer.AnalyzeDiagnostic] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[AnalyzeResponse] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      diagnostics.foreach { __item =>
        val __value = __item
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
      diagnostics.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def clearDiagnostics = copy(diagnostics = _root_.scala.Seq.empty)
    def addDiagnostics(__vs: pulumirpc.analyzer.AnalyzeDiagnostic *): AnalyzeResponse = addAllDiagnostics(__vs)
    def addAllDiagnostics(__vs: Iterable[pulumirpc.analyzer.AnalyzeDiagnostic]): AnalyzeResponse = copy(diagnostics = diagnostics ++ __vs)
    def withDiagnostics(__v: _root_.scala.Seq[pulumirpc.analyzer.AnalyzeDiagnostic]): AnalyzeResponse = copy(diagnostics = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 2 => diagnostics
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 2 => _root_.scalapb.descriptors.PRepeated(diagnostics.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: pulumirpc.analyzer.AnalyzeResponse.type = pulumirpc.analyzer.AnalyzeResponse
    // @@protoc_insertion_point(GeneratedMessage[pulumirpc.AnalyzeResponse])
}

object AnalyzeResponse extends scalapb.GeneratedMessageCompanion[pulumirpc.analyzer.AnalyzeResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[pulumirpc.analyzer.AnalyzeResponse] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): pulumirpc.analyzer.AnalyzeResponse = {
    val __diagnostics: _root_.scala.collection.immutable.VectorBuilder[pulumirpc.analyzer.AnalyzeDiagnostic] = new _root_.scala.collection.immutable.VectorBuilder[pulumirpc.analyzer.AnalyzeDiagnostic]
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 18 =>
          __diagnostics += _root_.scalapb.LiteParser.readMessage[pulumirpc.analyzer.AnalyzeDiagnostic](_input__)
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    pulumirpc.analyzer.AnalyzeResponse(
        diagnostics = __diagnostics.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[pulumirpc.analyzer.AnalyzeResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      pulumirpc.analyzer.AnalyzeResponse(
        diagnostics = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[pulumirpc.analyzer.AnalyzeDiagnostic]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = AnalyzerProto.javaDescriptor.getMessageTypes().get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = AnalyzerProto.scalaDescriptor.messages(6)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = pulumirpc.analyzer.AnalyzeDiagnostic
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = pulumirpc.analyzer.AnalyzeResponse(
    diagnostics = _root_.scala.Seq.empty
  )
  implicit class AnalyzeResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, pulumirpc.analyzer.AnalyzeResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, pulumirpc.analyzer.AnalyzeResponse](_l) {
    def diagnostics: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[pulumirpc.analyzer.AnalyzeDiagnostic]] = field(_.diagnostics)((c_, f_) => c_.copy(diagnostics = f_))
  }
  final val DIAGNOSTICS_FIELD_NUMBER = 2
  def of(
    diagnostics: _root_.scala.Seq[pulumirpc.analyzer.AnalyzeDiagnostic]
  ): _root_.pulumirpc.analyzer.AnalyzeResponse = _root_.pulumirpc.analyzer.AnalyzeResponse(
    diagnostics
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[pulumirpc.AnalyzeResponse])
}