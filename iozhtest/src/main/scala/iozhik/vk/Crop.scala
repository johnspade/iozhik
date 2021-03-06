package iozhik.vk

final case class Crop(
                      /** координата X левого верхнего угла в процентах;*/
                      x: Integer,
                      /** координата Y левого верхнего угла в процентах;*/
                      y: Integer,
                      /** координата X правого нижнего угла в процентах;*/
                      x2: Integer,
                      /** координата Y правого нижнего угла в процентах.*/
                      y2: Integer)
