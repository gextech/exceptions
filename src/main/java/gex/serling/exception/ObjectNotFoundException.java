package gex.serling.exception;

import lombok.Getter;

import java.io.Serializable;

/**
 * Thrown when some component in Serling could not resolve an object by id.
 *
 * @author domix on 11/20/14.
 */
public class ObjectNotFoundException extends SerlingException {
  public static final String MESSAGE = "No object with the given identifier exists";
  @Getter
  private Serializable identifier;
  @Getter
  private String entityName;

  /**
   * Constructs an NotFoundDomainClassException using the specified information.
   *
   * @param identifier The identifier of the entity which could not be resolved
   * @param entityName The name of the entity which could not be resolved
   */
  public ObjectNotFoundException(Serializable identifier, String entityName) {
    this(MESSAGE, identifier, entityName);
  }

  public ObjectNotFoundException(Serializable identifier, String entityName, Throwable cause) {
    super(MESSAGE, cause);
    this.identifier = identifier;
    this.entityName = entityName;
  }

  public ObjectNotFoundException(String message, Serializable identifier, String entityName) {
    super(message);
    this.identifier = identifier;
    this.entityName = entityName;
  }

  public ObjectNotFoundException(String message, Serializable identifier, String entityName, Throwable cause) {
    super(message, cause);
    this.identifier = identifier;
    this.entityName = entityName;
  }

}
