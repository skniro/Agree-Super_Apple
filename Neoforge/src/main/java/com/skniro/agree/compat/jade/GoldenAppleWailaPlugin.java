package com.skniro.agree.compat.jade;

import com.skniro.agree.block.init.LeafCropBlock;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaCommonRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class GoldenAppleWailaPlugin implements IWailaPlugin {

  @Override
  public void register(IWailaCommonRegistration registration) {
    //TODO register data providers
  }

  @Override
  public void registerClient(IWailaClientRegistration registration) {
    registration.registerBlockComponent(LeafCropBlockProgressProvider.INSTANCE, LeafCropBlock.class);
  }
}