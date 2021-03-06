import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("Renderable")
public abstract class Renderable extends CacheableNode {
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -1204322527
   )
   @Export("modelHeight")
   public int modelHeight;

   protected Renderable() {
      this.modelHeight = 1000;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(I)Lef;",
      garbageValue = "620909653"
   )
   @Export("getModel")
   protected Model getModel() {
      return null;
   }

   @ObfuscatedName("ce")
   @Export("draw")
   void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      Model var10 = this.getModel();
      if(var10 != null) {
         this.modelHeight = var10.modelHeight;
         var10.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

   }
}
