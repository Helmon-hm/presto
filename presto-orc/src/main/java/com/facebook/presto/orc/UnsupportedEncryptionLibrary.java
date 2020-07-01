/*
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
package com.facebook.presto.orc;

import io.airlift.slice.Slice;

public class UnsupportedEncryptionLibrary
        implements EncryptionLibrary
{
    @Override
    public Slice generateDataEncryptionKey(Slice intermediateKeyMetadata)
    {
        throw new UnsupportedOperationException("encryption not supported");
    }

    @Override
    public Slice encryptKey(Slice keyMetadata, byte[] input, int offset, int length)
    {
        throw new UnsupportedOperationException("encryption not supported");
    }

    @Override
    public byte[] encryptData(Slice keyMetadata, byte[] input, int offset, int length)
    {
        throw new UnsupportedOperationException("encryption not supported");
    }

    @Override
    public Slice decryptKey(Slice keyMetadata, byte[] input, int offset, int length)
    {
        throw new UnsupportedOperationException("encryption not supported");
    }

    @Override
    public byte[] decryptData(Slice keyMetadata, byte[] input, int offset, int length)
    {
        throw new UnsupportedOperationException("encryption not supported");
    }
}