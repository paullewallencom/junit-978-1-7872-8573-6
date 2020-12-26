/*
 * (C) Copyright 2017 Boni Garcia (http://bonigarcia.github.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package io.github.bonigarcia;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PlayingWithAllureTest {

    @Test
    void successTest() {
        assertTrue(true);
    }

    @Test
    void failureTest() {
        assertTrue(false);
    }

    @Test
    void brokenTest() {
        throw new RuntimeException("This test seems to be broken!");
    }

    @Test
    void slowSucessTest() throws InterruptedException {
        Thread.sleep(500);
    }

    @Test
    void slowFailureTest() throws InterruptedException {
        Thread.sleep(600);
        assertTrue(false);
    }

    @Test
    void slowBrokenTest() throws InterruptedException {
        Thread.sleep(700);
        throw new RuntimeException("ZZZ...");
    }

}
