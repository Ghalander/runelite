import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("ItemComposition")
public class ItemComposition extends CacheableNode {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   @Export("item_ref")
   public static IndexDataBase item_ref;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   @Export("items")
   public static NodeCache items;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   @Export("itemModelCache")
   public static NodeCache itemModelCache;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "Lgu;"
   )
   @Export("itemSpriteCache")
   public static NodeCache itemSpriteCache;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 893144361
   )
   @Export("id")
   public int id;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1453511911
   )
   @Export("inventoryModel")
   int inventoryModel;
   @ObfuscatedName("o")
   @Export("name")
   public String name;
   @ObfuscatedName("r")
   @Export("colourToReplace")
   short[] colourToReplace;
   @ObfuscatedName("i")
   @Export("colourToReplaceWith")
   short[] colourToReplaceWith;
   @ObfuscatedName("l")
   @Export("textureToReplace")
   short[] textureToReplace;
   @ObfuscatedName("m")
   @Export("textToReplaceWith")
   short[] textToReplaceWith;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 232612579
   )
   @Export("zoom2d")
   public int zoom2d;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1556411869
   )
   @Export("xan2d")
   public int xan2d;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -404379691
   )
   @Export("yan2d")
   public int yan2d;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1182865303
   )
   @Export("zan2d")
   public int zan2d;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 51891773
   )
   @Export("offsetX2d")
   public int offsetX2d;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1784761435
   )
   @Export("offsetY2d")
   public int offsetY2d;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 658096135
   )
   @Export("isStackable")
   public int isStackable;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -968472145
   )
   @Export("price")
   public int price;
   @ObfuscatedName("ag")
   @Export("isMembers")
   public boolean isMembers;
   @ObfuscatedName("ak")
   @Export("groundActions")
   public String[] groundActions;
   @ObfuscatedName("as")
   @Export("inventoryActions")
   public String[] inventoryActions;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 156584973
   )
   @Export("team")
   int team;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1536749267
   )
   @Export("maleModel")
   int maleModel;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -2144494677
   )
   @Export("maleModel1")
   int maleModel1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1840041673
   )
   @Export("maleOffset")
   int maleOffset;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1164979167
   )
   @Export("femaleModel")
   int femaleModel;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 2001513361
   )
   @Export("femaleModel1")
   int femaleModel1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1454486959
   )
   @Export("femaleOffset")
   int femaleOffset;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -417382559
   )
   @Export("maleModel2")
   int maleModel2;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 2095734483
   )
   @Export("femaleModel2")
   int femaleModel2;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1550750577
   )
   @Export("maleHeadModel")
   int maleHeadModel;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1469717441
   )
   @Export("maleHeadModel2")
   int maleHeadModel2;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -806041147
   )
   @Export("femaleHeadModel")
   int femaleHeadModel;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1553992041
   )
   @Export("femaleHeadModel2")
   int femaleHeadModel2;
   @ObfuscatedName("ae")
   @Export("countObj")
   int[] countObj;
   @ObfuscatedName("am")
   @Export("countCo")
   int[] countCo;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1866150387
   )
   @Export("note")
   public int note;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1408228201
   )
   @Export("notedTemplate")
   public int notedTemplate;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -933749849
   )
   @Export("resizeX")
   int resizeX;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -2006568821
   )
   @Export("resizeY")
   int resizeY;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1353408719
   )
   @Export("resizeZ")
   int resizeZ;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -1717939813
   )
   @Export("ambient")
   public int ambient;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -1199119237
   )
   @Export("contrast")
   public int contrast;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 394645357
   )
   @Export("int1")
   public int int1;
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "Lgr;"
   )
   IterableHashTable field3607;
   @ObfuscatedName("bg")
   @Export("isTradable")
   public boolean isTradable;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 806926903
   )
   @Export("unnotedId")
   int unnotedId;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1995884479
   )
   @Export("notedId")
   int notedId;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -389138497
   )
   @Export("int2")
   public int int2;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 599115067
   )
   @Export("int3")
   public int int3;

   static {
      items = new NodeCache(64);
      itemModelCache = new NodeCache(50);
      itemSpriteCache = new NodeCache(200);
   }

   ItemComposition() {
      this.name = "null";
      this.zoom2d = 2000;
      this.xan2d = 0;
      this.yan2d = 0;
      this.zan2d = 0;
      this.offsetX2d = 0;
      this.offsetY2d = 0;
      this.isStackable = 0;
      this.price = 1;
      this.isMembers = false;
      this.groundActions = new String[]{null, null, "Take", null, null};
      this.inventoryActions = new String[]{null, null, null, null, "Drop"};
      this.team = -2;
      this.maleModel = -1;
      this.maleModel1 = -1;
      this.maleOffset = 0;
      this.femaleModel = -1;
      this.femaleModel1 = -1;
      this.femaleOffset = 0;
      this.maleModel2 = -1;
      this.femaleModel2 = -1;
      this.maleHeadModel = -1;
      this.maleHeadModel2 = -1;
      this.femaleHeadModel = -1;
      this.femaleHeadModel2 = -1;
      this.note = -1;
      this.notedTemplate = -1;
      this.resizeX = 128;
      this.resizeY = 128;
      this.resizeZ = 128;
      this.ambient = 0;
      this.contrast = 0;
      this.int1 = 0;
      this.isTradable = false;
      this.unnotedId = -1;
      this.notedId = -1;
      this.int2 = -1;
      this.int3 = -1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "50"
   )
   @Export("post")
   void post() {
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(Lgh;I)V",
      garbageValue = "1868364581"
   )
   @Export("loadBuffer")
   void loadBuffer(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.populateFromBuffer(var1, var2);
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Lgh;II)V",
      garbageValue = "-1784433545"
   )
   @Export("populateFromBuffer")
   void populateFromBuffer(Buffer var1, int var2) {
      if(var2 == 1) {
         this.inventoryModel = var1.readUnsignedShort();
      } else if(var2 == 2) {
         this.name = var1.readString();
      } else if(var2 == 4) {
         this.zoom2d = var1.readUnsignedShort();
      } else if(var2 == 5) {
         this.xan2d = var1.readUnsignedShort();
      } else if(var2 == 6) {
         this.yan2d = var1.readUnsignedShort();
      } else if(var2 == 7) {
         this.offsetX2d = var1.readUnsignedShort();
         if(this.offsetX2d > 32767) {
            this.offsetX2d -= 65536;
         }
      } else if(var2 == 8) {
         this.offsetY2d = var1.readUnsignedShort();
         if(this.offsetY2d > 32767) {
            this.offsetY2d -= 65536;
         }
      } else if(var2 == 11) {
         this.isStackable = 1;
      } else if(var2 == 12) {
         this.price = var1.readInt();
      } else if(var2 == 16) {
         this.isMembers = true;
      } else if(var2 == 23) {
         this.maleModel = var1.readUnsignedShort();
         this.maleOffset = var1.readUnsignedByte();
      } else if(var2 == 24) {
         this.maleModel1 = var1.readUnsignedShort();
      } else if(var2 == 25) {
         this.femaleModel = var1.readUnsignedShort();
         this.femaleOffset = var1.readUnsignedByte();
      } else if(var2 == 26) {
         this.femaleModel1 = var1.readUnsignedShort();
      } else if(var2 >= 30 && var2 < 35) {
         this.groundActions[var2 - 30] = var1.readString();
         if(this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.groundActions[var2 - 30] = null;
         }
      } else if(var2 >= 35 && var2 < 40) {
         this.inventoryActions[var2 - 35] = var1.readString();
      } else {
         int var3;
         int var4;
         if(var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.colourToReplace = new short[var3];
            this.colourToReplaceWith = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.colourToReplace[var4] = (short)var1.readUnsignedShort();
               this.colourToReplaceWith[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.textureToReplace = new short[var3];
            this.textToReplaceWith = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.textureToReplace[var4] = (short)var1.readUnsignedShort();
               this.textToReplaceWith[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 42) {
            this.team = var1.readByte();
         } else if(var2 == 65) {
            this.isTradable = true;
         } else if(var2 == 78) {
            this.maleModel2 = var1.readUnsignedShort();
         } else if(var2 == 79) {
            this.femaleModel2 = var1.readUnsignedShort();
         } else if(var2 == 90) {
            this.maleHeadModel = var1.readUnsignedShort();
         } else if(var2 == 91) {
            this.femaleHeadModel = var1.readUnsignedShort();
         } else if(var2 == 92) {
            this.maleHeadModel2 = var1.readUnsignedShort();
         } else if(var2 == 93) {
            this.femaleHeadModel2 = var1.readUnsignedShort();
         } else if(var2 == 95) {
            this.zan2d = var1.readUnsignedShort();
         } else if(var2 == 97) {
            this.note = var1.readUnsignedShort();
         } else if(var2 == 98) {
            this.notedTemplate = var1.readUnsignedShort();
         } else if(var2 >= 100 && var2 < 110) {
            if(this.countObj == null) {
               this.countObj = new int[10];
               this.countCo = new int[10];
            }

            this.countObj[var2 - 100] = var1.readUnsignedShort();
            this.countCo[var2 - 100] = var1.readUnsignedShort();
         } else if(var2 == 110) {
            this.resizeX = var1.readUnsignedShort();
         } else if(var2 == 111) {
            this.resizeY = var1.readUnsignedShort();
         } else if(var2 == 112) {
            this.resizeZ = var1.readUnsignedShort();
         } else if(var2 == 113) {
            this.ambient = var1.readByte();
         } else if(var2 == 114) {
            this.contrast = var1.readByte();
         } else if(var2 == 115) {
            this.int1 = var1.readUnsignedByte();
         } else if(var2 == 139) {
            this.unnotedId = var1.readUnsignedShort();
         } else if(var2 == 140) {
            this.notedId = var1.readUnsignedShort();
         } else if(var2 == 148) {
            this.int2 = var1.readUnsignedShort();
         } else if(var2 == 149) {
            this.int3 = var1.readUnsignedShort();
         } else if(var2 == 249) {
            this.field3607 = ItemContainer.readStringIntParameters(var1, this.field3607);
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(Ljq;Ljq;I)V",
      garbageValue = "1929572175"
   )
   void method4711(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var1.colourToReplace;
      this.colourToReplaceWith = var1.colourToReplaceWith;
      this.textureToReplace = var1.textureToReplace;
      this.textToReplaceWith = var1.textToReplaceWith;
      this.name = var2.name;
      this.isMembers = var2.isMembers;
      this.price = var2.price;
      this.isStackable = 1;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      signature = "(Ljq;Ljq;I)V",
      garbageValue = "-1870469039"
   )
   void method4712(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var2.colourToReplace;
      this.colourToReplaceWith = var2.colourToReplaceWith;
      this.textureToReplace = var2.textureToReplace;
      this.textToReplaceWith = var2.textToReplaceWith;
      this.name = var2.name;
      this.isMembers = var2.isMembers;
      this.isStackable = var2.isStackable;
      this.maleModel = var2.maleModel;
      this.maleModel1 = var2.maleModel1;
      this.maleModel2 = var2.maleModel2;
      this.femaleModel = var2.femaleModel;
      this.femaleModel1 = var2.femaleModel1;
      this.femaleModel2 = var2.femaleModel2;
      this.maleHeadModel = var2.maleHeadModel;
      this.maleHeadModel2 = var2.maleHeadModel2;
      this.femaleHeadModel = var2.femaleHeadModel;
      this.femaleHeadModel2 = var2.femaleHeadModel2;
      this.int1 = var2.int1;
      this.groundActions = var2.groundActions;
      this.inventoryActions = new String[5];
      if(var2.inventoryActions != null) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      this.inventoryActions[4] = "Discard";
      this.price = 0;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(Ljq;Ljq;I)V",
      garbageValue = "568284105"
   )
   void method4753(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var1.colourToReplace;
      this.colourToReplaceWith = var1.colourToReplaceWith;
      this.textureToReplace = var1.textureToReplace;
      this.textToReplaceWith = var1.textToReplaceWith;
      this.isStackable = var1.isStackable;
      this.name = var2.name;
      this.price = 0;
      this.isMembers = false;
      this.isTradable = false;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(II)Ldm;",
      garbageValue = "1054227047"
   )
   public final ModelData method4707(int var1) {
      int var3;
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return KitDefinition.getItemDefinition(var2).method4707(1);
         }
      }

      ModelData var4 = ModelData.method2428(class238.ItemDefinition_modelIndexCache, this.inventoryModel, 0);
      if(var4 == null) {
         return null;
      } else {
         if(this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
            var4.method2487(this.resizeX, this.resizeY, this.resizeZ);
         }

         if(this.colourToReplace != null) {
            for(var3 = 0; var3 < this.colourToReplace.length; ++var3) {
               var4.recolor(this.colourToReplace[var3], this.colourToReplaceWith[var3]);
            }
         }

         if(this.textureToReplace != null) {
            for(var3 = 0; var3 < this.textureToReplace.length; ++var3) {
               var4.method2437(this.textureToReplace[var3], this.textToReplaceWith[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(IB)Lef;",
      garbageValue = "11"
   )
   @Export("getModel")
   public final Model getModel(int var1) {
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return KitDefinition.getItemDefinition(var2).getModel(1);
         }
      }

      Model var5 = (Model)itemModelCache.get((long)this.id);
      if(var5 != null) {
         return var5;
      } else {
         ModelData var6 = ModelData.method2428(class238.ItemDefinition_modelIndexCache, this.inventoryModel, 0);
         if(var6 == null) {
            return null;
         } else {
            if(this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
               var6.method2487(this.resizeX, this.resizeY, this.resizeZ);
            }

            int var4;
            if(this.colourToReplace != null) {
               for(var4 = 0; var4 < this.colourToReplace.length; ++var4) {
                  var6.recolor(this.colourToReplace[var4], this.colourToReplaceWith[var4]);
               }
            }

            if(this.textureToReplace != null) {
               for(var4 = 0; var4 < this.textureToReplace.length; ++var4) {
                  var6.method2437(this.textureToReplace[var4], this.textToReplaceWith[var4]);
               }
            }

            var5 = var6.light(this.ambient + 64, this.contrast * 5 + 768, -50, -10, -50);
            var5.field1851 = true;
            itemModelCache.put(var5, (long)this.id);
            return var5;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(II)Ljq;",
      garbageValue = "-624587436"
   )
   public ItemComposition method4716(int var1) {
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return KitDefinition.getItemDefinition(var2);
         }
      }

      return this;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(ZI)Z",
      garbageValue = "-698982019"
   )
   @Export("readyWorn")
   public final boolean readyWorn(boolean var1) {
      int var2 = this.maleModel;
      int var3 = this.maleModel1;
      int var4 = this.maleModel2;
      if(var1) {
         var2 = this.femaleModel;
         var3 = this.femaleModel1;
         var4 = this.femaleModel2;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if(!class238.ItemDefinition_modelIndexCache.tryLoadRecord(var2, 0)) {
            var5 = false;
         }

         if(var3 != -1 && !class238.ItemDefinition_modelIndexCache.tryLoadRecord(var3, 0)) {
            var5 = false;
         }

         if(var4 != -1 && !class238.ItemDefinition_modelIndexCache.tryLoadRecord(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(ZI)Ldm;",
      garbageValue = "-1325312895"
   )
   @Export("getWornModelData")
   public final ModelData getWornModelData(boolean var1) {
      int var2 = this.maleModel;
      int var3 = this.maleModel1;
      int var4 = this.maleModel2;
      if(var1) {
         var2 = this.femaleModel;
         var3 = this.femaleModel1;
         var4 = this.femaleModel2;
      }

      if(var2 == -1) {
         return null;
      } else {
         ModelData var5 = ModelData.method2428(class238.ItemDefinition_modelIndexCache, var2, 0);
         if(var3 != -1) {
            ModelData var6 = ModelData.method2428(class238.ItemDefinition_modelIndexCache, var3, 0);
            if(var4 != -1) {
               ModelData var7 = ModelData.method2428(class238.ItemDefinition_modelIndexCache, var4, 0);
               ModelData[] var8 = new ModelData[]{var5, var6, var7};
               var5 = new ModelData(var8, 3);
            } else {
               ModelData[] var10 = new ModelData[]{var5, var6};
               var5 = new ModelData(var10, 2);
            }
         }

         if(!var1 && this.maleOffset != 0) {
            var5.method2426(0, this.maleOffset, 0);
         }

         if(var1 && this.femaleOffset != 0) {
            var5.method2426(0, this.femaleOffset, 0);
         }

         int var9;
         if(this.colourToReplace != null) {
            for(var9 = 0; var9 < this.colourToReplace.length; ++var9) {
               var5.recolor(this.colourToReplace[var9], this.colourToReplaceWith[var9]);
            }
         }

         if(this.textureToReplace != null) {
            for(var9 = 0; var9 < this.textureToReplace.length; ++var9) {
               var5.method2437(this.textureToReplace[var9], this.textToReplaceWith[var9]);
            }
         }

         return var5;
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      signature = "(ZB)Z",
      garbageValue = "117"
   )
   public final boolean method4723(boolean var1) {
      int var2 = this.maleHeadModel;
      int var3 = this.maleHeadModel2;
      if(var1) {
         var2 = this.femaleHeadModel;
         var3 = this.femaleHeadModel2;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if(!class238.ItemDefinition_modelIndexCache.tryLoadRecord(var2, 0)) {
            var4 = false;
         }

         if(var3 != -1 && !class238.ItemDefinition_modelIndexCache.tryLoadRecord(var3, 0)) {
            var4 = false;
         }

         return var4;
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(ZI)Ldm;",
      garbageValue = "-269012239"
   )
   public final ModelData method4720(boolean var1) {
      int var2 = this.maleHeadModel;
      int var3 = this.maleHeadModel2;
      if(var1) {
         var2 = this.femaleHeadModel;
         var3 = this.femaleHeadModel2;
      }

      if(var2 == -1) {
         return null;
      } else {
         ModelData var4 = ModelData.method2428(class238.ItemDefinition_modelIndexCache, var2, 0);
         if(var3 != -1) {
            ModelData var5 = ModelData.method2428(class238.ItemDefinition_modelIndexCache, var3, 0);
            ModelData[] var6 = new ModelData[]{var4, var5};
            var4 = new ModelData(var6, 2);
         }

         int var7;
         if(this.colourToReplace != null) {
            for(var7 = 0; var7 < this.colourToReplace.length; ++var7) {
               var4.recolor(this.colourToReplace[var7], this.colourToReplaceWith[var7]);
            }
         }

         if(this.textureToReplace != null) {
            for(var7 = 0; var7 < this.textureToReplace.length; ++var7) {
               var4.method2437(this.textureToReplace[var7], this.textToReplaceWith[var7]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(IIB)I",
      garbageValue = "2"
   )
   public int method4721(int var1, int var2) {
      return GraphicsObject.method1615(this.field3607, var1, var2);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1636862767"
   )
   public String method4722(int var1, String var2) {
      return class192.method3599(this.field3607, var1, var2);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "-23"
   )
   public int method4719() {
      return this.team != -1 && this.inventoryActions != null?(this.team >= 0?(this.inventoryActions[this.team] != null?this.team:-1):("Drop".equalsIgnoreCase(this.inventoryActions[4])?4:-1)):-1;
   }
}
