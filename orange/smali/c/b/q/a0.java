public class c.b.q.a0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final c;
	 /* # instance fields */
	 public final android.widget.ProgressBar a;
	 public android.graphics.Bitmap b;
	 /* # direct methods */
	 public static c.b.q.a0 ( ) {
		 /* .locals 1 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [I */
		 /* .line 1 */
		 /* fill-array-data v0, :array_0 */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x101013b */
		 /* 0x101013c */
	 } // .end array-data
} // .end method
public c.b.q.a0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.a = p1;
	 return;
} // .end method
/* # virtual methods */
public final android.graphics.drawable.Drawable a ( android.graphics.drawable.Drawable p0 ) {
	 /* .locals 6 */
	 /* .line 29 */
	 /* instance-of v0, p1, Landroid/graphics/drawable/AnimationDrawable; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 30 */
		 /* check-cast p1, Landroid/graphics/drawable/AnimationDrawable; */
		 /* .line 31 */
		 v0 = 		 (( android.graphics.drawable.AnimationDrawable ) p1 ).getNumberOfFrames ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I
		 /* .line 32 */
		 /* new-instance v1, Landroid/graphics/drawable/AnimationDrawable; */
		 /* invoke-direct {v1}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V */
		 /* .line 33 */
		 v2 = 		 (( android.graphics.drawable.AnimationDrawable ) p1 ).isOneShot ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->isOneShot()Z
		 (( android.graphics.drawable.AnimationDrawable ) v1 ).setOneShot ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 /* const/16 v3, 0x2710 */
	 /* if-ge v2, v0, :cond_0 */
	 /* .line 34 */
	 (( android.graphics.drawable.AnimationDrawable ) p1 ).getFrame ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/drawable/AnimationDrawable;->getFrame(I)Landroid/graphics/drawable/Drawable;
	 int v5 = 1; // const/4 v5, 0x1
	 (( c.b.q.a0 ) p0 ).a ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Lc/b/q/a0;->a(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
	 /* .line 35 */
	 (( android.graphics.drawable.Drawable ) v4 ).setLevel ( v3 ); // invoke-virtual {v4, v3}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
	 /* .line 36 */
	 v3 = 	 (( android.graphics.drawable.AnimationDrawable ) p1 ).getDuration ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I
	 (( android.graphics.drawable.AnimationDrawable ) v1 ).addFrame ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V
	 /* add-int/lit8 v2, v2, 0x1 */
	 /* .line 37 */
} // :cond_0
(( android.graphics.drawable.AnimationDrawable ) v1 ).setLevel ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/drawable/AnimationDrawable;->setLevel(I)Z
/* move-object p1, v1 */
} // :cond_1
} // .end method
public final android.graphics.drawable.Drawable a ( android.graphics.drawable.Drawable p0, Boolean p1 ) {
/* .locals 7 */
/* .line 7 */
/* instance-of v0, p1, Lc/h/g/r/c; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
/* move-object v0, p1 */
/* check-cast v0, Lc/h/g/r/c; */
if ( v1 != null) { // if-eqz v1, :cond_8
	 /* .line 9 */
	 (( c.b.q.a0 ) p0 ).a ( v1, p2 ); // invoke-virtual {p0, v1, p2}, Lc/b/q/a0;->a(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
	 /* .line 10 */
	 /* goto/16 :goto_4 */
	 /* .line 11 */
} // :cond_0
/* instance-of v0, p1, Landroid/graphics/drawable/LayerDrawable; */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_5
	 /* .line 12 */
	 /* check-cast p1, Landroid/graphics/drawable/LayerDrawable; */
	 /* .line 13 */
	 p2 = 	 (( android.graphics.drawable.LayerDrawable ) p1 ).getNumberOfLayers ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I
	 /* .line 14 */
	 /* new-array v0, p2, [Landroid/graphics/drawable/Drawable; */
	 int v2 = 0; // const/4 v2, 0x0
	 int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, p2, :cond_3 */
/* .line 15 */
v4 = (( android.graphics.drawable.LayerDrawable ) p1 ).getId ( v3 ); // invoke-virtual {p1, v3}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I
/* .line 16 */
(( android.graphics.drawable.LayerDrawable ) p1 ).getDrawable ( v3 ); // invoke-virtual {p1, v3}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* const v6, 0x102000d */
/* if-eq v4, v6, :cond_2 */
/* const v6, 0x102000f */
/* if-ne v4, v6, :cond_1 */
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
} // :cond_2
} // :goto_1
int v4 = 1; // const/4 v4, 0x1
} // :goto_2
(( c.b.q.a0 ) p0 ).a ( v5, v4 ); // invoke-virtual {p0, v5, v4}, Lc/b/q/a0;->a(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
/* aput-object v4, v0, v3 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 17 */
} // :cond_3
/* new-instance v1, Landroid/graphics/drawable/LayerDrawable; */
/* invoke-direct {v1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V */
} // :goto_3
/* if-ge v2, p2, :cond_4 */
/* .line 18 */
v0 = (( android.graphics.drawable.LayerDrawable ) p1 ).getId ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I
(( android.graphics.drawable.LayerDrawable ) v1 ).setId ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_4
/* .line 19 */
} // :cond_5
/* instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable; */
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 20 */
/* check-cast p1, Landroid/graphics/drawable/BitmapDrawable; */
/* .line 21 */
(( android.graphics.drawable.BitmapDrawable ) p1 ).getBitmap ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
/* .line 22 */
v2 = this.b;
/* if-nez v2, :cond_6 */
/* .line 23 */
this.b = v0;
/* .line 24 */
} // :cond_6
/* new-instance v2, Landroid/graphics/drawable/ShapeDrawable; */
(( c.b.q.a0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/a0;->a()Landroid/graphics/drawable/shapes/Shape;
/* invoke-direct {v2, v3}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V */
/* .line 25 */
/* new-instance v3, Landroid/graphics/BitmapShader; */
v4 = android.graphics.Shader$TileMode.REPEAT;
v5 = android.graphics.Shader$TileMode.CLAMP;
/* invoke-direct {v3, v0, v4, v5}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V */
/* .line 26 */
(( android.graphics.drawable.ShapeDrawable ) v2 ).getPaint ( ); // invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
(( android.graphics.Paint ) v0 ).setShader ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
/* .line 27 */
(( android.graphics.drawable.ShapeDrawable ) v2 ).getPaint ( ); // invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
(( android.graphics.drawable.BitmapDrawable ) p1 ).getPaint ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;
(( android.graphics.Paint ) p1 ).getColorFilter ( ); // invoke-virtual {p1}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;
(( android.graphics.Paint ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
if ( p2 != null) { // if-eqz p2, :cond_7
/* .line 28 */
/* new-instance p1, Landroid/graphics/drawable/ClipDrawable; */
int p2 = 3; // const/4 p2, 0x3
/* invoke-direct {p1, v2, p2, v1}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V */
/* move-object v2, p1 */
} // :cond_7
} // :cond_8
} // :goto_4
} // .end method
public final android.graphics.drawable.shapes.Shape a ( ) {
/* .locals 3 */
/* const/16 v0, 0x8 */
/* new-array v0, v0, [F */
/* .line 38 */
/* fill-array-data v0, :array_0 */
/* .line 39 */
/* new-instance v1, Landroid/graphics/drawable/shapes/RoundRectShape; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, v0, v2, v2}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V */
/* :array_0 */
/* .array-data 4 */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
/* 0x40a00000 # 5.0f */
} // .end array-data
} // .end method
public void a ( android.util.AttributeSet p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
(( android.widget.ProgressBar ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/widget/ProgressBar;->getContext()Landroid/content/Context;
v1 = c.b.q.a0.c;
int v2 = 0; // const/4 v2, 0x0
c.b.q.k2 .a ( v0,p1,v1,p2,v2 );
/* .line 2 */
(( c.b.q.k2 ) p1 ).c ( v2 ); // invoke-virtual {p1, v2}, Lc/b/q/k2;->c(I)Landroid/graphics/drawable/Drawable;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 3 */
v0 = this.a;
(( c.b.q.a0 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/a0;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
(( android.widget.ProgressBar ) v0 ).setIndeterminateDrawable ( p2 ); // invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
int p2 = 1; // const/4 p2, 0x1
/* .line 4 */
(( c.b.q.k2 ) p1 ).c ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->c(I)Landroid/graphics/drawable/Drawable;
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 5 */
v0 = this.a;
(( c.b.q.a0 ) p0 ).a ( p2, v2 ); // invoke-virtual {p0, p2, v2}, Lc/b/q/a0;->a(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
(( android.widget.ProgressBar ) v0 ).setProgressDrawable ( p2 ); // invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 6 */
} // :cond_1
(( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
return;
} // .end method
public android.graphics.Bitmap b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
