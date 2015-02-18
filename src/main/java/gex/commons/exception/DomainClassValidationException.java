/**
 *
 * Copyright (C) 2014-2015 Grupo Expansion <oss@expansion.com.mx>
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

/**
 * Thrown when some component found invalid values in a entity.
 *
 * @author domix on 11/20/14.
 * @deprecated As of release 0.1.4, replaced by {@link gex.commons.exception.EntityValidationException}. This class will be deleted in 0.2 release.
 * @todo Remove this class in release 0.2
 */
@Deprecated
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
