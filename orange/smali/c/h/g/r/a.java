public abstract class c.h.g.r.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Method a;
	 public static Boolean b;
	 public static java.lang.reflect.Method c;
	 public static Boolean d;
	 /* # direct methods */
	 public static void a ( android.graphics.drawable.Drawable p0, Float p1, Float p2 ) {
		 /* .locals 2 */
		 /* .line 3 */
		 /* const/16 v1, 0x15 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 4 */
		 (( android.graphics.drawable.Drawable ) p0 ).setHotspot ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V
	 } // :cond_0
	 return;
} // .end method
public static void a ( android.graphics.drawable.Drawable p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
	 /* .locals 2 */
	 /* .line 5 */
	 /* const/16 v1, 0x15 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 6 */
	 (( android.graphics.drawable.Drawable ) p0 ).setHotspotBounds ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V
} // :cond_0
return;
} // .end method
public static void a ( android.graphics.drawable.Drawable p0, android.content.res.ColorStateList p1 ) {
/* .locals 2 */
/* .line 7 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 8 */
(( android.graphics.drawable.Drawable ) p0 ).setTintList ( p1 ); // invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V
/* .line 9 */
} // :cond_0
/* instance-of v0, p0, Lc/h/g/r/b; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 10 */
/* check-cast p0, Lc/h/g/r/b; */
} // :cond_1
} // :goto_0
return;
} // .end method
public static void a ( android.graphics.drawable.Drawable p0, android.content.res.Resources$Theme p1 ) {
/* .locals 2 */
/* .line 15 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 16 */
(( android.graphics.drawable.Drawable ) p0 ).applyTheme ( p1 ); // invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->applyTheme(Landroid/content/res/Resources$Theme;)V
} // :cond_0
return;
} // .end method
public static void a ( android.graphics.drawable.Drawable p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3, android.content.res.Resources$Theme p4 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 19 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 20 */
(( android.graphics.drawable.Drawable ) p0 ).inflate ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
/* .line 21 */
} // :cond_0
(( android.graphics.drawable.Drawable ) p0 ).inflate ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
} // :goto_0
return;
} // .end method
public static void a ( android.graphics.drawable.Drawable p0, android.graphics.PorterDuff$Mode p1 ) {
/* .locals 2 */
/* .line 11 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 12 */
(( android.graphics.drawable.Drawable ) p0 ).setTintMode ( p1 ); // invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V
/* .line 13 */
} // :cond_0
/* instance-of v0, p0, Lc/h/g/r/b; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 14 */
/* check-cast p0, Lc/h/g/r/b; */
} // :cond_1
} // :goto_0
return;
} // .end method
public static void a ( android.graphics.drawable.Drawable p0, Boolean p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).setAutoMirrored ( p1 ); // invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V
} // :cond_0
return;
} // .end method
public static Boolean a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 17 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 18 */
p0 = (( android.graphics.drawable.Drawable ) p0 ).canApplyTheme ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean a ( android.graphics.drawable.Drawable p0, Integer p1 ) {
/* .locals 7 */
/* .line 22 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 23 */
p0 = (( android.graphics.drawable.Drawable ) p0 ).setLayoutDirection ( p1 ); // invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z
} // :cond_0
/* const/16 v1, 0x11 */
int v2 = 0; // const/4 v2, 0x0
/* if-lt v0, v1, :cond_2 */
/* .line 24 */
/* sget-boolean v0, Lc/h/g/r/a;->b:Z */
final String v1 = "DrawableCompat"; // const-string v1, "DrawableCompat"
int v3 = 1; // const/4 v3, 0x1
/* if-nez v0, :cond_1 */
/* .line 25 */
try { // :try_start_0
/* const-class v0, Landroid/graphics/drawable/Drawable; */
final String v4 = "setLayoutDirection"; // const-string v4, "setLayoutDirection"
/* new-array v5, v3, [Ljava/lang/Class; */
v6 = java.lang.Integer.TYPE;
/* aput-object v6, v5, v2 */
/* .line 26 */
(( java.lang.Class ) v0 ).getDeclaredMethod ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 27 */
(( java.lang.reflect.Method ) v0 ).setAccessible ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v4 = "Failed to retrieve setLayoutDirection(int) method"; // const-string v4, "Failed to retrieve setLayoutDirection(int) method"
/* .line 28 */
android.util.Log .i ( v1,v4,v0 );
/* .line 29 */
} // :goto_0
c.h.g.r.a.b = (v3!= 0);
/* .line 30 */
} // :cond_1
v0 = c.h.g.r.a.a;
if ( v0 != null) { // if-eqz v0, :cond_2
try { // :try_start_1
/* new-array v4, v3, [Ljava/lang/Object; */
/* .line 31 */
java.lang.Integer .valueOf ( p1 );
/* aput-object p1, v4, v2 */
(( java.lang.reflect.Method ) v0 ).invoke ( p0, v4 ); // invoke-virtual {v0, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception p0 */
final String p1 = "Failed to invoke setLayoutDirection(int) via reflection"; // const-string p1, "Failed to invoke setLayoutDirection(int) via reflection"
/* .line 32 */
android.util.Log .i ( v1,p1,p0 );
int p0 = 0; // const/4 p0, 0x0
/* .line 33 */
} // :cond_2
} // .end method
public static Integer b ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 5 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 6 */
p0 = (( android.graphics.drawable.Drawable ) p0 ).getAlpha ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getAlpha()I
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static void b ( android.graphics.drawable.Drawable p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).setTint ( p1 ); // invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V
/* .line 3 */
} // :cond_0
/* instance-of v0, p0, Lc/h/g/r/b; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* check-cast p0, Lc/h/g/r/b; */
} // :cond_1
} // :goto_0
return;
} // .end method
public static android.graphics.ColorFilter c ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).getColorFilter ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getColorFilter()Landroid/graphics/ColorFilter;
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Integer d ( android.graphics.drawable.Drawable p0 ) {
/* .locals 6 */
/* .line 1 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = (( android.graphics.drawable.Drawable ) p0 ).getLayoutDirection ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I
} // :cond_0
/* const/16 v1, 0x11 */
int v2 = 0; // const/4 v2, 0x0
/* if-lt v0, v1, :cond_2 */
/* .line 3 */
/* sget-boolean v0, Lc/h/g/r/a;->d:Z */
final String v1 = "DrawableCompat"; // const-string v1, "DrawableCompat"
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
try { // :try_start_0
/* const-class v3, Landroid/graphics/drawable/Drawable; */
final String v4 = "getLayoutDirection"; // const-string v4, "getLayoutDirection"
/* new-array v5, v2, [Ljava/lang/Class; */
/* .line 5 */
(( java.lang.Class ) v3 ).getDeclaredMethod ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 6 */
(( java.lang.reflect.Method ) v3 ).setAccessible ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v3 */
final String v4 = "Failed to retrieve getLayoutDirection() method"; // const-string v4, "Failed to retrieve getLayoutDirection() method"
/* .line 7 */
android.util.Log .i ( v1,v4,v3 );
/* .line 8 */
} // :goto_0
c.h.g.r.a.d = (v0!= 0);
/* .line 9 */
} // :cond_1
v0 = c.h.g.r.a.c;
if ( v0 != null) { // if-eqz v0, :cond_2
try { // :try_start_1
/* new-array v3, v2, [Ljava/lang/Object; */
/* .line 10 */
(( java.lang.reflect.Method ) v0 ).invoke ( p0, v3 ); // invoke-virtual {v0, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/Integer; */
p0 = (( java.lang.Integer ) p0 ).intValue ( ); // invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception p0 */
final String v0 = "Failed to invoke getLayoutDirection() via reflection"; // const-string v0, "Failed to invoke getLayoutDirection() via reflection"
/* .line 11 */
android.util.Log .i ( v1,v0,p0 );
int p0 = 0; // const/4 p0, 0x0
/* .line 12 */
} // :cond_2
} // .end method
public static Boolean e ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = (( android.graphics.drawable.Drawable ) p0 ).isAutoMirrored ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static void f ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
(( android.graphics.drawable.Drawable ) p0 ).jumpToCurrentState ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
return;
} // .end method
public static android.graphics.drawable.Drawable g ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ">(", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ")TT;" */
/* } */
} // .end annotation
/* .line 1 */
/* instance-of v0, p0, Lc/h/g/r/c; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p0, Lc/h/g/r/c; */
} // :cond_0
} // .end method
public static android.graphics.drawable.Drawable h ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
} // :cond_0
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_2 */
/* .line 2 */
/* instance-of v0, p0, Lc/h/g/r/b; */
/* if-nez v0, :cond_1 */
/* .line 3 */
/* new-instance v0, Lc/h/g/r/e; */
/* invoke-direct {v0, p0}, Lc/h/g/r/e;-><init>(Landroid/graphics/drawable/Drawable;)V */
} // :cond_1
/* .line 4 */
} // :cond_2
/* instance-of v0, p0, Lc/h/g/r/b; */
/* if-nez v0, :cond_3 */
/* .line 5 */
/* new-instance v0, Lc/h/g/r/d; */
/* invoke-direct {v0, p0}, Lc/h/g/r/d;-><init>(Landroid/graphics/drawable/Drawable;)V */
} // :cond_3
} // .end method
