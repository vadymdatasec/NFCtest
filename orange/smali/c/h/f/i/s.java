public abstract class c.h.f.i.s {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.ThreadLocal a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ThreadLocal<", */
	 /* "Landroid/util/TypedValue;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.util.WeakHashMap b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/WeakHashMap<", */
/* "Lc/h/f/i/o;", */
/* "Landroid/util/SparseArray<", */
/* "Lc/h/f/i/n;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
public static final java.lang.Object c;
/* # direct methods */
public static c.h.f.i.s ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/ThreadLocal; */
/* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/WeakHashMap; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V */
/* .line 3 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static Integer a ( android.content.res.Resources p0, Integer p1, android.content.res.Resources$Theme p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/res/Resources$NotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p0 = (( android.content.res.Resources ) p0 ).getColor ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I
/* .line 3 */
} // :cond_0
p0 = (( android.content.res.Resources ) p0 ).getColor ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColor(I)I
} // .end method
public static android.content.res.ColorStateList a ( Object p0, Integer p1 ) {
/* .locals 4 */
/* .line 4 */
v0 = c.h.f.i.s.c;
/* monitor-enter v0 */
/* .line 5 */
try { // :try_start_0
v1 = c.h.f.i.s.b;
(( java.util.WeakHashMap ) v1 ).get ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/util/SparseArray; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 6 */
v2 = (( android.util.SparseArray ) v1 ).size ( ); // invoke-virtual {v1}, Landroid/util/SparseArray;->size()I
/* if-lez v2, :cond_1 */
/* .line 7 */
(( android.util.SparseArray ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/h/f/i/n; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 8 */
v3 = this.b;
p0 = this.a;
(( android.content.res.Resources ) p0 ).getConfiguration ( ); // invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
p0 = (( android.content.res.Configuration ) v3 ).equals ( p0 ); // invoke-virtual {v3, p0}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 9 */
p0 = this.a;
/* monitor-exit v0 */
/* .line 10 */
} // :cond_0
(( android.util.SparseArray ) v1 ).remove ( p1 ); // invoke-virtual {v1, p1}, Landroid/util/SparseArray;->remove(I)V
/* .line 11 */
} // :cond_1
/* monitor-exit v0 */
int p0 = 0; // const/4 p0, 0x0
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static android.graphics.Typeface a ( android.content.Context p0, Integer p1, android.util.TypedValue p2, Integer p3, Object p4 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/res/Resources$NotFoundException; */
/* } */
} // .end annotation
/* .line 26 */
v0 = (( android.content.Context ) p0 ).isRestricted ( ); // invoke-virtual {p0}, Landroid/content/Context;->isRestricted()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_0
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
int v7 = 0; // const/4 v7, 0x0
/* move-object v0, p0 */
/* move v1, p1 */
/* move-object v2, p2 */
/* move v3, p3 */
/* move-object v4, p4 */
/* .line 27 */
/* invoke-static/range {v0 ..v7}, Lc/h/f/i/s;->a(Landroid/content/Context;ILandroid/util/TypedValue;ILc/h/f/i/r;Landroid/os/Handler;ZZ)Landroid/graphics/Typeface; */
} // .end method
public static android.graphics.Typeface a ( android.content.Context p0, Integer p1, android.util.TypedValue p2, Integer p3, Object p4, android.os.Handler p5, Boolean p6, Boolean p7 ) {
/* .locals 10 */
/* .line 28 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
int v0 = 1; // const/4 v0, 0x1
/* move v9, p1 */
/* move-object v2, p2 */
/* .line 29 */
(( android.content.res.Resources ) v1 ).getValue ( p1, p2, v0 ); // invoke-virtual {v1, p1, p2, v0}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V
/* move-object v0, p0 */
/* move v3, p1 */
/* move v4, p3 */
/* move-object v5, p4 */
/* move-object v6, p5 */
/* move/from16 v7, p6 */
/* move/from16 v8, p7 */
/* .line 30 */
/* invoke-static/range {v0 ..v8}, Lc/h/f/i/s;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/util/TypedValue;IILc/h/f/i/r;Landroid/os/Handler;ZZ)Landroid/graphics/Typeface; */
/* if-nez v0, :cond_1 */
/* if-nez p4, :cond_1 */
if ( p7 != null) { // if-eqz p7, :cond_0
/* .line 31 */
} // :cond_0
/* new-instance v0, Landroid/content/res/Resources$NotFoundException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Font resource ID #0x"; // const-string v2, "Font resource ID #0x"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 32 */
java.lang.Integer .toHexString ( p1 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " could not be retrieved."; // const-string v2, " could not be retrieved."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
} // :goto_0
} // .end method
public static android.graphics.Typeface a ( android.content.Context p0, android.content.res.Resources p1, android.util.TypedValue p2, Integer p3, Integer p4, Object p5, android.os.Handler p6, Boolean p7, Boolean p8 ) {
/* .locals 15 */
/* move-object/from16 v0, p1 */
/* move-object/from16 v1, p2 */
/* move/from16 v4, p3 */
/* move/from16 v5, p4 */
/* move-object/from16 v9, p5 */
/* move-object/from16 v10, p6 */
final String v11 = "ResourcesCompat"; // const-string v11, "ResourcesCompat"
/* .line 33 */
v2 = this.string;
if ( v2 != null) { // if-eqz v2, :cond_b
/* .line 34 */
final String v1 = "res/"; // const-string v1, "res/"
/* .line 35 */
v1 = (( java.lang.String ) v12 ).startsWith ( v1 ); // invoke-virtual {v12, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
int v13 = -3; // const/4 v13, -0x3
int v14 = 0; // const/4 v14, 0x0
/* if-nez v1, :cond_1 */
if ( v9 != null) { // if-eqz v9, :cond_0
/* .line 36 */
(( c.h.f.i.r ) v9 ).a ( v13, v10 ); // invoke-virtual {v9, v13, v10}, Lc/h/f/i/r;->a(ILandroid/os/Handler;)V
} // :cond_0
/* .line 37 */
} // :cond_1
c.h.g.g .b ( v0,v4,v5 );
if ( v1 != null) { // if-eqz v1, :cond_3
if ( v9 != null) { // if-eqz v9, :cond_2
/* .line 38 */
(( c.h.f.i.r ) v9 ).a ( v1, v10 ); // invoke-virtual {v9, v1, v10}, Lc/h/f/i/r;->a(Landroid/graphics/Typeface;Landroid/os/Handler;)V
} // :cond_2
} // :cond_3
if ( p8 != null) { // if-eqz p8, :cond_4
/* .line 39 */
} // :cond_4
try { // :try_start_0
(( java.lang.String ) v12 ).toLowerCase ( ); // invoke-virtual {v12}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v2 = ".xml"; // const-string v2, ".xml"
v1 = (( java.lang.String ) v1 ).endsWith ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 40 */
(( android.content.res.Resources ) v0 ).getXml ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;
/* .line 41 */
c.h.f.i.i .a ( v1,v0 );
/* if-nez v2, :cond_6 */
final String v0 = "Failed to find font-family tag"; // const-string v0, "Failed to find font-family tag"
/* .line 42 */
android.util.Log .e ( v11,v0 );
if ( v9 != null) { // if-eqz v9, :cond_5
/* .line 43 */
(( c.h.f.i.r ) v9 ).a ( v13, v10 ); // invoke-virtual {v9, v13, v10}, Lc/h/f/i/r;->a(ILandroid/os/Handler;)V
} // :cond_5
} // :cond_6
/* move-object v1, p0 */
/* move-object/from16 v3, p1 */
/* move/from16 v4, p3 */
/* move/from16 v5, p4 */
/* move-object/from16 v6, p5 */
/* move-object/from16 v7, p6 */
/* move/from16 v8, p7 */
/* .line 44 */
/* invoke-static/range {v1 ..v8}, Lc/h/g/g;->a(Landroid/content/Context;Lc/h/f/i/e;Landroid/content/res/Resources;IILc/h/f/i/r;Landroid/os/Handler;Z)Landroid/graphics/Typeface; */
} // :cond_7
/* move-object v1, p0 */
/* .line 45 */
c.h.g.g .a ( p0,v0,v4,v12,v5 );
if ( v9 != null) { // if-eqz v9, :cond_9
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 46 */
(( c.h.f.i.r ) v9 ).a ( v0, v10 ); // invoke-virtual {v9, v0, v10}, Lc/h/f/i/r;->a(Landroid/graphics/Typeface;Landroid/os/Handler;)V
/* .line 47 */
} // :cond_8
(( c.h.f.i.r ) v9 ).a ( v13, v10 ); // invoke-virtual {v9, v13, v10}, Lc/h/f/i/r;->a(ILandroid/os/Handler;)V
/* :try_end_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_9
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
/* .line 48 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to read xml resource "; // const-string v2, "Failed to read xml resource "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v12 ); // invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v11,v1,v0 );
/* :catch_1 */
/* move-exception v0 */
/* .line 49 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to parse xml resource "; // const-string v2, "Failed to parse xml resource "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v12 ); // invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v11,v1,v0 );
} // :goto_1
if ( v9 != null) { // if-eqz v9, :cond_a
/* .line 50 */
(( c.h.f.i.r ) v9 ).a ( v13, v10 ); // invoke-virtual {v9, v13, v10}, Lc/h/f/i/r;->a(ILandroid/os/Handler;)V
} // :cond_a
/* .line 51 */
} // :cond_b
/* new-instance v2, Landroid/content/res/Resources$NotFoundException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Resource \""; // const-string v5, "Resource \""
(( java.lang.StringBuilder ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.res.Resources ) v0 ).getResourceName ( v4 ); // invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "\" ("; // const-string v0, "\" ("
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 52 */
/* invoke-static/range {p3 ..p3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String; */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = ") is not a Font: "; // const-string v0, ") is not a Font: "
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v0}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
} // .end method
public static android.util.TypedValue a ( ) {
/* .locals 2 */
/* .line 23 */
v0 = c.h.f.i.s.a;
(( java.lang.ThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/util/TypedValue; */
/* if-nez v0, :cond_0 */
/* .line 24 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
/* .line 25 */
v1 = c.h.f.i.s.a;
(( java.lang.ThreadLocal ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
} // :cond_0
} // .end method
public static void a ( Object p0, Integer p1, android.content.res.ColorStateList p2 ) {
/* .locals 3 */
/* .line 12 */
v0 = c.h.f.i.s.c;
/* monitor-enter v0 */
/* .line 13 */
try { // :try_start_0
v1 = c.h.f.i.s.b;
(( java.util.WeakHashMap ) v1 ).get ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/util/SparseArray; */
/* if-nez v1, :cond_0 */
/* .line 14 */
/* new-instance v1, Landroid/util/SparseArray; */
/* invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V */
/* .line 15 */
v2 = c.h.f.i.s.b;
(( java.util.WeakHashMap ) v2 ).put ( p0, v1 ); // invoke-virtual {v2, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 16 */
} // :cond_0
/* new-instance v2, Lc/h/f/i/n; */
p0 = this.a;
/* .line 17 */
(( android.content.res.Resources ) p0 ).getConfiguration ( ); // invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* invoke-direct {v2, p2, p0}, Lc/h/f/i/n;-><init>(Landroid/content/res/ColorStateList;Landroid/content/res/Configuration;)V */
/* .line 18 */
(( android.util.SparseArray ) v1 ).append ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V
/* .line 19 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static Boolean a ( android.content.res.Resources p0, Integer p1 ) {
/* .locals 2 */
/* .line 20 */
c.h.f.i.s .a ( );
int v1 = 1; // const/4 v1, 0x1
/* .line 21 */
(( android.content.res.Resources ) p0 ).getValue ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V
/* .line 22 */
/* iget p0, v0, Landroid/util/TypedValue;->type:I */
/* const/16 p1, 0x1c */
/* if-lt p0, p1, :cond_0 */
/* const/16 p1, 0x1f */
/* if-gt p0, p1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public static android.content.res.ColorStateList b ( android.content.res.Resources p0, Integer p1, android.content.res.Resources$Theme p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/res/Resources$NotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lc/h/f/i/o; */
/* invoke-direct {v0, p0, p2}, Lc/h/f/i/o;-><init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V */
/* .line 2 */
c.h.f.i.s .a ( v0,p1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
} // :cond_0
c.h.f.i.s .d ( p0,p1,p2 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
c.h.f.i.s .a ( v0,p1,v1 );
/* .line 5 */
} // :cond_1
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_2 */
/* .line 6 */
c.h.f.i.m .a ( p0,p1,p2 );
/* .line 7 */
} // :cond_2
(( android.content.res.Resources ) p0 ).getColorStateList ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;
} // .end method
public static android.graphics.drawable.Drawable c ( android.content.res.Resources p0, Integer p1, android.content.res.Resources$Theme p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/res/Resources$NotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
(( android.content.res.Resources ) p0 ).getDrawable ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
/* .line 3 */
} // :cond_0
(( android.content.res.Resources ) p0 ).getDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
} // .end method
public static android.content.res.ColorStateList d ( android.content.res.Resources p0, Integer p1, android.content.res.Resources$Theme p2 ) {
/* .locals 2 */
/* .line 1 */
v0 = c.h.f.i.s .a ( p0,p1 );
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
(( android.content.res.Resources ) p0 ).getXml ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;
/* .line 3 */
try { // :try_start_0
c.h.f.i.c .a ( p0,p1,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
final String p1 = "ResourcesCompat"; // const-string p1, "ResourcesCompat"
final String p2 = "Failed to inflate ColorStateList, leaving it to the framework"; // const-string p2, "Failed to inflate ColorStateList, leaving it to the framework"
/* .line 4 */
android.util.Log .w ( p1,p2,p0 );
} // .end method
