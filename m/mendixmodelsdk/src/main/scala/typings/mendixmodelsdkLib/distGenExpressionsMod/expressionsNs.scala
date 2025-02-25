package typings
package mendixmodelsdkLib.distGenExpressionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions")
@js.native
object expressionsNs extends js.Object {
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class BinaryExpression protected () extends Expression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var left: Expression = js.native
    var operator: BinaryOperator = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var right: Expression = js.native
  }
  
  @js.native
  class BinaryOperator ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class BooleanLiteral protected () extends LiteralExpression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var value: scala.Boolean = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class ConstantRefExpression protected () extends Expression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var constant: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant = js.native
    val constantQualifiedName: java.lang.String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class EmptyLiteral protected () extends LiteralExpression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class EnumerationValueRefExpression protected () extends Expression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var value: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumerationValue = js.native
    val valueQualifiedName: java.lang.String = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Expressions`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/microflow-expressions relevant section in reference guide}
    *
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  abstract class Expression protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsAppServiceCallParameterMapping: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping = js.native
    val containerAsBasicCodeActionParameterValue: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue = js.native
    val containerAsBasicJavaActionParameterValue: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue = js.native
    val containerAsBinaryExpression: BinaryExpression = js.native
    val containerAsBinaryRequestHandling: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling = js.native
    val containerAsChangeListAction: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction = js.native
    val containerAsChangeVariableAction: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction = js.native
    val containerAsConditionalSettings: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings = js.native
    val containerAsCreateVariableAction: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction = js.native
    val containerAsCustomRange: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange = js.native
    val containerAsDocumentTemplateParameterMapping: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping = js.native
    val containerAsEndEvent: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent = js.native
    val containerAsExpressionSplitCondition: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition = js.native
    val containerAsExpressionValue: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue = js.native
    val containerAsFormDataPart: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart = js.native
    val containerAsFunctionCallExpression: FunctionCallExpression = js.native
    val containerAsGenerateDocumentAction: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction = js.native
    val containerAsHttpConfiguration: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration = js.native
    val containerAsHttpHeaderEntry: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry = js.native
    val containerAsIfExpression: IfExpression = js.native
    val containerAsInspectAttribute: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute = js.native
    val containerAsLogMessageAction: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction = js.native
    val containerAsMemberChange: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange = js.native
    val containerAsMicroflowCallParameterMapping: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping = js.native
    val containerAsParenthesisExpression: ParenthesisExpression = js.native
    val containerAsProxyConfiguration: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration = js.native
    val containerAsRestCallAction: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction = js.native
    val containerAsRuleCallParameterMapping: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping = js.native
    val containerAsTemplateArgument: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument = js.native
    val containerAsUnaryExpression: UnaryExpression = js.native
    val containerAsWebServiceCallAction: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction = js.native
    val containerAsWebServiceOperationParameterMapping: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping = js.native
    val containerAsWidgetValidation: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation = js.native
    @JSName("model")
    var model_Expression: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class FloatLiteral protected () extends LiteralExpression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var value: scala.Double = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class FunctionCallExpression protected () extends Expression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    val arguments: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Expression] = js.native
    var functionName: java.lang.String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class GlobalVariableRef protected () extends VariableRef {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var referredName: java.lang.String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class IfExpression protected () extends Expression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var condition: Expression = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var ifFalse: Expression = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var ifTrue: Expression = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class IntegerLiteral protected () extends LiteralExpression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var value: scala.Double = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  abstract class LiteralExpression protected () extends Expression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class NoExpression protected () extends Expression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class NoVariableRef protected () extends VariableRef {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class ParenthesisExpression protected () extends Expression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var expression: Expression = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class StringLiteral protected () extends LiteralExpression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var value: java.lang.String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class UnaryExpression protected () extends Expression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var expression: Expression = js.native
    var operator: UnaryOperator = js.native
  }
  
  @js.native
  class UnaryOperator ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class UnparsableExpression protected () extends Expression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var expression: java.lang.String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  abstract class VariableRef protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsVariableRefExpression: VariableRefExpression = js.native
    @JSName("model")
    var model_VariableRef: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  @js.native
  class VariableRefExpression protected () extends Expression {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.11.0: introduced
      */
    var member: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.MemberRef | scala.Null = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var variable: VariableRef = js.native
  }
  
  /* static members */
  @js.native
  object BinaryExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
    /**
      * Creates and returns a new BinaryExpression instance in the SDK and on the server.
      * The new BinaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression = js.native
  }
  
  /* static members */
  @js.native
  object BinaryOperator extends js.Object {
    var And: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Div: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Divide: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Equals: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var GreaterThan: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var GreaterThanOrEqual: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var LessThan: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var LessThanOrEqual: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Minus: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Mod: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Multiply: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var None: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var NotEquals: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Or: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
    var Plus: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryOperator = js.native
  }
  
  /* static members */
  @js.native
  object BooleanLiteral extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
    /**
      * Creates and returns a new BooleanLiteral instance in the SDK and on the server.
      * The new BooleanLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BooleanLiteral = js.native
  }
  
  /* static members */
  @js.native
  object ConstantRefExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
    /**
      * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
      * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ConstantRefExpression = js.native
  }
  
  /* static members */
  @js.native
  object EmptyLiteral extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
    /**
      * Creates and returns a new EmptyLiteral instance in the SDK and on the server.
      * The new EmptyLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EmptyLiteral = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationValueRefExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
    /**
      * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
      * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.EnumerationValueRefExpression = js.native
  }
  
  /* static members */
  @js.native
  object Expression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object FloatLiteral extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
    /**
      * Creates and returns a new FloatLiteral instance in the SDK and on the server.
      * The new FloatLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FloatLiteral = js.native
  }
  
  /* static members */
  @js.native
  object FunctionCallExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
    /**
      * Creates and returns a new FunctionCallExpression instance in the SDK and on the server.
      * The new FunctionCallExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression = js.native
  }
  
  /* static members */
  @js.native
  object GlobalVariableRef extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new GlobalVariableRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.GlobalVariableRef = js.native
    /**
      * Creates and returns a new GlobalVariableRef instance in the SDK and on the server.
      * The new GlobalVariableRef will be automatically stored in the 'variable' property
      * of the parent VariableRefExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.GlobalVariableRef = js.native
  }
  
  /* static members */
  @js.native
  object IfExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
    /**
      * Creates and returns a new IfExpression instance in the SDK and on the server.
      * The new IfExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression = js.native
  }
  
  /* static members */
  @js.native
  object IntegerLiteral extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
    /**
      * Creates and returns a new IntegerLiteral instance in the SDK and on the server.
      * The new IntegerLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IntegerLiteral = js.native
  }
  
  /* static members */
  @js.native
  object LiteralExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object NoExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
    /**
      * Creates and returns a new NoExpression instance in the SDK and on the server.
      * The new NoExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoExpression = js.native
  }
  
  /* static members */
  @js.native
  object NoVariableRef extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NoVariableRef instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoVariableRef = js.native
    /**
      * Creates and returns a new NoVariableRef instance in the SDK and on the server.
      * The new NoVariableRef will be automatically stored in the 'variable' property
      * of the parent VariableRefExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.NoVariableRef = js.native
  }
  
  /* static members */
  @js.native
  object ParenthesisExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
    /**
      * Creates and returns a new ParenthesisExpression instance in the SDK and on the server.
      * The new ParenthesisExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression = js.native
  }
  
  /* static members */
  @js.native
  object StringLiteral extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
    /**
      * Creates and returns a new StringLiteral instance in the SDK and on the server.
      * The new StringLiteral will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.StringLiteral = js.native
  }
  
  /* static members */
  @js.native
  object UnaryExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
    /**
      * Creates and returns a new UnaryExpression instance in the SDK and on the server.
      * The new UnaryExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression = js.native
  }
  
  /* static members */
  @js.native
  object UnaryOperator extends js.Object {
    var None: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryOperator = js.native
    var UnaryMinus: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryOperator = js.native
  }
  
  /* static members */
  @js.native
  object UnparsableExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
    /**
      * Creates and returns a new UnparsableExpression instance in the SDK and on the server.
      * The new UnparsableExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnparsableExpression = js.native
  }
  
  /* static members */
  @js.native
  object VariableRef extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object VariableRefExpression extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.AppServiceCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicCodeActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicCodeActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.20.0
      */
    def createInBasicJavaActionParameterValueUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BasicJavaActionParameterValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'left' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderLeft(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'right' property
      * of the parent BinaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryExpressionUnderRight(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.BinaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.BinaryRequestHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInBinaryRequestHandlingUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.BinaryRequestHandling): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeListAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeListActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeListAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.ChangeVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInChangeVariableActionUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ChangeVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.ConditionalSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConditionalSettingsUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ConditionalSettings): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'initialValueModel' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderInitialValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'limitExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderLimitExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'offsetExpressionModel' property
      * of the parent microflows.CustomRange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCustomRangeUnderOffsetExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CustomRange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.DocumentTemplateParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'returnValueModel' property
      * of the parent microflows.EndEvent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInEndEventUnderReturnValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.EndEvent): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.ExpressionSplitCondition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInExpressionSplitConditionUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ExpressionSplitCondition): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'valueModel' property
      * of the parent pluginwidgets.ExpressionValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 7.18.0
      */
    def createInExpressionValueUnderValueModel(container: mendixmodelsdkLib.distGenPluginwidgetsMod.pluginwidgetsNs.ExpressionValue): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.FormDataPart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInFormDataPartUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.FormDataPart): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'arguments' property
      * of the parent FunctionCallExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInFunctionCallExpressionUnderArguments(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.FunctionCallExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'marginBottomInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'marginLeftInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'marginRightInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginRightInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'marginTopInInchModel' property
      * of the parent microflows.GenerateDocumentAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInGenerateDocumentActionUnderMarginTopInInchModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.GenerateDocumentAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'customLocationModel' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderCustomLocationModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'password' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderPassword(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'username' property
      * of the parent microflows.HttpConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpConfigurationUnderUsername(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.HttpHeaderEntry element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInHttpHeaderEntryUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.HttpHeaderEntry): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'condition' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderCondition(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'ifFalse' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfFalse(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'ifTrue' property
      * of the parent IfExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInIfExpressionUnderIfTrue(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.IfExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.InspectAttribute element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInInspectAttributeUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.InspectAttribute): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'nodeModel' property
      * of the parent microflows.LogMessageAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInLogMessageActionUnderNodeModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.LogMessageAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'valueModel' property
      * of the parent microflows.MemberChange element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMemberChangeUnderValueModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MemberChange): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expression' property
      * of the parent ParenthesisExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInParenthesisExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.ParenthesisExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'hostExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderHostExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'passwordExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPasswordExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'portExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderPortExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'usernameExpressionModel' property
      * of the parent microflows.ProxyConfiguration element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInProxyConfigurationUnderUsernameExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ProxyConfiguration): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.RestCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInRestCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RestCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.RuleCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInRuleCallParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.RuleCallParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent microflows.TemplateArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInTemplateArgumentUnderExpressionModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.TemplateArgument): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expression' property
      * of the parent UnaryExpression element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInUnaryExpressionUnderExpression(container: mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.UnaryExpression): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'timeOutModel' property
      * of the parent microflows.WebServiceCallAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInWebServiceCallActionUnderTimeOutModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceCallAction): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
      * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWebServiceOperationParameterMappingUnderArgumentModel(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.WebServiceOperationParameterMapping): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
    /**
      * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
      * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInWidgetValidationUnderExpressionModel(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.WidgetValidation): mendixmodelsdkLib.distGenExpressionsMod.expressionsNs.VariableRefExpression = js.native
  }
  
}

