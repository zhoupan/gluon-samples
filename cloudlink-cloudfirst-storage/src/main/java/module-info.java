/*
 * Copyright (c) 2020 Gluon
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *     * Neither the name of Gluon, any associated website, nor the
 * names of its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL GLUON BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
module com.gluonhq.samples.cloudfirststorage {

    requires javafx.controls;
    requires javafx.fxml;

    requires com.gluonhq.charm.glisten;
    requires com.gluonhq.cloudlink.client;
    requires com.gluonhq.connect;
    requires com.gluonhq.glisten.afterburner;

    requires com.gluonhq.attach.display;
    requires com.gluonhq.attach.lifecycle;
    requires com.gluonhq.attach.statusbar;
    requires com.gluonhq.attach.storage;
    requires com.gluonhq.attach.util;

    requires java.json;
    requires java.annotation;
    requires afterburner.mfx;

    exports com.gluonhq.samples.cloudfirst;
    exports com.gluonhq.samples.cloudfirst.model to afterburner.mfx;
    exports com.gluonhq.samples.cloudfirst.service to afterburner.mfx;
    exports com.gluonhq.samples.cloudfirst.views to afterburner.mfx;

    opens com.gluonhq.samples.cloudfirst.model to com.gluonhq.cloudlink.client;
    opens com.gluonhq.samples.cloudfirst.views to javafx.fxml, afterburner.mfx, com.gluonhq.glisten.afterburner;
}