/**
 * Copyright 2011-2017 GatlingCorp (http://gatling.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gatling.core.check.extractor.jsonpath

object Json4 extends JsonSample {

  val value = """{
                |   "error": [
                |    {
                |      "errorCode": "12345",
                |      "errorMessage": "Account number not found"
                |    },
                |    {
                |      "errorCode": "87263",
                |      "errorMessage": "my service message, actualError=Not Found [404]"
                |    },
                |    {
                |      "errorCode": "345621",
                |      "errorMessage": "test message, actualError=Not Found [404]"
                |    }
                |  ]
                |}
                |""".stripMargin
}