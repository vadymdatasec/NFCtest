public abstract class c.h.f.i.c {
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
/* # direct methods */
public static c.h.f.i.c ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/ThreadLocal; */
/* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
return;
} // .end method
public static Integer a ( Integer p0, Float p1, Float p2 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v1, p2, v1 */
/* if-ltz v1, :cond_0 */
/* const/high16 v1, 0x42c80000 # 100.0f */
/* cmpg-float v1, p2, v1 */
/* if-gtz v1, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* const/high16 v2, 0x3f800000 # 1.0f */
/* cmpl-float v2, p1, v2 */
/* if-nez v2, :cond_1 */
/* if-nez v1, :cond_1 */
/* .line 21 */
} // :cond_1
v2 = android.graphics.Color .alpha ( p0 );
/* int-to-float v2, v2 */
/* mul-float v2, v2, p1 */
/* const/high16 p1, 0x3f000000 # 0.5f */
/* add-float/2addr v2, p1 */
/* float-to-int p1, v2 */
/* const/16 v2, 0xff */
/* .line 22 */
p1 = c.h.i.a .a ( p1,v0,v2 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 23 */
c.h.f.i.a .a ( p0 );
/* .line 24 */
v0 = (( c.h.f.i.a ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/f/i/a;->d()F
p0 = (( c.h.f.i.a ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/f/i/a;->c()F
p0 = c.h.f.i.a .c ( v0,p0,p2 );
} // :cond_2
/* const p2, 0xffffff */
/* and-int/2addr p0, p2 */
/* shl-int/lit8 p1, p1, 0x18 */
/* or-int/2addr p0, p1 */
} // .end method
public static android.content.res.ColorStateList a ( android.content.res.Resources p0, Integer p1, android.content.res.Resources$Theme p2 ) {
/* .locals 0 */
/* .line 1 */
try { // :try_start_0
(( android.content.res.Resources ) p0 ).getXml ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;
/* .line 2 */
c.h.f.i.c .a ( p0,p1,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
final String p1 = "CSLCompat"; // const-string p1, "CSLCompat"
final String p2 = "Failed to inflate ColorStateList."; // const-string p2, "Failed to inflate ColorStateList."
/* .line 3 */
android.util.Log .e ( p1,p2,p0 );
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static android.content.res.ColorStateList a ( android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.content.res.Resources$Theme p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 4 */
android.util.Xml .asAttributeSet ( p1 );
/* .line 5 */
v1 = } // :goto_0
int v2 = 2; // const/4 v2, 0x2
/* if-eq v1, v2, :cond_0 */
int v3 = 1; // const/4 v3, 0x1
/* if-eq v1, v3, :cond_0 */
} // :cond_0
/* if-ne v1, v2, :cond_1 */
/* .line 6 */
c.h.f.i.c .a ( p0,p1,v0,p2 );
/* .line 7 */
} // :cond_1
/* new-instance p0, Lorg/xmlpull/v1/XmlPullParserException; */
final String p1 = "No start tag found"; // const-string p1, "No start tag found"
/* invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static android.content.res.ColorStateList a ( android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources$Theme p3 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 8 */
final String v1 = "selector"; // const-string v1, "selector"
/* .line 9 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 10 */
c.h.f.i.c .b ( p0,p1,p2,p3 );
/* .line 11 */
} // :cond_0
/* new-instance p0, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 12 */
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": invalid color state list tag "; // const-string p1, ": invalid color state list tag "
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static android.content.res.TypedArray a ( android.content.res.Resources p0, android.content.res.Resources$Theme p1, android.util.AttributeSet p2, Integer[] p3 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
/* .line 19 */
(( android.content.res.Resources ) p0 ).obtainAttributes ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 20 */
(( android.content.res.Resources$Theme ) p1 ).obtainStyledAttributes ( p2, p3, p0, p0 ); // invoke-virtual {p1, p2, p3, p0, p0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
} // :goto_0
} // .end method
public static android.util.TypedValue a ( ) {
/* .locals 2 */
/* .line 16 */
v0 = c.h.f.i.c.a;
(( java.lang.ThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/util/TypedValue; */
/* if-nez v0, :cond_0 */
/* .line 17 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
/* .line 18 */
v1 = c.h.f.i.c.a;
(( java.lang.ThreadLocal ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
} // :cond_0
} // .end method
public static Boolean a ( android.content.res.Resources p0, Integer p1 ) {
/* .locals 2 */
/* .line 13 */
c.h.f.i.c .a ( );
int v1 = 1; // const/4 v1, 0x1
/* .line 14 */
(( android.content.res.Resources ) p0 ).getValue ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V
/* .line 15 */
/* iget p0, v0, Landroid/util/TypedValue;->type:I */
/* const/16 p1, 0x1c */
/* if-lt p0, p1, :cond_0 */
/* const/16 p1, 0x1f */
/* if-gt p0, p1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public static android.content.res.ColorStateList b ( android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources$Theme p3 ) {
/* .locals 17 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p2 */
/* move-object/from16 v2, p3 */
/* .line 1 */
v3 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
int v4 = 1; // const/4 v4, 0x1
/* add-int/2addr v3, v4 */
/* const/16 v5, 0x14 */
/* new-array v6, v5, [[I */
/* new-array v5, v5, [I */
int v8 = 0; // const/4 v8, 0x0
/* .line 2 */
} // :goto_0
v9 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I */
/* if-eq v9, v4, :cond_a */
/* .line 3 */
v10 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
/* if-ge v10, v3, :cond_0 */
int v11 = 3; // const/4 v11, 0x3
/* if-eq v9, v11, :cond_a */
} // :cond_0
int v11 = 2; // const/4 v11, 0x2
/* if-ne v9, v11, :cond_9 */
/* if-gt v10, v3, :cond_9 */
/* .line 4 */
/* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
final String v10 = "item"; // const-string v10, "item"
v9 = (( java.lang.String ) v9 ).equals ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v9, :cond_1 */
/* goto/16 :goto_6 */
/* .line 5 */
} // :cond_1
v9 = c.h.d.ColorStateListItem;
c.h.f.i.c .a ( v0,v2,v1,v9 );
/* .line 6 */
int v11 = -1; // const/4 v11, -0x1
v10 = (( android.content.res.TypedArray ) v9 ).getResourceId ( v10, v11 ); // invoke-virtual {v9, v10, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* const v12, -0xff01 */
/* if-eq v10, v11, :cond_2 */
/* .line 7 */
v11 = c.h.f.i.c .a ( v0,v10 );
/* if-nez v11, :cond_2 */
/* .line 8 */
try { // :try_start_0
(( android.content.res.Resources ) v0 ).getXml ( v10 ); // invoke-virtual {v0, v10}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;
c.h.f.i.c .a ( v0,v10,v2 );
v10 = (( android.content.res.ColorStateList ) v10 ).getDefaultColor ( ); // invoke-virtual {v10}, Landroid/content/res/ColorStateList;->getDefaultColor()I
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 9 */
/* :catch_0 */
v10 = (( android.content.res.TypedArray ) v9 ).getColor ( v10, v12 ); // invoke-virtual {v9, v10, v12}, Landroid/content/res/TypedArray;->getColor(II)I
/* .line 10 */
} // :cond_2
v10 = (( android.content.res.TypedArray ) v9 ).getColor ( v10, v12 ); // invoke-virtual {v9, v10, v12}, Landroid/content/res/TypedArray;->getColor(II)I
} // :goto_1
/* const/high16 v11, 0x3f800000 # 1.0f */
/* .line 11 */
v12 = (( android.content.res.TypedArray ) v9 ).hasValue ( v12 ); // invoke-virtual {v9, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v12 != null) { // if-eqz v12, :cond_3
/* .line 12 */
v11 = (( android.content.res.TypedArray ) v9 ).getFloat ( v12, v11 ); // invoke-virtual {v9, v12, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* .line 13 */
} // :cond_3
v12 = (( android.content.res.TypedArray ) v9 ).hasValue ( v12 ); // invoke-virtual {v9, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v12 != null) { // if-eqz v12, :cond_4
/* .line 14 */
v11 = (( android.content.res.TypedArray ) v9 ).getFloat ( v12, v11 ); // invoke-virtual {v9, v12, v11}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* .line 15 */
} // :cond_4
} // :goto_2
v12 = c.h.j.a .b ( );
/* const/high16 v13, -0x40800000 # -1.0f */
if ( v12 != null) { // if-eqz v12, :cond_5
/* .line 16 */
v12 = (( android.content.res.TypedArray ) v9 ).hasValue ( v12 ); // invoke-virtual {v9, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v12 != null) { // if-eqz v12, :cond_5
/* .line 17 */
v12 = (( android.content.res.TypedArray ) v9 ).getFloat ( v12, v13 ); // invoke-virtual {v9, v12, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* .line 18 */
} // :cond_5
v12 = (( android.content.res.TypedArray ) v9 ).getFloat ( v12, v13 ); // invoke-virtual {v9, v12, v13}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* .line 19 */
} // :goto_3
(( android.content.res.TypedArray ) v9 ).recycle ( ); // invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V
/* .line 20 */
v9 = /* invoke-interface/range {p2 ..p2}, Landroid/util/AttributeSet;->getAttributeCount()I */
/* .line 21 */
/* new-array v13, v9, [I */
int v14 = 0; // const/4 v14, 0x0
int v15 = 0; // const/4 v15, 0x0
} // :goto_4
/* if-ge v14, v9, :cond_8 */
v4 = /* .line 22 */
/* const v7, 0x10101a5 */
/* if-eq v4, v7, :cond_7 */
/* const v7, 0x101031f */
/* if-eq v4, v7, :cond_7 */
/* .line 23 */
/* if-eq v4, v7, :cond_7 */
/* if-eq v4, v7, :cond_7 */
/* add-int/lit8 v7, v15, 0x1 */
int v0 = 0; // const/4 v0, 0x0
v16 = /* .line 24 */
if ( v16 != null) { // if-eqz v16, :cond_6
} // :cond_6
/* neg-int v4, v4 */
/* .line 25 */
} // :goto_5
/* aput v4, v13, v15 */
/* move v15, v7 */
} // :cond_7
/* add-int/lit8 v14, v14, 0x1 */
int v4 = 1; // const/4 v4, 0x1
/* move-object/from16 v0, p0 */
/* .line 26 */
} // :cond_8
android.util.StateSet .trimStateSet ( v13,v15 );
/* .line 27 */
v4 = c.h.f.i.c .a ( v10,v11,v12 );
/* .line 28 */
c.h.f.i.l .a ( v5,v8,v4 );
/* .line 29 */
c.h.f.i.l .a ( v6,v8,v0 );
/* move-object v6, v0 */
/* check-cast v6, [[I */
/* add-int/lit8 v8, v8, 0x1 */
} // :cond_9
} // :goto_6
int v4 = 1; // const/4 v4, 0x1
/* move-object/from16 v0, p0 */
/* goto/16 :goto_0 */
/* .line 30 */
} // :cond_a
/* new-array v0, v8, [I */
/* .line 31 */
/* new-array v1, v8, [[I */
int v2 = 0; // const/4 v2, 0x0
/* .line 32 */
java.lang.System .arraycopy ( v5,v2,v0,v2,v8 );
/* .line 33 */
java.lang.System .arraycopy ( v6,v2,v1,v2,v8 );
/* .line 34 */
/* new-instance v2, Landroid/content/res/ColorStateList; */
/* invoke-direct {v2, v1, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V */
} // .end method
