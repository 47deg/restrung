/*
 * Copyright (C) 2014 47 Degrees, LLC
 *  http://47deg.com
 *  hello@47deg.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package ly.apps.android.rest.client.example.api;

import ly.apps.android.rest.client.Callback;
import ly.apps.android.rest.client.annotations.GET;
import ly.apps.android.rest.client.annotations.QueryParam;
import ly.apps.android.rest.client.annotations.RestService;
import ly.apps.android.rest.client.example.responses.ForecastResponse;

/**
 * Demonstrates the use of a annotated interface that is automatically proxied to create the weather service.
 * @see <a href="https://github.com/47deg/appsly-android-rest">Appsly Android REST on GitHub</a>
 */

@RestService
public interface OpenWeatherAPI {

    @GET("/weather")
    void getForecast(@QueryParam("lat") double latitude, @QueryParam("lon") double longitude, Callback<ForecastResponse> callback);



}
