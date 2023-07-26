public abstract class c.w.a.a.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( android.content.res.Resources p0, android.content.res.Resources$Theme p1, android.util.AttributeSet p2, org.xmlpull.v1.XmlPullParser p3 ) {
		 /* .locals 1 */
		 /* .line 146 */
		 v0 = c.w.a.a.a.j;
		 c.h.f.i.t .a ( p0,p1,p2,v0 );
		 int p1 = 0; // const/4 p1, 0x0
		 final String p2 = "value"; // const-string p2, "value"
		 /* .line 147 */
		 c.h.f.i.t .b ( p0,p3,p2,p1 );
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 int p3 = 1; // const/4 p3, 0x1
		 } // :cond_0
		 int p3 = 0; // const/4 p3, 0x0
	 } // :goto_0
	 if ( p3 != null) { // if-eqz p3, :cond_1
		 /* .line 148 */
		 /* iget p2, p2, Landroid/util/TypedValue;->type:I */
		 p2 = 		 c.w.a.a.j .a ( p2 );
		 if ( p2 != null) { // if-eqz p2, :cond_1
			 int p1 = 3; // const/4 p1, 0x3
			 /* .line 149 */
		 } // :cond_1
		 (( android.content.res.TypedArray ) p0 ).recycle ( ); // invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V
	 } // .end method
	 public static Integer a ( android.content.res.TypedArray p0, Integer p1, Integer p2 ) {
		 /* .locals 3 */
		 /* .line 150 */
		 (( android.content.res.TypedArray ) p0 ).peekValue ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;
		 int v0 = 1; // const/4 v0, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int v2 = 1; // const/4 v2, 0x1
		 } // :cond_0
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* .line 151 */
		 /* iget p1, p1, Landroid/util/TypedValue;->type:I */
	 } // :cond_1
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 152 */
} // :goto_1
(( android.content.res.TypedArray ) p0 ).peekValue ( p2 ); // invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;
if ( p0 != null) { // if-eqz p0, :cond_2
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 153 */
/* iget p0, p0, Landroid/util/TypedValue;->type:I */
} // :cond_3
int p0 = 0; // const/4 p0, 0x0
} // :goto_3
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 154 */
p1 = c.w.a.a.j .a ( p1 );
/* if-nez p1, :cond_5 */
} // :cond_4
if ( v0 != null) { // if-eqz v0, :cond_6
p0 = c.w.a.a.j .a ( p0 );
if ( p0 != null) { // if-eqz p0, :cond_6
} // :cond_5
int v1 = 3; // const/4 v1, 0x3
} // :cond_6
} // .end method
public static android.animation.Animator a ( android.content.Context p0, Integer p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/res/Resources$NotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
/* const/16 v1, 0x18 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
android.animation.AnimatorInflater .loadAnimator ( p0,p1 );
/* .line 3 */
} // :cond_0
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.Context ) p0 ).getTheme ( ); // invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
c.w.a.a.j .a ( p0,v0,v1,p1 );
} // :goto_0
} // .end method
public static android.animation.Animator a ( android.content.Context p0, android.content.res.Resources p1, android.content.res.Resources$Theme p2, Integer p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/res/Resources$NotFoundException; */
/* } */
} // .end annotation
/* const/high16 v0, 0x3f800000 # 1.0f */
/* .line 4 */
c.w.a.a.j .a ( p0,p1,p2,p3,v0 );
} // .end method
public static android.animation.Animator a ( android.content.Context p0, android.content.res.Resources p1, android.content.res.Resources$Theme p2, Integer p3, Float p4 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/res/Resources$NotFoundException; */
/* } */
} // .end annotation
final String v0 = "Can\'t load animation resource ID #0x"; // const-string v0, "Can\'t load animation resource ID #0x"
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
try { // :try_start_0
(( android.content.res.Resources ) p1 ).getAnimation ( p3 ); // invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getAnimation(I)Landroid/content/res/XmlResourceParser;
/* .line 6 */
c.w.a.a.j .a ( p0,p1,p2,v1,p4 );
/* :try_end_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 7 */
} // :cond_0
/* :catchall_0 */
/* move-exception p0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 8 */
try { // :try_start_1
/* new-instance p1, Landroid/content/res/Resources$NotFoundException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 9 */
java.lang.Integer .toHexString ( p3 );
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V */
/* .line 10 */
(( android.content.res.Resources$NotFoundException ) p1 ).initCause ( p0 ); // invoke-virtual {p1, p0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* .line 11 */
/* throw p1 */
/* :catch_1 */
/* move-exception p0 */
/* .line 12 */
/* new-instance p1, Landroid/content/res/Resources$NotFoundException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 13 */
java.lang.Integer .toHexString ( p3 );
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V */
/* .line 14 */
(( android.content.res.Resources$NotFoundException ) p1 ).initCause ( p0 ); // invoke-virtual {p1, p0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* .line 15 */
/* throw p1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 16 */
/* .line 17 */
} // :cond_1
/* throw p0 */
} // .end method
public static android.animation.Animator a ( android.content.Context p0, android.content.res.Resources p1, android.content.res.Resources$Theme p2, org.xmlpull.v1.XmlPullParser p3, Float p4 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 103 */
android.util.Xml .asAttributeSet ( p3 );
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move v7, p4 */
/* invoke-static/range {v0 ..v7}, Lc/w/a/a/j;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;IF)Landroid/animation/Animator; */
} // .end method
public static android.animation.Animator a ( android.content.Context p0, android.content.res.Resources p1, android.content.res.Resources$Theme p2, org.xmlpull.v1.XmlPullParser p3, android.util.AttributeSet p4, android.animation.AnimatorSet p5, Integer p6, Float p7 ) {
/* .locals 18 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* move-object/from16 v8, p1 */
/* move-object/from16 v9, p2 */
/* move-object/from16 v10, p3 */
/* move-object/from16 v11, p5 */
/* .line 104 */
v12 = /* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
int v0 = 0; // const/4 v0, 0x0
/* move-object v13, v0 */
/* .line 105 */
} // :cond_0
} // :goto_0
v1 = /* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I */
int v2 = 3; // const/4 v2, 0x3
int v14 = 0; // const/4 v14, 0x0
/* if-ne v1, v2, :cond_1 */
v2 = /* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
/* if-le v2, v12, :cond_9 */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
/* if-eq v1, v2, :cond_9 */
int v3 = 2; // const/4 v3, 0x2
/* if-eq v1, v3, :cond_2 */
/* .line 106 */
} // :cond_2
/* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
final String v3 = "objectAnimator"; // const-string v3, "objectAnimator"
/* .line 107 */
v3 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* move-object/from16 v2, p2 */
/* move-object/from16 v3, p4 */
/* move/from16 v4, p7 */
/* move-object/from16 v5, p3 */
/* .line 108 */
/* invoke-static/range {v0 ..v5}, Lc/w/a/a/j;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;FLorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ObjectAnimator; */
} // :goto_1
/* move-object/from16 v3, p0 */
/* goto/16 :goto_2 */
} // :cond_3
final String v3 = "animator"; // const-string v3, "animator"
/* .line 109 */
v3 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_4
int v4 = 0; // const/4 v4, 0x0
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* move-object/from16 v2, p2 */
/* move-object/from16 v3, p4 */
/* move/from16 v5, p7 */
/* move-object/from16 v6, p3 */
/* .line 110 */
/* invoke-static/range {v0 ..v6}, Lc/w/a/a/j;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroid/animation/ValueAnimator;FLorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ValueAnimator; */
} // :cond_4
final String v3 = "set"; // const-string v3, "set"
/* .line 111 */
v3 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 112 */
/* new-instance v15, Landroid/animation/AnimatorSet; */
/* invoke-direct {v15}, Landroid/animation/AnimatorSet;-><init>()V */
/* .line 113 */
v0 = c.w.a.a.a.h;
/* move-object/from16 v7, p4 */
c.h.f.i.t .a ( v8,v9,v7,v0 );
final String v0 = "ordering"; // const-string v0, "ordering"
/* .line 114 */
v16 = c.h.f.i.t .b ( v6,v10,v0,v14,v14 );
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* move-object/from16 v2, p2 */
/* move-object/from16 v3, p3 */
/* move-object/from16 v4, p4 */
/* move-object v5, v15 */
/* move-object/from16 v17, v6 */
/* move/from16 v6, v16 */
/* move/from16 v7, p7 */
/* .line 115 */
/* invoke-static/range {v0 ..v7}, Lc/w/a/a/j;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/animation/AnimatorSet;IF)Landroid/animation/Animator; */
/* .line 116 */
/* invoke-virtual/range {v17 ..v17}, Landroid/content/res/TypedArray;->recycle()V */
/* move-object/from16 v3, p0 */
/* move-object v0, v15 */
} // :cond_5
final String v3 = "propertyValuesHolder"; // const-string v3, "propertyValuesHolder"
/* .line 117 */
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 118 */
/* invoke-static/range {p3 ..p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet; */
/* move-object/from16 v3, p0 */
/* .line 119 */
c.w.a.a.j .a ( v3,v8,v9,v10,v1 );
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 120 */
/* instance-of v4, v0, Landroid/animation/ValueAnimator; */
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 121 */
/* move-object v4, v0 */
/* check-cast v4, Landroid/animation/ValueAnimator; */
(( android.animation.ValueAnimator ) v4 ).setValues ( v1 ); // invoke-virtual {v4, v1}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V
} // :cond_6
int v14 = 1; // const/4 v14, 0x1
} // :goto_2
if ( v11 != null) { // if-eqz v11, :cond_0
/* if-nez v14, :cond_0 */
/* if-nez v13, :cond_7 */
/* .line 122 */
/* new-instance v13, Ljava/util/ArrayList; */
/* invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V */
/* .line 123 */
} // :cond_7
(( java.util.ArrayList ) v13 ).add ( v0 ); // invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* goto/16 :goto_0 */
/* .line 124 */
} // :cond_8
/* new-instance v0, Ljava/lang/RuntimeException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unknown animator name: "; // const-string v2, "Unknown animator name: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_9
if ( v11 != null) { // if-eqz v11, :cond_c
if ( v13 != null) { // if-eqz v13, :cond_c
/* .line 125 */
v1 = (( java.util.ArrayList ) v13 ).size ( ); // invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
/* new-array v1, v1, [Landroid/animation/Animator; */
/* .line 126 */
(( java.util.ArrayList ) v13 ).iterator ( ); // invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v3 = } // :goto_3
if ( v3 != null) { // if-eqz v3, :cond_a
/* check-cast v3, Landroid/animation/Animator; */
/* add-int/lit8 v4, v14, 0x1 */
/* .line 127 */
/* aput-object v3, v1, v14 */
/* move v14, v4 */
} // :cond_a
/* if-nez p6, :cond_b */
/* .line 128 */
(( android.animation.AnimatorSet ) v11 ).playTogether ( v1 ); // invoke-virtual {v11, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V
/* .line 129 */
} // :cond_b
(( android.animation.AnimatorSet ) v11 ).playSequentially ( v1 ); // invoke-virtual {v11, v1}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V
} // :cond_c
} // :goto_4
} // .end method
public static android.animation.Keyframe a ( android.animation.Keyframe p0, Float p1 ) {
/* .locals 2 */
/* .line 184 */
(( android.animation.Keyframe ) p0 ).getType ( ); // invoke-virtual {p0}, Landroid/animation/Keyframe;->getType()Ljava/lang/Class;
v1 = java.lang.Float.TYPE;
/* if-ne v0, v1, :cond_0 */
/* .line 185 */
android.animation.Keyframe .ofFloat ( p1 );
/* .line 186 */
} // :cond_0
(( android.animation.Keyframe ) p0 ).getType ( ); // invoke-virtual {p0}, Landroid/animation/Keyframe;->getType()Ljava/lang/Class;
v0 = java.lang.Integer.TYPE;
/* if-ne p0, v0, :cond_1 */
/* .line 187 */
android.animation.Keyframe .ofInt ( p1 );
/* .line 188 */
} // :cond_1
android.animation.Keyframe .ofObject ( p1 );
} // :goto_0
} // .end method
public static android.animation.Keyframe a ( android.content.Context p0, android.content.res.Resources p1, android.content.res.Resources$Theme p2, android.util.AttributeSet p3, Integer p4, org.xmlpull.v1.XmlPullParser p5 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 190 */
v0 = c.w.a.a.a.j;
c.h.f.i.t .a ( p1,p2,p3,v0 );
int p2 = 3; // const/4 p2, 0x3
final String p3 = "fraction"; // const-string p3, "fraction"
/* const/high16 v0, -0x40800000 # -1.0f */
/* .line 191 */
p3 = c.h.f.i.t .a ( p1,p5,p3,p2,v0 );
final String v0 = "value"; // const-string v0, "value"
int v1 = 0; // const/4 v1, 0x0
/* .line 192 */
c.h.f.i.t .b ( p1,p5,v0,v1 );
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_0
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
int v5 = 4; // const/4 v5, 0x4
/* if-ne p4, v5, :cond_2 */
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 193 */
/* iget p4, v2, Landroid/util/TypedValue;->type:I */
p4 = c.w.a.a.j .a ( p4 );
if ( p4 != null) { // if-eqz p4, :cond_1
int p4 = 3; // const/4 p4, 0x3
} // :cond_1
int p4 = 0; // const/4 p4, 0x0
} // :cond_2
} // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_5
if ( p4 != null) { // if-eqz p4, :cond_4
/* if-eq p4, v3, :cond_3 */
/* if-eq p4, p2, :cond_3 */
int p2 = 0; // const/4 p2, 0x0
/* .line 194 */
} // :cond_3
p2 = c.h.f.i.t .b ( p1,p5,v0,v1,v1 );
/* .line 195 */
android.animation.Keyframe .ofInt ( p3,p2 );
} // :cond_4
int p2 = 0; // const/4 p2, 0x0
/* .line 196 */
p2 = c.h.f.i.t .a ( p1,p5,v0,v1,p2 );
/* .line 197 */
android.animation.Keyframe .ofFloat ( p3,p2 );
} // :cond_5
/* if-nez p4, :cond_6 */
/* .line 198 */
android.animation.Keyframe .ofFloat ( p3 );
/* .line 199 */
} // :cond_6
android.animation.Keyframe .ofInt ( p3 );
} // :goto_2
final String p3 = "interpolator"; // const-string p3, "interpolator"
/* .line 200 */
p3 = c.h.f.i.t .c ( p1,p5,p3,v3,v1 );
/* if-lez p3, :cond_7 */
/* .line 201 */
c.w.a.a.h .a ( p0,p3 );
/* .line 202 */
(( android.animation.Keyframe ) p2 ).setInterpolator ( p0 ); // invoke-virtual {p2, p0}, Landroid/animation/Keyframe;->setInterpolator(Landroid/animation/TimeInterpolator;)V
/* .line 203 */
} // :cond_7
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
} // .end method
public static android.animation.ObjectAnimator a ( android.content.Context p0, android.content.res.Resources p1, android.content.res.Resources$Theme p2, android.util.AttributeSet p3, Float p4, org.xmlpull.v1.XmlPullParser p5 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/res/Resources$NotFoundException; */
/* } */
} // .end annotation
/* .line 204 */
/* new-instance v7, Landroid/animation/ObjectAnimator; */
/* invoke-direct {v7}, Landroid/animation/ObjectAnimator;-><init>()V */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-object v4, v7 */
/* move v5, p4 */
/* move-object v6, p5 */
/* .line 205 */
/* invoke-static/range {v0 ..v6}, Lc/w/a/a/j;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroid/animation/ValueAnimator;FLorg/xmlpull/v1/XmlPullParser;)Landroid/animation/ValueAnimator; */
} // .end method
public static android.animation.PropertyValuesHolder a ( android.content.Context p0, android.content.res.Resources p1, android.content.res.Resources$Theme p2, org.xmlpull.v1.XmlPullParser p3, java.lang.String p4, Integer p5 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* move-object v1, v0 */
/* .line 155 */
} // :cond_0
v2 = } // :goto_0
int v3 = 3; // const/4 v3, 0x3
/* if-eq v2, v3, :cond_4 */
int v4 = 1; // const/4 v4, 0x1
/* if-eq v2, v4, :cond_4 */
/* .line 156 */
final String v3 = "keyframe"; // const-string v3, "keyframe"
/* .line 157 */
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
int v2 = 4; // const/4 v2, 0x4
/* if-ne p5, v2, :cond_1 */
/* .line 158 */
android.util.Xml .asAttributeSet ( p3 );
p5 = c.w.a.a.j .a ( p1,p2,p5,p3 );
/* .line 159 */
} // :cond_1
android.util.Xml .asAttributeSet ( p3 );
/* move-object v2, p0 */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* move v6, p5 */
/* move-object v7, p3 */
/* invoke-static/range {v2 ..v7}, Lc/w/a/a/j;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;ILorg/xmlpull/v1/XmlPullParser;)Landroid/animation/Keyframe; */
if ( v2 != null) { // if-eqz v2, :cond_3
/* if-nez v1, :cond_2 */
/* .line 160 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 161 */
} // :cond_2
(( java.util.ArrayList ) v1 ).add ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 162 */
} // :cond_3
} // :cond_4
if ( v1 != null) { // if-eqz v1, :cond_f
/* .line 163 */
p0 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-lez p0, :cond_f */
int p1 = 0; // const/4 p1, 0x0
/* .line 164 */
(( java.util.ArrayList ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p2, Landroid/animation/Keyframe; */
/* add-int/lit8 p3, p0, -0x1 */
/* .line 165 */
(( java.util.ArrayList ) v1 ).get ( p3 ); // invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p3, Landroid/animation/Keyframe; */
/* .line 166 */
v0 = (( android.animation.Keyframe ) p3 ).getFraction ( ); // invoke-virtual {p3}, Landroid/animation/Keyframe;->getFraction()F
/* const/high16 v2, 0x3f800000 # 1.0f */
int v4 = 0; // const/4 v4, 0x0
/* cmpg-float v5, v0, v2 */
/* if-gez v5, :cond_6 */
/* cmpg-float v0, v0, v4 */
/* if-gez v0, :cond_5 */
/* .line 167 */
(( android.animation.Keyframe ) p3 ).setFraction ( v2 ); // invoke-virtual {p3, v2}, Landroid/animation/Keyframe;->setFraction(F)V
/* .line 168 */
} // :cond_5
v0 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
c.w.a.a.j .a ( p3,v2 );
(( java.util.ArrayList ) v1 ).add ( v0, p3 ); // invoke-virtual {v1, v0, p3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
/* add-int/lit8 p0, p0, 0x1 */
/* .line 169 */
} // :cond_6
} // :goto_1
p3 = (( android.animation.Keyframe ) p2 ).getFraction ( ); // invoke-virtual {p2}, Landroid/animation/Keyframe;->getFraction()F
/* cmpl-float v0, p3, v4 */
if ( v0 != null) { // if-eqz v0, :cond_8
/* cmpg-float p3, p3, v4 */
/* if-gez p3, :cond_7 */
/* .line 170 */
(( android.animation.Keyframe ) p2 ).setFraction ( v4 ); // invoke-virtual {p2, v4}, Landroid/animation/Keyframe;->setFraction(F)V
/* .line 171 */
} // :cond_7
c.w.a.a.j .a ( p2,v4 );
(( java.util.ArrayList ) v1 ).add ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
/* add-int/lit8 p0, p0, 0x1 */
/* .line 172 */
} // :cond_8
} // :goto_2
/* new-array p2, p0, [Landroid/animation/Keyframe; */
/* .line 173 */
(( java.util.ArrayList ) v1 ).toArray ( p2 ); // invoke-virtual {v1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
} // :goto_3
/* if-ge p1, p0, :cond_e */
/* .line 174 */
/* aget-object p3, p2, p1 */
/* .line 175 */
v0 = (( android.animation.Keyframe ) p3 ).getFraction ( ); // invoke-virtual {p3}, Landroid/animation/Keyframe;->getFraction()F
/* cmpg-float v0, v0, v4 */
/* if-gez v0, :cond_d */
/* if-nez p1, :cond_9 */
/* .line 176 */
(( android.animation.Keyframe ) p3 ).setFraction ( v4 ); // invoke-virtual {p3, v4}, Landroid/animation/Keyframe;->setFraction(F)V
} // :cond_9
/* add-int/lit8 v0, p0, -0x1 */
/* if-ne p1, v0, :cond_a */
/* .line 177 */
(( android.animation.Keyframe ) p3 ).setFraction ( v2 ); // invoke-virtual {p3, v2}, Landroid/animation/Keyframe;->setFraction(F)V
} // :cond_a
/* add-int/lit8 p3, p1, 0x1 */
/* move v1, p1 */
} // :goto_4
/* if-ge p3, v0, :cond_c */
/* .line 178 */
/* aget-object v5, p2, p3 */
v5 = (( android.animation.Keyframe ) v5 ).getFraction ( ); // invoke-virtual {v5}, Landroid/animation/Keyframe;->getFraction()F
/* cmpl-float v5, v5, v4 */
/* if-ltz v5, :cond_b */
} // :cond_b
/* add-int/lit8 v1, p3, 0x1 */
/* move v8, v1 */
/* move v1, p3 */
/* move p3, v8 */
} // :cond_c
} // :goto_5
/* add-int/lit8 p3, v1, 0x1 */
/* .line 179 */
/* aget-object p3, p2, p3 */
p3 = (( android.animation.Keyframe ) p3 ).getFraction ( ); // invoke-virtual {p3}, Landroid/animation/Keyframe;->getFraction()F
/* add-int/lit8 v0, p1, -0x1 */
/* aget-object v0, p2, v0 */
/* .line 180 */
v0 = (( android.animation.Keyframe ) v0 ).getFraction ( ); // invoke-virtual {v0}, Landroid/animation/Keyframe;->getFraction()F
/* sub-float/2addr p3, v0 */
/* .line 181 */
c.w.a.a.j .a ( p2,p3,p1,v1 );
} // :cond_d
} // :goto_6
/* add-int/lit8 p1, p1, 0x1 */
/* .line 182 */
} // :cond_e
android.animation.PropertyValuesHolder .ofKeyframe ( p4,p2 );
/* if-ne p5, v3, :cond_f */
/* .line 183 */
c.w.a.a.k .a ( );
(( android.animation.PropertyValuesHolder ) v0 ).setEvaluator ( p0 ); // invoke-virtual {v0, p0}, Landroid/animation/PropertyValuesHolder;->setEvaluator(Landroid/animation/TypeEvaluator;)V
} // :cond_f
} // .end method
public static android.animation.PropertyValuesHolder a ( android.content.res.TypedArray p0, Integer p1, Integer p2, Integer p3, java.lang.String p4 ) {
/* .locals 11 */
/* .line 18 */
(( android.content.res.TypedArray ) p0 ).peekValue ( p2 ); // invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 19 */
/* iget v0, v0, Landroid/util/TypedValue;->type:I */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 20 */
} // :goto_1
(( android.content.res.TypedArray ) p0 ).peekValue ( p3 ); // invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;
if ( v4 != null) { // if-eqz v4, :cond_2
int v5 = 1; // const/4 v5, 0x1
} // :cond_2
int v5 = 0; // const/4 v5, 0x0
} // :goto_2
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 21 */
/* iget v4, v4, Landroid/util/TypedValue;->type:I */
} // :cond_3
int v4 = 0; // const/4 v4, 0x0
} // :goto_3
int v6 = 4; // const/4 v6, 0x4
int v7 = 3; // const/4 v7, 0x3
/* if-ne p1, v6, :cond_7 */
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 22 */
p1 = c.w.a.a.j .a ( v0 );
/* if-nez p1, :cond_5 */
} // :cond_4
if ( v5 != null) { // if-eqz v5, :cond_6
p1 = c.w.a.a.j .a ( v4 );
if ( p1 != null) { // if-eqz p1, :cond_6
} // :cond_5
int p1 = 3; // const/4 p1, 0x3
} // :cond_6
int p1 = 0; // const/4 p1, 0x0
} // :cond_7
} // :goto_4
/* if-nez p1, :cond_8 */
int v6 = 1; // const/4 v6, 0x1
} // :cond_8
int v6 = 0; // const/4 v6, 0x0
} // :goto_5
int v8 = 0; // const/4 v8, 0x0
int v9 = 2; // const/4 v9, 0x2
/* if-ne p1, v9, :cond_d */
/* .line 23 */
(( android.content.res.TypedArray ) p0 ).getString ( p2 ); // invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
/* .line 24 */
(( android.content.res.TypedArray ) p0 ).getString ( p3 ); // invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
/* .line 25 */
c.h.g.e .a ( p1 );
/* .line 26 */
c.h.g.e .a ( p0 );
/* if-nez p2, :cond_9 */
if ( p3 != null) { // if-eqz p3, :cond_1e
} // :cond_9
if ( p2 != null) { // if-eqz p2, :cond_c
/* .line 27 */
/* new-instance v0, Lc/w/a/a/i; */
/* invoke-direct {v0}, Lc/w/a/a/i;-><init>()V */
if ( p3 != null) { // if-eqz p3, :cond_b
/* .line 28 */
v3 = c.h.g.e .a ( p2,p3 );
if ( v3 != null) { // if-eqz v3, :cond_a
/* new-array p0, v9, [Ljava/lang/Object; */
/* aput-object p2, p0, v2 */
/* aput-object p3, p0, v1 */
/* .line 29 */
android.animation.PropertyValuesHolder .ofObject ( p4,v0,p0 );
/* .line 30 */
} // :cond_a
/* new-instance p2, Landroid/view/InflateException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String p4 = " Can\'t morph from "; // const-string p4, " Can\'t morph from "
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " to "; // const-string p1, " to "
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p0 ); // invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // :cond_b
/* new-array p0, v1, [Ljava/lang/Object; */
/* aput-object p2, p0, v2 */
/* .line 31 */
android.animation.PropertyValuesHolder .ofObject ( p4,v0,p0 );
} // :goto_6
/* move-object v8, p0 */
/* goto/16 :goto_10 */
} // :cond_c
if ( p3 != null) { // if-eqz p3, :cond_1e
/* .line 32 */
/* new-instance p0, Lc/w/a/a/i; */
/* invoke-direct {p0}, Lc/w/a/a/i;-><init>()V */
/* new-array p1, v1, [Ljava/lang/Object; */
/* aput-object p3, p1, v2 */
/* .line 33 */
android.animation.PropertyValuesHolder .ofObject ( p4,p0,p1 );
/* goto/16 :goto_10 */
} // :cond_d
/* if-ne p1, v7, :cond_e */
/* .line 34 */
c.w.a.a.k .a ( );
} // :cond_e
/* move-object p1, v8 */
} // :goto_7
int v7 = 5; // const/4 v7, 0x5
int v10 = 0; // const/4 v10, 0x0
if ( v6 != null) { // if-eqz v6, :cond_14
if ( v3 != null) { // if-eqz v3, :cond_12
/* if-ne v0, v7, :cond_f */
/* .line 35 */
p2 = (( android.content.res.TypedArray ) p0 ).getDimension ( p2, v10 ); // invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F
/* .line 36 */
} // :cond_f
p2 = (( android.content.res.TypedArray ) p0 ).getFloat ( p2, v10 ); // invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F
} // :goto_8
if ( v5 != null) { // if-eqz v5, :cond_11
/* if-ne v4, v7, :cond_10 */
/* .line 37 */
p0 = (( android.content.res.TypedArray ) p0 ).getDimension ( p3, v10 ); // invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F
/* .line 38 */
} // :cond_10
p0 = (( android.content.res.TypedArray ) p0 ).getFloat ( p3, v10 ); // invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F
} // :goto_9
/* new-array p3, v9, [F */
/* aput p2, p3, v2 */
/* aput p0, p3, v1 */
/* .line 39 */
android.animation.PropertyValuesHolder .ofFloat ( p4,p3 );
} // :cond_11
/* new-array p0, v1, [F */
/* aput p2, p0, v2 */
/* .line 40 */
android.animation.PropertyValuesHolder .ofFloat ( p4,p0 );
} // :cond_12
/* if-ne v4, v7, :cond_13 */
/* .line 41 */
p0 = (( android.content.res.TypedArray ) p0 ).getDimension ( p3, v10 ); // invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F
/* .line 42 */
} // :cond_13
p0 = (( android.content.res.TypedArray ) p0 ).getFloat ( p3, v10 ); // invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F
} // :goto_a
/* new-array p2, v1, [F */
/* aput p0, p2, v2 */
/* .line 43 */
android.animation.PropertyValuesHolder .ofFloat ( p4,p2 );
} // :goto_b
/* move-object v8, p0 */
/* goto/16 :goto_f */
} // :cond_14
if ( v3 != null) { // if-eqz v3, :cond_1a
/* if-ne v0, v7, :cond_15 */
/* .line 44 */
p2 = (( android.content.res.TypedArray ) p0 ).getDimension ( p2, v10 ); // invoke-virtual {p0, p2, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F
/* float-to-int p2, p2 */
/* .line 45 */
} // :cond_15
v0 = c.w.a.a.j .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_16
/* .line 46 */
p2 = (( android.content.res.TypedArray ) p0 ).getColor ( p2, v2 ); // invoke-virtual {p0, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I
/* .line 47 */
} // :cond_16
p2 = (( android.content.res.TypedArray ) p0 ).getInt ( p2, v2 ); // invoke-virtual {p0, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I
} // :goto_c
if ( v5 != null) { // if-eqz v5, :cond_19
/* if-ne v4, v7, :cond_17 */
/* .line 48 */
p0 = (( android.content.res.TypedArray ) p0 ).getDimension ( p3, v10 ); // invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F
/* float-to-int p0, p0 */
/* .line 49 */
} // :cond_17
v0 = c.w.a.a.j .a ( v4 );
if ( v0 != null) { // if-eqz v0, :cond_18
/* .line 50 */
p0 = (( android.content.res.TypedArray ) p0 ).getColor ( p3, v2 ); // invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I
/* .line 51 */
} // :cond_18
p0 = (( android.content.res.TypedArray ) p0 ).getInt ( p3, v2 ); // invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I
} // :goto_d
/* new-array p3, v9, [I */
/* aput p2, p3, v2 */
/* aput p0, p3, v1 */
/* .line 52 */
android.animation.PropertyValuesHolder .ofInt ( p4,p3 );
} // :cond_19
/* new-array p0, v1, [I */
/* aput p2, p0, v2 */
/* .line 53 */
android.animation.PropertyValuesHolder .ofInt ( p4,p0 );
} // :cond_1a
if ( v5 != null) { // if-eqz v5, :cond_1d
/* if-ne v4, v7, :cond_1b */
/* .line 54 */
p0 = (( android.content.res.TypedArray ) p0 ).getDimension ( p3, v10 ); // invoke-virtual {p0, p3, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F
/* float-to-int p0, p0 */
/* .line 55 */
} // :cond_1b
p2 = c.w.a.a.j .a ( v4 );
if ( p2 != null) { // if-eqz p2, :cond_1c
/* .line 56 */
p0 = (( android.content.res.TypedArray ) p0 ).getColor ( p3, v2 ); // invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I
/* .line 57 */
} // :cond_1c
p0 = (( android.content.res.TypedArray ) p0 ).getInt ( p3, v2 ); // invoke-virtual {p0, p3, v2}, Landroid/content/res/TypedArray;->getInt(II)I
} // :goto_e
/* new-array p2, v1, [I */
/* aput p0, p2, v2 */
/* .line 58 */
android.animation.PropertyValuesHolder .ofInt ( p4,p2 );
} // :cond_1d
} // :goto_f
if ( v8 != null) { // if-eqz v8, :cond_1e
if ( p1 != null) { // if-eqz p1, :cond_1e
/* .line 59 */
(( android.animation.PropertyValuesHolder ) v8 ).setEvaluator ( p1 ); // invoke-virtual {v8, p1}, Landroid/animation/PropertyValuesHolder;->setEvaluator(Landroid/animation/TypeEvaluator;)V
} // :cond_1e
} // :goto_10
} // .end method
public static android.animation.ValueAnimator a ( android.content.Context p0, android.content.res.Resources p1, android.content.res.Resources$Theme p2, android.util.AttributeSet p3, android.animation.ValueAnimator p4, Float p5, org.xmlpull.v1.XmlPullParser p6 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/res/Resources$NotFoundException; */
/* } */
} // .end annotation
/* .line 206 */
v0 = c.w.a.a.a.g;
c.h.f.i.t .a ( p1,p2,p3,v0 );
/* .line 207 */
v1 = c.w.a.a.a.k;
c.h.f.i.t .a ( p1,p2,p3,v1 );
/* if-nez p4, :cond_0 */
/* .line 208 */
/* new-instance p4, Landroid/animation/ValueAnimator; */
/* invoke-direct {p4}, Landroid/animation/ValueAnimator;-><init>()V */
/* .line 209 */
} // :cond_0
c.w.a.a.j .a ( p4,v0,p1,p5,p6 );
int p2 = 0; // const/4 p2, 0x0
final String p3 = "interpolator"; // const-string p3, "interpolator"
/* .line 210 */
p2 = c.h.f.i.t .c ( v0,p6,p3,p2,p2 );
/* if-lez p2, :cond_1 */
/* .line 211 */
c.w.a.a.h .a ( p0,p2 );
/* .line 212 */
(( android.animation.ValueAnimator ) p4 ).setInterpolator ( p0 ); // invoke-virtual {p4, p0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V
/* .line 213 */
} // :cond_1
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 214 */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
} // :cond_2
} // .end method
public static void a ( android.animation.ValueAnimator p0, android.content.res.TypedArray p1, Integer p2, Float p3, org.xmlpull.v1.XmlPullParser p4 ) {
/* .locals 5 */
/* .line 73 */
/* check-cast p0, Landroid/animation/ObjectAnimator; */
final String v0 = "pathData"; // const-string v0, "pathData"
int v1 = 1; // const/4 v1, 0x1
/* .line 74 */
c.h.f.i.t .a ( p1,p4,v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_3
int v1 = 2; // const/4 v1, 0x2
final String v2 = "propertyXName"; // const-string v2, "propertyXName"
/* .line 75 */
c.h.f.i.t .a ( p1,p4,v2,v1 );
int v3 = 3; // const/4 v3, 0x3
final String v4 = "propertyYName"; // const-string v4, "propertyYName"
/* .line 76 */
c.h.f.i.t .a ( p1,p4,v4,v3 );
/* if-eq p2, v1, :cond_0 */
int v1 = 4; // const/4 v1, 0x4
} // :cond_0
/* if-nez v2, :cond_2 */
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 77 */
} // :cond_1
/* new-instance p0, Landroid/view/InflateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( android.content.res.TypedArray ) p1 ).getPositionDescription ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " propertyXName or propertyYName is needed for PathData"; // const-string p1, " propertyXName or propertyYName is needed for PathData"
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 78 */
} // :cond_2
} // :goto_0
c.h.g.e .b ( v0 );
/* const/high16 p2, 0x3f000000 # 0.5f */
/* mul-float p3, p3, p2 */
/* .line 79 */
c.w.a.a.j .a ( p1,p0,p3,v2,p4 );
} // :cond_3
int p2 = 0; // const/4 p2, 0x0
final String p3 = "propertyName"; // const-string p3, "propertyName"
/* .line 80 */
c.h.f.i.t .a ( p1,p4,p3,p2 );
/* .line 81 */
(( android.animation.ObjectAnimator ) p0 ).setPropertyName ( p1 ); // invoke-virtual {p0, p1}, Landroid/animation/ObjectAnimator;->setPropertyName(Ljava/lang/String;)V
} // :goto_1
return;
} // .end method
public static void a ( android.animation.ValueAnimator p0, android.content.res.TypedArray p1, android.content.res.TypedArray p2, Float p3, org.xmlpull.v1.XmlPullParser p4 ) {
/* .locals 11 */
int v0 = 1; // const/4 v0, 0x1
final String v1 = "duration"; // const-string v1, "duration"
/* const/16 v2, 0x12c */
/* .line 60 */
v1 = c.h.f.i.t .b ( p1,p4,v1,v0,v2 );
/* int-to-long v1, v1 */
int v3 = 0; // const/4 v3, 0x0
final String v4 = "startOffset"; // const-string v4, "startOffset"
int v5 = 2; // const/4 v5, 0x2
/* .line 61 */
v4 = c.h.f.i.t .b ( p1,p4,v4,v5,v3 );
/* int-to-long v4, v4 */
int v6 = 4; // const/4 v6, 0x4
final String v7 = "valueType"; // const-string v7, "valueType"
int v8 = 7; // const/4 v8, 0x7
/* .line 62 */
v7 = c.h.f.i.t .b ( p1,p4,v7,v8,v6 );
final String v8 = "valueFrom"; // const-string v8, "valueFrom"
/* .line 63 */
v8 = c.h.f.i.t .a ( p4,v8 );
if ( v8 != null) { // if-eqz v8, :cond_1
final String v8 = "valueTo"; // const-string v8, "valueTo"
/* .line 64 */
v8 = c.h.f.i.t .a ( p4,v8 );
if ( v8 != null) { // if-eqz v8, :cond_1
int v8 = 6; // const/4 v8, 0x6
int v9 = 5; // const/4 v9, 0x5
/* if-ne v7, v6, :cond_0 */
/* .line 65 */
v7 = c.w.a.a.j .a ( p1,v9,v8 );
} // :cond_0
final String v10 = ""; // const-string v10, ""
/* .line 66 */
c.w.a.a.j .a ( p1,v7,v9,v8,v10 );
if ( v8 != null) { // if-eqz v8, :cond_1
/* new-array v9, v0, [Landroid/animation/PropertyValuesHolder; */
/* aput-object v8, v9, v3 */
/* .line 67 */
(( android.animation.ValueAnimator ) p0 ).setValues ( v9 ); // invoke-virtual {p0, v9}, Landroid/animation/ValueAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V
/* .line 68 */
} // :cond_1
(( android.animation.ValueAnimator ) p0 ).setDuration ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;
/* .line 69 */
(( android.animation.ValueAnimator ) p0 ).setStartDelay ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Landroid/animation/ValueAnimator;->setStartDelay(J)V
int v1 = 3; // const/4 v1, 0x3
final String v2 = "repeatCount"; // const-string v2, "repeatCount"
/* .line 70 */
v1 = c.h.f.i.t .b ( p1,p4,v2,v1,v3 );
(( android.animation.ValueAnimator ) p0 ).setRepeatCount ( v1 ); // invoke-virtual {p0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V
final String v1 = "repeatMode"; // const-string v1, "repeatMode"
/* .line 71 */
p1 = c.h.f.i.t .b ( p1,p4,v1,v6,v0 );
(( android.animation.ValueAnimator ) p0 ).setRepeatMode ( p1 ); // invoke-virtual {p0, p1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 72 */
c.w.a.a.j .a ( p0,p2,v7,p3,p4 );
} // :cond_2
return;
} // .end method
public static void a ( android.graphics.Path p0, android.animation.ObjectAnimator p1, Float p2, java.lang.String p3, java.lang.String p4 ) {
/* .locals 17 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* move-object/from16 v2, p3 */
/* move-object/from16 v3, p4 */
/* .line 82 */
/* new-instance v4, Landroid/graphics/PathMeasure; */
int v5 = 0; // const/4 v5, 0x0
/* invoke-direct {v4, v0, v5}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V */
/* .line 83 */
/* new-instance v6, Ljava/util/ArrayList; */
/* invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V */
int v7 = 0; // const/4 v7, 0x0
/* .line 84 */
java.lang.Float .valueOf ( v7 );
(( java.util.ArrayList ) v6 ).add ( v8 ); // invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
int v8 = 0; // const/4 v8, 0x0
/* .line 85 */
} // :cond_0
v9 = (( android.graphics.PathMeasure ) v4 ).getLength ( ); // invoke-virtual {v4}, Landroid/graphics/PathMeasure;->getLength()F
/* add-float/2addr v8, v9 */
/* .line 86 */
java.lang.Float .valueOf ( v8 );
(( java.util.ArrayList ) v6 ).add ( v9 ); // invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 87 */
v9 = (( android.graphics.PathMeasure ) v4 ).nextContour ( ); // invoke-virtual {v4}, Landroid/graphics/PathMeasure;->nextContour()Z
/* if-nez v9, :cond_0 */
/* .line 88 */
/* new-instance v4, Landroid/graphics/PathMeasure; */
/* invoke-direct {v4, v0, v5}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V */
/* const/16 v0, 0x64 */
/* div-float v9, v8, p2 */
/* float-to-int v9, v9 */
int v10 = 1; // const/4 v10, 0x1
/* add-int/2addr v9, v10 */
/* .line 89 */
v0 = java.lang.Math .min ( v0,v9 );
/* .line 90 */
/* new-array v9, v0, [F */
/* .line 91 */
/* new-array v11, v0, [F */
int v12 = 2; // const/4 v12, 0x2
/* new-array v13, v12, [F */
/* add-int/lit8 v14, v0, -0x1 */
/* int-to-float v14, v14 */
/* div-float/2addr v8, v14 */
int v14 = 0; // const/4 v14, 0x0
int v15 = 0; // const/4 v15, 0x0
} // :goto_0
int v12 = 0; // const/4 v12, 0x0
/* if-ge v14, v0, :cond_2 */
/* .line 92 */
(( java.util.ArrayList ) v6 ).get ( v15 ); // invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v16, Ljava/lang/Float; */
v16 = /* invoke-virtual/range {v16 ..v16}, Ljava/lang/Float;->floatValue()F */
/* sub-float v10, v7, v16 */
(( android.graphics.PathMeasure ) v4 ).getPosTan ( v10, v13, v12 ); // invoke-virtual {v4, v10, v13, v12}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z
/* .line 93 */
/* aget v10, v13, v5 */
/* aput v10, v9, v14 */
int v10 = 1; // const/4 v10, 0x1
/* .line 94 */
/* aget v12, v13, v10 */
/* aput v12, v11, v14 */
/* add-float/2addr v7, v8 */
/* add-int/lit8 v10, v15, 0x1 */
/* .line 95 */
v12 = (( java.util.ArrayList ) v6 ).size ( ); // invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
/* if-ge v10, v12, :cond_1 */
/* .line 96 */
(( java.util.ArrayList ) v6 ).get ( v10 ); // invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v12, Ljava/lang/Float; */
v12 = (( java.lang.Float ) v12 ).floatValue ( ); // invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F
/* cmpl-float v12, v7, v12 */
/* if-lez v12, :cond_1 */
/* .line 97 */
(( android.graphics.PathMeasure ) v4 ).nextContour ( ); // invoke-virtual {v4}, Landroid/graphics/PathMeasure;->nextContour()Z
/* move v15, v10 */
} // :cond_1
/* add-int/lit8 v14, v14, 0x1 */
int v10 = 1; // const/4 v10, 0x1
} // :cond_2
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 98 */
android.animation.PropertyValuesHolder .ofFloat ( v2,v9 );
} // :cond_3
/* move-object v0, v12 */
} // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 99 */
android.animation.PropertyValuesHolder .ofFloat ( v3,v11 );
} // :cond_4
/* if-nez v0, :cond_5 */
int v2 = 1; // const/4 v2, 0x1
/* new-array v0, v2, [Landroid/animation/PropertyValuesHolder; */
/* aput-object v12, v0, v5 */
/* .line 100 */
(( android.animation.ObjectAnimator ) v1 ).setValues ( v0 ); // invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V
} // :cond_5
int v2 = 1; // const/4 v2, 0x1
/* if-nez v12, :cond_6 */
/* new-array v2, v2, [Landroid/animation/PropertyValuesHolder; */
/* aput-object v0, v2, v5 */
/* .line 101 */
(( android.animation.ObjectAnimator ) v1 ).setValues ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ObjectAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V
} // :cond_6
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [Landroid/animation/PropertyValuesHolder; */
/* aput-object v0, v3, v5 */
/* aput-object v12, v3, v2 */
/* .line 102 */
(( android.animation.ObjectAnimator ) v1 ).setValues ( v3 ); // invoke-virtual {v1, v3}, Landroid/animation/ObjectAnimator;->setValues([Landroid/animation/PropertyValuesHolder;)V
} // :goto_2
return;
} // .end method
public static void a ( android.animation.Keyframe[] p0, Float p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* sub-int v0, p3, p2 */
/* add-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* div-float/2addr p1, v0 */
} // :goto_0
/* if-gt p2, p3, :cond_0 */
/* .line 189 */
/* aget-object v0, p0, p2 */
/* add-int/lit8 v1, p2, -0x1 */
/* aget-object v1, p0, v1 */
v1 = (( android.animation.Keyframe ) v1 ).getFraction ( ); // invoke-virtual {v1}, Landroid/animation/Keyframe;->getFraction()F
/* add-float/2addr v1, p1 */
(( android.animation.Keyframe ) v0 ).setFraction ( v1 ); // invoke-virtual {v0, v1}, Landroid/animation/Keyframe;->setFraction(F)V
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_0
return;
} // .end method
public static Boolean a ( Integer p0 ) {
/* .locals 1 */
/* const/16 v0, 0x1c */
/* if-lt p0, v0, :cond_0 */
/* const/16 v0, 0x1f */
/* if-gt p0, v0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static android.animation.PropertyValuesHolder a ( android.content.Context p0, android.content.res.Resources p1, android.content.res.Resources$Theme p2, org.xmlpull.v1.XmlPullParser p3, android.util.AttributeSet p4 ) {
/* .locals 17 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* move-object/from16 v6, p3 */
int v7 = 0; // const/4 v7, 0x0
/* move-object v8, v7 */
/* .line 130 */
} // :goto_0
v0 = /* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I */
int v9 = 0; // const/4 v9, 0x0
int v1 = 3; // const/4 v1, 0x3
/* if-eq v0, v1, :cond_5 */
int v10 = 1; // const/4 v10, 0x1
/* if-eq v0, v10, :cond_5 */
int v2 = 2; // const/4 v2, 0x2
/* if-eq v0, v2, :cond_0 */
/* .line 131 */
/* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I */
/* .line 132 */
} // :cond_0
/* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
final String v3 = "propertyValuesHolder"; // const-string v3, "propertyValuesHolder"
/* .line 133 */
v0 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 134 */
v0 = c.w.a.a.a.i;
/* move-object/from16 v11, p1 */
/* move-object/from16 v12, p2 */
/* move-object/from16 v13, p4 */
c.h.f.i.t .a ( v11,v12,v13,v0 );
final String v0 = "propertyName"; // const-string v0, "propertyName"
/* .line 135 */
c.h.f.i.t .a ( v14,v6,v0,v1 );
int v0 = 4; // const/4 v0, 0x4
final String v1 = "valueType"; // const-string v1, "valueType"
/* .line 136 */
v5 = c.h.f.i.t .b ( v14,v6,v1,v2,v0 );
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* move-object/from16 v2, p2 */
/* move-object/from16 v3, p3 */
/* move-object v4, v15 */
/* move/from16 v16, v5 */
/* .line 137 */
/* invoke-static/range {v0 ..v5}, Lc/w/a/a/j;->a(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Landroid/animation/PropertyValuesHolder; */
/* if-nez v0, :cond_1 */
/* move/from16 v1, v16 */
/* .line 138 */
c.w.a.a.j .a ( v14,v1,v9,v10,v15 );
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_3
/* if-nez v8, :cond_2 */
/* .line 139 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* move-object v8, v1 */
/* .line 140 */
} // :cond_2
(( java.util.ArrayList ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 141 */
} // :cond_3
(( android.content.res.TypedArray ) v14 ).recycle ( ); // invoke-virtual {v14}, Landroid/content/res/TypedArray;->recycle()V
} // :cond_4
/* move-object/from16 v11, p1 */
/* move-object/from16 v12, p2 */
/* move-object/from16 v13, p4 */
/* .line 142 */
} // :goto_1
/* invoke-interface/range {p3 ..p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I */
} // :cond_5
if ( v8 != null) { // if-eqz v8, :cond_6
/* .line 143 */
v0 = (( java.util.ArrayList ) v8 ).size ( ); // invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
/* .line 144 */
/* new-array v7, v0, [Landroid/animation/PropertyValuesHolder; */
} // :goto_2
/* if-ge v9, v0, :cond_6 */
/* .line 145 */
(( java.util.ArrayList ) v8 ).get ( v9 ); // invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/animation/PropertyValuesHolder; */
/* aput-object v1, v7, v9 */
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_6
} // .end method
