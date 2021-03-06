package telegramium.bots.client

import telegramium.bots.ChatId
import telegramium.bots.IFile
import telegramium.bots.KeyboardMarkup

final case class SendPhotoReq(
                              /** Unique identifier for the target chat or username of the
                                * target channel (in the format @channelusername)*/
                              chatId: ChatId,
                              /** Photo to send. Pass a file_id as String to send a photo
                                * that exists on the Telegram servers (recommended), pass an
                                * HTTP URL as a String for Telegram to get a photo from the
                                * Internet, or upload a new photo using multipart/form-data.
                                * More info on Sending Files »*/
                              photo: IFile,
                              /** Photo caption (may also be used when resending photos by
                                * file_id), 0-1024 characters*/
                              caption: Option[String] = Option.empty,
                              /** Send Markdown or HTML, if you want Telegram apps to show
                                * bold, italic, fixed-width text or inline URLs in the media
                                * caption.*/
                              parseMode: Option[String] = Option.empty,
                              /** Sends the message silently. Users will receive a
                                * notification with no sound.*/
                              disableNotification: Option[Boolean] = Option.empty,
                              /** If the message is a reply, ID of the original message*/
                              replyToMessageId: Option[Int] = Option.empty,
                              /** Additional interface options. A JSON-serialized object for
                                * an inline keyboard, custom reply keyboard, instructions to
                                * remove reply keyboard or to force a reply from the user.*/
                              replyMarkup: Option[KeyboardMarkup] = Option.empty)
