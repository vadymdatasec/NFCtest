public abstract class c.b.q.a1 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "RestrictedAPI" */
	 /* } */
} // .end annotation
/* # static fields */
public static final a;
public static final b;
public static final android.graphics.Rect c;
public static java.lang.Class d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.b.q.a1 ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [I */
/* const v1, 0x10100a0 */
int v2 = 0; // const/4 v2, 0x0
/* aput v1, v0, v2 */
/* .line 1 */
/* new-array v0, v2, [I */
/* .line 2 */
/* .line 3 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
/* .line 4 */
/* const/16 v1, 0x12 */
/* if-lt v0, v1, :cond_0 */
try { // :try_start_0
final String v0 = "android.graphics.Insets"; // const-string v0, "android.graphics.Insets"
/* .line 5 */
java.lang.Class .forName ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // :cond_0
return;
} // .end method
public static android.graphics.PorterDuff$Mode a ( Integer p0, android.graphics.PorterDuff$Mode p1 ) {
/* .locals 1 */
int v0 = 3; // const/4 v0, 0x3
/* if-eq p0, v0, :cond_2 */
int v0 = 5; // const/4 v0, 0x5
/* if-eq p0, v0, :cond_1 */
/* const/16 v0, 0x9 */
/* if-eq p0, v0, :cond_0 */
/* packed-switch p0, :pswitch_data_0 */
/* .line 20 */
/* :pswitch_0 */
p0 = android.graphics.PorterDuff$Mode.ADD;
/* .line 21 */
/* :pswitch_1 */
p0 = android.graphics.PorterDuff$Mode.SCREEN;
/* .line 22 */
/* :pswitch_2 */
p0 = android.graphics.PorterDuff$Mode.MULTIPLY;
/* .line 23 */
} // :cond_0
p0 = android.graphics.PorterDuff$Mode.SRC_ATOP;
/* .line 24 */
} // :cond_1
p0 = android.graphics.PorterDuff$Mode.SRC_IN;
/* .line 25 */
} // :cond_2
p0 = android.graphics.PorterDuff$Mode.SRC_OVER;
/* :pswitch_data_0 */
/* .packed-switch 0xe */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static Boolean a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 4 */
/* .line 1 */
/* const/16 v1, 0xf */
int v2 = 0; // const/4 v2, 0x0
/* if-ge v0, v1, :cond_0 */
/* instance-of v0, p0, Landroid/graphics/drawable/InsetDrawable; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* if-ge v0, v1, :cond_1 */
/* instance-of v0, p0, Landroid/graphics/drawable/GradientDrawable; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
} // :cond_1
/* const/16 v1, 0x11 */
/* if-ge v0, v1, :cond_2 */
/* instance-of v0, p0, Landroid/graphics/drawable/LayerDrawable; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 4 */
} // :cond_2
/* instance-of v0, p0, Landroid/graphics/drawable/DrawableContainer; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 5 */
(( android.graphics.drawable.Drawable ) p0 ).getConstantState ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
/* .line 6 */
/* instance-of v0, p0, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState; */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 7 */
/* check-cast p0, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState; */
/* .line 8 */
(( android.graphics.drawable.DrawableContainer$DrawableContainerState ) p0 ).getChildren ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;->getChildren()[Landroid/graphics/drawable/Drawable;
/* array-length v0, p0 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_7 */
/* aget-object v3, p0, v1 */
/* .line 9 */
v3 = c.b.q.a1 .a ( v3 );
/* if-nez v3, :cond_3 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
/* .line 10 */
} // :cond_4
/* instance-of v0, p0, Lc/h/g/r/c; */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 11 */
/* check-cast p0, Lc/h/g/r/c; */
/* .line 12 */
/* .line 13 */
p0 = c.b.q.a1 .a ( p0 );
/* .line 14 */
} // :cond_5
/* instance-of v0, p0, Lc/b/m/a/m; */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 15 */
/* check-cast p0, Lc/b/m/a/m; */
/* .line 16 */
(( c.b.m.a.m ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/m/a/m;->a()Landroid/graphics/drawable/Drawable;
/* .line 17 */
p0 = c.b.q.a1 .a ( p0 );
/* .line 18 */
} // :cond_6
/* instance-of v0, p0, Landroid/graphics/drawable/ScaleDrawable; */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 19 */
/* check-cast p0, Landroid/graphics/drawable/ScaleDrawable; */
(( android.graphics.drawable.ScaleDrawable ) p0 ).getDrawable ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/ScaleDrawable;->getDrawable()Landroid/graphics/drawable/Drawable;
p0 = c.b.q.a1 .a ( p0 );
} // :cond_7
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static void b ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-ne v0, v1, :cond_0 */
final String v0 = "android.graphics.drawable.VectorDrawable"; // const-string v0, "android.graphics.drawable.VectorDrawable"
/* .line 2 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
c.b.q.a1 .c ( p0 );
} // :cond_0
return;
} // .end method
public static void c ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.graphics.drawable.Drawable ) p0 ).getState ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* array-length v1, v0 */
/* if-nez v1, :cond_0 */
/* .line 3 */
} // :cond_0
v1 = c.b.q.a1.b;
(( android.graphics.drawable.Drawable ) p0 ).setState ( v1 ); // invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 4 */
} // :cond_1
} // :goto_0
v1 = c.b.q.a1.a;
(( android.graphics.drawable.Drawable ) p0 ).setState ( v1 ); // invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 5 */
} // :goto_1
(( android.graphics.drawable.Drawable ) p0 ).setState ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
return;
} // .end method
public static android.graphics.Rect d ( android.graphics.drawable.Drawable p0 ) {
/* .locals 12 */
/* .line 1 */
/* const/16 v1, 0x1d */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).getOpticalInsets ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getOpticalInsets()Landroid/graphics/Insets;
/* .line 3 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
/* .line 4 */
/* iget v1, p0, Landroid/graphics/Insets;->left:I */
/* iput v1, v0, Landroid/graphics/Rect;->left:I */
/* .line 5 */
/* iget v1, p0, Landroid/graphics/Insets;->right:I */
/* iput v1, v0, Landroid/graphics/Rect;->right:I */
/* .line 6 */
/* iget v1, p0, Landroid/graphics/Insets;->top:I */
/* iput v1, v0, Landroid/graphics/Rect;->top:I */
/* .line 7 */
/* iget p0, p0, Landroid/graphics/Insets;->bottom:I */
/* iput p0, v0, Landroid/graphics/Rect;->bottom:I */
/* .line 8 */
} // :cond_0
v0 = c.b.q.a1.d;
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 9 */
try { // :try_start_0
c.h.g.r.a .g ( p0 );
/* .line 10 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
final String v1 = "getOpticalInsets"; // const-string v1, "getOpticalInsets"
int v2 = 0; // const/4 v2, 0x0
/* new-array v3, v2, [Ljava/lang/Class; */
/* .line 11 */
(( java.lang.Class ) v0 ).getMethod ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* new-array v1, v2, [Ljava/lang/Object; */
/* .line 12 */
(( java.lang.reflect.Method ) v0 ).invoke ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
if ( p0 != null) { // if-eqz p0, :cond_7
/* .line 13 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
/* .line 14 */
v1 = c.b.q.a1.d;
(( java.lang.Class ) v1 ).getFields ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;
/* array-length v3, v1 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v3, :cond_6 */
/* aget-object v5, v1, v4 */
/* .line 15 */
(( java.lang.reflect.Field ) v5 ).getName ( ); // invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
int v7 = -1; // const/4 v7, -0x1
v8 = (( java.lang.String ) v6 ).hashCode ( ); // invoke-virtual {v6}, Ljava/lang/String;->hashCode()I
int v9 = 3; // const/4 v9, 0x3
int v10 = 2; // const/4 v10, 0x2
int v11 = 1; // const/4 v11, 0x1
/* sparse-switch v8, :sswitch_data_0 */
/* :sswitch_0 */
final String v8 = "right"; // const-string v8, "right"
v6 = (( java.lang.String ) v6 ).equals ( v8 ); // invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1
int v7 = 2; // const/4 v7, 0x2
/* :sswitch_1 */
final String v8 = "left"; // const-string v8, "left"
v6 = (( java.lang.String ) v6 ).equals ( v8 ); // invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1
int v7 = 0; // const/4 v7, 0x0
/* :sswitch_2 */
final String v8 = "top"; // const-string v8, "top"
v6 = (( java.lang.String ) v6 ).equals ( v8 ); // invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1
int v7 = 1; // const/4 v7, 0x1
/* :sswitch_3 */
final String v8 = "bottom"; // const-string v8, "bottom"
v6 = (( java.lang.String ) v6 ).equals ( v8 ); // invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1
int v7 = 3; // const/4 v7, 0x3
} // :cond_1
} // :goto_1
if ( v7 != null) { // if-eqz v7, :cond_5
/* if-eq v7, v11, :cond_4 */
/* if-eq v7, v10, :cond_3 */
/* if-eq v7, v9, :cond_2 */
/* .line 16 */
} // :cond_2
v5 = (( java.lang.reflect.Field ) v5 ).getInt ( p0 ); // invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* iput v5, v0, Landroid/graphics/Rect;->bottom:I */
/* .line 17 */
} // :cond_3
v5 = (( java.lang.reflect.Field ) v5 ).getInt ( p0 ); // invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* iput v5, v0, Landroid/graphics/Rect;->right:I */
/* .line 18 */
} // :cond_4
v5 = (( java.lang.reflect.Field ) v5 ).getInt ( p0 ); // invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* iput v5, v0, Landroid/graphics/Rect;->top:I */
/* .line 19 */
} // :cond_5
v5 = (( java.lang.reflect.Field ) v5 ).getInt ( p0 ); // invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* iput v5, v0, Landroid/graphics/Rect;->left:I */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_2
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_6
/* :catch_0 */
final String p0 = "DrawableUtils"; // const-string p0, "DrawableUtils"
final String v0 = "Couldn\'t obtain the optical insets.Ignoring."; // const-string v0, "Couldn\'t obtain the optical insets.Ignoring."
/* .line 20 */
android.util.Log .e ( p0,v0 );
/* .line 21 */
} // :cond_7
p0 = c.b.q.a1.c;
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x527265d5 -> :sswitch_3 */
/* 0x1c155 -> :sswitch_2 */
/* 0x32a007 -> :sswitch_1 */
/* 0x677c21c -> :sswitch_0 */
} // .end sparse-switch
} // .end method
