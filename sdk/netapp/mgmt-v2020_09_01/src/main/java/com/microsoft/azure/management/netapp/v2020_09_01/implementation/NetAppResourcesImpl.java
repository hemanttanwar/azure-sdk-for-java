/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.netapp.v2020_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.netapp.v2020_09_01.NetAppResources;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.netapp.v2020_09_01.CheckAvailabilityResponse;
import com.microsoft.azure.management.netapp.v2020_09_01.CheckNameResourceTypes;
import com.microsoft.azure.management.netapp.v2020_09_01.CheckQuotaNameResourceTypes;

class NetAppResourcesImpl extends WrapperImpl<NetAppResourcesInner> implements NetAppResources {
    private final NetAppManager manager;

    NetAppResourcesImpl(NetAppManager manager) {
        super(manager.inner().netAppResources());
        this.manager = manager;
    }

    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CheckAvailabilityResponse> checkNameAvailabilityAsync(String location, String name, CheckNameResourceTypes type, String resourceGroup) {
        NetAppResourcesInner client = this.inner();
        return client.checkNameAvailabilityAsync(location, name, type, resourceGroup)
        .map(new Func1<CheckAvailabilityResponseInner, CheckAvailabilityResponse>() {
            @Override
            public CheckAvailabilityResponse call(CheckAvailabilityResponseInner inner) {
                return new CheckAvailabilityResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CheckAvailabilityResponse> checkFilePathAvailabilityAsync(String location, String name, CheckNameResourceTypes type, String resourceGroup) {
        NetAppResourcesInner client = this.inner();
        return client.checkFilePathAvailabilityAsync(location, name, type, resourceGroup)
        .map(new Func1<CheckAvailabilityResponseInner, CheckAvailabilityResponse>() {
            @Override
            public CheckAvailabilityResponse call(CheckAvailabilityResponseInner inner) {
                return new CheckAvailabilityResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CheckAvailabilityResponse> checkQuotaAvailabilityAsync(String location, String name, CheckQuotaNameResourceTypes type, String resourceGroup) {
        NetAppResourcesInner client = this.inner();
        return client.checkQuotaAvailabilityAsync(location, name, type, resourceGroup)
        .map(new Func1<CheckAvailabilityResponseInner, CheckAvailabilityResponse>() {
            @Override
            public CheckAvailabilityResponse call(CheckAvailabilityResponseInner inner) {
                return new CheckAvailabilityResponseImpl(inner, manager());
            }
        });
    }

}
