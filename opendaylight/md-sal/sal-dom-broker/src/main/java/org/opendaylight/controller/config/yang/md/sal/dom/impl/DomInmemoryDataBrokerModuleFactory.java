/**
* Generated file

* Generated from: yang module name: opendaylight-sal-dom-broker-impl  yang module local name: dom-inmemory-data-broker
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Fri Mar 28 17:32:48 CET 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.md.sal.dom.impl;

import org.opendaylight.controller.config.api.DependencyResolver;
import org.opendaylight.controller.config.api.DynamicMBeanWithInstance;
import org.opendaylight.controller.config.spi.Module;
import org.osgi.framework.BundleContext;

/**
*
*/
public class DomInmemoryDataBrokerModuleFactory extends org.opendaylight.controller.config.yang.md.sal.dom.impl.AbstractDomInmemoryDataBrokerModuleFactory
{



    @Override
    public Module createModule(final String instanceName, final DependencyResolver dependencyResolver, final BundleContext bundleContext) {
        DomInmemoryDataBrokerModule module = (DomInmemoryDataBrokerModule) super.createModule(instanceName, dependencyResolver, bundleContext);
        module.setBundleContext(bundleContext);
        return module;
    }

    @Override
    public Module createModule(final String instanceName, final DependencyResolver dependencyResolver,
            final DynamicMBeanWithInstance old, final BundleContext bundleContext) throws Exception {
        DomInmemoryDataBrokerModule module = (DomInmemoryDataBrokerModule)  super.createModule(instanceName, dependencyResolver, old, bundleContext);
        module.setBundleContext(bundleContext);
        return module;
    }
}
