package iozhik.tgbot;

import java.util.*;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PassportElementErrorTranslationFile implements PassportElementError {

  private String type;

  private String fileHash;

  private String message;

  public PassportElementErrors what() {
    return PassportElementErrors.PASSPORT_ELEMENT_ERROR_TRANSLATION_FILE;
  }

  public String getDiscriminator() {
    return "translation_file";
  }

  public PassportElementErrorTranslationFile() {}

  public PassportElementErrorTranslationFile(String type, String fileHash, String message) {
    this.type = type;
    this.fileHash = fileHash;
    this.message = message;
  }

  public String getType() {
    return this.type;
  }

  public PassportElementErrorTranslationFile setType(String v) {
    this.type = v;
    return this;
  }

  public String getFileHash() {
    return this.fileHash;
  }

  public PassportElementErrorTranslationFile setFileHash(String v) {
    this.fileHash = v;
    return this;
  }

  public String getMessage() {
    return this.message;
  }

  public PassportElementErrorTranslationFile setMessage(String v) {
    this.message = v;
    return this;
  }

  public boolean isPassportElementErrorFiles() {
    return false;
  }

  public PassportElementErrorFiles asPassportElementErrorFiles() {
    throw new IllegalStateException("Not a $stName: " + this);
  }

  public boolean isPassportElementErrorDataField() {
    return false;
  }

  public PassportElementErrorDataField asPassportElementErrorDataField() {
    throw new IllegalStateException("Not a $stName: " + this);
  }

  public boolean isPassportElementErrorReverseSide() {
    return false;
  }

  public PassportElementErrorReverseSide asPassportElementErrorReverseSide() {
    throw new IllegalStateException("Not a $stName: " + this);
  }

  public boolean isPassportElementErrorSelfie() {
    return false;
  }

  public PassportElementErrorSelfie asPassportElementErrorSelfie() {
    throw new IllegalStateException("Not a $stName: " + this);
  }

  public boolean isPassportElementErrorFrontSide() {
    return false;
  }

  public PassportElementErrorFrontSide asPassportElementErrorFrontSide() {
    throw new IllegalStateException("Not a $stName: " + this);
  }

  public boolean isPassportElementErrorFile() {
    return false;
  }

  public PassportElementErrorFile asPassportElementErrorFile() {
    throw new IllegalStateException("Not a $stName: " + this);
  }

  public boolean isPassportElementErrorUnspecified() {
    return false;
  }

  public PassportElementErrorUnspecified asPassportElementErrorUnspecified() {
    throw new IllegalStateException("Not a $stName: " + this);
  }

  public boolean isPassportElementErrorTranslationFile() {
    return true;
  }

  public PassportElementErrorTranslationFile asPassportElementErrorTranslationFile() {
    return this;
  }

  public boolean isPassportElementErrorTranslationFiles() {
    return false;
  }

  public PassportElementErrorTranslationFiles asPassportElementErrorTranslationFiles() {
    throw new IllegalStateException("Not a $stName: " + this);
  }

  @Override
  public boolean equals(Object thatObj) {
    if (this == thatObj) return true;

    if (!(thatObj instanceof PassportElementErrorTranslationFile)) return false;

    PassportElementErrorTranslationFile that = (PassportElementErrorTranslationFile) thatObj;

    return this.type.equals(that.type)
        && this.fileHash.equals(that.fileHash)
        && this.message.equals(that.message);
  }

  @Override
  public String toString() {
    return "PassportElementErrorTranslationFile{"
        + "type="
        + '\''
        + this.type
        + '\''
        + ','
        + "fileHash="
        + '\''
        + this.fileHash
        + '\''
        + ','
        + "message="
        + '\''
        + this.message
        + '\''
        + '}';
  }
}
