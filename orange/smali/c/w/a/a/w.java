public class c.w.a.a.w extends c.w.a.a.m {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final android.graphics.PorterDuff$Mode k;
	 /* # instance fields */
	 public c.w.a.a.u c;
	 public android.graphics.PorterDuffColorFilter d;
	 public android.graphics.ColorFilter e;
	 public Boolean f;
	 public Boolean g;
	 public final h;
	 public final android.graphics.Matrix i;
	 public final android.graphics.Rect j;
	 /* # direct methods */
	 public static c.w.a.a.w ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = android.graphics.PorterDuff$Mode.SRC_IN;
		 return;
	 } // .end method
	 public c.w.a.a.w ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/w/a/a/m;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lc/w/a/a/w;->g:Z */
		 /* const/16 v0, 0x9 */
		 /* new-array v0, v0, [F */
		 /* .line 3 */
		 this.h = v0;
		 /* .line 4 */
		 /* new-instance v0, Landroid/graphics/Matrix; */
		 /* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
		 this.i = v0;
		 /* .line 5 */
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.j = v0;
		 /* .line 6 */
		 /* new-instance v0, Lc/w/a/a/u; */
		 /* invoke-direct {v0}, Lc/w/a/a/u;-><init>()V */
		 this.c = v0;
		 return;
	 } // .end method
	 public c.w.a.a.w ( ) {
		 /* .locals 2 */
		 /* .line 7 */
		 /* invoke-direct {p0}, Lc/w/a/a/m;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 8 */
		 /* iput-boolean v0, p0, Lc/w/a/a/w;->g:Z */
		 /* const/16 v0, 0x9 */
		 /* new-array v0, v0, [F */
		 /* .line 9 */
		 this.h = v0;
		 /* .line 10 */
		 /* new-instance v0, Landroid/graphics/Matrix; */
		 /* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
		 this.i = v0;
		 /* .line 11 */
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.j = v0;
		 /* .line 12 */
		 this.c = p1;
		 /* .line 13 */
		 v0 = this.d;
		 v1 = this.c;
		 p1 = this.d;
		 (( c.w.a.a.w ) p0 ).a ( v0, v1, p1 ); // invoke-virtual {p0, v0, v1, p1}, Lc/w/a/a/w;->a(Landroid/graphics/PorterDuffColorFilter;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
		 this.d = p1;
		 return;
	 } // .end method
	 public static Integer a ( Integer p0, Float p1 ) {
		 /* .locals 2 */
		 /* .line 16 */
		 v0 = 		 android.graphics.Color .alpha ( p0 );
		 /* const v1, 0xffffff */
		 /* and-int/2addr p0, v1 */
		 /* int-to-float v0, v0 */
		 /* mul-float v0, v0, p1 */
		 /* float-to-int p1, v0 */
		 /* shl-int/lit8 p1, p1, 0x18 */
		 /* or-int/2addr p0, p1 */
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
		 /* .line 17 */
		 /* :pswitch_0 */
		 p0 = android.graphics.PorterDuff$Mode.ADD;
		 /* .line 18 */
		 /* :pswitch_1 */
		 p0 = android.graphics.PorterDuff$Mode.SCREEN;
		 /* .line 19 */
		 /* :pswitch_2 */
		 p0 = android.graphics.PorterDuff$Mode.MULTIPLY;
		 /* .line 20 */
	 } // :cond_0
	 p0 = android.graphics.PorterDuff$Mode.SRC_ATOP;
	 /* .line 21 */
} // :cond_1
p0 = android.graphics.PorterDuff$Mode.SRC_IN;
/* .line 22 */
} // :cond_2
p0 = android.graphics.PorterDuff$Mode.SRC_OVER;
/* :pswitch_data_0 */
/* .packed-switch 0xe */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static c.w.a.a.w a ( android.content.res.Resources p0, Integer p1, android.content.res.Resources$Theme p2 ) {
/* .locals 6 */
final String v0 = "parser error"; // const-string v0, "parser error"
final String v1 = "VectorDrawableCompat"; // const-string v1, "VectorDrawableCompat"
/* .line 4 */
/* const/16 v3, 0x18 */
/* if-lt v2, v3, :cond_0 */
/* .line 5 */
/* new-instance v0, Lc/w/a/a/w; */
/* invoke-direct {v0}, Lc/w/a/a/w;-><init>()V */
/* .line 6 */
c.h.f.i.s .c ( p0,p1,p2 );
this.b = p0;
/* .line 7 */
/* new-instance p0, Lc/w/a/a/v; */
p1 = this.b;
/* .line 8 */
(( android.graphics.drawable.Drawable ) p1 ).getConstantState ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
/* invoke-direct {p0, p1}, Lc/w/a/a/v;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V */
/* .line 9 */
} // :cond_0
try { // :try_start_0
(( android.content.res.Resources ) p0 ).getXml ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;
/* .line 10 */
android.util.Xml .asAttributeSet ( p1 );
/* .line 11 */
v3 = } // :goto_0
int v4 = 2; // const/4 v4, 0x2
/* if-eq v3, v4, :cond_1 */
int v5 = 1; // const/4 v5, 0x1
/* if-eq v3, v5, :cond_1 */
} // :cond_1
/* if-ne v3, v4, :cond_2 */
/* .line 12 */
c.w.a.a.w .createFromXmlInner ( p0,p1,v2,p2 );
/* .line 13 */
} // :cond_2
/* new-instance p0, Lorg/xmlpull/v1/XmlPullParserException; */
final String p1 = "No start tag found"; // const-string p1, "No start tag found"
/* invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* :try_end_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 14 */
android.util.Log .e ( v1,v0,p0 );
/* :catch_1 */
/* move-exception p0 */
/* .line 15 */
android.util.Log .e ( v1,v0,p0 );
} // :goto_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static c.w.a.a.w createFromXmlInner ( android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources$Theme p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lc/w/a/a/w; */
/* invoke-direct {v0}, Lc/w/a/a/w;-><init>()V */
/* .line 2 */
(( c.w.a.a.w ) v0 ).inflate ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lc/w/a/a/w;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
} // .end method
/* # virtual methods */
public android.graphics.PorterDuffColorFilter a ( android.graphics.PorterDuffColorFilter p0, android.content.res.ColorStateList p1, android.graphics.PorterDuff$Mode p2 ) {
/* .locals 1 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* if-nez p3, :cond_0 */
/* .line 2 */
} // :cond_0
(( c.w.a.a.m ) p0 ).getState ( ); // invoke-virtual {p0}, Lc/w/a/a/m;->getState()[I
int v0 = 0; // const/4 v0, 0x0
p1 = (( android.content.res.ColorStateList ) p2 ).getColorForState ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I
/* .line 3 */
/* new-instance p2, Landroid/graphics/PorterDuffColorFilter; */
/* invoke-direct {p2, p1, p3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V */
} // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.Object a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
v0 = this.b;
v0 = this.p;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public final void a ( android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources$Theme p3 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 46 */
v0 = this.c;
/* .line 47 */
v1 = this.b;
/* .line 48 */
/* new-instance v2, Ljava/util/ArrayDeque; */
/* invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V */
/* .line 49 */
v3 = this.h;
(( java.util.ArrayDeque ) v2 ).push ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V
v3 = /* .line 50 */
v4 = /* .line 51 */
int v5 = 1; // const/4 v5, 0x1
/* add-int/2addr v4, v5 */
int v6 = 1; // const/4 v6, 0x1
} // :goto_0
/* if-eq v3, v5, :cond_8 */
v7 = /* .line 52 */
int v8 = 3; // const/4 v8, 0x3
/* if-ge v7, v4, :cond_0 */
/* if-eq v3, v8, :cond_8 */
} // :cond_0
int v7 = 2; // const/4 v7, 0x2
final String v9 = "group"; // const-string v9, "group"
/* if-ne v3, v7, :cond_6 */
/* .line 53 */
/* .line 54 */
(( java.util.ArrayDeque ) v2 ).peek ( ); // invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;
/* check-cast v7, Lc/w/a/a/q; */
final String v8 = "path"; // const-string v8, "path"
/* .line 55 */
v8 = (( java.lang.String ) v8 ).equals ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_2
/* .line 56 */
/* new-instance v3, Lc/w/a/a/p; */
/* invoke-direct {v3}, Lc/w/a/a/p;-><init>()V */
/* .line 57 */
(( c.w.a.a.p ) v3 ).a ( p1, p3, p4, p2 ); // invoke-virtual {v3, p1, p3, p4, p2}, Lc/w/a/a/p;->a(Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
/* .line 58 */
v6 = this.b;
(( java.util.ArrayList ) v6 ).add ( v3 ); // invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 59 */
(( c.w.a.a.s ) v3 ).getPathName ( ); // invoke-virtual {v3}, Lc/w/a/a/s;->getPathName()Ljava/lang/String;
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 60 */
v6 = this.p;
(( c.w.a.a.s ) v3 ).getPathName ( ); // invoke-virtual {v3}, Lc/w/a/a/s;->getPathName()Ljava/lang/String;
(( c.e.i ) v6 ).put ( v7, v3 ); // invoke-virtual {v6, v7, v3}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_1
int v6 = 0; // const/4 v6, 0x0
/* .line 61 */
/* iget v7, v0, Lc/w/a/a/u;->a:I */
/* iget v3, v3, Lc/w/a/a/s;->d:I */
/* or-int/2addr v3, v7 */
/* iput v3, v0, Lc/w/a/a/u;->a:I */
} // :cond_2
final String v8 = "clip-path"; // const-string v8, "clip-path"
/* .line 62 */
v8 = (( java.lang.String ) v8 ).equals ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_4
/* .line 63 */
/* new-instance v3, Lc/w/a/a/o; */
/* invoke-direct {v3}, Lc/w/a/a/o;-><init>()V */
/* .line 64 */
(( c.w.a.a.o ) v3 ).a ( p1, p3, p4, p2 ); // invoke-virtual {v3, p1, p3, p4, p2}, Lc/w/a/a/o;->a(Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
/* .line 65 */
v7 = this.b;
(( java.util.ArrayList ) v7 ).add ( v3 ); // invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 66 */
(( c.w.a.a.s ) v3 ).getPathName ( ); // invoke-virtual {v3}, Lc/w/a/a/s;->getPathName()Ljava/lang/String;
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 67 */
v7 = this.p;
(( c.w.a.a.s ) v3 ).getPathName ( ); // invoke-virtual {v3}, Lc/w/a/a/s;->getPathName()Ljava/lang/String;
(( c.e.i ) v7 ).put ( v8, v3 ); // invoke-virtual {v7, v8, v3}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 68 */
} // :cond_3
/* iget v7, v0, Lc/w/a/a/u;->a:I */
/* iget v3, v3, Lc/w/a/a/s;->d:I */
/* or-int/2addr v3, v7 */
/* iput v3, v0, Lc/w/a/a/u;->a:I */
/* .line 69 */
} // :cond_4
v3 = (( java.lang.String ) v9 ).equals ( v3 ); // invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 70 */
/* new-instance v3, Lc/w/a/a/q; */
/* invoke-direct {v3}, Lc/w/a/a/q;-><init>()V */
/* .line 71 */
(( c.w.a.a.q ) v3 ).a ( p1, p3, p4, p2 ); // invoke-virtual {v3, p1, p3, p4, p2}, Lc/w/a/a/q;->a(Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
/* .line 72 */
v7 = this.b;
(( java.util.ArrayList ) v7 ).add ( v3 ); // invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 73 */
(( java.util.ArrayDeque ) v2 ).push ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V
/* .line 74 */
(( c.w.a.a.q ) v3 ).getGroupName ( ); // invoke-virtual {v3}, Lc/w/a/a/q;->getGroupName()Ljava/lang/String;
if ( v7 != null) { // if-eqz v7, :cond_5
/* .line 75 */
v7 = this.p;
(( c.w.a.a.q ) v3 ).getGroupName ( ); // invoke-virtual {v3}, Lc/w/a/a/q;->getGroupName()Ljava/lang/String;
(( c.e.i ) v7 ).put ( v8, v3 ); // invoke-virtual {v7, v8, v3}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 76 */
} // :cond_5
/* iget v7, v0, Lc/w/a/a/u;->a:I */
/* iget v3, v3, Lc/w/a/a/q;->k:I */
/* or-int/2addr v3, v7 */
/* iput v3, v0, Lc/w/a/a/u;->a:I */
} // :cond_6
/* if-ne v3, v8, :cond_7 */
/* .line 77 */
/* .line 78 */
v3 = (( java.lang.String ) v9 ).equals ( v3 ); // invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 79 */
(( java.util.ArrayDeque ) v2 ).pop ( ); // invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;
/* .line 80 */
} // :cond_7
v3 = } // :goto_1
/* goto/16 :goto_0 */
} // :cond_8
/* if-nez v6, :cond_9 */
return;
/* .line 81 */
} // :cond_9
/* new-instance p1, Lorg/xmlpull/v1/XmlPullParserException; */
final String p2 = "no path defined"; // const-string p2, "no path defined"
/* invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void a ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1, android.content.res.Resources$Theme p2 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException; */
/* } */
} // .end annotation
/* .line 23 */
v0 = this.c;
/* .line 24 */
v1 = this.b;
final String v2 = "tintMode"; // const-string v2, "tintMode"
int v3 = 6; // const/4 v3, 0x6
int v4 = -1; // const/4 v4, -0x1
/* .line 25 */
v2 = c.h.f.i.t .b ( p1,p2,v2,v3,v4 );
/* .line 26 */
v3 = android.graphics.PorterDuff$Mode.SRC_IN;
c.w.a.a.w .a ( v2,v3 );
this.d = v2;
final String v2 = "tint"; // const-string v2, "tint"
int v3 = 1; // const/4 v3, 0x1
/* .line 27 */
c.h.f.i.t .a ( p1,p2,p3,v2,v3 );
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 28 */
this.c = p3;
} // :cond_0
int p3 = 5; // const/4 p3, 0x5
/* .line 29 */
/* iget-boolean v2, v0, Lc/w/a/a/u;->e:Z */
final String v3 = "autoMirrored"; // const-string v3, "autoMirrored"
p3 = c.h.f.i.t .a ( p1,p2,v3,p3,v2 );
/* iput-boolean p3, v0, Lc/w/a/a/u;->e:Z */
int p3 = 7; // const/4 p3, 0x7
/* .line 30 */
/* iget v0, v1, Lc/w/a/a/t;->k:F */
final String v2 = "viewportWidth"; // const-string v2, "viewportWidth"
p3 = c.h.f.i.t .a ( p1,p2,v2,p3,v0 );
/* iput p3, v1, Lc/w/a/a/t;->k:F */
/* const/16 p3, 0x8 */
/* .line 31 */
/* iget v0, v1, Lc/w/a/a/t;->l:F */
final String v2 = "viewportHeight"; // const-string v2, "viewportHeight"
p3 = c.h.f.i.t .a ( p1,p2,v2,p3,v0 );
/* iput p3, v1, Lc/w/a/a/t;->l:F */
/* .line 32 */
/* iget v0, v1, Lc/w/a/a/t;->k:F */
int v2 = 0; // const/4 v2, 0x0
/* cmpg-float v0, v0, v2 */
/* if-lez v0, :cond_5 */
/* cmpg-float p3, p3, v2 */
/* if-lez p3, :cond_4 */
int p3 = 3; // const/4 p3, 0x3
/* .line 33 */
/* iget v0, v1, Lc/w/a/a/t;->i:F */
p3 = (( android.content.res.TypedArray ) p1 ).getDimension ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F
/* iput p3, v1, Lc/w/a/a/t;->i:F */
int p3 = 2; // const/4 p3, 0x2
/* .line 34 */
/* iget v0, v1, Lc/w/a/a/t;->j:F */
p3 = (( android.content.res.TypedArray ) p1 ).getDimension ( p3, v0 ); // invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F
/* iput p3, v1, Lc/w/a/a/t;->j:F */
/* .line 35 */
/* iget v0, v1, Lc/w/a/a/t;->i:F */
/* cmpg-float v0, v0, v2 */
/* if-lez v0, :cond_3 */
/* cmpg-float p3, p3, v2 */
/* if-lez p3, :cond_2 */
int p3 = 4; // const/4 p3, 0x4
/* .line 36 */
v0 = (( c.w.a.a.t ) v1 ).getAlpha ( ); // invoke-virtual {v1}, Lc/w/a/a/t;->getAlpha()F
final String v2 = "alpha"; // const-string v2, "alpha"
/* .line 37 */
p2 = c.h.f.i.t .a ( p1,p2,v2,p3,v0 );
/* .line 38 */
(( c.w.a.a.t ) v1 ).setAlpha ( p2 ); // invoke-virtual {v1, p2}, Lc/w/a/a/t;->setAlpha(F)V
int p2 = 0; // const/4 p2, 0x0
/* .line 39 */
(( android.content.res.TypedArray ) p1 ).getString ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 40 */
this.n = p1;
/* .line 41 */
p2 = this.p;
(( c.e.i ) p2 ).put ( p1, v1 ); // invoke-virtual {p2, p1, v1}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_1
return;
/* .line 42 */
} // :cond_2
/* new-instance p2, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
(( android.content.res.TypedArray ) p1 ).getPositionDescription ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "<vector> tag requires height > 0"; // const-string p1, "<vector> tag requires height > 0"
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 43 */
} // :cond_3
/* new-instance p2, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
(( android.content.res.TypedArray ) p1 ).getPositionDescription ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "<vector> tag requires width > 0"; // const-string p1, "<vector> tag requires width > 0"
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 44 */
} // :cond_4
/* new-instance p2, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
(( android.content.res.TypedArray ) p1 ).getPositionDescription ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "<vector> tag requires viewportHeight > 0"; // const-string p1, "<vector> tag requires viewportHeight > 0"
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 45 */
} // :cond_5
/* new-instance p2, Lorg/xmlpull/v1/XmlPullParserException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
(( android.content.res.TypedArray ) p1 ).getPositionDescription ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "<vector> tag requires viewportWidth > 0"; // const-string p1, "<vector> tag requires viewportWidth > 0"
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* .line 82 */
/* iput-boolean p1, p0, Lc/w/a/a/w;->g:Z */
return;
} // .end method
public final Boolean a ( ) {
/* .locals 3 */
/* .line 83 */
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x11 */
/* if-lt v0, v2, :cond_0 */
/* .line 84 */
v0 = (( c.w.a.a.w ) p0 ).isAutoMirrored ( ); // invoke-virtual {p0}, Lc/w/a/a/w;->isAutoMirrored()Z
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 85 */
v0 = c.h.g.r.a .d ( p0 );
/* if-ne v0, v2, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
} // .end method
public Boolean canApplyTheme ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .a ( v0 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 9 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
return;
/* .line 3 */
} // :cond_0
v0 = this.j;
(( android.graphics.drawable.Drawable ) p0 ).copyBounds ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V
/* .line 4 */
v0 = this.j;
v0 = (( android.graphics.Rect ) v0 ).width ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->width()I
/* if-lez v0, :cond_9 */
v0 = this.j;
v0 = (( android.graphics.Rect ) v0 ).height ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->height()I
/* if-gtz v0, :cond_1 */
/* goto/16 :goto_1 */
/* .line 5 */
} // :cond_1
v0 = this.e;
/* if-nez v0, :cond_2 */
v0 = this.d;
/* .line 6 */
} // :cond_2
v1 = this.i;
(( android.graphics.Canvas ) p1 ).getMatrix ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V
/* .line 7 */
v1 = this.i;
v2 = this.h;
(( android.graphics.Matrix ) v1 ).getValues ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->getValues([F)V
/* .line 8 */
v1 = this.h;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
v1 = java.lang.Math .abs ( v1 );
/* .line 9 */
v3 = this.h;
int v4 = 4; // const/4 v4, 0x4
/* aget v3, v3, v4 */
v3 = java.lang.Math .abs ( v3 );
/* .line 10 */
v4 = this.h;
int v5 = 1; // const/4 v5, 0x1
/* aget v4, v4, v5 */
v4 = java.lang.Math .abs ( v4 );
/* .line 11 */
v5 = this.h;
int v6 = 3; // const/4 v6, 0x3
/* aget v5, v5, v6 */
v5 = java.lang.Math .abs ( v5 );
/* const/high16 v6, 0x3f800000 # 1.0f */
int v7 = 0; // const/4 v7, 0x0
/* cmpl-float v4, v4, v7 */
/* if-nez v4, :cond_3 */
/* cmpl-float v4, v5, v7 */
if ( v4 != null) { // if-eqz v4, :cond_4
} // :cond_3
/* const/high16 v1, 0x3f800000 # 1.0f */
/* const/high16 v3, 0x3f800000 # 1.0f */
/* .line 12 */
} // :cond_4
v4 = this.j;
v4 = (( android.graphics.Rect ) v4 ).width ( ); // invoke-virtual {v4}, Landroid/graphics/Rect;->width()I
/* int-to-float v4, v4 */
/* mul-float v4, v4, v1 */
/* float-to-int v1, v4 */
/* .line 13 */
v4 = this.j;
v4 = (( android.graphics.Rect ) v4 ).height ( ); // invoke-virtual {v4}, Landroid/graphics/Rect;->height()I
/* int-to-float v4, v4 */
/* mul-float v4, v4, v3 */
/* float-to-int v3, v4 */
/* const/16 v4, 0x800 */
/* .line 14 */
v1 = java.lang.Math .min ( v4,v1 );
/* .line 15 */
v3 = java.lang.Math .min ( v4,v3 );
/* if-lez v1, :cond_9 */
/* if-gtz v3, :cond_5 */
/* .line 16 */
} // :cond_5
v4 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 17 */
v5 = this.j;
/* iget v8, v5, Landroid/graphics/Rect;->left:I */
/* int-to-float v8, v8 */
/* iget v5, v5, Landroid/graphics/Rect;->top:I */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).translate ( v8, v5 ); // invoke-virtual {p1, v8, v5}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 18 */
v5 = (( c.w.a.a.w ) p0 ).a ( ); // invoke-virtual {p0}, Lc/w/a/a/w;->a()Z
if ( v5 != null) { // if-eqz v5, :cond_6
/* .line 19 */
v5 = this.j;
v5 = (( android.graphics.Rect ) v5 ).width ( ); // invoke-virtual {v5}, Landroid/graphics/Rect;->width()I
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).translate ( v5, v7 ); // invoke-virtual {p1, v5, v7}, Landroid/graphics/Canvas;->translate(FF)V
/* const/high16 v5, -0x40800000 # -1.0f */
/* .line 20 */
(( android.graphics.Canvas ) p1 ).scale ( v5, v6 ); // invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->scale(FF)V
/* .line 21 */
} // :cond_6
v5 = this.j;
(( android.graphics.Rect ) v5 ).offsetTo ( v2, v2 ); // invoke-virtual {v5, v2, v2}, Landroid/graphics/Rect;->offsetTo(II)V
/* .line 22 */
v2 = this.c;
(( c.w.a.a.u ) v2 ).b ( v1, v3 ); // invoke-virtual {v2, v1, v3}, Lc/w/a/a/u;->b(II)V
/* .line 23 */
/* iget-boolean v2, p0, Lc/w/a/a/w;->g:Z */
/* if-nez v2, :cond_7 */
/* .line 24 */
v2 = this.c;
(( c.w.a.a.u ) v2 ).c ( v1, v3 ); // invoke-virtual {v2, v1, v3}, Lc/w/a/a/u;->c(II)V
/* .line 25 */
} // :cond_7
v2 = this.c;
v2 = (( c.w.a.a.u ) v2 ).a ( ); // invoke-virtual {v2}, Lc/w/a/a/u;->a()Z
/* if-nez v2, :cond_8 */
/* .line 26 */
v2 = this.c;
(( c.w.a.a.u ) v2 ).c ( v1, v3 ); // invoke-virtual {v2, v1, v3}, Lc/w/a/a/u;->c(II)V
/* .line 27 */
v1 = this.c;
(( c.w.a.a.u ) v1 ).d ( ); // invoke-virtual {v1}, Lc/w/a/a/u;->d()V
/* .line 28 */
} // :cond_8
} // :goto_0
v1 = this.c;
v2 = this.j;
(( c.w.a.a.u ) v1 ).a ( p1, v0, v2 ); // invoke-virtual {v1, p1, v0, v2}, Lc/w/a/a/u;->a(Landroid/graphics/Canvas;Landroid/graphics/ColorFilter;Landroid/graphics/Rect;)V
/* .line 29 */
(( android.graphics.Canvas ) p1 ).restoreToCount ( v4 ); // invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->restoreToCount(I)V
} // :cond_9
} // :goto_1
return;
} // .end method
public Integer getAlpha ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = c.h.g.r.a .b ( v0 );
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
v0 = (( c.w.a.a.t ) v0 ).getRootAlpha ( ); // invoke-virtual {v0}, Lc/w/a/a/t;->getRootAlpha()I
} // .end method
public Integer getChangingConfigurations ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( android.graphics.drawable.Drawable ) v0 ).getChangingConfigurations ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I
/* .line 3 */
} // :cond_0
v0 = /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I */
v1 = this.c;
v1 = (( c.w.a.a.u ) v1 ).getChangingConfigurations ( ); // invoke-virtual {v1}, Lc/w/a/a/u;->getChangingConfigurations()I
/* or-int/2addr v0, v1 */
} // .end method
public android.graphics.ColorFilter getColorFilter ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .c ( v0 );
/* .line 3 */
} // :cond_0
v0 = this.e;
} // .end method
public android.graphics.drawable.Drawable$ConstantState getConstantState ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/16 v1, 0x18 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* new-instance v0, Lc/w/a/a/v; */
v1 = this.b;
(( android.graphics.drawable.Drawable ) v1 ).getConstantState ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
/* invoke-direct {v0, v1}, Lc/w/a/a/v;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V */
/* .line 3 */
} // :cond_0
v0 = this.c;
v1 = (( c.w.a.a.w ) p0 ).getChangingConfigurations ( ); // invoke-virtual {p0}, Lc/w/a/a/w;->getChangingConfigurations()I
/* iput v1, v0, Lc/w/a/a/u;->a:I */
/* .line 4 */
v0 = this.c;
} // .end method
public Integer getIntrinsicHeight ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicHeight ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
/* iget v0, v0, Lc/w/a/a/t;->j:F */
/* float-to-int v0, v0 */
} // .end method
public Integer getIntrinsicWidth ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( android.graphics.drawable.Drawable ) v0 ).getIntrinsicWidth ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
/* iget v0, v0, Lc/w/a/a/t;->i:F */
/* float-to-int v0, v0 */
} // .end method
public Integer getOpacity ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( android.graphics.drawable.Drawable ) v0 ).getOpacity ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
} // :cond_0
int v0 = -3; // const/4 v0, -0x3
} // .end method
public void inflate ( android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).inflate ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( c.w.a.a.w ) p0 ).inflate ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lc/w/a/a/w;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
return;
} // .end method
public void inflate ( android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources$Theme p3 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 4 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
c.h.g.r.a .a ( v0,p1,p2,p3,p4 );
return;
/* .line 6 */
} // :cond_0
v0 = this.c;
/* .line 7 */
/* new-instance v1, Lc/w/a/a/t; */
/* invoke-direct {v1}, Lc/w/a/a/t;-><init>()V */
/* .line 8 */
this.b = v1;
/* .line 9 */
v1 = c.w.a.a.a.a;
c.h.f.i.t .a ( p1,p4,p3,v1 );
/* .line 10 */
(( c.w.a.a.w ) p0 ).a ( v1, p2, p4 ); // invoke-virtual {p0, v1, p2, p4}, Lc/w/a/a/w;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)V
/* .line 11 */
(( android.content.res.TypedArray ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V
/* .line 12 */
v1 = (( c.w.a.a.w ) p0 ).getChangingConfigurations ( ); // invoke-virtual {p0}, Lc/w/a/a/w;->getChangingConfigurations()I
/* iput v1, v0, Lc/w/a/a/u;->a:I */
int v1 = 1; // const/4 v1, 0x1
/* .line 13 */
/* iput-boolean v1, v0, Lc/w/a/a/u;->k:Z */
/* .line 14 */
(( c.w.a.a.w ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lc/w/a/a/w;->a(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
/* .line 15 */
p1 = this.d;
p2 = this.c;
p3 = this.d;
(( c.w.a.a.w ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/w/a/a/w;->a(Landroid/graphics/PorterDuffColorFilter;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
this.d = p1;
return;
} // .end method
public void invalidateSelf ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).invalidateSelf ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
/* .line 3 */
} // :cond_0
/* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V */
return;
} // .end method
public Boolean isAutoMirrored ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = c.h.g.r.a .e ( v0 );
/* .line 3 */
} // :cond_0
v0 = this.c;
/* iget-boolean v0, v0, Lc/w/a/a/u;->e:Z */
} // .end method
public Boolean isStateful ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
/* .line 3 */
} // :cond_0
v0 = /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z */
/* if-nez v0, :cond_2 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
v0 = (( c.w.a.a.u ) v0 ).c ( ); // invoke-virtual {v0}, Lc/w/a/a/u;->c()Z
/* if-nez v0, :cond_2 */
v0 = this.c;
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
v0 = (( android.content.res.ColorStateList ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :cond_2
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public android.graphics.drawable.Drawable mutate ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
/* .line 3 */
} // :cond_0
/* iget-boolean v0, p0, Lc/w/a/a/w;->f:Z */
/* if-nez v0, :cond_1 */
/* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable; */
/* if-ne v0, p0, :cond_1 */
/* .line 4 */
/* new-instance v0, Lc/w/a/a/u; */
v1 = this.c;
/* invoke-direct {v0, v1}, Lc/w/a/a/u;-><init>(Lc/w/a/a/u;)V */
this.c = v0;
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput-boolean v0, p0, Lc/w/a/a/w;->f:Z */
} // :cond_1
} // .end method
public void onBoundsChange ( android.graphics.Rect p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setBounds ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V
} // :cond_0
return;
} // .end method
public Boolean onStateChange ( Integer[] p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p1 = (( android.graphics.drawable.Drawable ) v0 ).setState ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
v1 = this.c;
/* .line 4 */
v2 = this.c;
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_1
v4 = this.d;
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 5 */
v0 = this.d;
(( c.w.a.a.w ) p0 ).a ( v0, v2, v4 ); // invoke-virtual {p0, v0, v2, v4}, Lc/w/a/a/w;->a(Landroid/graphics/PorterDuffColorFilter;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
this.d = v0;
/* .line 6 */
(( c.w.a.a.w ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Lc/w/a/a/w;->invalidateSelf()V
int v0 = 1; // const/4 v0, 0x1
/* .line 7 */
} // :cond_1
v2 = (( c.w.a.a.u ) v1 ).c ( ); // invoke-virtual {v1}, Lc/w/a/a/u;->c()Z
if ( v2 != null) { // if-eqz v2, :cond_2
p1 = (( c.w.a.a.u ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lc/w/a/a/u;->a([I)Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 8 */
(( c.w.a.a.w ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Lc/w/a/a/w;->invalidateSelf()V
} // :cond_2
/* move v3, v0 */
} // :goto_0
} // .end method
public void scheduleSelf ( java.lang.Runnable p0, Long p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).scheduleSelf ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V
return;
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V */
return;
} // .end method
public void setAlpha ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
v0 = this.b;
v0 = (( c.w.a.a.t ) v0 ).getRootAlpha ( ); // invoke-virtual {v0}, Lc/w/a/a/t;->getRootAlpha()I
/* if-eq v0, p1, :cond_1 */
/* .line 4 */
v0 = this.c;
v0 = this.b;
(( c.w.a.a.t ) v0 ).setRootAlpha ( p1 ); // invoke-virtual {v0, p1}, Lc/w/a/a/t;->setRootAlpha(I)V
/* .line 5 */
(( c.w.a.a.w ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Lc/w/a/a/w;->invalidateSelf()V
} // :cond_1
return;
} // .end method
public void setAutoMirrored ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .a ( v0,p1 );
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
/* iput-boolean p1, v0, Lc/w/a/a/u;->e:Z */
return;
} // .end method
public void setColorFilter ( android.graphics.ColorFilter p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V
return;
/* .line 3 */
} // :cond_0
this.e = p1;
/* .line 4 */
(( c.w.a.a.w ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Lc/w/a/a/w;->invalidateSelf()V
return;
} // .end method
public void setTint ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .b ( v0,p1 );
return;
/* .line 3 */
} // :cond_0
android.content.res.ColorStateList .valueOf ( p1 );
(( c.w.a.a.w ) p0 ).setTintList ( p1 ); // invoke-virtual {p0, p1}, Lc/w/a/a/w;->setTintList(Landroid/content/res/ColorStateList;)V
return;
} // .end method
public void setTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .a ( v0,p1 );
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
/* .line 4 */
v1 = this.c;
/* if-eq v1, p1, :cond_1 */
/* .line 5 */
this.c = p1;
/* .line 6 */
v1 = this.d;
v0 = this.d;
(( c.w.a.a.w ) p0 ).a ( v1, p1, v0 ); // invoke-virtual {p0, v1, p1, v0}, Lc/w/a/a/w;->a(Landroid/graphics/PorterDuffColorFilter;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
this.d = p1;
/* .line 7 */
(( c.w.a.a.w ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Lc/w/a/a/w;->invalidateSelf()V
} // :cond_1
return;
} // .end method
public void setTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.h.g.r.a .a ( v0,p1 );
return;
/* .line 3 */
} // :cond_0
v0 = this.c;
/* .line 4 */
v1 = this.d;
/* if-eq v1, p1, :cond_1 */
/* .line 5 */
this.d = p1;
/* .line 6 */
v1 = this.d;
v0 = this.c;
(( c.w.a.a.w ) p0 ).a ( v1, v0, p1 ); // invoke-virtual {p0, v1, v0, p1}, Lc/w/a/a/w;->a(Landroid/graphics/PorterDuffColorFilter;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
this.d = p1;
/* .line 7 */
(( c.w.a.a.w ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Lc/w/a/a/w;->invalidateSelf()V
} // :cond_1
return;
} // .end method
public Boolean setVisible ( Boolean p0, Boolean p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p1 = (( android.graphics.drawable.Drawable ) v0 ).setVisible ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
/* .line 3 */
} // :cond_0
p1 = /* invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z */
} // .end method
public void unscheduleSelf ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).unscheduleSelf ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V
return;
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V */
return;
} // .end method
