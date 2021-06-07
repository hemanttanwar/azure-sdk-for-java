/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_08_01.BastionHost;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_08_01.BastionHostIPConfiguration;
import com.microsoft.azure.management.network.v2020_08_01.ProvisioningState;

class BastionHostImpl extends GroupableResourceCoreImpl<BastionHost, BastionHostInner, BastionHostImpl, NetworkManager> implements BastionHost, BastionHost.Definition, BastionHost.Update {
    BastionHostImpl(String name, BastionHostInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<BastionHost> createResourceAsync() {
        BastionHostsInner client = this.manager().inner().bastionHosts();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<BastionHost> updateResourceAsync() {
        BastionHostsInner client = this.manager().inner().bastionHosts();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<BastionHostInner> getInnerAsync() {
        BastionHostsInner client = this.manager().inner().bastionHosts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String dnsName() {
        return this.inner().dnsName();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<BastionHostIPConfiguration> ipConfigurations() {
        return this.inner().ipConfigurations();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public BastionHostImpl withDnsName(String dnsName) {
        this.inner().withDnsName(dnsName);
        return this;
    }

    @Override
    public BastionHostImpl withIpConfigurations(List<BastionHostIPConfiguration> ipConfigurations) {
        this.inner().withIpConfigurations(ipConfigurations);
        return this;
    }

}
