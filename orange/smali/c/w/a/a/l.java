public class c.w.a.a.l implements android.view.animation.Interpolator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public a;
	 public b;
	 /* # direct methods */
	 public c.w.a.a.l ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.Context ) p1 ).getTheme ( ); // invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
		 /* invoke-direct {p0, v0, p1, p2, p3}, Lc/w/a/a/l;-><init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Lorg/xmlpull/v1/XmlPullParser;)V */
		 return;
	 } // .end method
	 public c.w.a.a.l ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 3 */
		 v0 = c.w.a.a.a.l;
		 c.h.f.i.t .a ( p1,p2,p3,v0 );
		 /* .line 4 */
		 (( c.w.a.a.l ) p0 ).a ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Lc/w/a/a/l;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V
		 /* .line 5 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 /* .line 19 */
		 /* new-instance v0, Landroid/graphics/Path; */
		 /* invoke-direct {v0}, Landroid/graphics/Path;-><init>()V */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 20 */
		 (( android.graphics.Path ) v0 ).moveTo ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/graphics/Path;->moveTo(FF)V
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* .line 21 */
		 (( android.graphics.Path ) v0 ).quadTo ( p1, p2, v1, v1 ); // invoke-virtual {v0, p1, p2, v1, v1}, Landroid/graphics/Path;->quadTo(FFFF)V
		 /* .line 22 */
		 (( c.w.a.a.l ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/w/a/a/l;->a(Landroid/graphics/Path;)V
		 return;
	 } // .end method
	 public final void a ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 8 */
		 /* .line 23 */
		 /* new-instance v7, Landroid/graphics/Path; */
		 /* invoke-direct {v7}, Landroid/graphics/Path;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 24 */
		 (( android.graphics.Path ) v7 ).moveTo ( v0, v0 ); // invoke-virtual {v7, v0, v0}, Landroid/graphics/Path;->moveTo(FF)V
		 /* const/high16 v5, 0x3f800000 # 1.0f */
		 /* const/high16 v6, 0x3f800000 # 1.0f */
		 /* move-object v0, v7 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* .line 25 */
		 /* invoke-virtual/range {v0 ..v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
		 /* .line 26 */
		 (( c.w.a.a.l ) p0 ).a ( v7 ); // invoke-virtual {p0, v7}, Lc/w/a/a/l;->a(Landroid/graphics/Path;)V
		 return;
	 } // .end method
	 public final void a ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1 ) {
		 /* .locals 7 */
		 final String v0 = "pathData"; // const-string v0, "pathData"
		 /* .line 1 */
		 v1 = 		 c.h.f.i.t .a ( p2,v0 );
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 int v1 = 4; // const/4 v1, 0x4
			 /* .line 2 */
			 c.h.f.i.t .a ( p1,p2,v0,v1 );
			 /* .line 3 */
			 c.h.g.e .b ( p1 );
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 /* .line 4 */
				 (( c.w.a.a.l ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/w/a/a/l;->a(Landroid/graphics/Path;)V
				 /* .line 5 */
			 } // :cond_0
			 /* new-instance p2, Landroid/view/InflateException; */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v1 = "The path is null, which is created from "; // const-string v1, "The path is null, which is created from "
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {p2, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
			 /* throw p2 */
		 } // :cond_1
		 final String v0 = "controlX1"; // const-string v0, "controlX1"
		 /* .line 6 */
		 v1 = 		 c.h.f.i.t .a ( p2,v0 );
		 if ( v1 != null) { // if-eqz v1, :cond_5
			 final String v1 = "controlY1"; // const-string v1, "controlY1"
			 /* .line 7 */
			 v2 = 			 c.h.f.i.t .a ( p2,v1 );
			 if ( v2 != null) { // if-eqz v2, :cond_4
				 int v2 = 0; // const/4 v2, 0x0
				 int v3 = 0; // const/4 v3, 0x0
				 /* .line 8 */
				 v0 = 				 c.h.f.i.t .a ( p1,p2,v0,v2,v3 );
				 int v2 = 1; // const/4 v2, 0x1
				 /* .line 9 */
				 v1 = 				 c.h.f.i.t .a ( p1,p2,v1,v2,v3 );
				 final String v2 = "controlX2"; // const-string v2, "controlX2"
				 /* .line 10 */
				 v4 = 				 c.h.f.i.t .a ( p2,v2 );
				 final String v5 = "controlY2"; // const-string v5, "controlY2"
				 /* .line 11 */
				 v6 = 				 c.h.f.i.t .a ( p2,v5 );
				 /* if-ne v4, v6, :cond_3 */
				 /* if-nez v4, :cond_2 */
				 /* .line 12 */
				 (( c.w.a.a.l ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/w/a/a/l;->a(FF)V
			 } // :cond_2
			 int v4 = 2; // const/4 v4, 0x2
			 /* .line 13 */
			 v2 = 			 c.h.f.i.t .a ( p1,p2,v2,v4,v3 );
			 int v4 = 3; // const/4 v4, 0x3
			 /* .line 14 */
			 p1 = 			 c.h.f.i.t .a ( p1,p2,v5,v4,v3 );
			 /* .line 15 */
			 (( c.w.a.a.l ) p0 ).a ( v0, v1, v2, p1 ); // invoke-virtual {p0, v0, v1, v2, p1}, Lc/w/a/a/l;->a(FFFF)V
		 } // :goto_0
		 return;
		 /* .line 16 */
	 } // :cond_3
	 /* new-instance p1, Landroid/view/InflateException; */
	 final String p2 = "pathInterpolator requires both controlX2 and controlY2 for cubic Beziers."; // const-string p2, "pathInterpolator requires both controlX2 and controlY2 for cubic Beziers."
	 /* invoke-direct {p1, p2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
	 /* .line 17 */
} // :cond_4
/* new-instance p1, Landroid/view/InflateException; */
final String p2 = "pathInterpolator requires the controlY1 attribute"; // const-string p2, "pathInterpolator requires the controlY1 attribute"
/* invoke-direct {p1, p2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 18 */
} // :cond_5
/* new-instance p1, Landroid/view/InflateException; */
final String p2 = "pathInterpolator requires the controlX1 attribute"; // const-string p2, "pathInterpolator requires the controlX1 attribute"
/* invoke-direct {p1, p2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void a ( android.graphics.Path p0 ) {
/* .locals 10 */
/* .line 27 */
/* new-instance v0, Landroid/graphics/PathMeasure; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p1, v1}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V */
/* .line 28 */
p1 = (( android.graphics.PathMeasure ) v0 ).getLength ( ); // invoke-virtual {v0}, Landroid/graphics/PathMeasure;->getLength()F
/* const v2, 0x3b03126f # 0.002f */
/* div-float v2, p1, v2 */
/* float-to-int v2, v2 */
int v3 = 1; // const/4 v3, 0x1
/* add-int/2addr v2, v3 */
/* const/16 v4, 0xbb8 */
/* .line 29 */
v2 = java.lang.Math .min ( v4,v2 );
/* if-lez v2, :cond_5 */
/* .line 30 */
/* new-array v4, v2, [F */
this.a = v4;
/* .line 31 */
/* new-array v4, v2, [F */
this.b = v4;
int v4 = 2; // const/4 v4, 0x2
/* new-array v4, v4, [F */
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v5, v2, :cond_0 */
/* int-to-float v6, v5 */
/* mul-float v6, v6, p1 */
/* add-int/lit8 v7, v2, -0x1 */
/* int-to-float v7, v7 */
/* div-float/2addr v6, v7 */
int v7 = 0; // const/4 v7, 0x0
/* .line 32 */
(( android.graphics.PathMeasure ) v0 ).getPosTan ( v6, v4, v7 ); // invoke-virtual {v0, v6, v4, v7}, Landroid/graphics/PathMeasure;->getPosTan(F[F[F)Z
/* .line 33 */
v6 = this.a;
/* aget v7, v4, v1 */
/* aput v7, v6, v5 */
/* .line 34 */
v6 = this.b;
/* aget v7, v4, v3 */
/* aput v7, v6, v5 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 35 */
} // :cond_0
p1 = this.a;
/* aget p1, p1, v1 */
p1 = java.lang.Math .abs ( p1 );
/* float-to-double v4, p1 */
/* const-wide v6, 0x3ee4f8b588e368f1L # 1.0E-5 */
/* cmpl-double p1, v4, v6 */
/* if-gtz p1, :cond_4 */
p1 = this.b;
/* aget p1, p1, v1 */
p1 = java.lang.Math .abs ( p1 );
/* float-to-double v4, p1 */
/* cmpl-double p1, v4, v6 */
/* if-gtz p1, :cond_4 */
p1 = this.a;
/* add-int/lit8 v4, v2, -0x1 */
/* aget p1, p1, v4 */
/* const/high16 v5, 0x3f800000 # 1.0f */
/* sub-float/2addr p1, v5 */
p1 = java.lang.Math .abs ( p1 );
/* float-to-double v8, p1 */
/* cmpl-double p1, v8, v6 */
/* if-gtz p1, :cond_4 */
p1 = this.b;
/* aget p1, p1, v4 */
/* sub-float/2addr p1, v5 */
/* .line 36 */
p1 = java.lang.Math .abs ( p1 );
/* float-to-double v4, p1 */
/* cmpl-double p1, v4, v6 */
/* if-gtz p1, :cond_4 */
int p1 = 0; // const/4 p1, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-ge v1, v2, :cond_2 */
/* .line 37 */
v4 = this.a;
/* add-int/lit8 v5, v3, 0x1 */
/* aget v3, v4, v3 */
/* cmpg-float p1, v3, p1 */
/* if-ltz p1, :cond_1 */
/* .line 38 */
/* aput v3, v4, v1 */
/* add-int/lit8 v1, v1, 0x1 */
/* move p1, v3 */
/* move v3, v5 */
/* .line 39 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "The Path cannot loop back on itself, x :"; // const-string v1, "The Path cannot loop back on itself, x :"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 40 */
} // :cond_2
p1 = (( android.graphics.PathMeasure ) v0 ).nextContour ( ); // invoke-virtual {v0}, Landroid/graphics/PathMeasure;->nextContour()Z
/* if-nez p1, :cond_3 */
return;
/* .line 41 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "The Path should be continuous, can\'t have 2+ contours"; // const-string v0, "The Path should be continuous, can\'t have 2+ contours"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 42 */
} // :cond_4
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "The Path must start at (0,0) and end at (1,1) start: "; // const-string v4, "The Path must start at (0,0) and end at (1,1) start: "
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.a;
/* aget v4, v4, v1 */
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v4 = ","; // const-string v4, ","
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v5 = this.b;
/* aget v1, v5, v1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = " end:"; // const-string v1, " end:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
/* sub-int/2addr v2, v3 */
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 43 */
} // :cond_5
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "The Path has a invalid length "; // const-string v2, "The Path has a invalid length "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Float getInterpolation ( Float p0 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* cmpg-float v1, p1, v0 */
/* if-gtz v1, :cond_0 */
} // :cond_0
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v2, p1, v1 */
/* if-ltz v2, :cond_1 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
v2 = this.a;
/* array-length v2, v2 */
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v2, v3 */
} // :goto_0
/* sub-int v4, v2, v1 */
/* if-le v4, v3, :cond_3 */
/* add-int v4, v1, v2 */
/* .line 2 */
/* div-int/lit8 v4, v4, 0x2 */
/* .line 3 */
v5 = this.a;
/* aget v5, v5, v4 */
/* cmpg-float v5, p1, v5 */
/* if-gez v5, :cond_2 */
/* move v2, v4 */
} // :cond_2
/* move v1, v4 */
/* .line 4 */
} // :cond_3
v3 = this.a;
/* aget v4, v3, v2 */
/* aget v5, v3, v1 */
/* sub-float/2addr v4, v5 */
/* cmpl-float v0, v4, v0 */
/* if-nez v0, :cond_4 */
/* .line 5 */
p1 = this.b;
/* aget p1, p1, v1 */
/* .line 6 */
} // :cond_4
/* aget v0, v3, v1 */
/* sub-float/2addr p1, v0 */
/* div-float/2addr p1, v4 */
/* .line 7 */
v0 = this.b;
/* aget v1, v0, v1 */
/* .line 8 */
/* aget v0, v0, v2 */
/* sub-float/2addr v0, v1 */
/* mul-float p1, p1, v0 */
/* add-float/2addr v1, p1 */
} // .end method
