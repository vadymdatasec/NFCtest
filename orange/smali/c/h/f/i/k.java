public abstract class c.h.f.i.k {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.graphics.Shader$TileMode a ( Integer p0 ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-eq p0, v0, :cond_1 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* if-eq p0, v0, :cond_0 */
		 /* .line 30 */
		 p0 = android.graphics.Shader$TileMode.CLAMP;
		 /* .line 31 */
	 } // :cond_0
	 p0 = android.graphics.Shader$TileMode.MIRROR;
	 /* .line 32 */
} // :cond_1
p0 = android.graphics.Shader$TileMode.REPEAT;
} // .end method
public static android.graphics.Shader a ( android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources$Theme p3 ) {
/* .locals 20 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/xmlpull/v1/XmlPullParserException; */
/* } */
} // .end annotation
/* move-object/from16 v0, p1 */
/* .line 1 */
/* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
final String v2 = "gradient"; // const-string v2, "gradient"
/* .line 2 */
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 3 */
v1 = c.h.d.GradientColor;
/* move-object/from16 v2, p0 */
/* move-object/from16 v3, p2 */
/* move-object/from16 v4, p3 */
c.h.f.i.t .a ( v2,v4,v3,v1 );
/* .line 4 */
int v6 = 0; // const/4 v6, 0x0
final String v7 = "startX"; // const-string v7, "startX"
v9 = c.h.f.i.t .a ( v1,v0,v7,v5,v6 );
/* .line 5 */
final String v7 = "startY"; // const-string v7, "startY"
v10 = c.h.f.i.t .a ( v1,v0,v7,v5,v6 );
/* .line 6 */
final String v7 = "endX"; // const-string v7, "endX"
v11 = c.h.f.i.t .a ( v1,v0,v7,v5,v6 );
/* .line 7 */
final String v7 = "endY"; // const-string v7, "endY"
v12 = c.h.f.i.t .a ( v1,v0,v7,v5,v6 );
/* .line 8 */
final String v7 = "centerX"; // const-string v7, "centerX"
v14 = c.h.f.i.t .a ( v1,v0,v7,v5,v6 );
/* .line 9 */
final String v7 = "centerY"; // const-string v7, "centerY"
v15 = c.h.f.i.t .a ( v1,v0,v7,v5,v6 );
/* .line 10 */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "type"; // const-string v8, "type"
v5 = c.h.f.i.t .b ( v1,v0,v8,v5,v7 );
/* .line 11 */
final String v13 = "startColor"; // const-string v13, "startColor"
v8 = c.h.f.i.t .a ( v1,v0,v13,v8,v7 );
final String v13 = "centerColor"; // const-string v13, "centerColor"
/* .line 12 */
v6 = c.h.f.i.t .a ( v0,v13 );
/* .line 13 */
v2 = c.h.f.i.t .a ( v1,v0,v13,v2,v7 );
/* .line 14 */
final String v3 = "endColor"; // const-string v3, "endColor"
v3 = c.h.f.i.t .a ( v1,v0,v3,v13,v7 );
/* .line 15 */
final String v4 = "tileMode"; // const-string v4, "tileMode"
v4 = c.h.f.i.t .b ( v1,v0,v4,v13,v7 );
/* .line 16 */
final String v13 = "gradientRadius"; // const-string v13, "gradientRadius"
/* move/from16 v17, v14 */
int v14 = 0; // const/4 v14, 0x0
v7 = c.h.f.i.t .a ( v1,v0,v13,v7,v14 );
/* .line 17 */
(( android.content.res.TypedArray ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
/* .line 18 */
/* invoke-static/range {p0 ..p3}, Lc/h/f/i/k;->b(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lc/h/f/i/j; */
/* .line 19 */
c.h.f.i.k .a ( v0,v8,v3,v6,v2 );
int v1 = 1; // const/4 v1, 0x1
/* if-eq v5, v1, :cond_1 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v5, v1, :cond_0 */
/* .line 20 */
/* new-instance v1, Landroid/graphics/LinearGradient; */
v13 = this.a;
v14 = this.b;
/* .line 21 */
c.h.f.i.k .a ( v4 );
/* move-object v8, v1 */
/* invoke-direct/range {v8 ..v15}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V */
/* .line 22 */
} // :cond_0
/* new-instance v1, Landroid/graphics/SweepGradient; */
v2 = this.a;
v0 = this.b;
/* move/from16 v3, v17 */
/* invoke-direct {v1, v3, v15, v2, v0}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V */
} // :cond_1
/* move/from16 v3, v17 */
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v1, v7, v1 */
/* if-lez v1, :cond_2 */
/* .line 23 */
/* new-instance v1, Landroid/graphics/RadialGradient; */
v2 = this.a;
v0 = this.b;
/* .line 24 */
c.h.f.i.k .a ( v4 );
/* move-object v13, v1 */
/* move v14, v3 */
/* move/from16 v16, v7 */
/* move-object/from16 v17, v2 */
/* move-object/from16 v18, v0 */
/* invoke-direct/range {v13 ..v19}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V */
/* .line 25 */
} // :cond_2
/* new-instance v0, Lorg/xmlpull/v1/XmlPullParserException; */
final String v1 = "<gradient> tag requires \'gradientRadius\' attribute with radial type"; // const-string v1, "<gradient> tag requires \'gradientRadius\' attribute with radial type"
/* invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 26 */
} // :cond_3
/* new-instance v2, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 27 */
/* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String; */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = ": invalid gradient color tag "; // const-string v0, ": invalid gradient color tag "
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
} // .end method
public static c.h.f.i.j a ( Object p0, Integer p1, Integer p2, Boolean p3, Integer p4 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 28 */
/* new-instance p0, Lc/h/f/i/j; */
/* invoke-direct {p0, p1, p4, p2}, Lc/h/f/i/j;-><init>(III)V */
/* .line 29 */
} // :cond_1
/* new-instance p0, Lc/h/f/i/j; */
/* invoke-direct {p0, p1, p2}, Lc/h/f/i/j;-><init>(II)V */
} // .end method
public static c.h.f.i.j b ( android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources$Theme p3 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = /* .line 1 */
int v1 = 1; // const/4 v1, 0x1
/* add-int/2addr v0, v1 */
/* .line 2 */
/* new-instance v2, Ljava/util/ArrayList; */
/* const/16 v3, 0x14 */
/* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 3 */
/* new-instance v4, Ljava/util/ArrayList; */
/* invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 4 */
} // :cond_0
v3 = } // :goto_0
/* if-eq v3, v1, :cond_5 */
v5 = /* .line 5 */
/* if-ge v5, v0, :cond_1 */
int v6 = 3; // const/4 v6, 0x3
/* if-eq v3, v6, :cond_5 */
} // :cond_1
int v6 = 2; // const/4 v6, 0x2
/* if-eq v3, v6, :cond_2 */
} // :cond_2
/* if-gt v5, v0, :cond_0 */
/* .line 6 */
final String v5 = "item"; // const-string v5, "item"
v3 = (( java.lang.String ) v3 ).equals ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_3 */
/* .line 7 */
} // :cond_3
v3 = c.h.d.GradientColorItem;
c.h.f.i.t .a ( p0,p3,p2,v3 );
/* .line 8 */
v5 = (( android.content.res.TypedArray ) v3 ).hasValue ( v5 ); // invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z
/* .line 9 */
v6 = (( android.content.res.TypedArray ) v3 ).hasValue ( v6 ); // invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v5 != null) { // if-eqz v5, :cond_4
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 10 */
int v6 = 0; // const/4 v6, 0x0
v5 = (( android.content.res.TypedArray ) v3 ).getColor ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Landroid/content/res/TypedArray;->getColor(II)I
/* .line 11 */
int v7 = 0; // const/4 v7, 0x0
v6 = (( android.content.res.TypedArray ) v3 ).getFloat ( v6, v7 ); // invoke-virtual {v3, v6, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* .line 12 */
(( android.content.res.TypedArray ) v3 ).recycle ( ); // invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V
/* .line 13 */
java.lang.Integer .valueOf ( v5 );
/* .line 14 */
java.lang.Float .valueOf ( v6 );
/* .line 15 */
} // :cond_4
/* new-instance p0, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 16 */
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ": <item> tag requires a \'color\' attribute and a \'offset\' attribute!"; // const-string p1, ": <item> tag requires a \'color\' attribute and a \'offset\' attribute!"
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 17 */
p0 = } // :cond_5
/* if-lez p0, :cond_6 */
/* new-instance p0, Lc/h/f/i/j; */
/* invoke-direct {p0, v4, v2}, Lc/h/f/i/j;-><init>(Ljava/util/List;Ljava/util/List;)V */
} // :cond_6
int p0 = 0; // const/4 p0, 0x0
} // .end method
