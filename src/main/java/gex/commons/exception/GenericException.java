package gex.commons.exception;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

public class GenericException extends RuntimeException {

  @Getter
  @Setter
  private List<String> validationErrors = emptyList();

  @Getter
  @Setter
  private Map<String, Object> extraData = emptyMap();

  @Getter
  @Setter
  private String i18nCode = "";

  @Getter
  @Setter
  private String code = "";

  public GenericException(Throwable cause) {
    super(cause);
  }

  public GenericException(String message) {
    super(message);
  }

  public GenericException(String message, Throwable cause) {
    super(message, cause);
  }

  public GenericException(String message, Map<String, Object> extraData) {
    super(message);
    this.extraData = extraData;
  }

  public GenericException(String message, Map<String, Object> extraData, Throwable cause) {
    super(message, cause);
    this.extraData = extraData;
  }

  public GenericException(String message, List<String> validationErrors) {
    super(message);
    this.validationErrors = validationErrors;
  }

  public GenericException(String message, List<String> validationErrors, Throwable cause) {
    super(message, cause);
    this.validationErrors = validationErrors;
  }

  public GenericException(String message, Map<String, Object> extraData, List<String> validationErrors) {
    super(message);
    this.validationErrors = validationErrors;
    this.extraData = extraData;
  }

  public GenericException(String message, Map<String, Object> extraData, List<String> validationErrors, Throwable cause) {
    super(message, cause);
    this.validationErrors = validationErrors;
    this.extraData = extraData;
  }
}



