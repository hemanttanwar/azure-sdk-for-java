// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.hanaonazure {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.hanaonazure;
    exports com.azure.resourcemanager.hanaonazure.fluent;
    exports com.azure.resourcemanager.hanaonazure.fluent.models;
    exports com.azure.resourcemanager.hanaonazure.models;

    opens com.azure.resourcemanager.hanaonazure.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.hanaonazure.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
