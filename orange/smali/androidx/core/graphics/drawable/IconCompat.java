public class androidx.core.graphics.drawable.IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final android.graphics.PorterDuff$Mode k;
	 /* # instance fields */
	 public Integer a;
	 public java.lang.Object b;
	 public c;
	 public android.os.Parcelable d;
	 public Integer e;
	 public Integer f;
	 public android.content.res.ColorStateList g;
	 public android.graphics.PorterDuff$Mode h;
	 public java.lang.String i;
	 public java.lang.String j;
	 /* # direct methods */
	 public static androidx.core.graphics.drawable.IconCompat ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = android.graphics.PorterDuff$Mode.SRC_IN;
		 return;
	 } // .end method
	 public androidx.core.graphics.drawable.IconCompat ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* iput v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 this.c = v0;
		 /* .line 4 */
		 this.d = v0;
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 5 */
		 /* iput v1, p0, Landroidx/core/graphics/drawable/IconCompat;->e:I */
		 /* .line 6 */
		 /* iput v1, p0, Landroidx/core/graphics/drawable/IconCompat;->f:I */
		 /* .line 7 */
		 this.g = v0;
		 /* .line 8 */
		 v1 = androidx.core.graphics.drawable.IconCompat.k;
		 this.h = v1;
		 /* .line 9 */
		 this.i = v0;
		 return;
	 } // .end method
	 public androidx.core.graphics.drawable.IconCompat ( ) {
		 /* .locals 2 */
		 /* .line 10 */
		 /* invoke-direct {p0}, Landroidx/versionedparcelable/CustomVersionedParcelable;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 11 */
		 /* iput v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 12 */
		 this.c = v0;
		 /* .line 13 */
		 this.d = v0;
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 14 */
		 /* iput v1, p0, Landroidx/core/graphics/drawable/IconCompat;->e:I */
		 /* .line 15 */
		 /* iput v1, p0, Landroidx/core/graphics/drawable/IconCompat;->f:I */
		 /* .line 16 */
		 this.g = v0;
		 /* .line 17 */
		 v1 = androidx.core.graphics.drawable.IconCompat.k;
		 this.h = v1;
		 /* .line 18 */
		 this.i = v0;
		 /* .line 19 */
		 /* iput p1, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
		 return;
	 } // .end method
	 public static Integer a ( android.graphics.drawable.Icon p0 ) {
		 /* .locals 6 */
		 final String v0 = "Unable to get icon resource"; // const-string v0, "Unable to get icon resource"
		 final String v1 = "IconCompat"; // const-string v1, "IconCompat"
		 /* .line 39 */
		 /* const/16 v3, 0x1c */
		 /* if-lt v2, v3, :cond_0 */
		 /* .line 40 */
		 p0 = 		 (( android.graphics.drawable.Icon ) p0 ).getResId ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getResId()I
	 } // :cond_0
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 41 */
	 try { // :try_start_0
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 final String v4 = "getResId"; // const-string v4, "getResId"
		 /* new-array v5, v2, [Ljava/lang/Class; */
		 (( java.lang.Class ) v3 ).getMethod ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* new-array v4, v2, [Ljava/lang/Object; */
		 (( java.lang.reflect.Method ) v3 ).invoke ( p0, v4 ); // invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast p0, Ljava/lang/Integer; */
		 p0 = 		 (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
		 /* :try_end_0 */
		 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* .line 42 */
		 android.util.Log .e ( v1,v0,p0 );
		 /* :catch_1 */
		 /* move-exception p0 */
		 /* .line 43 */
		 android.util.Log .e ( v1,v0,p0 );
		 /* :catch_2 */
		 /* move-exception p0 */
		 /* .line 44 */
		 android.util.Log .e ( v1,v0,p0 );
	 } // .end method
	 public static android.graphics.Bitmap a ( android.graphics.Bitmap p0, Boolean p1 ) {
		 /* .locals 9 */
		 /* .line 45 */
		 v0 = 		 (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* .line 46 */
		 v1 = 		 (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* .line 47 */
		 v0 = 		 java.lang.Math .min ( v0,v1 );
		 /* int-to-float v0, v0 */
		 /* const v1, 0x3f2aaaab */
		 /* mul-float v0, v0, v1 */
		 /* float-to-int v0, v0 */
		 /* .line 48 */
		 v1 = android.graphics.Bitmap$Config.ARGB_8888;
		 android.graphics.Bitmap .createBitmap ( v0,v0,v1 );
		 /* .line 49 */
		 /* new-instance v2, Landroid/graphics/Canvas; */
		 /* invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
		 /* .line 50 */
		 /* new-instance v3, Landroid/graphics/Paint; */
		 int v4 = 3; // const/4 v4, 0x3
		 /* invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V */
		 /* int-to-float v4, v0 */
		 /* const/high16 v5, 0x3f000000 # 0.5f */
		 /* mul-float v5, v5, v4 */
		 /* const v6, 0x3f6aaaab */
		 /* mul-float v6, v6, v5 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* const p1, 0x3c2aaaab */
			 /* mul-float p1, p1, v4 */
			 int v7 = 0; // const/4 v7, 0x0
			 /* .line 51 */
			 (( android.graphics.Paint ) v3 ).setColor ( v7 ); // invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setColor(I)V
			 /* const v7, 0x3caaaaab */
			 /* mul-float v4, v4, v7 */
			 /* const/high16 v7, 0x3d000000 # 0.03125f */
			 int v8 = 0; // const/4 v8, 0x0
			 /* .line 52 */
			 (( android.graphics.Paint ) v3 ).setShadowLayer ( p1, v8, v4, v7 ); // invoke-virtual {v3, p1, v8, v4, v7}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V
			 /* .line 53 */
			 (( android.graphics.Canvas ) v2 ).drawCircle ( v5, v5, v6, v3 ); // invoke-virtual {v2, v5, v5, v6, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
			 /* const/high16 v4, 0x1e000000 */
			 /* .line 54 */
			 (( android.graphics.Paint ) v3 ).setShadowLayer ( p1, v8, v8, v4 ); // invoke-virtual {v3, p1, v8, v8, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V
			 /* .line 55 */
			 (( android.graphics.Canvas ) v2 ).drawCircle ( v5, v5, v6, v3 ); // invoke-virtual {v2, v5, v5, v6, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
			 /* .line 56 */
			 (( android.graphics.Paint ) v3 ).clearShadowLayer ( ); // invoke-virtual {v3}, Landroid/graphics/Paint;->clearShadowLayer()V
		 } // :cond_0
		 /* const/high16 p1, -0x1000000 */
		 /* .line 57 */
		 (( android.graphics.Paint ) v3 ).setColor ( p1 ); // invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setColor(I)V
		 /* .line 58 */
		 /* new-instance p1, Landroid/graphics/BitmapShader; */
		 v4 = android.graphics.Shader$TileMode.CLAMP;
		 /* invoke-direct {p1, p0, v4, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V */
		 /* .line 59 */
		 /* new-instance v4, Landroid/graphics/Matrix; */
		 /* invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V */
		 /* .line 60 */
		 v7 = 		 (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* sub-int/2addr v7, v0 */
		 /* neg-int v7, v7 */
		 /* div-int/lit8 v7, v7, 0x2 */
		 /* int-to-float v7, v7 */
		 /* .line 61 */
		 p0 = 		 (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* sub-int/2addr p0, v0 */
		 /* neg-int p0, p0 */
		 /* div-int/lit8 p0, p0, 0x2 */
		 /* int-to-float p0, p0 */
		 /* .line 62 */
		 (( android.graphics.Matrix ) v4 ).setTranslate ( v7, p0 ); // invoke-virtual {v4, v7, p0}, Landroid/graphics/Matrix;->setTranslate(FF)V
		 /* .line 63 */
		 (( android.graphics.BitmapShader ) p1 ).setLocalMatrix ( v4 ); // invoke-virtual {p1, v4}, Landroid/graphics/BitmapShader;->setLocalMatrix(Landroid/graphics/Matrix;)V
		 /* .line 64 */
		 (( android.graphics.Paint ) v3 ).setShader ( p1 ); // invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
		 /* .line 65 */
		 (( android.graphics.Canvas ) v2 ).drawCircle ( v5, v5, v6, v3 ); // invoke-virtual {v2, v5, v5, v6, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 66 */
		 (( android.graphics.Canvas ) v2 ).setBitmap ( p0 ); // invoke-virtual {v2, p0}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V
	 } // .end method
	 public static androidx.core.graphics.drawable.IconCompat a ( android.content.res.Resources p0, java.lang.String p1, Integer p2 ) {
		 /* .locals 2 */
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 if ( p2 != null) { // if-eqz p2, :cond_1
				 /* .line 1 */
				 /* new-instance v0, Landroidx/core/graphics/drawable/IconCompat; */
				 int v1 = 2; // const/4 v1, 0x2
				 /* invoke-direct {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V */
				 /* .line 2 */
				 /* iput p2, v0, Landroidx/core/graphics/drawable/IconCompat;->e:I */
				 if ( p0 != null) { // if-eqz p0, :cond_0
					 /* .line 3 */
					 try { // :try_start_0
						 (( android.content.res.Resources ) p0 ).getResourceName ( p2 ); // invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
						 this.b = p0;
						 /* :try_end_0 */
						 /* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
						 /* .line 4 */
						 /* :catch_0 */
						 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
						 final String p1 = "Icon resource cannot be found"; // const-string p1, "Icon resource cannot be found"
						 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
						 /* throw p0 */
						 /* .line 5 */
					 } // :cond_0
					 this.b = p1;
					 /* .line 6 */
				 } // :goto_0
				 this.j = p1;
				 /* .line 7 */
			 } // :cond_1
			 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
			 final String p1 = "Drawable resource ID must not be 0"; // const-string p1, "Drawable resource ID must not be 0"
			 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
			 /* throw p0 */
			 /* .line 8 */
		 } // :cond_2
		 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
		 final String p1 = "Package must not be null."; // const-string p1, "Package must not be null."
		 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
	 } // .end method
	 public static androidx.core.graphics.drawable.IconCompat a ( android.graphics.Bitmap p0 ) {
		 /* .locals 2 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 9 */
			 /* new-instance v0, Landroidx/core/graphics/drawable/IconCompat; */
			 int v1 = 1; // const/4 v1, 0x1
			 /* invoke-direct {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V */
			 /* .line 10 */
			 this.b = p0;
			 /* .line 11 */
		 } // :cond_0
		 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
		 final String v0 = "Bitmap must not be null."; // const-string v0, "Bitmap must not be null."
		 /* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
	 } // .end method
	 public static java.lang.String a ( Integer p0 ) {
		 /* .locals 0 */
		 /* packed-switch p0, :pswitch_data_0 */
		 final String p0 = "UNKNOWN"; // const-string p0, "UNKNOWN"
		 /* :pswitch_0 */
		 final String p0 = "URI_MASKABLE"; // const-string p0, "URI_MASKABLE"
		 /* :pswitch_1 */
		 final String p0 = "BITMAP_MASKABLE"; // const-string p0, "BITMAP_MASKABLE"
		 /* :pswitch_2 */
		 final String p0 = "URI"; // const-string p0, "URI"
		 /* :pswitch_3 */
		 final String p0 = "DATA"; // const-string p0, "DATA"
		 /* :pswitch_4 */
		 final String p0 = "RESOURCE"; // const-string p0, "RESOURCE"
		 /* :pswitch_5 */
		 final String p0 = "BITMAP"; // const-string p0, "BITMAP"
		 /* :pswitch_data_0 */
		 /* .packed-switch 0x1 */
		 /* :pswitch_5 */
		 /* :pswitch_4 */
		 /* :pswitch_3 */
		 /* :pswitch_2 */
		 /* :pswitch_1 */
		 /* :pswitch_0 */
	 } // .end packed-switch
} // .end method
public static java.lang.String b ( android.graphics.drawable.Icon p0 ) {
	 /* .locals 7 */
	 final String v0 = "Unable to get icon package"; // const-string v0, "Unable to get icon package"
	 final String v1 = "IconCompat"; // const-string v1, "IconCompat"
	 /* .line 33 */
	 /* const/16 v3, 0x1c */
	 /* if-lt v2, v3, :cond_0 */
	 /* .line 34 */
	 (( android.graphics.drawable.Icon ) p0 ).getResPackage ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getResPackage()Ljava/lang/String;
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 35 */
try { // :try_start_0
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 final String v4 = "getResPackage"; // const-string v4, "getResPackage"
	 int v5 = 0; // const/4 v5, 0x0
	 /* new-array v6, v5, [Ljava/lang/Class; */
	 (( java.lang.Class ) v3 ).getMethod ( v4, v6 ); // invoke-virtual {v3, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 /* new-array v4, v5, [Ljava/lang/Object; */
	 (( java.lang.reflect.Method ) v3 ).invoke ( p0, v4 ); // invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast p0, Ljava/lang/String; */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p0 */
	 /* .line 36 */
	 android.util.Log .e ( v1,v0,p0 );
	 /* :catch_1 */
	 /* move-exception p0 */
	 /* .line 37 */
	 android.util.Log .e ( v1,v0,p0 );
	 /* :catch_2 */
	 /* move-exception p0 */
	 /* .line 38 */
	 android.util.Log .e ( v1,v0,p0 );
} // .end method
public static Integer c ( android.graphics.drawable.Icon p0 ) {
	 /* .locals 7 */
	 final String v0 = "Unable to get icon type "; // const-string v0, "Unable to get icon type "
	 final String v1 = "IconCompat"; // const-string v1, "IconCompat"
	 /* .line 8 */
	 /* const/16 v3, 0x1c */
	 /* if-lt v2, v3, :cond_0 */
	 /* .line 9 */
	 p0 = 	 (( android.graphics.drawable.Icon ) p0 ).getType ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getType()I
} // :cond_0
int v2 = -1; // const/4 v2, -0x1
/* .line 10 */
try { // :try_start_0
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 final String v4 = "getType"; // const-string v4, "getType"
	 int v5 = 0; // const/4 v5, 0x0
	 /* new-array v6, v5, [Ljava/lang/Class; */
	 (( java.lang.Class ) v3 ).getMethod ( v4, v6 ); // invoke-virtual {v3, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 /* new-array v4, v5, [Ljava/lang/Object; */
	 (( java.lang.reflect.Method ) v3 ).invoke ( p0, v4 ); // invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v3, Ljava/lang/Integer; */
	 p0 = 	 (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
	 /* :try_end_0 */
	 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v3 */
	 /* .line 11 */
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).append ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .e ( v1,p0,v3 );
	 /* :catch_1 */
	 /* move-exception v3 */
	 /* .line 12 */
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).append ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .e ( v1,p0,v3 );
	 /* :catch_2 */
	 /* move-exception v3 */
	 /* .line 13 */
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).append ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .e ( v1,p0,v3 );
} // .end method
public static android.net.Uri d ( android.graphics.drawable.Icon p0 ) {
	 /* .locals 7 */
	 final String v0 = "Unable to get icon uri"; // const-string v0, "Unable to get icon uri"
	 final String v1 = "IconCompat"; // const-string v1, "IconCompat"
	 /* .line 4 */
	 /* const/16 v3, 0x1c */
	 /* if-lt v2, v3, :cond_0 */
	 /* .line 5 */
	 (( android.graphics.drawable.Icon ) p0 ).getUri ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getUri()Landroid/net/Uri;
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 6 */
try { // :try_start_0
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 final String v4 = "getUri"; // const-string v4, "getUri"
	 int v5 = 0; // const/4 v5, 0x0
	 /* new-array v6, v5, [Ljava/lang/Class; */
	 (( java.lang.Class ) v3 ).getMethod ( v4, v6 ); // invoke-virtual {v3, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 /* new-array v4, v5, [Ljava/lang/Object; */
	 (( java.lang.reflect.Method ) v3 ).invoke ( p0, v4 ); // invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast p0, Landroid/net/Uri; */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p0 */
	 /* .line 7 */
	 android.util.Log .e ( v1,v0,p0 );
	 /* :catch_1 */
	 /* move-exception p0 */
	 /* .line 8 */
	 android.util.Log .e ( v1,v0,p0 );
	 /* :catch_2 */
	 /* move-exception p0 */
	 /* .line 9 */
	 android.util.Log .e ( v1,v0,p0 );
} // .end method
/* # virtual methods */
public android.graphics.Bitmap a ( ) {
	 /* .locals 3 */
	 /* .line 12 */
	 /* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
	 int v1 = -1; // const/4 v1, -0x1
	 /* if-ne v0, v1, :cond_1 */
	 /* const/16 v1, 0x17 */
	 /* if-lt v0, v1, :cond_1 */
	 /* .line 13 */
	 v0 = this.b;
	 /* instance-of v1, v0, Landroid/graphics/Bitmap; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 14 */
		 /* check-cast v0, Landroid/graphics/Bitmap; */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 15 */
} // :cond_1
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_2 */
/* .line 16 */
v0 = this.b;
/* check-cast v0, Landroid/graphics/Bitmap; */
} // :cond_2
int v2 = 5; // const/4 v2, 0x5
/* if-ne v0, v2, :cond_3 */
/* .line 17 */
v0 = this.b;
/* check-cast v0, Landroid/graphics/Bitmap; */
androidx.core.graphics.drawable.IconCompat .a ( v0,v1 );
/* .line 18 */
} // :cond_3
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "called getBitmap() on "; // const-string v2, "called getBitmap() on "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.io.InputStream a ( android.content.Context p0 ) {
/* .locals 4 */
/* .line 19 */
(( androidx.core.graphics.drawable.IconCompat ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->e()Landroid/net/Uri;
/* .line 20 */
(( android.net.Uri ) v0 ).getScheme ( ); // invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
final String v2 = "content"; // const-string v2, "content"
/* .line 21 */
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
final String v3 = "IconCompat"; // const-string v3, "IconCompat"
/* if-nez v2, :cond_1 */
final String v2 = "file"; // const-string v2, "file"
/* .line 22 */
v1 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 23 */
} // :cond_0
try { // :try_start_0
/* new-instance p1, Ljava/io/FileInputStream; */
/* new-instance v1, Ljava/io/File; */
v2 = this.b;
/* check-cast v2, Ljava/lang/String; */
/* invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* invoke-direct {p1, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 24 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unable to load image from path: "; // const-string v2, "Unable to load image from path: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v3,v0,p1 );
/* .line 25 */
} // :cond_1
} // :goto_0
try { // :try_start_1
(( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
(( android.content.ContentResolver ) p1 ).openInputStream ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception p1 */
/* .line 26 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unable to load image from URI: "; // const-string v2, "Unable to load image from URI: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v3,v0,p1 );
} // :goto_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a ( Boolean p0 ) {
/* .locals 3 */
/* .line 27 */
v0 = this.h;
(( android.graphics.PorterDuff$Mode ) v0 ).name ( ); // invoke-virtual {v0}, Landroid/graphics/PorterDuff$Mode;->name()Ljava/lang/String;
this.i = v0;
/* .line 28 */
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
final String v1 = "UTF-16"; // const-string v1, "UTF-16"
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
/* .line 29 */
/* :pswitch_1 */
p1 = this.b;
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
java.nio.charset.Charset .forName ( v1 );
(( java.lang.String ) p1 ).getBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
this.c = p1;
/* .line 30 */
/* :pswitch_2 */
p1 = this.b;
/* check-cast p1, [B */
this.c = p1;
/* .line 31 */
/* :pswitch_3 */
p1 = this.b;
/* check-cast p1, Ljava/lang/String; */
java.nio.charset.Charset .forName ( v1 );
(( java.lang.String ) p1 ).getBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
this.c = p1;
/* :pswitch_4 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 32 */
p1 = this.b;
/* check-cast p1, Landroid/graphics/Bitmap; */
/* .line 33 */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 34 */
v1 = android.graphics.Bitmap$CompressFormat.PNG;
/* const/16 v2, 0x5a */
(( android.graphics.Bitmap ) p1 ).compress ( v1, v2, v0 ); // invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
/* .line 35 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
this.c = p1;
/* .line 36 */
} // :cond_0
p1 = this.b;
/* check-cast p1, Landroid/os/Parcelable; */
this.d = p1;
/* :pswitch_5 */
/* if-nez p1, :cond_1 */
/* .line 37 */
p1 = this.b;
/* check-cast p1, Landroid/os/Parcelable; */
this.d = p1;
/* .line 38 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "Can\'t serialize Icon created with IconCompat#createFromIcon"; // const-string v0, "Can\'t serialize Icon created with IconCompat#createFromIcon"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :goto_0
return;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch -0x1 */
/* :pswitch_5 */
/* :pswitch_0 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_4 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public Integer b ( ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
v0 = this.b;
/* check-cast v0, Landroid/graphics/drawable/Icon; */
v0 = androidx.core.graphics.drawable.IconCompat .a ( v0 );
/* .line 3 */
} // :cond_0
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_1 */
/* .line 4 */
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->e:I */
/* .line 5 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "called getResId() on "; // const-string v2, "called getResId() on "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public android.graphics.drawable.Icon b ( android.content.Context p0 ) {
/* .locals 4 */
/* .line 6 */
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x1a */
/* packed-switch v0, :pswitch_data_0 */
/* .line 7 */
/* :pswitch_0 */
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "Unknown type"; // const-string v0, "Unknown type"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 8 */
/* :pswitch_1 */
/* const/16 v3, 0x1e */
/* if-lt v0, v3, :cond_0 */
/* .line 9 */
(( androidx.core.graphics.drawable.IconCompat ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->e()Landroid/net/Uri;
android.graphics.drawable.Icon .createWithAdaptiveBitmapContentUri ( p1 );
/* goto/16 :goto_0 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 10 */
(( androidx.core.graphics.drawable.IconCompat ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/graphics/drawable/IconCompat;->a(Landroid/content/Context;)Ljava/io/InputStream;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 11 */
/* if-lt v0, v2, :cond_1 */
/* .line 12 */
android.graphics.BitmapFactory .decodeStream ( p1 );
android.graphics.drawable.Icon .createWithAdaptiveBitmap ( p1 );
/* goto/16 :goto_0 */
/* .line 13 */
} // :cond_1
android.graphics.BitmapFactory .decodeStream ( p1 );
/* .line 14 */
androidx.core.graphics.drawable.IconCompat .a ( p1,v1 );
android.graphics.drawable.Icon .createWithBitmap ( p1 );
/* goto/16 :goto_0 */
/* .line 15 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Cannot load adaptive icon from uri: "; // const-string v1, "Cannot load adaptive icon from uri: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 16 */
(( androidx.core.graphics.drawable.IconCompat ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->e()Landroid/net/Uri;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 17 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Context is required to resolve the file uri of the icon: "; // const-string v1, "Context is required to resolve the file uri of the icon: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 18 */
(( androidx.core.graphics.drawable.IconCompat ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->e()Landroid/net/Uri;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 19 */
/* :pswitch_2 */
/* if-lt p1, v2, :cond_4 */
/* .line 20 */
p1 = this.b;
/* check-cast p1, Landroid/graphics/Bitmap; */
android.graphics.drawable.Icon .createWithAdaptiveBitmap ( p1 );
/* .line 21 */
} // :cond_4
p1 = this.b;
/* check-cast p1, Landroid/graphics/Bitmap; */
/* .line 22 */
androidx.core.graphics.drawable.IconCompat .a ( p1,v1 );
/* .line 23 */
android.graphics.drawable.Icon .createWithBitmap ( p1 );
/* .line 24 */
/* :pswitch_3 */
p1 = this.b;
/* check-cast p1, Ljava/lang/String; */
android.graphics.drawable.Icon .createWithContentUri ( p1 );
/* .line 25 */
/* :pswitch_4 */
p1 = this.b;
/* check-cast p1, [B */
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->e:I */
/* iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->f:I */
android.graphics.drawable.Icon .createWithData ( p1,v0,v1 );
/* .line 26 */
/* :pswitch_5 */
(( androidx.core.graphics.drawable.IconCompat ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->c()Ljava/lang/String;
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->e:I */
android.graphics.drawable.Icon .createWithResource ( p1,v0 );
/* .line 27 */
/* :pswitch_6 */
p1 = this.b;
/* check-cast p1, Landroid/graphics/Bitmap; */
android.graphics.drawable.Icon .createWithBitmap ( p1 );
/* .line 28 */
} // :goto_0
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 29 */
(( android.graphics.drawable.Icon ) p1 ).setTintList ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Icon;->setTintList(Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Icon;
/* .line 30 */
} // :cond_5
v0 = this.h;
v1 = androidx.core.graphics.drawable.IconCompat.k;
/* if-eq v0, v1, :cond_6 */
/* .line 31 */
(( android.graphics.drawable.Icon ) p1 ).setTintMode ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Icon;->setTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/drawable/Icon;
} // :cond_6
/* .line 32 */
/* :pswitch_7 */
p1 = this.b;
/* check-cast p1, Landroid/graphics/drawable/Icon; */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch -0x1 */
/* :pswitch_7 */
/* :pswitch_0 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public java.lang.String c ( ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* const/16 v2, 0x17 */
/* if-lt v0, v2, :cond_0 */
/* .line 2 */
v0 = this.b;
/* check-cast v0, Landroid/graphics/drawable/Icon; */
androidx.core.graphics.drawable.IconCompat .b ( v0 );
/* .line 3 */
} // :cond_0
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v2 = 2; // const/4 v2, 0x2
/* if-ne v0, v2, :cond_2 */
/* .line 4 */
v0 = this.j;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
v0 = this.b;
/* check-cast v0, Ljava/lang/String; */
final String v2 = ":"; // const-string v2, ":"
(( java.lang.String ) v0 ).split ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
/* .line 6 */
} // :cond_1
v0 = this.j;
/* .line 7 */
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "called getResPackage() on "; // const-string v2, "called getResPackage() on "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer d ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
v0 = this.b;
/* check-cast v0, Landroid/graphics/drawable/Icon; */
v0 = androidx.core.graphics.drawable.IconCompat .c ( v0 );
/* .line 3 */
} // :cond_0
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
} // .end method
public android.net.Uri e ( ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
v0 = this.b;
/* check-cast v0, Landroid/graphics/drawable/Icon; */
androidx.core.graphics.drawable.IconCompat .d ( v0 );
/* .line 3 */
} // :cond_0
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v1 = 4; // const/4 v1, 0x4
/* if-eq v0, v1, :cond_2 */
int v1 = 6; // const/4 v1, 0x6
/* if-ne v0, v1, :cond_1 */
/* .line 4 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "called getUri() on "; // const-string v2, "called getUri() on "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 5 */
} // :cond_2
} // :goto_0
v0 = this.b;
/* check-cast v0, Ljava/lang/String; */
android.net.Uri .parse ( v0 );
} // .end method
public void f ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.i;
android.graphics.PorterDuff$Mode .valueOf ( v0 );
this.h = v0;
/* .line 2 */
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v1 = 0; // const/4 v1, 0x0
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
/* .line 3 */
/* :pswitch_1 */
v0 = this.c;
this.b = v0;
/* .line 4 */
/* :pswitch_2 */
/* new-instance v0, Ljava/lang/String; */
v2 = this.c;
final String v3 = "UTF-16"; // const-string v3, "UTF-16"
java.nio.charset.Charset .forName ( v3 );
/* invoke-direct {v0, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
this.b = v0;
/* .line 5 */
/* iget v2, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v3 = 2; // const/4 v3, 0x2
/* if-ne v2, v3, :cond_2 */
/* .line 6 */
v2 = this.j;
/* if-nez v2, :cond_2 */
/* .line 7 */
/* check-cast v0, Ljava/lang/String; */
int v2 = -1; // const/4 v2, -0x1
final String v3 = ":"; // const-string v3, ":"
(( java.lang.String ) v0 ).split ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
this.j = v0;
/* .line 8 */
/* :pswitch_3 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 9 */
this.b = v0;
/* .line 10 */
} // :cond_0
v0 = this.c;
this.b = v0;
int v2 = 3; // const/4 v2, 0x3
/* .line 11 */
/* iput v2, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
/* .line 12 */
/* iput v1, p0, Landroidx/core/graphics/drawable/IconCompat;->e:I */
/* .line 13 */
/* array-length v0, v0 */
/* iput v0, p0, Landroidx/core/graphics/drawable/IconCompat;->f:I */
/* .line 14 */
/* :pswitch_4 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 15 */
this.b = v0;
/* .line 16 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Invalid icon"; // const-string v1, "Invalid icon"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
} // :goto_0
return;
/* :pswitch_data_0 */
/* .packed-switch -0x1 */
/* :pswitch_4 */
/* :pswitch_0 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public android.graphics.drawable.Icon g ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( androidx.core.graphics.drawable.IconCompat ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/Context;)Landroid/graphics/drawable/Icon;
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
v0 = this.b;
java.lang.String .valueOf ( v0 );
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "Icon(typ="; // const-string v1, "Icon(typ="
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
androidx.core.graphics.drawable.IconCompat .a ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 4 */
/* iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->a:I */
/* packed-switch v1, :pswitch_data_0 */
/* :pswitch_0 */
final String v1 = " uri="; // const-string v1, " uri="
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* :pswitch_1 */
final String v1 = " len="; // const-string v1, " len="
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->e:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 7 */
/* iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->f:I */
if ( v1 != null) { // if-eqz v1, :cond_1
final String v1 = " off="; // const-string v1, " off="
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Landroidx/core/graphics/drawable/IconCompat;->f:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* :pswitch_2 */
final String v1 = " pkg="; // const-string v1, " pkg="
/* .line 9 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.j;
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " id="; // const-string v1, " id="
/* .line 11 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* .line 12 */
v3 = (( androidx.core.graphics.drawable.IconCompat ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/core/graphics/drawable/IconCompat;->b()I
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
final String v2 = "0x%08x"; // const-string v2, "0x%08x"
java.lang.String .format ( v2,v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* :pswitch_3 */
final String v1 = " size="; // const-string v1, " size="
/* .line 13 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* .line 14 */
v1 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "x"; // const-string v1, "x"
/* .line 15 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* .line 16 */
v1 = (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 17 */
} // :cond_1
} // :goto_0
v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_2
final String v1 = " tint="; // const-string v1, " tint="
/* .line 18 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 19 */
v1 = this.g;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 20 */
} // :cond_2
v1 = this.h;
v2 = androidx.core.graphics.drawable.IconCompat.k;
/* if-eq v1, v2, :cond_3 */
final String v1 = " mode="; // const-string v1, " mode="
/* .line 21 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.h;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
} // :cond_3
final String v1 = ")"; // const-string v1, ")"
/* .line 22 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 23 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_3 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
