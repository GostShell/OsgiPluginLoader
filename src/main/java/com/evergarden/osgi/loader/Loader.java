package com.evergarden.osgi.loader;

import com.evergarden.sdk.database.Migration;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Loader implements BundleActivator {

    @Override
    public void start(BundleContext ctx) throws Exception {
       Migration mig = (Migration) ctx.getService(ctx.getServiceReference(Migration.class));
       mig.execute("We try to load all plugin here");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {

    }
}
