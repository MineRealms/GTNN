package dev.arbor.gtnn.data.materials

import com.gregtechceu.gtceu.api.data.tag.TagPrefix
import com.gregtechceu.gtceu.utils.memoization.GTMemoizer
import net.minecraft.world.level.ItemLike
import java.util.function.Supplier
import dev.arbor.gtnn.data.GTNNMaterials
import vazkii.botania.common.block.BotaniaBlocks
import vazkii.botania.common.item.BotaniaItems

object BotaniaMaterialsModification {
    fun init() {
        TagPrefix.ingot.setIgnored(GTNNMaterials.TerraSteel, Supplier<ItemLike> { BotaniaItems.terrasteel })
        // Materials initialize during CONSTRUCT, before Botania's block RegisterEvent.
        TagPrefix.block.setIgnored(GTNNMaterials.TerraSteel, GTMemoizer.memoizeBlockSupplier { BotaniaBlocks.terrasteelBlock })
        TagPrefix.nugget.setIgnored(GTNNMaterials.TerraSteel, Supplier<ItemLike> { BotaniaItems.terrasteelNugget })

        TagPrefix.ingot.setIgnored(GTNNMaterials.ManaSteel, Supplier<ItemLike> { BotaniaItems.manaSteel })
        TagPrefix.block.setIgnored(GTNNMaterials.ManaSteel, GTMemoizer.memoizeBlockSupplier { BotaniaBlocks.manasteelBlock })
        TagPrefix.nugget.setIgnored(GTNNMaterials.ManaSteel, Supplier<ItemLike> { BotaniaItems.manasteelNugget })

        TagPrefix.ingot.setIgnored(GTNNMaterials.Elementium, Supplier<ItemLike> { BotaniaItems.elementium })
        TagPrefix.block.setIgnored(GTNNMaterials.Elementium, GTMemoizer.memoizeBlockSupplier { BotaniaBlocks.elementiumBlock })
        TagPrefix.nugget.setIgnored(GTNNMaterials.Elementium, Supplier<ItemLike> { BotaniaItems.elementiumNugget })
    }
}
