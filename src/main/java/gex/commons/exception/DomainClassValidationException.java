package gex.commons.exception;

import lombok.Getter;

/**
 * Thrown when some component in Serling could not resolve an object by id.
 *
 * @author domix on 11/20/14.
 */
public class DomainClassValidationException extends GenericException {
  @Getter
  private Object entity;

  public DomainClassValidationException(Object entity) {
    super("The provided entity has some errors.");
    this.entity = entity;
  }

  public DomainClassValidationException(Object entity, Throwable cause) {
    super("The provided entity has some errors.", cause);
    this.entity = entity;
  }

  public DomainClassValidationException(Object entity, String message) {
    super(message);
    this.entity = entity;
  }

  public DomainClassValidationException(Object entity, String message, Throwable cause) {
    super(message, cause);
    this.entity = entity;
  }

}
