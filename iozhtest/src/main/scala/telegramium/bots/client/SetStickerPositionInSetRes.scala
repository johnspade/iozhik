package telegramium.bots.client

final case class SetStickerPositionInSetRes(ok: Boolean,
                                            description: Option[String] = Option.empty,
                                            result: Option[Boolean] = Option.empty)
