/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package example.angularspring.exception;

import com.mangofactory.swagger.annotations.ApiError;

/**
 *
 * @author parivero
 */
@ApiError(code=404,reason="Recurso no encontrado")
public class NotFoundException extends RuntimeException{
	
}
