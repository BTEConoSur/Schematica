package com.bteconosur.common.start;

import com.bteconosur.common.storage.StorageType;
import com.bteconosur.common.storage.configuration.ConfigurationResolver;

public class InitialStartService implements StartService {

    private ConfigurationResolver configurationResolver;

    @Override
    public void onStart() {

        configurationResolver = ConfigurationResolver.buildWithFile(
                "settings.cvs"
        );

        String storageTypeValue = configurationResolver.getPath("storage-type");
        StorageType storageType = StorageType.valueOf(storageTypeValue);

    }

    @Override
    public void onStop() {

    }

}
