package iozhik.vk

final case class Document(
                          /** идентификатор документа.*/
                          id: Integer,
                          /** идентификатор пользователя, загрузившего документ.*/
                          ownerId: Integer,
                          /** название документа.*/
                          title: String,
                          /** размер документа в байтах.*/
                          size: Integer,
                          /** расширение документа.*/
                          ext: String,
                          /** адрес документа, по которому его можно загрузить.*/
                          url: String,
                          /** дата добавления в формате Unixtime.*/
                          date: Integer,
                          /**
                            * * тип документа. Возможные значения:
                            * * 1 — текстовые документы;
                            * * 2 — архивы;
                            * * 3 — gif;
                            * * 4 — изображения;
                            * * 5 — аудио;
                            * * 6 — видео;
                            * * 7 — электронные книги;
                            * * 8 — неизвестно.
                            * */
                          `type`: Int,
                          /** информация для предварительного просмотра документа*/
                          preview: Preview)