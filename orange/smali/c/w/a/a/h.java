public abstract class c.w.a.a.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.view.animation.Interpolator a ( android.content.Context p0, Integer p1 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/content/res/Resources$NotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* const/16 v1, 0x15 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 2 */
	 android.view.animation.AnimationUtils .loadInterpolator ( p0,p1 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* const v1, 0x10c000f */
final String v2 = "Can\'t load animation resource ID #0x"; // const-string v2, "Can\'t load animation resource ID #0x"
/* if-ne p1, v1, :cond_1 */
/* .line 3 */
try { // :try_start_0
	 /* new-instance p0, Lc/m/a/a/a; */
	 /* invoke-direct {p0}, Lc/m/a/a/a;-><init>()V */
	 /* :catchall_0 */
	 /* move-exception p0 */
	 /* :catch_0 */
	 /* move-exception p0 */
	 /* :catch_1 */
	 /* move-exception p0 */
} // :cond_1
/* const v1, 0x10c000d */
/* if-ne p1, v1, :cond_2 */
/* .line 4 */
/* new-instance p0, Lc/m/a/a/b; */
/* invoke-direct {p0}, Lc/m/a/a/b;-><init>()V */
} // :cond_2
/* const v1, 0x10c000e */
/* if-ne p1, v1, :cond_3 */
/* .line 5 */
/* new-instance p0, Lc/m/a/a/c; */
/* invoke-direct {p0}, Lc/m/a/a/c;-><init>()V */
/* .line 6 */
} // :cond_3
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getAnimation ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getAnimation(I)Landroid/content/res/XmlResourceParser;
/* .line 7 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.Context ) p0 ).getTheme ( ); // invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
c.w.a.a.h .a ( p0,v1,v3,v0 );
/* :try_end_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 8 */
} // :cond_4
/* .line 9 */
} // :goto_0
try { // :try_start_1
/* new-instance v1, Landroid/content/res/Resources$NotFoundException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 10 */
java.lang.Integer .toHexString ( p1 );
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V */
/* .line 11 */
(( android.content.res.Resources$NotFoundException ) v1 ).initCause ( p0 ); // invoke-virtual {v1, p0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* .line 12 */
/* throw v1 */
/* .line 13 */
} // :goto_1
/* new-instance v1, Landroid/content/res/Resources$NotFoundException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 14 */
java.lang.Integer .toHexString ( p1 );
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V */
/* .line 15 */
(( android.content.res.Resources$NotFoundException ) v1 ).initCause ( p0 ); // invoke-virtual {v1, p0}, Landroid/content/res/Resources$NotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* .line 16 */
/* throw v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 17 */
/* .line 18 */
} // :cond_5
/* throw p0 */
} // .end method
public static android.view.animation.Interpolator a ( android.content.Context p0, android.content.res.Resources p1, android.content.res.Resources$Theme p2, org.xmlpull.v1.XmlPullParser p3 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
p1 = /* .line 19 */
int p2 = 0; // const/4 p2, 0x0
/* .line 20 */
v0 = } // :goto_0
int v1 = 3; // const/4 v1, 0x3
v1 = /* if-ne v0, v1, :cond_0 */
/* if-le v1, p1, :cond_c */
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_c */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_1 */
/* .line 21 */
} // :cond_1
android.util.Xml .asAttributeSet ( p3 );
/* .line 22 */
final String v1 = "linearInterpolator"; // const-string v1, "linearInterpolator"
/* .line 23 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 24 */
/* new-instance p2, Landroid/view/animation/LinearInterpolator; */
/* invoke-direct {p2}, Landroid/view/animation/LinearInterpolator;-><init>()V */
} // :cond_2
final String v1 = "accelerateInterpolator"; // const-string v1, "accelerateInterpolator"
/* .line 25 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 26 */
/* new-instance v0, Landroid/view/animation/AccelerateInterpolator; */
/* invoke-direct {v0, p0, p2}, Landroid/view/animation/AccelerateInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // :goto_1
/* move-object p2, v0 */
} // :cond_3
final String v1 = "decelerateInterpolator"; // const-string v1, "decelerateInterpolator"
/* .line 27 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 28 */
/* new-instance v0, Landroid/view/animation/DecelerateInterpolator; */
/* invoke-direct {v0, p0, p2}, Landroid/view/animation/DecelerateInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // :cond_4
final String v1 = "accelerateDecelerateInterpolator"; // const-string v1, "accelerateDecelerateInterpolator"
/* .line 29 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 30 */
/* new-instance p2, Landroid/view/animation/AccelerateDecelerateInterpolator; */
/* invoke-direct {p2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V */
} // :cond_5
final String v1 = "cycleInterpolator"; // const-string v1, "cycleInterpolator"
/* .line 31 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 32 */
/* new-instance v0, Landroid/view/animation/CycleInterpolator; */
/* invoke-direct {v0, p0, p2}, Landroid/view/animation/CycleInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // :cond_6
final String v1 = "anticipateInterpolator"; // const-string v1, "anticipateInterpolator"
/* .line 33 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 34 */
/* new-instance v0, Landroid/view/animation/AnticipateInterpolator; */
/* invoke-direct {v0, p0, p2}, Landroid/view/animation/AnticipateInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // :cond_7
final String v1 = "overshootInterpolator"; // const-string v1, "overshootInterpolator"
/* .line 35 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 36 */
/* new-instance v0, Landroid/view/animation/OvershootInterpolator; */
/* invoke-direct {v0, p0, p2}, Landroid/view/animation/OvershootInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // :cond_8
final String v1 = "anticipateOvershootInterpolator"; // const-string v1, "anticipateOvershootInterpolator"
/* .line 37 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 38 */
/* new-instance v0, Landroid/view/animation/AnticipateOvershootInterpolator; */
/* invoke-direct {v0, p0, p2}, Landroid/view/animation/AnticipateOvershootInterpolator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // :cond_9
final String v1 = "bounceInterpolator"; // const-string v1, "bounceInterpolator"
/* .line 39 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 40 */
/* new-instance p2, Landroid/view/animation/BounceInterpolator; */
/* invoke-direct {p2}, Landroid/view/animation/BounceInterpolator;-><init>()V */
/* goto/16 :goto_0 */
} // :cond_a
final String v1 = "pathInterpolator"; // const-string v1, "pathInterpolator"
/* .line 41 */
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 42 */
/* new-instance v0, Lc/w/a/a/l; */
/* invoke-direct {v0, p0, p2, p3}, Lc/w/a/a/l;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lorg/xmlpull/v1/XmlPullParser;)V */
/* .line 43 */
} // :cond_b
/* new-instance p0, Ljava/lang/RuntimeException; */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String p2 = "Unknown interpolator name: "; // const-string p2, "Unknown interpolator name: "
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // :cond_c
} // .end method
