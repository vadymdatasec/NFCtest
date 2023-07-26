public abstract class e.b.a.y.z.e.z {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.b.a.y.x.f1.g a;
	 /* # direct methods */
	 public static e.b.a.y.z.e.z ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/b/a/y/z/e/y; */
		 /* invoke-direct {v0}, Le/b/a/y/z/e/y;-><init>()V */
		 return;
	 } // .end method
	 public static e.b.a.y.x.y0 a ( Object p0, android.graphics.drawable.Drawable p1, Integer p2, Integer p3 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Le/b/a/y/x/f1/g;", */
		 /* "Landroid/graphics/drawable/Drawable;", */
		 /* "II)", */
		 /* "Le/b/a/y/x/y0<", */
		 /* "Landroid/graphics/Bitmap;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( android.graphics.drawable.Drawable ) p1 ).getCurrent ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;
	 /* .line 2 */
	 /* instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable; */
	 int v1 = 0; // const/4 v1, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
		 /* check-cast p1, Landroid/graphics/drawable/BitmapDrawable; */
		 (( android.graphics.drawable.BitmapDrawable ) p1 ).getBitmap ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
		 /* .line 4 */
	 } // :cond_0
	 /* instance-of v0, p1, Landroid/graphics/drawable/Animatable; */
	 /* if-nez v0, :cond_1 */
	 /* .line 5 */
	 e.b.a.y.z.e.z .b ( p0,p1,p2,p3 );
	 int v1 = 1; // const/4 v1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 6 */
} // :cond_2
p0 = e.b.a.y.z.e.z.a;
/* .line 7 */
} // :goto_1
e.b.a.y.z.e.e .a ( p1,p0 );
} // .end method
public static android.graphics.Bitmap b ( Object p0, android.graphics.drawable.Drawable p1, Integer p2, Integer p3 ) {
/* .locals 6 */
final String v0 = "Unable to draw "; // const-string v0, "Unable to draw "
int v1 = 5; // const/4 v1, 0x5
/* const/high16 v2, -0x80000000 */
int v3 = 0; // const/4 v3, 0x0
final String v4 = "DrawableToBitmap"; // const-string v4, "DrawableToBitmap"
/* if-ne p2, v2, :cond_1 */
/* .line 1 */
v5 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicWidth ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* if-gtz v5, :cond_1 */
/* .line 2 */
p0 = android.util.Log .isLoggable ( v4,v1 );
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 3 */
/* new-instance p0, Ljava/lang/StringBuilder; */
/* invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width"; // const-string p1, " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width"
(( java.lang.StringBuilder ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v4,p0 );
} // :cond_0
} // :cond_1
/* if-ne p3, v2, :cond_3 */
/* .line 4 */
v2 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicHeight ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* if-gtz v2, :cond_3 */
/* .line 5 */
p0 = android.util.Log .isLoggable ( v4,v1 );
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 6 */
/* new-instance p0, Ljava/lang/StringBuilder; */
/* invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height"; // const-string p1, " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height"
(( java.lang.StringBuilder ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v4,p0 );
} // :cond_2
/* .line 7 */
} // :cond_3
v0 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicWidth ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* if-lez v0, :cond_4 */
p2 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicWidth ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* .line 8 */
} // :cond_4
v0 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicHeight ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* if-lez v0, :cond_5 */
p3 = (( android.graphics.drawable.Drawable ) p1 ).getIntrinsicHeight ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* .line 9 */
} // :cond_5
e.b.a.y.z.e.r0 .a ( );
/* .line 10 */
/* .line 11 */
v1 = android.graphics.Bitmap$Config.ARGB_8888;
/* .line 12 */
try { // :try_start_0
/* new-instance v1, Landroid/graphics/Canvas; */
/* invoke-direct {v1, p0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
int v2 = 0; // const/4 v2, 0x0
/* .line 13 */
(( android.graphics.drawable.Drawable ) p1 ).setBounds ( v2, v2, p2, p3 ); // invoke-virtual {p1, v2, v2, p2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 14 */
(( android.graphics.drawable.Drawable ) p1 ).draw ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
/* .line 15 */
(( android.graphics.Canvas ) v1 ).setBitmap ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 16 */
/* :catchall_0 */
/* move-exception p0 */
/* .line 17 */
/* throw p0 */
} // .end method
