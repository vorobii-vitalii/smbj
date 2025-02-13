/*
 * Copyright (C)2016 - SMBJ Contributors
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
package com.hierynomus.smbj.connection;

import javax.crypto.SecretKey;

import com.hierynomus.mssmb2.SMB2Packet;
import com.hierynomus.mssmb2.SMB2PacketData;

/**
 * When signing is disabled, this class is used to sign and verify packets so that the code does not need to take the lack of signing into account.
 */
public class NoSignatory implements Signatory {
    @Override
    public SMB2Packet sign(SMB2Packet packet, SecretKey secretKey) {
        return packet;
    }

    @Override
    public boolean verify(SMB2PacketData packet, SecretKey secretKey) {
        return true;
    }
}
