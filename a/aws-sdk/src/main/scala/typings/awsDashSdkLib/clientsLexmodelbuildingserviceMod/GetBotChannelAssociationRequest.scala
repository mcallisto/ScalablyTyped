package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBotChannelAssociationRequest extends js.Object {
  /**
    * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: AliasName
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: BotName
  /**
    * The name of the association between the bot and the channel. The name is case sensitive. 
    */
  var name: BotChannelName
}

object GetBotChannelAssociationRequest {
  @scala.inline
  def apply(botAlias: AliasName, botName: BotName, name: BotChannelName): GetBotChannelAssociationRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias, botName = botName, name = name)
  
    __obj.asInstanceOf[GetBotChannelAssociationRequest]
  }
}

