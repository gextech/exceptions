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
import lombok.Setter;

import java.util.List;
import java.util.Map;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

/**
 * Very generic exception which will be thrown with some valuable information.
 */
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



