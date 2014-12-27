/**
 *
 * Copyright (C) 2014 Grupo Expansion <oss@expansion.com.mx>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gex.commons.exception;

import lombok.Getter;

import java.io.Serializable;

/**
 * Thrown when some component could not resolve an object by id.
 *
 * @author domix on 11/20/14.
 */
public class ObjectNotFoundException extends GenericException {
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
