package com.bteconosur.common.storage;

import com.bteconosur.common.Identifiable;

public interface ObjectStorageFactory {

    <T extends Identifiable> ObjectStorage<T> newObjectStorage(StorageType storageType,
                                                               Credentials credentials);
    
}
