package zorbaq.misc.item;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class ItemSmokingPipe extends Item implements IBauble {
	
	public ItemSmokingPipe() {
		super();
		setMaxStackSize(1);
		setHasSubtypes(false);
		setMaxDamage(0);
		setCreativeTab(CreativeTabs.MISC);
	}
	
	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (player.ticksExisted%39 == 0) {
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 200, 0, true, true));
		}
    }

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.HEAD;
	}
}
