package gex.serling.exception;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

public class SerlingException extends RuntimeException {

  @Getter
  @Setter
  private List<String> validationErrors = emptyList();

  @Getter
  @Setter
  private Map<String, Object> extraData = emptyMap();

  @Getter
  @Setter
  private String i18nCode = "";

  public SerlingException(Throwable cause) {
    super(cause);
  }

  public SerlingException(String message) {
    super(message);
  }

  public SerlingException(String message, Throwable cause) {
    super(message, cause);
  }

  public SerlingException(String message, Map extraData) {
    super(message);
    this.extraData = extraData;
  }

  public SerlingException(String message, Map extraData, Throwable cause) {
    super(message, cause);
    this.extraData = extraData;
  }

  public SerlingException(String message, List validationErrors) {
    super(message);
    this.validationErrors = validationErrors;
  }

  public SerlingException(String message, List validationErrors, Throwable cause) {
    super(message, cause);
    this.validationErrors = validationErrors;
  }

  public SerlingException(String message, Map extraData, List validationErrors) {
    super(message);
    this.validationErrors = validationErrors;
    this.extraData = extraData;
  }

  public SerlingException(String message, Map extraData, List validationErrors, Throwable cause) {
    super(message, cause);
    this.validationErrors = validationErrors;
    this.extraData = extraData;
  }
}



