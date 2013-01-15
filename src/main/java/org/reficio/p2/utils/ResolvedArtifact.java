package org.reficio.p2.utils;

/**
 * Copyright (c) 2012 Reficio (TM) - Reestablish your software! All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import org.sonatype.aether.artifact.Artifact;

/**
 * @author Tom Bujok (tom.bujok@gmail.com)
 * @since 1.0.0
 *        <p/>
 *        Reficio (TM) - Reestablish your software!</br>
 *        http://www.reficio.org
 */
public class ResolvedArtifact {
    private boolean root;
    private final Artifact artifact;
    private final Artifact sourceArtifact;

    public ResolvedArtifact(Artifact artifact, boolean root) {
        this.artifact = artifact;
        this.sourceArtifact = null;
        this.root = root;
    }

    public ResolvedArtifact(Artifact artifact, Artifact sourceArtifact, boolean root) {
        this.artifact = artifact;
        this.sourceArtifact = sourceArtifact;
        this.root = root;
    }

    public Artifact getArtifact() {
        return artifact;
    }

    public Artifact getSourceArtifact() {
        return sourceArtifact;
    }

    public boolean isRoot() {
        return root;
    }

}